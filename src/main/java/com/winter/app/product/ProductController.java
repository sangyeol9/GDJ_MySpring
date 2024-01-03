package com.winter.app.product;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/product/*")
public class ProductController {
	
	private ProductDTO dto ;
	private ProductDAO dao ;
	
	public ProductController() {
		this.dto = new ProductDTO();
		this.dao = new ProductDAO();
	}
	
	@RequestMapping(value ="list",method = RequestMethod.GET)
	public String list(HttpServletRequest request) {
		
		return "product/list";
	}
	
	@RequestMapping(value="detail",method =RequestMethod.GET)
	public String detail(ProductDTO productDTO,Model model) {
		
		return "product/detail";
	}
	
}
