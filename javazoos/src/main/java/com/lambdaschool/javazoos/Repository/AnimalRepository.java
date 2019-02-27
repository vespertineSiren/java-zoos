package com.lambdaschool.javazoos.Repository;

import com.lambdaschool.javazoos.Model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface AnimalRepository extends JpaRepository<Animal, Long> {

    Optional<Animal> findByAnimaltypeEqualsIgnoreCase(String name);
}
