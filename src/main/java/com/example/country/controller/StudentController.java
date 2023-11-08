package com.example.country.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.country.entity.Student;
import com.example.country.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
     StudentService service;

	@GetMapping("/students")
    public List<Student>  getStudents() {
    	return service.listAll();
    }
	
	@GetMapping("/student/{id}")
	public Student getsingleStudent(@PathVariable(value="id") int id) {
		
		return service.get(id);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Student> updateCountry(@PathVariable(value="id") int id, @RequestBody Student con) {
	 try {
		Student existcon = service.get(id);
	    existcon.setStudentname(con.getStudentname());
	    existcon.setCourse(con.getCourse());
	    existcon.setFee(con.getFee());
	    
	   Student updatemsg =  service.updatestudent(existcon);
	   return new ResponseEntity<Student>(updatemsg,HttpStatus.OK);
	 }
	 catch (Exception e) {
		 return new ResponseEntity<Student>(HttpStatus.CONFLICT);
	}

	}
	@PostMapping("/aad")
	public Student addCountry(@RequestBody Student std) {
		return service.addStudent(std);
	}
	
	
	
	
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable(value="id") int id) {
		service.delete(id);
	}
	
}
