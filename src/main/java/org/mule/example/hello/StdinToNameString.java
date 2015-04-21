package org.mule.example.hello;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class StdinToNameString extends AbstractTransformer {

	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {
			 NameString nameString = new NameString();
		     String name = (String)src;
		     nameString.setName(name.replaceAll("\r", "").replaceAll("\n", "").trim());
		     return nameString;
	}

}
