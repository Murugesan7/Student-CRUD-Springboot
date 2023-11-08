package com.example.country.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.country.entity.Student;
import com.example.country.repository.StudentRepository;


@Component
@Service
public class StudentService {

	 @Autowired
	     StudentRepository repo;
	    
	    public List<Student> listAll() {
	        return repo.findAll();
	    }
	     
	    public Student addStudent(Student std) {
	        repo.save(std);
	        return std;
	    }
	     
	    public Student get(int id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(int id) {
	        repo.deleteById(id);
	    }
	    
	    public Student updatestudent(Student stu) {
	    	repo.save(stu);
	    	return stu;
	    }
	  
}
