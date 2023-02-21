package com.id.swamedia.wsapi.demo.dto;

public class LicenseValidationRequest {

	private final String email;
	private final String license;

	public LicenseValidationRequest(String email, String license) {
		this.email = email;
		this.license = license;
	}

	public String getEmail() {
		return email;
	}

	public String getLicense() {
		return license;
	}
}
