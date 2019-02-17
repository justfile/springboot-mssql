package com.example.mssql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class OrderDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Order> orderList() {
        String query = "select * from [order]";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper<Order>(Order.class));
    }
}
