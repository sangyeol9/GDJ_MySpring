package com.winter.app.product;

public class ProductDTO {
	private Long productnum;
	private String productname;
	private String productcontents;
	private Double productrate;
	private Double productejumsu;
	
	public Long getProductnum() {
		return productnum;
	}
	public void setProductnum(Long productnum) {
		this.productnum = productnum;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductcontents() {
		return productcontents;
	}
	public void setProductcontents(String productcontents) {
		this.productcontents = productcontents;
	}
	public Double getProductrate() {
		return productrate;
	}
	public void setProductrate(Double productrate) {
		this.productrate = productrate;
	}
	public Double getProductejumsu() {
		return productejumsu;
	}
	public void setProductejumsu(Double productejumsu) {
		this.productejumsu = productejumsu;
	}
	
	
}