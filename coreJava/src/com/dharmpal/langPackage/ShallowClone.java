package com.dharmpal.langPackage;

class Cat{
	int i;
	Cat(int i){
		this.i = i;
	}
}
class Dog implements Cloneable{
	Cat c;
	int j;
	Dog(int j,Cat c){
		this.j = j;
		this.c = c;
	}
public Object clone()throws CloneNotSupportedException{
	return super.clone();
}
}
public class ShallowClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat c = new Cat(10);
		Dog d = new Dog(20,c);
		System.out.println(d.c.i+"-----"+d.j);
		Dog d1 = (Dog)d.clone();
		d.c.i= 303;
		d.j = 400;
		System.out.println(d1.c.i+"------"+d1.j);
	}
}
