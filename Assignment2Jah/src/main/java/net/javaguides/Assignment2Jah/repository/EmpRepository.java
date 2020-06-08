package net.javaguides.Assignment2Jah.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.Assignment2Jah.entity.Emp;


public interface EmpRepository extends JpaRepository<Emp,Integer> {
    Emp findByName(String name);
}

