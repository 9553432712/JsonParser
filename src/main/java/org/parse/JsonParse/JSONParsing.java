package org.parse.JsonParse;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JSONParsing 
{
	public UserInfo readJson() {
		return JsonFileToJavaBean.read();
	}
}
