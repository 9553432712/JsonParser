package org.parse.JsonParse;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JsonParseApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonParseApplication.class, args);
		
		/*JSONParsing j = new JSONParsing();
		UserInfo u=j.readJson();
		
		System.out.println(u.isBillableUser());
		System.out.println(u.getSubscriberId());
		System.out.println(u.getBillingAddress());
		//System.out.println(u.getPlans());
		System.out.println(getPlanNames(u.getPlans()));*/
	}
	
	public static String  getPlanNames(List<Plans> p) {
		
		String planNames = "planNames:-\t";
		for(int i=0;i<p.size();i++) {
			planNames = planNames+p.get(i).getPlanName()+",";
		}
		return planNames.substring(0, planNames.length()-1);
	}
}