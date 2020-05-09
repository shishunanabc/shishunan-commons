package com.shishunan.commons.utils;
/**
 * 文件工具类
 * @author 师述男
 *
 */
public class FileUtil {
	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”
	*/
	public static String getExtendName(String fileName){
		//获取文件名之后分割
		String[] split=fileName.split(",");
		//获取名字的后面部分
		String name="."+split[split.length];
		return name;
	}
}
