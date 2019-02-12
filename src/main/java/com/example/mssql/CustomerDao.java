package com.example.mssql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Customer> customerList() {
        String query = "SELECT * FROM customer";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper<Customer>(Customer.class));
    }
}
