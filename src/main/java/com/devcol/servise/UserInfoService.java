package com.devcol.servise;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devcol.model.UserInfo;
import com.devcol.repository.UserInfoRepo;

@Service
public class UserInfoService {
	@Autowired
	UserInfoRepo userInfoRepo;

	public UserInfo getUserInfo(int userId) {

		return userInfoRepo.findByUserId(userId);
	}

	public List<UserInfo> getAllUser() {
		return userInfoRepo.findAll();
	}

	public UserInfo saveUser(UserInfo userInfo) {
		userInfoRepo.save(userInfo);
		userInfoRepo.flush();
		return userInfo;

	}

	public UserInfo updateUser(UserInfo userInfo) {
		userInfoRepo.save(userInfo);
		userInfoRepo.flush();
		return userInfo;
	}

	public void deleteUser(int userId) {
		userInfoRepo.deleteById(userId);
	}
	
	public List<UserInfo> getUserBellowAge(int age) {
		return userInfoRepo.findByAgeBetween(age,age+5);
		
	}

	public UserInfo getUserCusm(String firstName,String lastName) {
		return userInfoRepo.findByFirstNameAndLastName(firstName,lastName);
		
	}
}
