package org.mule.example.hello;

import java.io.Serializable;

public class NameString2 implements Serializable {
	private static final long serialVersionUID = 7010138636008560022L;
	private String name;
	private String greeting;

	public NameString2() {
		this.name = null;
	}

	public NameString2(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGreeting() {
		return this.greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public boolean isValid() {
		return (this.name != null) && (this.name.length() > 0);
	}
}