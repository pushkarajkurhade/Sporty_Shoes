package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.example.PersonEntity;

import repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	PersonRepository personRepository;

	public List<PersonEntity> getAllPerson() {
		return personRepository.findAll();
	}

	public PersonEntity getPerson(int id) {
		return personRepository.findById(id).get();
	}

	public void addPerson(PersonEntity pe) {
		personRepository.save(pe);
	}

	public void updatePerson(int id, PersonEntity pe){
        if(personRepository.findById(id).isPresent()) {
            PersonEntity oldPersonEntity=personRepository.findById(id).get();
            oldPersonEntity.setName(pe.getName());
            oldPersonEntity.setAge(pe.getAge());
            personRepository.save(oldPersonEntity);
        }
    }

	public void deletePerson(int id){
        personRepository.deleteById(id);       
    }

}
