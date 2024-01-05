package com.winter.app.departments;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/departments/*")
public class DepartmentController {
	
	@Autowired
	DepartmentDAO dao;	
	
	
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public String list_departments() throws Exception {
	
		
		List<DepartmentDTO> list=dao.getList();
			
			
		return "departments/list";
}
	
	@RequestMapping(value="/detail",method = RequestMethod.GET)
	public String detail(HttpServletRequest request) throws Exception {
		DepartmentDAO dao = new DepartmentDAO();
		DepartmentDTO dto = new DepartmentDTO();
		String id = request.getParameter("department_id");
		dto.setDepartment_id(Integer.valueOf(id));
		dto = dao.detail(dto);
		request.setAttribute("detail", dto);
		System.out.println("detail 성공");
		return "departments/detail";
	}
}