package org.mule.example.hello;

public class ChitChatter {

	private String chitchat = "";
	final LocaleMessage msg = new LocaleMessage();

	public ChitChatter() {
		this.chitchat = msg.getGreetingPart2();
	}

	public void chat(ChatString string) {
		string.append(this.chitchat);
	}
}
