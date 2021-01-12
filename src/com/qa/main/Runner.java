package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal();
		animal1.eat();
		
		Cat cat1 = new Cat();
		cat1.eat();
		
		// the object is built using the Cat() { } constructor
		Animal someAnimal = new Cat();
		someAnimal.eat();
		
		// makeNoise() in Animal is hidden from view by makeNoise() in Cat
		// BUT makeNoise() in Animal still gets called!
		someAnimal.makeNoise();
		
		// but the object still grabs the variables from Animal, NOT Cat!
		System.out.println(someAnimal.whatAmI);
		
	}
	
}
