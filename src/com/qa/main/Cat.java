package com.qa.main;

public class Cat extends Animal {
	
	String whatAmI = "cat";
	
	@Override
    public void eat(){
        System.out.println("am nyam nyam");
    }
	
	public static void makeNoise() {
		System.out.println("mrow?");
	}
	
}
