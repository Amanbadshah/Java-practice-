package com.demo.Electronics;

import java.util.List;

public interface ProductService {
	
	public Electronicitem Add(Electronicitem electronicitem);
	
	public Electronicitem getproduct(Integer id);
	
	public List<Electronicitem> getAllproduct();
	
	public String delete(int id);
	
	public Electronicitem updateproduct(Electronicitem electronicitem);
	

}
