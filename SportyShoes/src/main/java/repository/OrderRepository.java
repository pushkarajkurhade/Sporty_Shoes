package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.example.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer>{

}