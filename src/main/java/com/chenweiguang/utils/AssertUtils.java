package com.chenweiguang.utils;

import java.util.Collection;
import java.util.Map;

/**
 * 
 * @ClassName: dyUtils 
 * @Description: 断言为真
 * @author: 夭夭
 * @date: 2019年7月12日 下午7:18:22
 */
public class AssertUtils {
	/**
	 * @Title: isTrue 
	 * @Description: 方法1断言为真
	 * @param exp
	 * @param message
	 * @return: void
	 */
	public static void isTrue(boolean exp,String message) {
		if(!exp) 
			throw new CMSRuntimeException(message);
	}
	/**
	 * 
	 * @Title: isFalse 
	 * @Description: 断言为假
	 * @param exp
	 * @param message
	 * @return: void
	 */
	public static void isFalse(boolean exp,String message) {
		if(exp) {
			throw new CMSRuntimeException(message);
		}
	}
	/**
	 * 
	 * @Title: isNotNull 
	 * @Description: 断言对象不为空
	 * @param obj
	 * @param message
	 * @return: void
	 */
	public static void isNotNull(Object obj,String message) {
		if(obj==null) {
			throw new CMSRuntimeException(message);
		}
	}
	/**
	 * 
	 * @Title: isNull 
	 * @Description: 断言对象必须为空
	 * @param obj
	 * @param message
	 * @return: void
	 */
	public static void isNull(Object obj,String message) {
		if(obj!=null) {
			throw new CMSRuntimeException(message);
		}
	}
	/**
	 * 
	 * @Title: isNotEmpty 
	 * @Description: 断言list或set集合不为空,没有元素也算空
	 * @param c
	 * @param message
	 * @return: void
	 */
public static void isNotEmpty(Collection c,String message) {
		if(c==null || c.size()==0){
			throw new CMSRuntimeException(message);
		}
	}
	/**
	 * 
	 * @Title: isNotEmpty 
	 * @Description: 断言map集合不为空,没有元素也算空
	 * @param m
	 * @param message
	 * @return: void
	 */
	public static void isNotMap(Map<?,?> m,String message) {
		if(m==null || m.isEmpty()) {
			throw new CMSRuntimeException(message);
		}
	}
	/**
	 * 
	 * @Title: hasText 
	 * @Description: 断言字符串必须有值,去掉空格后,长度必须大于0
	 * @param src
	 * @param message
	 * @return: void
	 */
	public static void hasText(String src,String message) {
		if(null == src || src.trim().length()==0) {
			throw new CMSRuntimeException(message);
		}
	}
	/**
	 * 
	 * @Title: isNotPositive 
	 * @Description: 断言值必须是正数(值大于 0)；
	 * @param exp
	 * @param message
	 * @return: void
	 */
	public static void isNotPositive(boolean exp,String message) {
		if(!exp) {
			throw new CMSRuntimeException(message);
		}
	}
	public static void isPositive(boolean exp,String message) {
		if(!exp) {
			throw new CMSRuntimeException(message);
		}
	}
	

}
