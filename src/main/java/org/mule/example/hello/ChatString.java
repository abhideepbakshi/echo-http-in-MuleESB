package org.mule.example.hello;

public class ChatString {

	private static final long serialVersionUID = -3140370545357738491L;
	private StringBuffer string = new StringBuffer();

	public ChatString() {
	}

	public StringBuffer append(String str) {
		return this.string.append(str);
	}

	public StringBuffer append(StringBuffer sb) {
		return this.string.append(sb);
	}

	public StringBuffer insert(int offset, char[] str) {
		return this.string.insert(offset, str);
	}

	public StringBuffer insert(int index, char[] str, int offset, int len) {
		return this.string.insert(index, str, offset, len);
	}

	public String toString() {
		return this.string.toString();
	}

	public int getSize() {
		return this.string.length();
	}
}
