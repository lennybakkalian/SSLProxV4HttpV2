package io.sslprox.api;

import io.sslprox.responses.Res;

public interface SSLProxResHandler {
	public void handleException(Exception e);
	public void handleResponse(Res res);
}
