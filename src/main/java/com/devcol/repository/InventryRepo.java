package com.devcol.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcol.model.Inventry;

public interface InventryRepo extends JpaRepository<Inventry, Integer> {

	Inventry findInventryByFirstname(String name);
	Inventry findInventryByInName(String inName);
	List<Inventry> findInventryByInNameOrderByInNameDesc(String inName);
	List<Inventry> findInventryByInNameOrderByInName(String inName);
	List<Inventry> findByInV1AndInV2(int inV1, int inV2);
	List<Inventry> findInventryByInV1Between(int start, int end);
	List<Inventry> findByFirstnameAndInV1LessThan(String continentName, int pop);

}
