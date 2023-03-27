package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.example.OrderEntity;

import service.OrderService;

@RestController
@RequestMapping(path="/webapi")
public class OrderController {
	
	
	
	@Autowired
    OrderService orderService;
	
	@RequestMapping("/allOrder") 
    public List<OrderEntity> getAllOrder()
    {
    	return orderService.getAllOrder();
    }
	
	@RequestMapping("/Order/{id}") 
    public OrderEntity getOrder(@PathVariable int id)
    {
    	return orderService.getOrder(id);
    }
	
	@RequestMapping(method=RequestMethod.POST, value="/Order")  
    public void addOrder(@RequestBody OrderEntity pe ) {
        orderService.addOrder(pe);
    }
	
	@RequestMapping(method=RequestMethod.PUT, value="/Order/{id}") 
    public void updateOrder(@PathVariable int id, @RequestBody OrderEntity pe ) {
        orderService.updateOrder(id, pe);
    }   

    @RequestMapping(method=RequestMethod.DELETE, value="/Order/{id}") 
    public void deleteOrder(@PathVariable int id)  {
        orderService.deleteOrder(id);
    }   


}
