package com.company;

public class Main {

	public static void main(String[] args) {
		Animal dog = new Animal("canis familiaris");
		dog.name = "Szarik";


		Animal cat = new Animal("feline");
		cat.name = "Puszek";


		System.out.println("dog name = " + dog.name);


		Phone iphone = new Phone();
		iphone.producer = "aspple";
		iphone.model = "6S";

		Phone s11 = new Phone();
		s11.producer = "samsung";
		s11.model = "S11";

		Human Andrzej = new Human();
		Andrzej.firstName = "Andrzej";
		Andrzej.lastName = "Nowaki";
		Andrzej.sex = "Male";
		Andrzej.age = 33;
		Andrzej.mobilePhone = iphone;

		System.out.println("human name = " + Andrzej.firstName);

		dog.feed();
		String version = iphone.getOSVersion();

		System.out.println(iphone.getOSVersion());


	}
}
