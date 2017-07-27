package com.dharmpal.langPackage;
class Cat1{
	int i;
	Cat1(int i){
		this.i = i;
	}
}
class Dog1 implements Cloneable{
	Cat1 c;
	int j;
	Dog1(int j,Cat1 c){
		this.j = j;
		this.c = c;
	}
	public Object clone()throws CloneNotSupportedException{
		Cat1 c1 = new Cat1(c.i);
		Dog1 d1 = new Dog1(j,c1);
		return d1;
	}
}
public class DeepClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat1 c = new Cat1(10);
		Dog1 d = new Dog1(20,c);
		System.out.println(d.c.i+"-----"+d.j);
		Dog1 d1 = (Dog1)d.clone();
		d.c.i= 303;
		d.j = 400;
		System.out.println(d1.c.i+"------"+d1.j);
	}

}
