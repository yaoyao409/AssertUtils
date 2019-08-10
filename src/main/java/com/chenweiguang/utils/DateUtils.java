package com.chenweiguang.utils;


import java.util.Calendar;
import java.util.Date;
public class DateUtils {
	/**
	 * 
	 * @Title: randomDate 
	 * @Description: 方法1返回某个日期的随机日期
	 * @param startDate
	 * @return
	 * @return: Date
	 */
	public static Date randomDate(Date startDate) {
		//用当前时间获取日历类
		Calendar c = Calendar.getInstance();
		//当前时间的毫秒值..  即从1970到现在的毫米数
		long endMillis = c.getTimeInMillis();
		//用传入的日期初始化日历类Calendar
		c.setTime(startDate);
	//获取开始时间的毫米数
		long startMillis = c.getTimeInMillis();
		 long x = (long)( Math.random() * (endMillis - startMillis  +1)) + startMillis;
		 
	//用时间差创建日历类
		c.setTimeInMillis(x);
		return c.getTime();
	}
	/**
	 * 
	 * @Title: DateByInitMonth 
	 * @Description: 方法2返回月初
	 * 给一个时间对象,返回该时间所在月的1日0时0分0秒
	 * 例如一个Date对象的值是2019-05-18 11:37:22则返回的结果为2019-05-01 00:00:00
	 * @param src
	 * @return
	 * @return: Date
	 */
	public static Date ByInitMonth(Date src) {
		//获取Calendar对象
		Calendar c = Calendar.getInstance();
		//用传入的时间初始化日历对象
		c.setTime(src);
		//改变日期的,日,时,分,秒
		c.set(Calendar.DATE, 1);
		c.set(Calendar.HOUR, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		return c.getTime();
		
	}
	/**
	 * 
	 * @Title: ByFullMonth 
	 * @Description: 方法3返回月末
	 * 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	 * @param src
	 * @return
	 * @return: Date
	 */
	public static Date ByFullMonth(Date src) {
	//用传入的日期,初始化日历类. 然后让当前日期设置为下个月的月初,最后在
	//月初减去 1秒.  就能变成传入日期的月末了
		Calendar c = Calendar.getInstance();
		c.setTime(src);
		//让当前月份加1
		c.add(Calendar.MONTH, 1);
		//获取月初
		Date monthStart = ByInitMonth(c.getTime());
		//用月初初始化日历类
		c.setTime(monthStart);
		//用月初时间 -1秒
		c.add(Calendar.SECOND, -1);
		return c.getTime();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
