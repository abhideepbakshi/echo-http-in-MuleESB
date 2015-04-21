package org.mule.example.hello;


public class Greeter {

	private String greeting = "";
	private LocaleMessage msg = new LocaleMessage();

	public Greeter() {
		this.greeting = msg.getGreetingPart1();
	}

	public Object greet(NameString person) {
		System.out.println("In Greet");
		Object payload = person;
		if (person.isValid()) {
			person.setGreeting(this.greeting);
		} else {
			payload = new Exception(msg.getInvalidUserNameError());
		}
		return payload;
	}
	
	public Object greet2(NameString2 person) {
		System.out.println("In Greet 2");
		final NameString name = new NameString();
		Object payload = name;
		name.setName(person.getName());
		if (name.isValid()) {
			name.setGreeting(this.greeting);
		} else {
			payload = new Exception(msg.getInvalidUserNameError());
		}
		return payload;
	}
	
	
}
