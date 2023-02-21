package com.id.swamedia.wsapi.demo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

public class LoginResponse {

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String access_token;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String message;

	public LoginResponse() {
		super();
	}

	public LoginResponse(String access_token, String message) {
		super();
		this.access_token = access_token;
		this.message = message;
	}

	public String getAccess_token() {
		return access_token;
	}

	public String getMessage() {
		return message;
	}

}
