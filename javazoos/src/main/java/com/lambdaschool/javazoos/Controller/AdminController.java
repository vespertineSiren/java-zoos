package com.lambdaschool.javazoos.Controller;

import com.lambdaschool.javazoos.Repository.AnimalRepository;
import com.lambdaschool.javazoos.Repository.TelephoneRepository;
import com.lambdaschool.javazoos.Repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/admin/", produces = MediaType.APPLICATION_JSON_VALUE)
public class AdminController {

    @Autowired
    AnimalRepository animalRepository;

    @Autowired
    TelephoneRepository telephoneRepository;

    @Autowired
    ZooRepository zooRepository;

}
