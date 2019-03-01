package com.lambdaschool.javazoos.Controller;
import com.lambdaschool.javazoos.Model.Animal;
import com.lambdaschool.javazoos.Repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/animals", produces = MediaType.APPLICATION_JSON_VALUE)
public class AnimalController {

    @Autowired
    AnimalRepository animalRepository;

    @GetMapping(value = "/animals")
    public List<Animal> getAllZoos(){
        return animalRepository.findAll();
    }

    @GetMapping(value = "/animals/{name}")
    public Animal getAnimalUsingName(@PathVariable String name){
        var found = animalRepository.findByAnimaltypeEqualsIgnoreCase(name);

        if (found.isPresent()){
            return found.get();
        } else {
            return null;
        }
    }

}
