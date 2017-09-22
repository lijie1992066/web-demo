package com.lijie.domain;

public class Result {
	private String message;
	private int code;
	private Object data;
	private boolean flag;
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
	
	public boolean isFlag() {
		return flag;
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public Result(String message, int code, Object data, boolean flag) {
		super();
		this.message = message;
		this.code = code;
		this.data = data;
		this.flag = flag;
	}
	
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Result [message="+ message + ", code=" + code + ", data=" + data + ", flag=" + flag
				+ "]";
	}
	
}
