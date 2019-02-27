package com.lambdaschool.javazoos.Repository;

import com.lambdaschool.javazoos.Model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
