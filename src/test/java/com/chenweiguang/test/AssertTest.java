package com.chenweiguang.test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.chenweiguang.utils.AssertUtils;

public class AssertTest {
	//断言为真
	@Test
	public void isTrue() {
		String pwd="123";
		String repwd="123";
		AssertUtils.isTrue(pwd.equals(repwd), "两次密码不一致");
	}
	//断言为假
	@Test
	public void isFalse() {
		AssertUtils.isFalse(2<1, "断言为真");
	}
	
	//断言对象不为空
	@Test
	public void isNotNull() {
		AssertUtils.isNotNull(new String("abc"), "不为空");
	}
	//断言对象必须空
	@Test
	public void isNull() {
		AssertUtils.isNull(null, "必须是空");
	}
	//断言 List 或 Set 集合不为空，没有元素也算空
	@Test
	public void isNotEmpty() {
		List list = new ArrayList();
		list.add("娃哈哈");
		AssertUtils.isNotEmpty(list, "为空");
	}
	//断言 Map 集合不为空，没有元素也算空；
	@Test
	public void isNotMap() {
		Map map = new HashMap();
		map.put("heihei", "key");
		AssertUtils.isNotMap(map, "为空");
	}
	//断言字符串必须有值，去掉空格后，长度必须大于 0；
	@Test
	public void hasText() {
		AssertUtils.hasText("", "必须有值，去掉空格后，长度必须大于 0");
	}
	//断言不是正数
	@Test
	public void isNotPositive() {
		AssertUtils.isNotPositive(-1>0, "不是正数");
	
	}
	//断言是正数
	@Test
	public void isPositive() {
		AssertUtils.isPositive(1>0, "正数");
	}

}
