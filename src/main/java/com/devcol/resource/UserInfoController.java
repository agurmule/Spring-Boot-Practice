package com.devcol.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devcol.model.UserInfo;
import com.devcol.servise.UserInfoService;

@RestController
@RequestMapping("user")
public class UserInfoController {
	@Autowired
	UserInfoService infoService;

	// @GET
	@RequestMapping(method=RequestMethod.GET,value="/{userId}")
	public UserInfo getOne(@PathVariable int userId) {
		return infoService.getUserInfo(userId);
	}
	@RequestMapping(method=RequestMethod.GET,value="/all")
	public List<UserInfo> getAll() {
		return infoService.getAllUser();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/age/{age}")
	public List<UserInfo> getBetween(@PathVariable int age) {
		return infoService.getUserBellowAge(age);
	}
	@RequestMapping(method=RequestMethod.GET,value="/ctm/{firstName}/{lastName}")
	public UserInfo getBetween(@PathVariable String  firstName,@PathVariable String  lastName) {
		return infoService.getUserCusm(firstName,lastName);
	}


	// @POST
	@RequestMapping(method=RequestMethod.POST,value="")
	public UserInfo save(@RequestBody UserInfo userInfo) {
		return infoService.saveUser(userInfo);
	
	}

	// @PUT
	@RequestMapping(method=RequestMethod.PUT,value="")
	public UserInfo update(@RequestBody UserInfo userInfo) {
		return infoService.updateUser(userInfo);

	}

	// @DELETE
	@RequestMapping(method=RequestMethod.PUT,value="/{userId}")
	public void delete(@PathVariable int userId) {
		 infoService.deleteUser(userId);
	}

}
