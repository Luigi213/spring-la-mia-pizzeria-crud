package org.java.project.repo;

import org.java.project.pojo.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoPizza extends JpaRepository<Pizza, Integer>{
}
