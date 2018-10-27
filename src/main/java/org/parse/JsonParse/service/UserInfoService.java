package org.parse.JsonParse.service;

import java.util.List;

import org.parse.JsonParse.JSONParsing;
import org.parse.JsonParse.Plans;
import org.parse.JsonParse.UserInfo;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {
	
	public String  getPlanNames(List<Plans> p) {		
		String planNames = "planNames:-\t";
		for(int i=0;i<p.size();i++) 
		{
			planNames = planNames+p.get(i).getPlanName()+",";
		}
		return planNames.substring(0, planNames.length()-1);
	}
	
	public String getPlanNameById(String id) 
	{
		UserInfo u=readFromJson();
		List<Plans> p = u.getPlans();
		for(int i=0;i<p.size();i++)
		{
			if(id.equalsIgnoreCase(p.get(i).getPlanId()))
			{
				return p.get(i).getPlanName();
			}
		}
		return "No results found";
	}
	
	public UserInfo readFromJson()
	{
		JSONParsing j = new JSONParsing();
		UserInfo u=j.readJson();
		return u;
	}
}
