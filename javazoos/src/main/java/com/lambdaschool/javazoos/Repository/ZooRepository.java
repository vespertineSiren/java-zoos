package com.lambdaschool.javazoos.Repository;

import com.lambdaschool.javazoos.Model.Zoo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZooRepository extends JpaRepository<Zoo, Long> {
}
