package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class OwnerRowMapper implements RowMapper<Owner>
{
    public Owner mapRow(ResultSet rs, int rowNum ) throws SQLException {
        Owner owner = new Owner();
        owner.setId(rs.getLong("id"));
        owner.setName(rs.getString("o_name"));
        return owner;
    }
}