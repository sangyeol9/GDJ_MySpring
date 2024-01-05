package com.winter.app.regions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//DAO 보내기전 전처리, 후처리 작업
@Service
public class RegionService {
	
	@Autowired
	private RegionDAO dao;
	
	public int delete(RegionDTO dto) throws Exception{
		return dao.delete(dto);
	}
	
	public int update(RegionDTO dto) throws Exception{
		return dao.update(dto);
	}
	
	public int addRegion(RegionDTO dto) throws Exception {
		return dao.addRegion(dto);
	}
	
	public RegionDTO getDetail(RegionDTO dto) throws Exception {
		return dao.getDetail(dto);
		
	}
	
	public List<RegionDTO> getList() throws Exception {
	List<RegionDTO> ar = this.dao.getList();	
	
	
	return ar;
	}
	
	
}
