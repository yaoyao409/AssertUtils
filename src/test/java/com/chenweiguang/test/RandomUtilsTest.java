package com.chenweiguang.test;

import org.junit.Test;

import com.chenweiguang.utils.RandomUtils;

public class RandomUtilsTest {
	/**
	 * 
	 * @Title: random 
	 * @Description: 测试1返回min-max之间的随机整数
	 * @return: void
	 */
	/*@Test
	public void random() {
		for(int i=0;i<10;i++) {
			int ran = RandomUtils.random(1,10);
			System.out.println(ran);
		}
	}
	*//**
	 * 
	 * @Title: RandomCharacter 
	 * @Description: 测试2返回一个1-9,a-z之间的随机数
	 * @return: void
	 *//*
	@Test
	public void RandomCharacter() {
		for(int i=0;i<10;i++) {
			System.out.println(RandomUtils.randomCharacter());
		}
	}
	*//**
	 * 
	 * @Title: subRandom 
	 * @Description: 测试3 测试最小值与最大值之间截取subs不重复的随机数
	 * @return: void
	 *//*
	@Test
	public void subRandom() {
		int[] sub = RandomUtils.subRandom(1, 10, 3);
		for(int i : sub) {
			System.out.println(i);
		}
	}
	*//**
	 * 
	 * @Title: randomString 
	 * @Description: 测试4 返回参数lengh个字符串
	 * @return: void
	 *//*
	@Test
	public void randomString() {
		for(int i=0;i<10;i++) {
			System.out.println(RandomUtils.randomString(4));
		}
	}*/
	

}
