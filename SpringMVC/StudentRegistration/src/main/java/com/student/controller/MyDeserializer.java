package com.student.controller;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.student.entities.StudentAddress;

public class MyDeserializer implements JsonDeserializer<StudentAddress>{

	public StudentAddress deserialize(JsonElement json, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		JsonElement content = json.getAsJsonObject().get("studentAddress");		
        return new Gson().fromJson(content, StudentAddress.class);
	}

}
