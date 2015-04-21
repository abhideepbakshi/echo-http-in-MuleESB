package org.mule.example.hello;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class ChatStringToString extends AbstractTransformer{

	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {
		ChatString chatString = (ChatString)src;
		return chatString.toString();
	}

}
