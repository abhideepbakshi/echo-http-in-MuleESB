package org.mule.example.hello;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class NameStringToChatString extends AbstractTransformer {

	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {
		ChatString chatString = new ChatString();
		NameString nameString = (NameString) src;
		chatString.append(nameString.getGreeting());
		chatString.append(nameString.getName());
		return chatString;
	}

}
