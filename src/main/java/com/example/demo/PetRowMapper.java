package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class PetRowMapper implements RowMapper<Pet>
{
    public Pet mapRow(ResultSet rs, int rowNum ) throws SQLException {
        Pet pet = new Pet();
        pet.setId(rs.getLong("id"));
        pet.setName(rs.getString("p_name"));
        pet.setBreed(rs.getString("p_breed"));
        pet.setColor(rs.getString("p_color"));
        pet.setCheckIn(rs.getBoolean("p_checkIn"));
        pet.setOwner(rs.getString("Owner_name"));
        return pet;
    }
}