
/**    
* @Title: SystemInOutDemo.java  
* @Package com.ioStream  
* @Description: TODO(标准输入及输出流的学习；)  
* @author yijvyan  
* @date 2018年3月27日  
* @version V1.0    
*/

package com.ioStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;


/** @ClassName: SystemInOutDemo
 * @Description: TODO(System类的两个方法，很常用；以及转换流的使用；)
 * @author yijvyan
 * @date 2018年3月27日 */

public class SystemInOutDemo
{
	
	/** @throws IOException
	 * @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("-----------------------------1.标准输入输出流概述；--------------------------");
		
		//标准输入输出流：1.public static final InputStream in：字节输入流，用来读取键盘录入的数据；
		//        public static final int x;
		//        InputStream is = System.in;
		//		  Scanner sc = new Scanner(System.in);
		//	  2.public static final PrintStream out：字节输出流，将数据输出到命令行；
		//		  System.out.println();
		
		System.out.println("-----------------------------2.OutputStreamWriter的概述和使用；--------------------------");
		
		//需求：读取项目根目录下的CopyBuffered.java，并输出到命令行；
		//数据源：项目根目录下的CopyBuffered.java			BufferedReader
		//目的地：命令行 	System.out
		
		//注意：1.由于标准输出流是一个字节输出流，故只能输出字节或字节数组；
		//2.但此时读取到的是字符串，若想输出还得转换成字节数组；
		//3.若要标准输出流输出字符串，即将标准输出流转换成一种字符输出流即可，OutputStreamWriter；
		//OutputStreamWriter(OutputStream out);
		
		//		sysoByte();
		
		//		sysoWriter();
		
		sysoBufferWriter();
		
		System.out.println("-----------------------------3.InputStreamReader的概述和使用；--------------------------");
		
		//需求：读取键盘录入的数据，并输出到项目根目录下的systemInOut.txt；
		//数据源：读取键盘录入的数据					System.in；
		//目的地：项目根目录下的systemInOut.txt		FileWriter；
		
		//注意：转换流，需要把字节输入流转换成字符输入流，InputStreamReader；
		//InputStreamReader(InputStream in);
		
		//		sysi();
		
		//1.创建输入流对象；
		InputStream is = System.in;
		Reader r = new InputStreamReader(is);
		//2.创建输出流对象；
		FileWriter fw = new FileWriter("systemInOut.txt");
		
		//3.读写数据；
		//		byte[] bys = new byte[1024];
		char[] chs = new char[1024];
		int len;//用于存储读取到的字节个数；
		while ((len = r.read(chs)) != -1)
		{
			//注意：字符输出流只能输出字符或字符串，不能输出字节；
			//			fw.write(new String(bys));
			
			fw.write(chs, 0, len);
			fw.flush();
		}
		
		//4.释放资源；
		fw.close();
		r.close();
		
	}
	
	/** @Title: sysi @Description: TODO(标准输入流直接使用字节读取数据；) @param @throws
	 *         IOException 参数 @return void 返回类型 @throws */
	
	private static void sysi() throws IOException
	{
		//1.创建输入流对象；
		InputStream is = System.in;
		//2.创建输出流对象；
		FileWriter fw = new FileWriter("systemInOut.txt");
		
		//3.读写数据；
		byte[] bys = new byte[1024];
		int len;//用于存储读取到的字节个数；
		while ((len = is.read(bys)) != -1)
		{
			//注意：字符输出流只能输出字符或字符串，不能输出字节；
			fw.write(new String(bys));
			fw.flush();
		}
		
		//4.释放资源；
		fw.close();
		is.close();
	}
	
	/** @Title: sysoBufferWriter @Description:
	 *         TODO(使用高效流将转换流输出优化，提高效率的同时，减少代码；) @param @throws
	 *         FileNotFoundException @param @throws IOException 参数 @return void
	 *         返回类型 @throws */
	
	private static void sysoBufferWriter() throws FileNotFoundException, IOException
	{
		//1.创建输入流对象；
		BufferedReader br = new BufferedReader(new FileReader("CopyBuffered.java"));
		//2.创建输出流对象；
		//		OutputStream os = System.out;
		//多态，父类型引用指向子类对象；
		//		Writer w = new OutputStreamWriter(System.out);
		//		BufferedWriter bw = new BufferedWriter(w);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//3.一次读取一行；(进行数据的读写)；
		String line;//用于存储读取到的数据；
		while ((line = br.readLine()) != null)
		{
			//注意：标准输出流只能输出字节；
			//			os.write(line.getBytes());
			//			os.write("\r\n".getBytes());
			
			//			w.write(line);
			//			w.write("\r\n");
			
			bw.write(line);
			bw.newLine();
		}
		
		//4.释放资源；
		bw.close();
		br.close();
	}
	
	/** @Title: sysoWriter @Description:
	 *         TODO(和标准输出流比，就是不用再将字符串转换成字节或字节数组了；) @param @throws
	 *         FileNotFoundException @param @throws IOException 参数 @return void
	 *         返回类型 @throws */
	
	private static void sysoWriter() throws FileNotFoundException, IOException
	{
		//1.创建输入流对象；
		BufferedReader br = new BufferedReader(new FileReader("CopyBuffered.java"));
		//2.创建输出流对象；
		//		OutputStream os = System.out;
		//多态，父类型引用指向子类对象；
		Writer w = new OutputStreamWriter(System.out);
		
		//3.一次读取一行；(进行数据的读写)；
		String line;//用于存储读取到的数据；
		while ((line = br.readLine()) != null)
		{
			//注意：标准输出流只能输出字节；
			//			os.write(line.getBytes());
			//			os.write("\r\n".getBytes());
			w.write(line);
			w.write("\r\n");
		}
		
		//4.释放资源；
		w.close();
		br.close();
	}
	
	/** @Title: sysoByte @Description:
	 *         TODO(标准输出流输出的是字节或字节数组，但读取的是字符串，所以还要转换；) @param @throws
	 *         FileNotFoundException @param @throws IOException 参数 @return void
	 *         返回类型 @throws */
	
	private static void sysoByte() throws FileNotFoundException, IOException
	{
		//1.创建输入流对象；
		BufferedReader br = new BufferedReader(new FileReader("CopyBuffered.java"));
		//2.创建输出流对象；
		OutputStream os = System.out;
		
		//3.一次读取一行；
		String line;//用于存储读取到的数据；
		while ((line = br.readLine()) != null)
		{
			//注意：标准输出流只能输出字节；
			os.write(line.getBytes());
			os.write("\r\n".getBytes());
		}
		
		//4.释放资源；
		os.close();
		br.close();
	}
	
}
