package com.swarnava.Sg_Dashboard_API1.repository;

import com.swarnava.Sg_Dashboard_API1.RowMapper.BCAMapper;
import com.swarnava.Sg_Dashboard_API1.model.BCA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BCARepo {
    @Autowired
   private JdbcTemplate jdbc;

    String sql = "SELECT * FROM bca_instruction";;

   public List<BCA> findAllBCA() {
       return jdbc.query(sql, new BCAMapper());
   }
}
