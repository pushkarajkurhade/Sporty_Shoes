package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.example.PersonEntity;

public interface PersonRepository extends JpaRepository<PersonEntity, Integer>{

}