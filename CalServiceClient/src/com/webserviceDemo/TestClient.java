package com.webserviceDemo;

public class TestClient {
	public static void main(String[] args) throws Exception{
		
		java.net.URL endpointUrl = new java.net.URL("http://localhost:9090/CalculatorService/services/CalService");
		org.apache.axis.client.Service service = new org.apache.axis.client.Service();
		CalServiceSoapBindingStub stub = new CalServiceSoapBindingStub(endpointUrl,service);
		
		int result = stub.add(10, 30);
		System.out.println("The Add Result :"+result);
		
		int subResult = stub.sub(30, 10);
		System.out.println("The Sub Result :"+subResult);
	}
}
