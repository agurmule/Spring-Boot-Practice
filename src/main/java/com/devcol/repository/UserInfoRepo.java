package com.devcol.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcol.model.UserInfo;

public interface UserInfoRepo extends JpaRepository<UserInfo, Integer> {

	UserInfo findByUserId(int userId);

	List<UserInfo> findByAgeBetween(int start,int end);
	List<UserInfo> findByAgeGreaterThan(int start);
	List<UserInfo> findByAgeLessThan(int start);
	UserInfo findByFirstName(String firstName);
	UserInfo findByFirstNameAndLastName(String firstName,String lastName);
	


}
