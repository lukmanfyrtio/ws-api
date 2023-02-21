package com.id.swamedia.wsapi.demo.dto;

import javax.validation.constraints.NotNull;

public class RegistrationRequest {
	
	@NotNull(message = "Name is required")
	private final String name;
	@NotNull(message = "Email is required")
	private final String email;
	@NotNull(message = "Password is required")
	private final String password;

	public RegistrationRequest(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
}
