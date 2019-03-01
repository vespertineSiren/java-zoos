package com.lambdaschool.javazoos.Repository;

import com.lambdaschool.javazoos.Model.Telephone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelephoneRepository extends JpaRepository<Telephone, Long> {
}
