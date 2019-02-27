package com.lambdaschool.javazoos.Controller;
import com.lambdaschool.javazoos.Model.Zoo;
import com.lambdaschool.javazoos.Repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/zoos", produces = MediaType.APPLICATION_JSON_VALUE)
public class ZooController {

    @Autowired
    ZooRepository zooRepository;

    @GetMapping(value = "/zoos")
    public List<Zoo> getAllZoos(){
        return zooRepository.findAll();
    }

    @GetMapping(value = "/zoos/{name}")
    public Zoo getZooByNameIgnoresCase(@PathVariable String name) {
        return zooRepository.findByZoonameEqualsIgnoreCase(name);
    }

}
