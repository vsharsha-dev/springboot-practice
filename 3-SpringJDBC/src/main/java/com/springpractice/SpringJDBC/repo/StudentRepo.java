package com.springpractice.SpringJDBC.repo;

import com.springpractice.SpringJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {
//        jdbc.execute("CREATE TABLE IF NOT EXISTS student (rollno INT PRIMARY KEY, name VARCHAR(255), marks INT)");
//        jdbc.update("insert into student (rollno,name,marks) values (101,'Sai',90)");
//        jdbc.update("insert into student (rollno,name,marks) values (102,'Kumar',60)");
//        jdbc.update("insert into student (rollno,name,marks) values (103,'Ritik',85)");
        String sql = "insert into student (rollno,name,marks) values (?,?,?)";
        int rows = jdbc.update(sql, s.getRollNo(), s.getName(), s.getMarks());
        System.out.println(rows + " rows effected.");
    }

    public List<Student> findAll() {
        String sql = "select * from student";

        RowMapper<Student> mapper = (ResultSet rs, int rowNum) -> {
                Student s = new Student();
                s.setRollNo(rs.getInt("rollno"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));

                return s;

        };

        return jdbc.query(sql, mapper);
    }
}
