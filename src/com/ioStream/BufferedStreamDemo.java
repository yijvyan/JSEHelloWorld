
/**    
* @Title: BufferedStreamDemo.java  
* @Package com.ioStream  
* @Description: TODO(缓冲流的学习)  
* @author yijvyan  
* @date 2018年3月2日  
* @version V1.0    
*/

package com.ioStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/** @ClassName: BufferedStreamDemo
 * @Description: TODO(输出缓冲流BufferedWriter和输入缓冲流BufferedReader的学习)
 * @author yijvyan
 * @date 2018年3月2日 */

public class BufferedStreamDemo
{
	
	/** @throws IOException
	 * @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("---------------------BufferedWriter输出缓冲流&BufferdReader输入缓冲流的学习--------------------------------------------------");
		
		//BufferedWriter:将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入
		//BufferedReader:从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取
		//缓冲流对数据的读写底层还是用的是基本流，所使用的方法也是基本流的方法，只是创建对象时较麻烦而已，但是效率高
		
		BufferedWriter bW = new BufferedWriter(new FileWriter("bwFirst.txt"));
		
		bW.write("输出缓冲流来写入数据，写入的是字符串！");
		bW.flush();
		bW.close();
		
		BufferedReader bR = new BufferedReader(new FileReader("FileWriterDemo.java"));
		
		//一次读写一个字符
		//int ch;
		//while ((ch = bR.read()) != -1)
		//{
		//	System.out.print((char) ch);
		//}
		
		//bR.close();
		
		//一次读写一个字符组
		char[] chs = new char[1024];
		int len;
		while ((len = bR.read(chs)) != -1)
		{
			System.out.print(new String(chs, 0, len));
		}
		
		bR.close();
		
		System.out.println(
				"---------------------练习1.BufferedReader&BufferedWriter将项目路径下的FileWriterDemo.java中的内容复制到同路径下的CopyBuffered.java中----------------------------------------------");
		
		BufferedReader bRFW = new BufferedReader(new FileReader("FileWriterDemo.java"));
		BufferedWriter bWC = new BufferedWriter(new FileWriter("CopyBuffered.java"));
		
		//一次读写一个字符
		//int chF;
		//while ((chF = bRFW.read()) != -1)
		//{
		//	bWC.write(chF);
		//}
		
		//一次读写一个字符数组
		char[] chsC = new char[1024];
		int lenC;
		while ((lenC = bRFW.read(chsC)) != -1)
		{
			bWC.write(chsC, 0, lenC);
		}
		
		bWC.close();
		bRFW.close();
		
		System.out.println("---------------------BW&BR的特殊功能，BW的newLine()方法，BR的readLine()方法----------------------------------------------");
		BufferedWriter bWNewLine = new BufferedWriter(new FileWriter("bwNewLine.txt"));
		
		for (int x = 0; x < 10; x++)
		{
			bWNewLine.write("缓冲流的newLine()提供换行功能  " + x);
			//bWNewLine.write("\r\n");
			
			//1.void newLine():就是一个换行符，提供换行功能，这个换行符由系统决定
			//windows:\r\n  linux:\n  mac:\r
			bWNewLine.newLine();
			
			bWNewLine.flush();
		}
		bWNewLine.close();
		
		BufferedReader bRReadLine = new BufferedReader(new FileReader("bRReadLine.txt"));
		
		//2.Sting readLine():一次读取一行数据，但是不读取换行符；就是说，遇到换行符就停止读取
		//String line = bRReadLine.readLine();
		//System.out.println("BR的ReadLine()方法一次读一行： " + line);
		
		//line = bRReadLine.readLine();
		//System.out.println("BR的ReadLine()方法一次读一行： " + line);
		
		//BR的ReadLine()方法一次读一行，字符读完了，此时为null；即返回值为null时，循环条件结束
		//line = bRReadLine.readLine();
		//System.out.println("BR的ReadLine()方法一次读一行，字符读完了，此时为： " + line);
		
		String line;
		while ((line = bRReadLine.readLine()) != null)
		{
			//			System.out.print(line);
			//由于BR的readLine()方法，不读取换行符，故输出时不加ln，则不会换行
			System.out.println(line);
		}
		
		bRReadLine.close();
		
		System.out.println(
				"---------------------练习2.BR&BW特殊功能。将项目路径下的FileWriterDemo.java中的内容复制到同路径下的CopyNewLineReadLine.java中--------------------------------------------------");
		BufferedReader bRFWLine = new BufferedReader(new FileReader("FileWriterDemo.java"));
		BufferedWriter bWCLine = new BufferedWriter(new FileWriter("CopyNewLineReadLine.java"));
		
		String lineC;
		while ((lineC = bRFWLine.readLine()) != null)
		{
			bWCLine.write(lineC);
			bWCLine.newLine();
			bWCLine.flush();
		}
		
		bWCLine.close();
		bRFWLine.close();
		
	}
	
}
