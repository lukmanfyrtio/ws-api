package com.id.swamedia.wsapi.demo.utils;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.id.swamedia.wsapi.demo.dto.CustomResponseAPI;
import com.id.swamedia.wsapi.demo.dto.GeneralResponseAPI;
import com.id.swamedia.wsapi.demo.dto.LicenseValidationRequest;
import com.id.swamedia.wsapi.demo.dto.LicenseValidationResponse;
import com.id.swamedia.wsapi.demo.dto.LoginRequest;
import com.id.swamedia.wsapi.demo.dto.LoginResponse;
import com.id.swamedia.wsapi.demo.dto.RegisterResponse;
import com.id.swamedia.wsapi.demo.dto.RegistrationRequest;

@Service
public class ApiIntegrationExample {

	private static final String BASE_URL = "https://wsapi.stuvato.com/api";
	private static final RestTemplate restTemplate;

	static {
		ClientHttpRequestFactory factory = new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory());
		restTemplate = (new RestTemplateBuilder()).setReadTimeout(Duration.ofMinutes(10))
				.setConnectTimeout(Duration.ofMinutes(10)).build();
		restTemplate.setRequestFactory(factory);
	}

	public GeneralResponseAPI<RegisterResponse> registerApp(String name, String email, String password) {
		try {
			GeneralResponseAPI<RegisterResponse> response = new GeneralResponseAPI<RegisterResponse>();

			String url = BASE_URL + "/register";
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<Object> request = new HttpEntity<>(new RegistrationRequest(name, email, password), headers);
			ResponseEntity<RegisterResponse> apiRes = restTemplate.exchange(url, HttpMethod.POST, request,
					RegisterResponse.class);
			response.setData(apiRes.getBody());
			return response;
		} catch (HttpClientErrorException e) {
			GeneralResponseAPI<RegisterResponse> response = new GeneralResponseAPI<RegisterResponse>();
			response.setMessage(e.getStatusText());
			response.setStatus(e.getStatusCode().toString());
			return response;
		}
	}

	public GeneralResponseAPI<LoginResponse> loginApp(String email, String password) {
		try {
			GeneralResponseAPI<LoginResponse> response = new GeneralResponseAPI<LoginResponse>();

			String url = BASE_URL + "/login";
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<Object> request = new HttpEntity<>(new LoginRequest(email, password), headers);
			ResponseEntity<LoginResponse> apiRes = restTemplate.exchange(url, HttpMethod.POST, request,
					LoginResponse.class);
			response.setData(apiRes.getBody());
			return response;
		} catch (HttpClientErrorException e) {
			GeneralResponseAPI<LoginResponse> response = new GeneralResponseAPI<LoginResponse>();
			response.setMessage(e.getStatusText());
			response.setStatus(e.getStatusCode().toString());
			return response;
		}
	}

	public Object validateLicense(String email, String license, String accessToken) throws Exception {
		try {
			String url = BASE_URL + "/validate-license";
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.setBearerAuth("Bearer " + accessToken);
			HttpEntity<Object> request = new HttpEntity<>(new LicenseValidationRequest(email, license), headers);
			ResponseEntity<LicenseValidationResponse> apiRes = restTemplate.exchange(url, HttpMethod.POST, request,
					LicenseValidationResponse.class);

			CustomResponseAPI response = new CustomResponseAPI();
			Date expiredDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
					.parse(apiRes.getBody().getData().getExpires_at());

			long diffInMillies = Math.abs(expiredDate.getTime() - new Date().getTime());
			long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
			if (diff <= 7) {
				response.setMessage("please renew your plan ,your plan will be ended in " + diff + " days");
			} else {
				response.setMessage(apiRes.getBody().getMessage());
			}
			response.setStatus(apiRes.getBody().getStatus());

			response.setPlan(apiRes.getBody().getData().getPlan());
			response.setExpiredDate(new SimpleDateFormat("dd MMMM yyyy H:m:s").format(expiredDate));
			return response;
		} catch (HttpClientErrorException e) {
			GeneralResponseAPI<LoginResponse> response = new GeneralResponseAPI<LoginResponse>();
			response.setMessage(e.getStatusText());
			response.setStatus(e.getStatusCode().toString());
			return response;
		}

	}
}
