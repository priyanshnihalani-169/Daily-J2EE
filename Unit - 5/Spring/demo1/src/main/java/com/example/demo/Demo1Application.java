package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main1(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
	public static void main(String[] args)
	{
		SpringApplication.run(Demo1Application.class,args);
	}
	@Override
	public void run(String... args) throws Exception {
		//Todo Auto-generated method stud
		String sql = "insert into stud(snm,scity,scno)values(?,?,?)";
		int result = jdbcTemplate.update(sql,"Priya","Aadipur","7405728233");
		if(result > 0)
		{
			System.out.println("Record Inserted ...");
		}
		else
		{
			System.out.println("Record Not Inserted....");
		}
	}

}
