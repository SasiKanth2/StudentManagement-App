package com.vcube.StudentManagementProject02.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.StudentManagementProject02.Entity.Student;
import com.vcube.StudentManagementProject02.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository repo;
	
	public List<Student> getAllStudents(){
		return repo.findAll();
		}
	
	public Student save(Student student) {
		return repo.save(student);
		 
	}
	
	public Student findbyid(int id) {
		return repo.findById(id).get();
	}
	
	public Student updatestudent(Student student) {
		return repo.save(student);
	}
	
	public void deletestudent(int id) {
		 repo.deleteById(id);
	}
}
