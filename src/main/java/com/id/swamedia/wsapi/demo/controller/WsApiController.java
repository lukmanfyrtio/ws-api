package com.id.swamedia.wsapi.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.id.swamedia.wsapi.demo.dto.LicenseValidationRequest;
import com.id.swamedia.wsapi.demo.dto.LoginRequest;
import com.id.swamedia.wsapi.demo.dto.RegistrationRequest;
import com.id.swamedia.wsapi.demo.utils.ApiIntegrationExample;

@RestController
public class WsApiController {

	@Autowired
	private ApiIntegrationExample apiIntegrationExample;

	@PostMapping("/register")
	private Object signup(@RequestBody RegistrationRequest request) {
		return apiIntegrationExample.registerApp(request.getName(), request.getEmail(), request.getPassword());
	}

	@PostMapping("/login")
	private Object login(@RequestBody LoginRequest request) {
		return apiIntegrationExample.loginApp(request.getEmail(), request.getPassword());
	}

	@PostMapping("/validate-license")
	private Object validateLicense(@RequestBody LicenseValidationRequest request,
			@RequestHeader("access_token") String access_token) throws Exception {
		return apiIntegrationExample.validateLicense(request.getEmail(), request.getLicense(), access_token);
	}

}
