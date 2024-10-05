package com.infosys.javase8.defaultmethod;

public class DefaultStarter extends Greet implements Greeting, GreetingExtn {
	public static void main(String[] args) {
		new DefaultStarter().hello();
	}
}
