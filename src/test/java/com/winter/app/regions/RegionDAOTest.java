package com.winter.app.regions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.winter.app.MyTest;

public class RegionDAOTest extends MyTest {

	@Autowired
	RegionDAO dao;
	
	@Test
	public void getListTest() throws Exception {
		List<RegionDTO> ar =dao.getList();
		assertNotEquals(0, ar.size());
	}
	
	@Test
	public void getDetailTest()throws Exception{
		RegionDTO regionDTO = new RegionDTO();
		regionDTO.setRegion_id(1);
		regionDTO = dao.getDetail(regionDTO);
		
		assertNotNull(regionDTO);	
	}
	
	@Test
	public void update() throws Exception {
		RegionDTO dto = new RegionDTO();
		dto.setRegion_id(10);
		dto.setRegion_name("hello");
		int test = dao.update(dto);
		assertEquals(0, test);
	}
	
//	@Test
//	public void add() throws Exception{
//		RegionDTO dto = new RegionDTO();
//		
//		dto.setRegion_name("test");
//		int result = dao.addRegion(dto);
//		
//		assertNotEquals(0, result);
//	}
//	
//	@Test
//	public void delete() throws Exception {
//		RegionDTO dto = new RegionDTO();
//		dto.setRegion_id(11);
//		int result = dao.delete(dto);
//		
//		assertEquals(1, result);
//	}
	
}
