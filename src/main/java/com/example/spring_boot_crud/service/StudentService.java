package com.example.spring_boot_crud.service;
import java.util.List;
import com.example.spring_boot_crud.entity.Student;

public interface StudentService {
void save(Student student);
List<Student> getAll();
Student getById(Integer id);
void delete(Student student);
}