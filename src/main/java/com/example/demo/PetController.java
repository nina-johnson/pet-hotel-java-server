package com.example.demo;

import java.util.List;

// import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping( value = "/api/pet", method = RequestMethod.GET )
    public List<Pet> list(){
        return jdbcTemplate.query( "SELECT * FROM pets", new PetRowMapper());
    }

    @PostMapping( value = "/api/pet", method = RequestMethod.POST )
    public ResponseEntity <Pet> create(@RequestBody Pet pet ){
        jdbcTemplate.query( "INSERT INTO pets (p_name, p_breed, p_color) VALUES (?, ?, ?)", new Object[] <Pet>);
        return new ResponseEntity<Pet>(HttpStatus.OK);
    }

    // @RequestMapping( value = "/api/plants/{id}", method = RequestMethod.GET )
    // public List<Plant> list(@PathVariable long id){
    //     return jdbcTemplate.query( "SELECT * FROM plant WHERE id=?", new Object[] {id}, new PlantRowMapper());
    // }
}