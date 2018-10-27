package org.parse.JsonParse.controller;

import java.util.Optional;

import org.parse.JsonParse.JSONParsing;
import org.parse.JsonParse.UserInfo;
import org.parse.JsonParse.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserPlanController {
	
	@Autowired
	UserInfoService us;
	
	@RequestMapping("/getData")
	public UserInfo getUserInfo()
	{
		JSONParsing j = new JSONParsing();
		UserInfo u=j.readJson();
		return u;
	}
	
	@RequestMapping("/getPlansNames")
	public String getPlanNames() 
	{
		JSONParsing j = new JSONParsing();
		UserInfo u=j.readJson();
		return us.getPlanNames(u.getPlans());
	}
	
	@RequestMapping("/getPlan/{id}")
	public String getPlanNameById(@PathVariable Optional<String> id)
	{
		if(id.isPresent())
		{
			return us.getPlanNameById(id.get());
		}
		return "enter id";
		
	}
}
