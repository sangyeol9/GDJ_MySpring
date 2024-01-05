package com.winter.app.product;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.winter.app.util.DBConnector;

@Repository
public class ProductDAO {

	private ProductDTO dto;
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "com.winter.app.product.ProductDAO.";
	
	public ProductDAO() {
		dto = new ProductDTO();
	}
	
	public List<ProductDTO> list() throws Exception {
		return sqlSession.selectList(namespace+"list");
	}
	
	public ProductDTO detail(ProductDTO productDTO) throws Exception {
		Long num = productDTO.getProductnum();
		Connection con = DBConnector.getConnector();
		
		String sql = "SELECT * FROM PRODUCT WHERE PRODUCTNUM = ?";
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setLong(1, num);
		
		ResultSet rs = st.executeQuery();

		


		
		dto = null;
		if(rs.next()) {
			dto = new ProductDTO();
			dto.setProductnum(rs.getLong("PRODUCTNUM"));
			dto.setProductname(rs.getString("PRODUCTNAME"));
			dto.setProductcontents(rs.getString("PRODUCTCONTENTS"));
			dto.setProductrate(rs.getDouble("PRODUCTRATE"));
			dto.setProductjumsu(rs.getDouble("PRODUCTJUMSU"));
		}
		
		return dto;
	}
	
	
	
	public int add(ProductDTO productDTO) throws Exception {
		int result = 0;	
		Connection con = DBConnector.getConnector();
		String sql = "INSERT INTO PRODUCT VALUES(?,?,?,?,?)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setLong(1,productDTO.getProductnum());
		st.setString(2, productDTO.getProductname());
		st.setString(3,productDTO.getProductcontents());
		st.setDouble(4, productDTO.getProductrate());
		st.setDouble(5, productDTO.getProductjumsu());
		result = st.executeUpdate();
		
		DBConnector.disConnect(st, con);
		return result;	
	}
	
	public int update(ProductDTO productDTO) {
		int result = 0;	
			
		return result;
	}
	
	public int delete(ProductDTO productDTO) {
		int result = 0;	
			
		return result;
	}
	
}
