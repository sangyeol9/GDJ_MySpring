package com.winter.app.product;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

	private ProductDTO dto;
	
	public ProductDAO() {
		dto = new ProductDTO();
	}
	
	public List<ProductDTO> list() throws Exception {
		List<ProductDTO> ar = new ArrayList<ProductDTO>() ;
		dto.setProductnum(1L);
		dto.setProductcontents("1");
		dto.setProductjumsu(1.5);
		dto.setProductname("1");
		dto.setProductrate(1.5);
		ar.add(dto);
		return ar;
	}
	
	public ProductDTO detail(ProductDTO productDTO) {
		
		
		return dto;
	}
	
	public int add(ProductDTO productDTO) {
		int result = 0;	
	
	
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
