package com.chenweiguang.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamUtils {
	/**
	 * 
	 * @Title: closeAll 
	 * @Description: 方法1批量关闭流,参数能传无限个
	 * 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
	 * @return: void
	 */
	public static void closeAll(AutoCloseable ...autoCloseable) {
		if(null != autoCloseable) {
			for(AutoCloseable autoCloseable2:autoCloseable) {
				try {
					//关闭流
					autoCloseable2.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	/**
	 * 
	 * @Title: readTextFile 
	 * @Description: 方法2：
	 * 传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，要求方法内部调用上面第1个方法关闭流(3分)
	 * @param src
	 * @return
	 * @throws IOException
	 * @return: String
	 */
	public static String readTextFile(InputStream src) throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		byte[] b = new byte[1024];
		int i=0;
		while((i=src.read(b))!=-1) {
			out.write(b);
		}
		//关流
		closeAll(src,out);
		//以"UTF-8编码返回
		return out.toString("UTF-8");
		
	}
	/**
	 * 
	 * @Title: readTextFile 
	 * @Description: 方法3：
	 * 传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，
	* 记住了吗？少年…
	 * @param txtFile
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @return: String
	 */
	public static String readTextFile(File txtFile) throws FileNotFoundException, IOException {
		
		return readTextFile(new FileInputStream(txtFile));
		
	}

}
