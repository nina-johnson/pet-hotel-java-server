package com.example.demo;

import java.util.List;

// import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlantController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping( value = "/api/plants", method = RequestMethod.GET )
    public List<Plant> list(){
        return jdbcTemplate.query( "SELECT * FROM plant", new PlantRowMapper());
    }

    @RequestMapping( value = "/api/plants/{id}", method = RequestMethod.GET )
    public List<Plant> list(@PathVariable long id){
        return jdbcTemplate.query( "SELECT * FROM plant WHERE id=?", new Object[] {id}, new PlantRowMapper());
    }
}