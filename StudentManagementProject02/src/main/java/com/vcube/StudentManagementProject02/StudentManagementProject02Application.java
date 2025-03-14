package com.vcube.StudentManagementProject02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vcube.StudentManagementProject02.Entity.Student;
import com.vcube.StudentManagementProject02.Repository.StudentRepository;

//implements CommandLineRunner ---->we have to use this in below
@SpringBootApplication
public class StudentManagementProject02Application  {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementProject02Application.class, args);
	}

//	@Autowired
//	StudentRepository repo;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		
//	Student s1=new Student(1, "sasi",21,"galisasikanth@gmail.com","chuttuguta","9391963115");
//	repo.save(s1);
//	
//	Student s2=new Student(2, "babloo",21,"babloogali@gmail.com","Hyderabad","7891229833	");
//	repo.save(s2);
//	}

}
