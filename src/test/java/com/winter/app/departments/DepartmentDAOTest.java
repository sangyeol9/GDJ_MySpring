package com.winter.app.departments;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.winter.app.MyTest;


public class DepartmentDAOTest extends MyTest{

	@Autowired
	DepartmentDAO dao;
	
	@Test
	public void test1() throws Exception {
		List<DepartmentDTO> ar = dao.getList(); 
		assertNotEquals(0, ar.size());
		
	}
	
	@Test
	public void test2() throws Exception {
		DepartmentDTO dto  = new DepartmentDTO();
		dto.setDepartment_id(10);
		dto=dao.detail(dto);
		
		assertNotNull(dto);
	}
	@Test
	public void test3() throws Exception {
		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setDepartment_id(280);
		departmentDTO.setDepartment_name("Test55");
		int result = dao.update(departmentDTO);
		assertEquals(1, result);
	}
	
}
