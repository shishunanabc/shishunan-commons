package com.shishunan.commons.utils;

import java.util.Date;

/**
 * 日期工具类
 * @author 师述男
 *
 */
public class DateUtil {
	/*
	* 方法1：
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	@SuppressWarnings("deprecation")
	public static String getDateByInitMonth(Date src){
		//获取年月
		int year =src.getYear();
		int month=src.getMonth();
		String data=year+"-"+month+"-01"+"00:00:00";
		return data;
	}
	/*
	* 方法2：
	* 给任意一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	@SuppressWarnings("deprecation")
	public static String getDateByFullMonth(Date src){
		//获取年月
		int year =src.getYear();
		int month=src.getMonth();
		String data=year+"-"+month+"-31"+"23:59:59";
		return data;
	}
}
