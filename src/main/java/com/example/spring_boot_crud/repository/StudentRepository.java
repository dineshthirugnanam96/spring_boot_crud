package com.example.spring_boot_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.spring_boot_crud.entity.*;
public interface StudentRepository extends JpaRepository<Student, Integer> {

}