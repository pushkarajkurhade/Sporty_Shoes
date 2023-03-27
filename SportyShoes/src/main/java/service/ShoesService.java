package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.example.ShoesEntity;

import repository.ShoesRepository;

@Service
public class ShoesService {

	@Autowired
	ShoesRepository shoesRepository;

	public List<ShoesEntity> getAllShoes() {
		return shoesRepository.findAll();
	}

	public ShoesEntity getShoes(int id) {
		return shoesRepository.findById(id).get();
	}

	public void addShoes(ShoesEntity pe) {
		shoesRepository.save(pe);
	}

	public void updateShoes(int id, ShoesEntity pe){
        if(shoesRepository.findById(id).isPresent()) {
            ShoesEntity oldShoesEntity=shoesRepository.findById(id).get();
            oldShoesEntity.setShoes(pe.getShoes());
            oldShoesEntity.setShoesName(pe.getShoesName());
            oldShoesEntity.setShoesSize(pe.getShoesSize());
            shoesRepository.save(oldShoesEntity);
        }
    }

	public void deleteShoes(int id){
        shoesRepository.deleteById(id);       
    }

}
