package com.vcube.StudentManagementProject02.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.StudentManagementProject02.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
