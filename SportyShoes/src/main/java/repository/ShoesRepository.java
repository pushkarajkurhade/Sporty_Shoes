package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.example.ShoesEntity;

public interface ShoesRepository extends JpaRepository<ShoesEntity, Integer>{

}