package com.lara;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	@RequestMapping(value="/hello1", method=RequestMethod.GET)
	public String processHello1()
	{
	System.out.println("from processHello1");
	return "success1.jsp";
	}
	
	@RequestMapping(value="/hello2", method=RequestMethod.GET)
	public String processHello2()
	{
	System.out.println("from processHello2");
	return "success2.jsp";
	}
	
	@RequestMapping(value="/hello3", method=RequestMethod.POST)
	public String processHello3()
	{
	System.out.println("from processHello3");
	return "success3.jsp";
	}
	
	@RequestMapping(value="/hello4", method=RequestMethod.GET)
	public String processHello4(HttpServletRequest request)
	{
	String s1 = request.getParameter("param1");
	String s2 = request.getParameter("param2");
	System.out.println("from processHello4");
	System.out.println(s1);
	System.out.println(s2);
	return "success4.jsp";
	}
	
	@RequestMapping(value="/hello5", method=RequestMethod.POST)
	public String processHello5(HttpServletRequest request)
	{
	String s1 = request.getParameter("firstName");
	String s2 = request.getParameter("lastName");
	System.out.println("from processHello5");
	System.out.println(s1);
	System.out.println(s2);
	return "success5.jsp";
	}
	
	@RequestMapping(value="/hello6", method=RequestMethod.GET)
	public String processHello6(HttpServletResponse response)
	{
	response.setIntHeader("refresh", 10);
	System.out.println("from processHello6");
	return "success6.jsp";
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/hello7", method=RequestMethod.GET)
	public String processHello7(@SuppressWarnings("rawtypes") Map map)
	{
	map.put("key1", "value1");
	map.put("firstName", "Ramu");
	map.put("age", 33);
	System.out.println("from processHello7");
	return "success7.jsp";
	}
	
	@RequestMapping(value="/hello8", method=RequestMethod.GET)
	public String processHello8(ModelMap map)
	{
	map.put("key1", "value1");
	map.put("firstName", "Ramu");
	map.put("age", 33);
	System.out.println("from processHello8");
	return "success8.jsp";
	}
	
	@RequestMapping(value="/hello9", method=RequestMethod.GET)
	public String getViewForHello9(ModelMap map)
	{
	System.out.println("from getViewForHello9");
	map.put("hello9Command", new Person());
	return "test9.jsp";
	}
	@RequestMapping(value="/hello9", method=RequestMethod.POST)
	public String processHello9(@ModelAttribute("hello9Command")Person person)
	{
	System.out.println("from processHello9");
	System.out.println(person.getFirstName());
	System.out.println(person.getLastName());
	return "success9.jsp";
	}
	
	@RequestMapping(value="/hello10", method=RequestMethod.GET)
	public String getViewForHello10(ModelMap map)
	{
	System.out.println("from getViewForHello10");
	map.put("hello10Command", new Student());
	return "test10.jsp";
	}
	@RequestMapping(value="/hello10", method=RequestMethod.POST)
	public String processHello10(@ModelAttribute("hello10Command")Student st)
	{
	System.out.println("from processHello10");
	System.out.println(st.getFirstName());
	System.out.println(st.getAge());
	System.out.println(st.getEmail());
	return "success10.jsp";
	}
	@RequestMapping(value="/hello11", method=RequestMethod.GET)
	public String getViewForHello11(ModelMap map)
	{
	System.out.println("from getViewForHello11");
	map.put("hello11Command", new Student());
	return "test11";
	}
	@RequestMapping(value="/hello11", method=RequestMethod.POST)
	public String processHello11(@ModelAttribute("hello11Command")Student st)
	{
	System.out.println("from processHello11");
	System.out.println(st.getFirstName());
	System.out.println(st.getAge());
	System.out.println(st.getEmail());
	return "success11";
	}
	
	@RequestMapping(value="/hello12", method=RequestMethod.GET)
	public String getViewForHello12(ModelMap map)
	{
	System.out.println("from getViewForHello12");
	map.put("hello12Command", new Employee());
	return "test12";
	}
	@RequestMapping(value="/hello12", method=RequestMethod.POST)
	public String processHello12(@ModelAttribute("hello12Command")Employee st)
	{
	System.out.println("from processHello12");
	System.out.println(st.getFirstName());
	System.out.println(st.getLastName());
	return "success12";
	}
	@RequestMapping(value="/hello13", method=RequestMethod.GET)
	public String getViewForHello13(ModelMap map)
	{
	System.out.println("from getViewForHello13");
	map.put("hello13Command", new Employee());
	return "test13";
	}
	@RequestMapping(value="/hello13", method=RequestMethod.POST)
	public String processHello13(@ModelAttribute("hello13Command")Employee st)
	{
	System.out.println("from processHello13");
	System.out.println(st.getFirstName());
	System.out.println(st.getLastName());
	return "success13";
	}
	@RequestMapping(value="/hello14", method=RequestMethod.GET)
	public String getViewForHello14(ModelMap map)
	{
	System.out.println("from getViewForHello14");
	map.put("hello14Command", new Customer());
	return "test14";
	}
	@RequestMapping(value="/hello14", method=RequestMethod.POST)
	public String processHello14(@ModelAttribute("hello14Command")Customer st)
	{
	System.out.println("from processHello14");
	System.out.println(st.getFirstName());
	System.out.println(st.getLastName());
	System.out.println(st.getPic().getOriginalFilename());
	try
	{
	System.out.println(st.getPic().getBytes().length);
	}
	catch(IOException ex)
	{
	ex.printStackTrace();
	}
	return "success14";
	}
}
