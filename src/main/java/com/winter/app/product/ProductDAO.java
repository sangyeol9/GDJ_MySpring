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

	
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "com.winter.app.product.ProductDAO.";
	
	
	
	public List<ProductDTO> list() throws Exception {
		return sqlSession.selectList(namespace+"list");
	}
	
	public ProductDTO detail(ProductDTO productDTO) throws Exception {
		return sqlSession.selectOne(namespace+"detail",productDTO);
	}
	
	
	
	public int add(ProductDTO productDTO) throws Exception {
		return sqlSession.insert(namespace+"add",productDTO);
	}
	
	public int update(ProductDTO productDTO) {
		return sqlSession.update(namespace+"update",productDTO);
	}
	
	public int delete(ProductDTO productDTO) {
		return sqlSession.delete(namespace+"delete",productDTO);
	}
	
}
