package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class PlantRowMapper implements RowMapper<Plant>
{
    public Plant mapRow(ResultSet rs, int rowNum ) throws SQLException {
        Plant plant = new Plant();
        plant.setId(rs.getLong("id"));
        plant.setName(rs.getString("name"));
        return plant;
    }
}