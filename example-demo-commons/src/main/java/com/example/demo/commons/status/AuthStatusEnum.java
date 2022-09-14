package com.example.demo.commons.status;

/**
 * 
 * @author "guoxs"
 *
 */
public enum AuthStatusEnum {

	STATUS_0("0", "失败"),
	STATUS_1("1", "成功");

	private String code;
	
	private String details;

	AuthStatusEnum(String code, String details) {
		this.code = code;
		this.details = details;
	}
}
