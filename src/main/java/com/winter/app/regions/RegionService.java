package com.winter.app.regions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//DAO 보내기전 전처리, 후처리 작업
@Service
public class RegionService {
	
	@Autowired
	private RegionDAO dao;
	
	public List<RegionDTO> getList() throws Exception {
	List<RegionDTO> ar = this.dao.getList();	
	
	
	return ar;
	}
	
	
}
