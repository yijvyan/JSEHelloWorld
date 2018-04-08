
/**    
* @Title: CopyFileFiveMethod.java  
* @Package com.ioStream  
* @Description: TODO(主要是为了学习复制文本文件的5中方法)  
* @author yijvyan  
* @date 2018年3月3日  
* @version V1.0    
*/

package com.ioStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/** @ClassName: CopyFileFiveMethod
 * @Description: TODO(fR&fW共两种，bR&bW三种（多了一种特殊功能）)
 * @author yijvyan
 * @date 2018年3月3日 */

public class CopyFileFiveMethod
{
	
	/** @throws IOException
	 * @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args) throws IOException
	{
		String srcFileName = "FileWriterDemo.java";
		String destFileName = "CopyFileFive.java";
		
		//		method1(srcFileName, destFileName);
		//		method2(srcFileName, destFileName);
		//		method3(srcFileName, destFileName);
		//		method4(srcFileName, destFileName);
		//		//推荐使用第五种：特殊功能
		method5(srcFileName, destFileName);
	}
	
	//1.基本流---一次读写一个字符
	public static void method1(String srcFileName, String destFileName) throws IOException
	{
		FileReader fR = new FileReader(srcFileName);
		FileWriter fW = new FileWriter(destFileName);
		
		int ch;
		while ((ch = fR.read()) != -1)
		{
			fW.write(ch);
		}
		
		fW.close();
		fR.close();
	}
	
	//2.基本流---一次读写一个字符数组
	public static void method2(String srcFileName, String destFileName) throws IOException
	{
		FileReader fR = new FileReader(srcFileName);
		FileWriter fW = new FileWriter(destFileName);
		
		char[] chs = new char[1024];
		int len;
		while ((len = fR.read(chs)) != -1)
		{
			fW.write(chs, 0, len);
		}
		
		fW.close();
		fR.close();
	}
	
	//3.缓冲流---一次读写一个字符
	public static void method3(String srcFileName, String destFileName) throws IOException
	{
		BufferedReader bR = new BufferedReader(new FileReader(srcFileName));
		BufferedWriter bW = new BufferedWriter(new FileWriter(destFileName));
		
		int ch;
		while ((ch = bR.read()) != -1)
		{
			bW.write(ch);
		}
		
		bW.close();
		bR.close();
	}
	
	//4.缓冲流---一次读写一个字符数组
	public static void method4(String srcFileName, String destFileName) throws IOException
	{
		BufferedReader bR = new BufferedReader(new FileReader(srcFileName));
		BufferedWriter bW = new BufferedWriter(new FileWriter(destFileName));
		
		char[] chs = new char[1024];
		int len;
		while ((len = bR.read(chs)) != -1)
		{
			bW.write(chs, 0, len);
		}
		
		bW.close();
		bR.close();
	}
	
	//5.缓冲流的特殊功能---一次读写一个字符串---------推荐使用
	public static void method5(String srcFileName, String destFileName) throws IOException
	{
		BufferedReader bR = new BufferedReader(new FileReader(srcFileName));
		BufferedWriter bW = new BufferedWriter(new FileWriter(destFileName));
		
		String line;
		while ((line = bR.readLine()) != null)
		{
			bW.write(line);
			bW.newLine();
			bW.flush();
		}
		
		bW.close();
		bR.close();
	}
	
}
