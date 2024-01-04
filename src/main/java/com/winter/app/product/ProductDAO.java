package com.winter.app.product;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import java.util.ArrayList;
import java.util.List;

import com.winter.app.util.DBConnector;

public class ProductDAO {

	private ProductDTO dto;
	
	public ProductDAO() {
		dto = new ProductDTO();
	}
	
	public List<ProductDTO> list() throws Exception {

		List<ProductDTO> ar = new ArrayList<ProductDTO>();
		Connection con = DBConnector.getConnector();
		
		String sql = "SELECT * FROM PRODUCT";
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			dto = new ProductDTO();
			dto.setProductnum(rs.getLong("PRODUCTNUM"));
			dto.setProductname(rs.getString("PRODUCTNAME"));
			dto.setProductcontents(rs.getString("PRODUCTCONTENTS"));
			dto.setProductrate(rs.getDouble("PRODUCTRATE"));
			dto.setProductjumsu(rs.getDouble("PRODUCTJUMSU"));
			ar.add(dto);
		}
		
		DBConnector.disConnect(rs, st, con);
		
		return ar;
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
