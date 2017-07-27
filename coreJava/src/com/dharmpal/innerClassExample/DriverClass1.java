package com.dharmpal.innerClassExample;

class Test{
	interface Yes{
		void show();
	}
}
class Testing implements Test.Yes{
	public void show(){
		System.out.println("I am Implemented");
	}
}

public class DriverClass1 {
	public static void main(String[] args) {
		Test.Yes obj = new Testing();
		obj.show();
	}

}
