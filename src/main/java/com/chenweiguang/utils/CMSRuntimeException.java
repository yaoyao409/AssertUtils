package com.chenweiguang.utils;

public class CMSRuntimeException extends RuntimeException {
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: 自定义异常
	 */
	private static final long serialVersionUID = 1L;
	public CMSRuntimeException() {
		super();
	}
	public CMSRuntimeException(String message) {
		super(message);
	}
	

}
