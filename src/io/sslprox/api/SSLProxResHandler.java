package io.sslprox.api;

import io.sslprox.responses.Res;

public interface SSLProxResHandler {
	public void handleResponse(Res res) throws Exception;
}
