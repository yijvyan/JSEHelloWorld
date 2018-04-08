
/**    
* @Title: PrintWriterStreamDemo.java  
* @Package com.ioStream  
* @Description: TODO(打印流的学习；)  
* @author yijvyan  
* @date 2018年3月27日  
* @version V1.0    
*/

package com.ioStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/** @ClassName: PrintWriterStreamDemo
 * @Description: TODO(只有输出，没有输入；输出字节流或字符流；)
 * @author yijvyan
 * @date 2018年3月27日 */

public class PrintWriterStreamDemo
{
	
	/** @throws IOException
	 * @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("-------------------------------1.打印流的概述；---------------------------");
		
		//打印流：PrintStream		
		//PrintWriter：1.可自动换行，等价于println()；2.不能输出字节，但是可以输出其他任意类型；
		//3.通过某些配置，可以实现自动刷新（只有在调用println，printf或format才有用；）
		
		//注意：只能输出不能输入；
		
		//1.创建打印流对象；
		PrintWriter pw = new PrintWriter("printWriter.txt");
		
		//2.写出数据；
		pw.write("1.打印流写出数据；");
		pw.write("2.随便写点啥；");
		pw.write("3.那就HelloWorld吧；");
		
		//3.释放资源；
		pw.close();
		
		System.out.println("-------------------------------2.打印流的特有功能；---------------------------");
		
		//打印流的特有功能：1.自动换行 	   使用方法println()实现自动换行；
		//2.自动刷新	创建PrintWriter对象时启动自动刷新开关，再使用println等3个方法可以达到自动刷新的效果；
		
		//注意：1.创建FileWriter对象时boolean类型参数代表是否追加的意思；
		//	  2.创建打印流对象的boolean类型参数则代表是否自动刷新的意思；
		
		autoNewline();
		
		autoFlush();
		
		System.out.println("-------------------------------3.使用打印流复制文本文件；---------------------------");
		
		//使用打印流复制文本文件；
		//数据源		CopyBuffered.java			BufferedReader；
		//目的地		d:\\PrintWriterCB.java		PrintWriter；
		
		//1.创建输入流对象；
		BufferedReader br = new BufferedReader(new FileReader("CopyBuffered.java"));
		//2.创建打印流对象；
		PrintWriter pwC = new PrintWriter(new FileWriter("d:\\PrintWriterCB.java"), true);
		
		//3.读写操作；
		String line;//用于存储读取到的每行数据；
		while ((line = br.readLine()) != null)
		{
			pwC.println(line);
		}
		
		//4.释放资源；
		pwC.close();
		br.close();
		
	}
	
	/** @Title: autoFlush @Description: TODO(使用打印流的构造方法，实现自动刷新；) @param @throws
	 * IOException 参数 @return void 返回类型 @throws */
	
	private static void autoFlush() throws IOException
	{
		//1.创建打印流对象；
		//		PrintWriter pwP = new PrintWriter("printWriterPrintln.txt");
		PrintWriter pwF = new PrintWriter(new FileWriter("printWriterFlush.txt"), true);
		
		//2.写出数据；
		//		pw.write("1.打印流写出数据；");
		//		pw.write("2.随便写点啥；");
		//		pw.write("3.那就HelloWorld吧；");
		
		//		pwP.println("1.打印流写出数据；");
		pwF.print("1.打印流写出数据；");
		pwF.println("2.随便写点啥；");
		pwF.println("3.那就HelloWorld吧；");
		
		//3.释放资源；
		//		pwP.close();
	}
	
	/** @Title: autoNewline @Description:
	 *         TODO(使用println（）方法实现自动换行；) @param @throws FileNotFoundException
	 *         参数 @return void 返回类型 @throws */
	
	private static void autoNewline() throws FileNotFoundException
	{
		//1.创建打印流对象；
		PrintWriter pwP = new PrintWriter("printWriterPrintln.txt");
		
		//2.写出数据；
		//		pw.write("1.打印流写出数据；");
		//		pw.write("2.随便写点啥；");
		//		pw.write("3.那就HelloWorld吧；");
		
		//		pwP.println("1.打印流写出数据；");
		pwP.print("1.打印流写出数据；");
		pwP.println("2.随便写点啥；");
		pwP.println("3.那就HelloWorld吧；");
		
		//3.释放资源；
		pwP.close();
	}
	
}
