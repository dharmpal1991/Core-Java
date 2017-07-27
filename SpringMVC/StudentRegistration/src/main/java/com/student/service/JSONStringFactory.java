package com.student.service;

import java.lang.reflect.Type;

import flexjson.JSONSerializer;
import flexjson.ObjectBinder;
import flexjson.ObjectFactory;

public class JSONStringFactory  implements ObjectFactory{

	public Object instantiate(ObjectBinder objectBinder, Object object, Type type, @SuppressWarnings("rawtypes") Class cls) {
		
		return new JSONSerializer().deepSerialize(object);
	}

}
