package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/owner")
public class OwnerController<NewOwner, AddOwner> {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping
    public List<Owner> list() {
        return jdbcTemplate.query( "SELECT * FROM owners", new OwnerRowMapper() );
    }


    // @PostMapping (consumes = {
    //         MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE
    //     }, 
    //     produces = {
    //         MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE
    //     } )
    // public ResponseEntity<Owner> addOwner(@RequestBody Owner owner) {
    //     Owner returnValue= new Owner();
    //     returnValue.setName(owner.getName());

    //     return new ResponseEntity<Owner>(returnValue, HttpStatus.OK);
    // }

    // @PostMapping
    // public Owner addOwner(@RequestBody Owner owner) {
    //     return (Owner) jdbcTemplate.query("INSERT INTO owners (Owner_name) VALUES ('Hieu');",
    //             new OwnerRowMapper());
    // }

    @PostMapping

    public int create(@RequestBody Owner owner) {
        return jdbcTemplate.update("INSERT INTO owners (Owner_name) VALUES (?);", new Owner[] {owner.getName});
    }

}

// jdbcTemplate.query( "INSERT INTO owners (Owner_name) VALUES ($1);",  );