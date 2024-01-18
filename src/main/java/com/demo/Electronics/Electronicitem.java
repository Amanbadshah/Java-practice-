package com.demo.Electronics;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="Products")
public class Electronicitem {
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int produtnumber;
	private String produtname;
	private int productprice;
	private String serialnumber;
	public int getProdutnumber() {
		return produtnumber;
	}
	public void setProdutnumber(int produtnumber) {
		this.produtnumber = produtnumber;
	}
	public String getProdutname() {
		return produtname;
	}
	public void setProdutname(String produtname) {
		this.produtname = produtname;
	}
	public int getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}
	public String getSerialnumber() {
		return serialnumber;
	}
	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}
	

}
