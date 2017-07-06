package com.lara;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {
	private RegistrationDAO regDao;
	
	@Autowired
	public void setRegDao(RegistrationDAO regDao){
		System.out.println("setRegDAO:" + regDao);
		this.regDao = regDao;
	}
		@RequestMapping(value="/reg", method=RequestMethod.GET)
		public String getRegForm(ModelMap map){
			List<Gender> genders = regDao.genders();
			List<Education> educations = regDao.educations();
			List<Skill> skills = regDao.skills();
			map.put("genders", genders);
			map.put("educations", educations);
			map.put("skills", skills);
			map.put("regCommand", new RegistrationBean());
			return "reg";
		}
		@RequestMapping(value="/reg", method=RequestMethod.POST)
			public String processRegForm(@ModelAttribute("regCommand") RegistrationBean regBean){
				/*System.out.println("from processRegForm");
				System.out.println(regBean.getFirstName());
				System.out.println(regBean.getLastName());
				System.out.println(regBean.getGender());
				System.out.println(regBean.getEducation());
				System.out.println(Arrays.toString(regBean.getSkills()));*/
			
			regDao.saveUser(regBean);
				return "success";
	}
		@RequestMapping(value="/edit", method=RequestMethod.GET)
		public String getRegFormForEdit(HttpServletRequest request,ModelMap map){
			String id = request.getParameter("id");
			List<Gender> genders = regDao.genders();
			List<Education> educations = regDao.educations();
			List<Skill> skills = regDao.skills();
			RegistrationBean regBean = regDao.loadUser(Integer.parseInt(id));
			map.put("genders", genders);
			map.put("educations", educations);
			map.put("skills", skills);
			map.put("regCommand", regBean);
			return "regEdit";
		}
			@RequestMapping(value="/edit", method=RequestMethod.POST)
			public String processRegEditForm(@ModelAttribute("regCommand") RegistrationBean regBean){
				System.out.println(regBean.getFirstName());
				System.out.println(regBean.getLastName());
				System.out.println(regBean.getGender());
				System.out.println(regBean.getEducation());
				System.out.println(Arrays.toString(regBean.getSkills()));
				return "editSuccess";
				
			}
}
