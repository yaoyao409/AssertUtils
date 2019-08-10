package com.chenweiguang.test;

import static org.junit.Assert.fail;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;

import org.junit.Test;

import com.chenweiguang.entity.Persons;
import com.chenweiguang.utils.DateUtils;
import com.chenweiguang.utils.RandomUtils;
import com.chenweiguang.utils.StringUtils;

public class dateUtilsTest {
	/*@Test
	public void Person() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 1);
		for(int i=0;i<10000;i++) {
			Persons person = new Persons(StringUtils.generateChineseName(),RandomUtils.random(1, 120),
					StringUtils.randomChineseString(140),
					DateUtils.randomDate(c.getTime()));
			System.out.println(person);
		}
	}
	@Test
	public void dateUtils() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 1);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		for(int i=0;i<100;i++) {
			Date date = DateUtils.randomDate(c.getTime());
			System.out.println(df.format(date));
		}
	}
	*//**
	 * 
	 * @Title: test1 
	 * @Description: 
	 * 将上面{1}的位置使用DateUtil工具类中的getDateByInitMonth()返回值替换，
	 * 将上面{2}的位置使用DateUtil
	 * 工具类中的getDateByFullMonth()返回值替换。最后打印出正确拼接的SQL字符串
	 * @return: void
	 *//*
	@Test
	public void test1() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String startDate = df.format(DateUtils.ByInitMonth(new Date()));
		String endDate = df.format(DateUtils.ByFullMonth(new Date()));
		String sql="select * from t_order where create_time>='{1}'"
				+ " and create_time<='{2}' ";
		String sql1=sql.replace("{1}", startDate);
		String sql2 = sql.replace("{2}", endDate);
		System.out.println(sql2);
	}
	@Test
	public void testRandomDate() {
	}
	//测试月初
	@Test
	public void testByInitMonth() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = DateUtils.ByInitMonth(new Date());
		System.out.println(df.format(date));
	}
	//测试月末
	@Test
	public void testByFullMonth() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, 1);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = DateUtils.ByFullMonth(c.getTime());
		System.out.println(df.format(date));
		
	}
*/
}
