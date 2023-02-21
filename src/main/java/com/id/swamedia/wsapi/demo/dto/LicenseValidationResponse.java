package com.id.swamedia.wsapi.demo.dto;

public class LicenseValidationResponse {

	private String status;
	private String message;
	private LicenseData data;

	public LicenseValidationResponse() {
		super();
	}

	public LicenseValidationResponse(String status, String message, LicenseData data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LicenseData getData() {
		return data;
	}

	public void setData(LicenseData data) {
		this.data = data;
	}

	public static class LicenseData {
		private int id;
		private String agent_name;
		private String fullname;
		private String email;
		private String code;
		private String registered_date;
		private String broker_name;
		private String broker_code;
		private String payment_method;
		private String plan;
		private String plan_period;
		private String license_number;
		private String state;
		private String expires_at;
		private String license_update_at;
		private String notification;

		public LicenseData() {
			super();
		}

		public LicenseData(int id, String agent_name, String fullname, String email, String code,
				String registered_date, String broker_name, String broker_code, String payment_method, String plan,
				String plan_period, String license_number, String state, String expires_at, String license_update_at,
				String notification) {
			super();
			this.id = id;
			this.agent_name = agent_name;
			this.fullname = fullname;
			this.email = email;
			this.code = code;
			this.registered_date = registered_date;
			this.broker_name = broker_name;
			this.broker_code = broker_code;
			this.payment_method = payment_method;
			this.plan = plan;
			this.plan_period = plan_period;
			this.license_number = license_number;
			this.state = state;
			this.expires_at = expires_at;
			this.license_update_at = license_update_at;
			this.notification = notification;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getAgent_name() {
			return agent_name;
		}

		public void setAgent_name(String agent_name) {
			this.agent_name = agent_name;
		}

		public String getFullname() {
			return fullname;
		}

		public void setFullname(String fullname) {
			this.fullname = fullname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getRegistered_date() {
			return registered_date;
		}

		public void setRegistered_date(String registered_date) {
			this.registered_date = registered_date;
		}

		public String getBroker_name() {
			return broker_name;
		}

		public void setBroker_name(String broker_name) {
			this.broker_name = broker_name;
		}

		public String getBroker_code() {
			return broker_code;
		}

		public void setBroker_code(String broker_code) {
			this.broker_code = broker_code;
		}

		public String getPayment_method() {
			return payment_method;
		}

		public void setPayment_method(String payment_method) {
			this.payment_method = payment_method;
		}

		public String getPlan() {
			return plan;
		}

		public void setPlan(String plan) {
			this.plan = plan;
		}

		public String getPlan_period() {
			return plan_period;
		}

		public void setPlan_period(String plan_period) {
			this.plan_period = plan_period;
		}

		public String getLicense_number() {
			return license_number;
		}

		public void setLicense_number(String license_number) {
			this.license_number = license_number;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getExpires_at() {
			return expires_at;
		}

		public void setExpires_at(String expires_at) {
			this.expires_at = expires_at;
		}

		public String getLicense_update_at() {
			return license_update_at;
		}

		public void setLicense_update_at(String license_update_at) {
			this.license_update_at = license_update_at;
		}

		public String getNotification() {
			return notification;
		}

		public void setNotification(String notification) {
			this.notification = notification;
		}

	}
}
