package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.example.OrderEntity;

import repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	public List<OrderEntity> getAllOrder() {
		return orderRepository.findAll();
	}

	public OrderEntity getOrder(int id) {
		return orderRepository.findById(id).get();
	}

	public void addOrder(OrderEntity pe) {
		orderRepository.save(pe);
	}

	public void updateOrder(int id, OrderEntity pe){
        if(orderRepository.findById(id).isPresent()) {
            OrderEntity oldOrderEntity=orderRepository.findById(id).get();
            oldOrderEntity.setName(pe.getName());
            oldOrderEntity.setOrderid(pe.getOrderid());
            oldOrderEntity.setShoesName(pe.getShoesName());
            oldOrderEntity.setSize(pe.getSize());
            oldOrderEntity.setDiliveredAdress(pe.getDiliveredAdress());
            orderRepository.save(oldOrderEntity);
        }
    }

	public void deleteOrder(int id){
        orderRepository.deleteById(id);       
    }

}
