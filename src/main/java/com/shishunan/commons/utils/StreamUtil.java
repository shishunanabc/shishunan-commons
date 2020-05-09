package com.shishunan.commons.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.stream.FileImageInputStream;

/**
 * 流处理工具类
 * @author 师述男
 *
 */
public class StreamUtil {
	/*
	* 方法1：批量关闭流，参数能传入无限个。
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭，并且参数个数不限。
	*/
	public static void closeAll(FileImageInputStream file,InputStream src) throws IOException{
		file.close();
	}
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(10分)，要求方法内部调用上面第1个方法关闭流
	*/
	public static int readTextFile(InputStream src) throws IOException{
		int read=src.read();
		//调用第一个
		StreamUtil.closeAll(null, src);
		return read;
	}
	/*
	* 方法3：传入文本文件对象，返回该文件内容，并且要求内部调用上面第2个方法(。* 这是典型的方法重载，记住了吗？少年…
	*/
	public static String readTextFile(File txtFile){
		//调用第二个
		return StreamUtil.readTextFile(txtFile);
	}
}
