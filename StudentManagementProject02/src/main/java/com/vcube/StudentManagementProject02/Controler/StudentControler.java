package com.vcube.StudentManagementProject02.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.vcube.StudentManagementProject02.Entity.Student;
import com.vcube.StudentManagementProject02.Service.StudentService;

@Controller
public class StudentControler {

	@Autowired
	StudentService service;
	
	@GetMapping("/students")
	public String Allstudents(Model mod) {
	mod.addAttribute("student", service.getAllStudents());
		return "students";
		
	}
	
	@GetMapping("/students/new")
	public String AddStudents(Model mod ) {
		
		//creating student object to studentform
		Student s=new Student();
		mod.addAttribute("student",s);
		
		return "CreateStudent";
		}
	
	@PostMapping("/students")
	public String save(@ModelAttribute("Student") Student student) {
		service.save(student);
		return "redirect:/students";
	}
		
	@GetMapping("/students/edit/{id}")
	public String editstudent(@PathVariable int id,Model mod) {
		mod.addAttribute("student",service.findbyid(id));
		return "edit-form";
	}
	@PostMapping("/students/{id}")
	public String updatestudent(@PathVariable int id,@ModelAttribute("Student") Student student) {
		Student stud=service.findbyid(id);
		stud.setId(student.getId());
		stud.setName(student.getName());
		stud.setAge(student.getAge());
		stud.setEmail(student.getEmail());
		stud.setAddress(student.getAddress());
		stud.setNumber(student.getNumber());
		service.updatestudent(stud);
		return "redirect:/students";
		}
	@GetMapping("/students/{id}")
	public String deleteStudents(@PathVariable int id) {
		service.deletestudent(id);
		return "redirect:/students";
		
	}
}
