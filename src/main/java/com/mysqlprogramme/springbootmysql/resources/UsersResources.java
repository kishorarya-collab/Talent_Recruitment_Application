package com.mysqlprogramme.springbootmysql.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mysqlprogramme.springbootmysql.model.Candidate;
import com.mysqlprogramme.springbootmysql.model.Users;
import com.mysqlprogramme.springbootmysql.repository.CandidateRepository;
import com.mysqlprogramme.springbootmysql.repository.UsersRepository;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
//@RequestMapping(value="/rest/users")
public class UsersResources {
	
	@Autowired
    CandidateRepository candidateRepository;
	
	@Autowired
	UsersRepository usersRepository;

    @GetMapping(value = "/all")
    public List<Candidate> getAll() {
        return candidateRepository.findAll();
    }
    
	@GetMapping(value = "/one/id/{id}")
    public Users getOne(@PathVariable("id") Integer id) {
        List<Users> list= this.usersRepository.findAll();
    	Users user= list.stream().filter(e->e.getId()==id).findFirst().get();
        return user ;//usersRepository.findById(id);
    }
}
