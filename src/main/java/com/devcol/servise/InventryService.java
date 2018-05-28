package com.devcol.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devcol.model.Inventry;
import com.devcol.repository.InventryRepo;

@Service
public class InventryService {
@Autowired InventryRepo inventryRepo;
	public void addInventry(Inventry inventry) {
		 inventryRepo.save(inventry);
		 inventryRepo.flush();
		System.out.println("ID------------:"+ inventry.getId());
	}
	
	public Inventry search(String firstname) {
		 return inventryRepo.findInventryByInName(firstname);
	}
	
	public List<Inventry> getAllBySearch(String firstname) {
		 return inventryRepo.findInventryByInNameOrderByInName(firstname);
	}
	public List<Inventry> getAllByAND(int inv1 ,int inV2) {
		 return inventryRepo.findByInV1AndInV2(inv1, inV2);
	}
	
	public List<Inventry> getAllBetween(int inv1 ,int inV2) {
		 return inventryRepo.findInventryByInV1Between(inv1, inV2);
	}
	public List<Inventry> getAllBetweenSearch(String inv1 ,int inV2) {
		 return inventryRepo.findByFirstnameAndInV1LessThan(inv1, inV2);
	}

}
