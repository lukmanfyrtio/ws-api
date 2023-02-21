package com.id.swamedia.wsapi.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RegisterResponse {

	@JsonProperty("data")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private UserData userData;
	@JsonProperty("access_token")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String accessToken;
	@JsonProperty("token_type")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String tokenType;

	@JsonProperty("email")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<String> email;

	public RegisterResponse() {
		super();
	}

	public RegisterResponse(UserData userData, String accessToken, String tokenType, List<String> email) {
		super();
		this.userData = userData;
		this.accessToken = accessToken;
		this.tokenType = tokenType;
		this.email = email;
	}

	public List<String> getEmail() {
		return email;
	}

	public void setEmail(List<String> email) {
		this.email = email;
	}

	public UserData getUserData() {
		return userData;
	}

	public void setUserData(UserData userData) {
		this.userData = userData;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getTokenType() {
		return tokenType;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

	public class UserData {
		private String name;
		private String email;
		@JsonProperty("updated_at")
		private String updatedAt;
		@JsonProperty("created_at")
		private String createdAt;
		private int id;

		public UserData() {
			super();
		}

		public UserData(String name, String email, String updatedAt, String createdAt, int id) {
			super();
			this.name = name;
			this.email = email;
			this.updatedAt = updatedAt;
			this.createdAt = createdAt;
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

	}
}
