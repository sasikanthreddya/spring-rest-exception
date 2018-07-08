package com.sasi.spring.api.springrestexceptionhandlingdemo.model;

public class OrderError {
	private int errorCode;
	private String errorMessage;
	public OrderError() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderError(int errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	@Override
	public String toString() {
		return "OrderError [errorCode=" + errorCode + ", errorMessage=" + errorMessage + "]";
	}
	
	

}
