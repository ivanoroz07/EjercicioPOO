package org.generation.classes;

public class Person {
	String name;
	int age;
	String email;
	String rfc;
	String address;
	
	public Person(String name,int age, String email, String rfc, String address){
		this.name = name;
		this.age=age;
		this.rfc=rfc;
		this.email=email;
		this.rfc=address;
	}//constructor
	
	public Person(String name,int age, String email) {
		this(name, age, email, "XA00000", "Su Casa");
	}//constructor
	
	public Person(String name) {
		this(name, 18, "correo@falso.com");
	}//constructor
	
	public String toString() {
		return "name= " + this.name +", age= " +this.age + ", email= " + this.email
				+ ", rfc= "+ this.rfc + ", address= " + this.address;
	}

}// class persons

