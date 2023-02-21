package com.id.swamedia.wsapi.demo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

public class GeneralResponseAPI<T> {

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String message = "Success";
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String status = "ok";
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private T data;

	public GeneralResponseAPI() {
		super();
	}

	public GeneralResponseAPI(String message, String status, T data) {
		super();
		this.message = message;
		this.status = status;
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
