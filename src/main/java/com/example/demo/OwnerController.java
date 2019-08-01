package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
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
}