package com.lara;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Skill {
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
	public static class SkillResultSetExtracter implements RowMapper<Skill>{
		public Skill mapRow(ResultSet arg0, int arg1) throws SQLException{
			Skill s1 = new Skill();
			s1.setId(arg0.getInt("id"));
			s1.setName(arg0.getString("name"));
			return s1;
		}
		
	}

}
