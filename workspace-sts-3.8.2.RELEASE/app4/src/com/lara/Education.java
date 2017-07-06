package com.lara;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Education {
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static class EducationResultSetExtracter implements RowMapper<Education>{

		@Override
		public Education mapRow(ResultSet arg0, int arg1) throws SQLException {
			Education e1 = new Education();
			e1.setId(arg0.getInt("id"));
			e1.setName(arg0.getString("name"));
			return e1;
		}	
	}

}
