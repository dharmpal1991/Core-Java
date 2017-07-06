package com.lara;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class Gender {
	private Integer id;
	private String name;
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public static class GenderResultSetExtracter implements RowMapper<Gender>{
		public Gender mapRow(ResultSet arg0, int arg1) throws SQLException{
			Gender gender = new Gender();
			gender.setId(arg0.getInt("id"));
			gender.setName(arg0.getString("name"));
			return gender;
		}
	}
	
}
