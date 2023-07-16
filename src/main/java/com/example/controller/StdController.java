package com.example.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entity.Student;
import com.example.services.StdService;

@Controller
public class StdController {
	StdService ss;
	
	
	public StdController(StdService ss) {
		super();
		this.ss = ss;
	}
	//to link index page to the viewInfo.html page
	@GetMapping("/viewI")
	public String mapViewInfo() {
		return "viewInfo";
	}
	@GetMapping("/index")
	public String mapIndex() {
		return "index";
	}
	
	@GetMapping("/addI")
	public String mapAddInfo() {
		return "addInfo";
	}
	@GetMapping("/updateI")
	public String mapUpdateInfo() {
		return "updateInfo";
	}
	@GetMapping("/deleteI")
	public String mapDeleteInfo() {
		return "deleteInfo";
	}
	
	@GetMapping("/showI")
	public String mapShowInfo() {
		return "showInfo";
	}
	@GetMapping("/showAll")
	public String showAll() {
		return "showAll";
	}
	
	
	
	//below are the logical controller that sends the
	//value to the service > repository > db with SpringBoot 
	@PostMapping(value="/addStd")
	public String addStd(@RequestParam("id") String id,@RequestParam("name") String name,@RequestParam("branch") String branch) {
		Student s=new Student(id,name,branch);
		ss.addStd(s);
		return "index";
		
	}
	@GetMapping(value="/viewStd")
	public String viewStd(@RequestParam("id") String id, Model model) {
		Student s=ss.viewStd(id);
		model.addAttribute("student", s); 
		return "showInfo";
	}
	@GetMapping("/viewAll")
	public String viewAllStd(Model model){
		List<Student> stdList=ss.viewAllStd();
		model.addAttribute("slist",stdList);
		System.out.println(stdList);
		return "showAll";
	}
	@PutMapping(value="/updStd")
	public String updateStd(@RequestParam("id") String id,@RequestParam("name") String name,@RequestParam("branch") String branch) {
		Student s=ss.viewStd(id);
		s.setName(name);
		s.setBranch(branch);
		ss.updateStd(s);
		return "index";
		
	}
	@DeleteMapping(value="/delS")
	public String deleteStd(@RequestParam("id")String id) {
		ss.deleteStd(id);
		return "index";
	}
	
		
	}

