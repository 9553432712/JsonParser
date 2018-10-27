package org.parse.JsonParse;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonFileToJavaBean {
	
	public static UserInfo read() {
		UserInfo userInfo=null;
		try
		{
			ObjectMapper mapper = new ObjectMapper();
			userInfo = mapper.readValue(new File("bill.json"), UserInfo.class);
			System.out.println(userInfo);
		}
		catch (JsonParseException e) {
			
			e.printStackTrace();
		} catch (JsonMappingException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return userInfo;
	}

}
