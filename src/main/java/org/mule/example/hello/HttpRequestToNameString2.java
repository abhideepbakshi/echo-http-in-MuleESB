package org.mule.example.hello;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class HttpRequestToNameString2 extends AbstractTransformer {

	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {
		return new NameString2(
				extractNameValue(extractRequestQuery(convertRequestToString(
						src, encoding))));
	}

	private String convertRequestToString(Object src, String encoding) {
		String srcAsString = null;

		if ((src instanceof byte[])) {
			if (encoding != null) {
				try {
					srcAsString = new String((byte[]) src, encoding);
				} catch (UnsupportedEncodingException ex) {
					srcAsString = new String((byte[]) src);
				}

			} else {
				srcAsString = new String((byte[]) src);
			}

		} else {
			srcAsString = src.toString();
		}

		return srcAsString;
	}

	private String extractRequestQuery(String request) {
		String requestQuery = null;

		if ((request != null) && (request.length() > 0)
				&& (request.indexOf('?') != -1)) {
			requestQuery = request.substring(request.indexOf('?') + 1).trim();
		}

		return requestQuery;
	}

	private String extractNameValue(String requestQuery)
			throws TransformerException {
		String nameValue = null;

		if ((requestQuery != null) && (requestQuery.length() > 0)) {
			int nameParameterPos = requestQuery.indexOf("name=");
			if (nameParameterPos != -1) {
				int nextParameterValuePos = requestQuery.indexOf('&');
				if ((nextParameterValuePos == -1)
						|| (nextParameterValuePos < nameParameterPos)) {
					nextParameterValuePos = requestQuery.length();
				}

				nameValue = requestQuery.substring(
						nameParameterPos + "name=".length(),
						nextParameterValuePos);
			}

			if ((nameValue != null) && (nameValue.length() > 0)) {
				try {
					nameValue = URLDecoder.decode(nameValue, "UTF-8");
				} catch (UnsupportedEncodingException uee) {
					this.logger.error(uee.getMessage());
				}
			}
		}

		if (nameValue == null) {
			nameValue = "";
		}

		return nameValue;
	}

}
