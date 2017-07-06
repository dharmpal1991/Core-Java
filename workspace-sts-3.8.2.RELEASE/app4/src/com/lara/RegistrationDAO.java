package com.lara;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.StatementCallback;

public class RegistrationDAO {
	private JdbcTemplate template;
	public void setTemplate(JdbcTemplate template){
		System.out.println("setTemplate:" + template);
		this.template = template;
	}
	public List<Gender> genders(){
		String sql = "select id, name from gender";
		Gender.GenderResultSetExtracter rse = new Gender.GenderResultSetExtracter();
		return (List<Gender>)template.query(sql, rse);
	}
	public List<Education> educations(){
		String sql = "select id, name from education";
		Education.EducationResultSetExtracter rse = new Education.EducationResultSetExtracter();
		return (List<Education>)template.query(sql, rse);
	}
	public List<Skill> skills(){
		String sql = "select id, name from skill";
		Skill.SkillResultSetExtracter rse = new Skill.SkillResultSetExtracter();
		return (List<Skill>)template.query(sql, rse);
	}
	public void saveUser(RegistrationBean regBean){
		String sql1 = "select max(id) as max_id from users";
		List<Map<String,Object>> list =template.queryForList(sql1);
		BigDecimal bd = (BigDecimal)list.get(0).get("max_id");
		Integer id = 0;
		@SuppressWarnings("unused")
		int maxId;
		if(bd == null){
			id =0;
		}
		id++;
		
		StringBuffer sql = new StringBuffer("insert into users values(");
		sql.append(id+",'"+regBean.getFirstName()+",'");
		sql.append(","+regBean.getLastName()+"',");
		sql.append(regBean.getGender()+",");
		sql.append(regBean.getEducation()+")");
		
		String sql2 = "insert into user_skill values("+id+",?)";
		template.update(sql.toString());
		
		for(@SuppressWarnings("unused") String skillId:regBean.getSkills()){
			template.update(sql2);
		}
	}
	public RegistrationBean loadUser(int id){
		String sql1 = "select * from users";
		String sql2 = "select * from user_skill where user_id = "+id;
		
		StatementCallback<RegistrationDAO> scb = new  StatementCallback() {

			@Override
			public Object doInStatement(Statement arg0) throws SQLException,DataAccessException {
				ResultSet rs1 = arg0.executeQuery(sql1);
				RegistrationBean regBean = new RegistrationBean();
				if(rs.next()){
					regBean.setFirstName(rs1.getString("first Name"));
					regBean.setLastName(rs1.getString("last Name"));
					regBean.setGender(rs1.getInt("gender_id"));
					regBean.setEducation(rs1.getInt("education_id"));
				}
				rs1.close();
				ResultSet rs2 = arg0.executeQuery(sql2);
				ArrayList<Integer> list = new ArrayList<>();
				while(rs2.next()){
					list.add(rs2.getInt("skill_id"));
				}
				regBean.setSkills(list.toArray(new,Integer[]()));
				return null;
			}
		};
	}
}
