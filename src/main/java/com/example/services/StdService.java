package com.example.services;

import java.util.List;

import com.example.entity.Student;

public interface StdService {
	public String addStd(Student s);
	Student viewStd(String kodId);
	public List<Student> viewAllStd();
	String updateStd(Student s);
	String deleteStd(String kodId);
}
