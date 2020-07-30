package com.king.druid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author king
 * @Title:
 * @Package
 * @Description:
 * @date 2020/7/3021:00
 */
@RestController
public class MyController {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @RequestMapping("test")
    public String testDataSoure() throws SQLException {
        System.out.println(dataSource.getConnection());
        return "connection ok";
    }

    @RequestMapping("/hello")
    public List<Map<String, Object>> hello() {
        List<Map<String, Object>> employeeList = jdbcTemplate.queryForList("select * from employees");
        return employeeList;
    }

}
