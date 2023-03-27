package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.example.ShoesEntity;

import service.ShoesService;

@RestController
@RequestMapping(path="/webapi")
public class ShoesController {
	
	
	
	@Autowired
    ShoesService shoesService;
	
	@RequestMapping("/allShoes") 
    public List<ShoesEntity> getAllShoes()
    {
    	return shoesService.getAllShoes();
    }
	
	@RequestMapping("/Shoes/{id}") 
    public ShoesEntity getShoes(@PathVariable int id)
    {
    	return shoesService.getShoes(id);
    }
	
	@RequestMapping(method=RequestMethod.POST, value="/Shoes")  
    public void addShoes(@RequestBody ShoesEntity pe ) {
        shoesService.addShoes(pe);
    }
	
	@RequestMapping(method=RequestMethod.PUT, value="/Shoes/{id}") 
    public void updateShoes(@PathVariable int id, @RequestBody ShoesEntity pe ) {
        shoesService.updateShoes(id, pe);
    }   

    @RequestMapping(method=RequestMethod.DELETE, value="/Shoes/{id}") 
    public void deleteShoes(@PathVariable int id)  {
        shoesService.deleteShoes(id);
    }   


}

