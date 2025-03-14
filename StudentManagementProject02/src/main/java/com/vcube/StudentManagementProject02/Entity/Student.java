package com.vcube.StudentManagementProject02.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student02")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String Name;
	@Column
	private Integer Age;
	@Column
	private String Email;
	@Column
	private String Address;
	@Column
	private String Number;
	
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		Age = age;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public Student() {
		
	}
	
	public Student(int id, String name, Integer age, String email, String address, String number) {
		super();
		this.id = id;
		Name = name;
		Age = age;
		Email = email;
		Address = address;
		Number = number;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", Age=" + Age + ", Email=" + Email + ", Address=" + Address
				+ ", Number=" + Number + "]";
	}
	
	
	
}
