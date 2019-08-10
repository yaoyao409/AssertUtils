package com.chenweiguang.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 
 * @ClassName: RandomUtils 
 * @Description: 随机数的处理
 * @author: 夭夭
 * @date: 2019年7月11日 上午11:19:49
 */
public class RandomUtils {
	/**
	 * 
	 * @Title: random 
	 * @Description: 方法1返回min-max之间的随机整数
	 * @param min
	 * @param max
	 * @return
	 * @return: int
	 */
	public static int random(int min, int max) {
		// TODO Auto-generated method stub'
		Random r = new Random();
		return r.nextInt(max-min+1)+min;
	}
	/**
	 * 
	 * @Title: randomCharacter 
	 * @Description: 方法2返回一个1-9,a-z之间的随机数
	 * @return
	 * @return: char
	 */
	public static char randomCharacter() {
		String str="1234567890abcdefghijklmnopqrstevwxyzABCDEFGHIJKLMNOPQRSTEVWXYZ";
		return str.charAt(random(0,str.length()-1));	
	}
	
	/**
	 * 
	 * @Title: subRandom 
	 * @Description: 方法3 测试最小值与最大值之间截取subs不重复的随机数
	 * @param min
	 * @param max
	 * @param subs
	 * @return
	 * @return: int[]
	 */
	public static int[] subRandom(int min,int max,int subs) {
		//定义数组
		int[] values=new int[subs];
		Set<Integer> set = new HashSet<>();
		while(set.size()!=subs) {
			set.add(random(min, max));
		}
		int j=0;
		for (Integer integer : set) {
			values[j]=integer;
			j++;
		}
		return values;
	}
	/**
	 * 
	 * @Title: randomString 
	 * @Description: 方法4 返回参数lengh个字符串,方法内部调用randomCharacter方法
	 * @param length
	 * @return
	 * @return: String
	 */
	public static String randomString(int length) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<length;i++) {
			sb.append(randomCharacter());
		}
		return sb.toString();
		
	}

	

}
