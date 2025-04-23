package com.swarnava.Sg_Dashboard_API1.RowMapper;

import com.swarnava.Sg_Dashboard_API1.model.BCA;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BCAMapper implements RowMapper<BCA> {
        @Override
        public BCA mapRow(ResultSet rs, int rowNum) throws SQLException {
            BCA bca = new BCA();
            bca.setId(rs.getInt("instruction_id"));
            bca.setInst_name(rs.getString("instruction_name"));
            bca.setDate(rs.getDate("created_date"));
            bca.setAmount(rs.getInt("amount"));
            bca.setStatus(rs.getString("is_active"));
            bca.setType(rs.getString("description"));
            return bca;
        }
    }
