package com.winter.app.regions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.app.util.DBConnector;
@Repository
public class RegionDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "com.winter.app.regions.RegionDAO.";
	
	//UPDATE
	public int update(RegionDTO regionDTO) throws Exception {
		return sqlSession.update(namespace+"update",regionDTO);
		
		
	}
	
	//Insert
	public int addRegion(RegionDTO regionDTO) throws Exception {
		return sqlSession.insert(namespace+"addRegion",regionDTO);
		
	}
	
	
	public RegionDTO getDetail(RegionDTO regionDTO)throws Exception{
		return sqlSession.selectOne(namespace+"getDetail",regionDTO);
		
			
		}
	
	public List<RegionDTO> getList() throws Exception {
		//1. driver를 메모리에 로딩(객체 생성)
		//3. Sql문 생성
			//4. SQL문 미리 전송
			//5.	
			//6. 최종 전송 및 결과 처리
		return sqlSession.selectList(namespace+"getList");
	
	}
	
	public int delete(RegionDTO dto) {
	
		return sqlSession.delete(namespace+"delete",dto);
	}
	

}