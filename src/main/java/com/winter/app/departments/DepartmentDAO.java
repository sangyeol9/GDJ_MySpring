package com.winter.app.departments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import javax.xml.stream.events.Namespace;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.app.util.DBConnector;
@Repository
public class DepartmentDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private String namespace = "com.winter.app.departments.DepartmentDAO.";
	
	public List<DepartmentDTO> getList() throws Exception {
		//DB접속 후 부서테이블의모든 정보를 출력
		return sqlSession.selectList(namespace+"getList");
		
	}
	
	public DepartmentDTO detail(DepartmentDTO departmentDTO) throws Exception {
	
		return sqlSession.selectOne(namespace+"detail",departmentDTO);
	}

}
//	public int update(DepartmentDTO departmentDTO,int temp) throws Exception{
//		Connection con = DBConnector.getConnector();
//		String sql = "UPDATE DEPARTMENTS SET DEPARTMENT_ID=?, DEPARTMENT_NAME = ?,MANAGER_ID=?,LOCATION_ID=? WHERE DEPARTMENT_ID =?";
//		PreparedStatement st = con.prepareStatement(sql);
//		st.setInt(1, departmentDTO.getDepartment_id());
//		st.setString(2, departmentDTO.getDepartment_name());
//		st.setInt(3, departmentDTO.getManager_id());
//		st.setInt(4, departmentDTO.getLocation_id());
//		st.setInt(5, temp);
//		int result = st.executeUpdate();
//		DBConnector.disConnect(st, con);
//		
//		return result;
//		
//	}
//	
//	public int addList(DepartmentDTO departmentDTO) throws Exception {
//		Connection con = DBConnector.getConnector();
//		String sql = "INSERT INTO DEPARTMENTS VALUES(?,?,?,?)";
//		PreparedStatement st = con.prepareStatement(sql);
//		st.setInt(1, departmentDTO.getDepartment_id());
//		st.setString(2, departmentDTO.getDepartment_name());
//		st.setInt(3, departmentDTO.getManager_id());
//		st.setInt(4, departmentDTO.getLocation_id());
//		int result = st.executeUpdate();
//		DBConnector.disConnect(st, con);
//		
//		return result;
//	}
//	