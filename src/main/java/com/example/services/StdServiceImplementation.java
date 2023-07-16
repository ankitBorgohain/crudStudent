package com.example.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repository.StdRepository;
@Service
public class StdServiceImplementation implements StdService {
	
	StdRepository sr;
	public StdServiceImplementation(StdRepository sr) {
		super();
		this.sr = sr;
	}

	@Override
	public String addStd(Student s) {
		sr.save(s);
		return "showInfo";
	}

	@Override
	public List<Student> viewAllStd() {
		List<Student> stdlist=sr.findAll();
		return stdlist;
	}

	@Override
	public Student viewStd(String id) {
		// TODO Auto-generated method stub
		Student st=sr.findById(id).get();
		return st;
	}

	@Override
	public String updateStd(Student s) {
		// TODO Auto-generated method stub
		sr.save(s);
		return "Student Updated";
	}

	@Override
	public String deleteStd(String id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
		return "Student Deleted";
	}
	




}
