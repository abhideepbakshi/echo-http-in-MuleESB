package org.mule.example.hello;



public class LocaleMessage{

	public LocaleMessage() {
	}

	public String getGreetingPart2() {
		return ", how are you?";
	}
	

	public String getGreetingPart1() {
		return "Hello ";
	}

	public String getPrompt() {
		return "Please enter your name:";
	}

	public String getInvalidUserNameError() {
		return "Please provide a valid name with at least one character!";
	}

}
