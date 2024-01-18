package com.demo.Electronics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Electronicservice implements ProductService {
	
	@Autowired
	private ElecRepo elecRepo;

	@Override
	public Electronicitem Add(Electronicitem electronicitem) {
		// TODO Auto-generated method stub
		return elecRepo.save(electronicitem);
	}

	@Override
	public Electronicitem getproduct(Integer id) {
		// TODO Auto-generated method stub
		return elecRepo.findById(id).get();
	}

	@Override
	public List<Electronicitem> getAllproduct() {
		// TODO Auto-generated method stub
		return elecRepo.findAll();
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		elecRepo.deleteById(id);;
		return "product deleted Done";
	}

	@Override
	public Electronicitem updateproduct(Electronicitem electronicitem) {
		// TODO Auto-generated method stub
		return elecRepo.save(electronicitem);
	}
}
	

