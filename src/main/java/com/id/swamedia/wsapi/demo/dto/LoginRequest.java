package com.id.swamedia.wsapi.demo.dto;

import javax.validation.constraints.NotNull;

public class LoginRequest {
	@NotNull(message = "Email is required")
	private final String email;
	@NotNull(message = "Password is required")
	private final String password;

	public LoginRequest(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
}
