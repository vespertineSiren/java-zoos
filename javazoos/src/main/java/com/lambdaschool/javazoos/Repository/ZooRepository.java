package com.lambdaschool.javazoos.Repository;

import com.lambdaschool.javazoos.Model.Zoo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ZooRepository extends JpaRepository<Zoo, Long> {

    Zoo findByZoonameEqualsIgnoreCase(String name);

}
