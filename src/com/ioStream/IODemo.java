
/**    
* @Title: IODemo.java  
* @Package com.ioStream  
* @Description: TODO(对IO流再次深入地学习；)  
* @author yijvyan  
* @date 2018年3月25日  
* @version V1.0    
*/

package com.ioStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/** @ClassName: IODemo
 * @Description: TODO(学习更多api的使用方法；)
 * @author yijvyan
 * @date 2018年3月25日 */

public class IODemo
{
	
	/** @throws IOException
	 * @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("--------------------------1.IO流的分类；-----------------------");
		
		//IO流的分类：1.按流向分：  1.1.输入流		读取数据		FileReader		Reader；
		//  				  1.2.输出流     	写出数据   		FileWriter		Writer；
		//			2.按数据类型分：
		//					  2.1.字节流：          2.1.1.字节输入流      		读取数据		InputStream；
		//					  		        2.1.2.字节输出流      		写出数据		OutputStream；
		//					  2.2.字符流：          2.1.1.字符输入流      		读取数据		Reader；
		//					  		        2.1.2.字符输出流      		写出数据		Writer；
		
		System.out.println("--------------------------2.字符流复制文本文件；-----------------------");
		
		//使用字符流复制文本文件；
		//数据源    Copy.java  			目的地     d:\\Copy.java；
		
		//1.创建字符输入流对象；
		FileReader fr = new FileReader("Copy.java");
		//2.创建字符输出流对象；
		FileWriter fw = new FileWriter("d:\\IOCopy.java");
		
		//3.1.一次读写一个字符；
		//		int ch;
		//		while ((ch = fr.read()) != -1)
		//		{
		//			fw.write(ch);
		//			fw.flush();
		//		}
		
		//3.2.一次读写一个字符数组；
		int len;//用于存储读到的字符个数；
		char[] chs = new char[1024];
		while ((len = fr.read(chs)) != -1)
		{
			fw.write(chs, 0, len);
			fw.flush();
		}
		
		//4.释放资源；
		fw.close();
		fr.close();
		
		System.out.println("--------------------------4.分别使用字符流和字节流进行图片的复制；-----------------------");
		
		//分别使用字符流和字节流进行图片的复制；
		//二进制文件只能使用字节流进行复制（即使用windows自带的记事本打开后是乱码，不能读懂的文件）；
		//文本文件的复制既可以使用字符流，也可以使用字节流；
		
		//1.使用字符流：
		//1.1.创建字符输入流对象；
		FileReader frR = new FileReader("CodeMonkey.png");
		//1.2.创建字符输出流对象；
		FileWriter fwR = new FileWriter("d:\\IOCodeMonkey.png");
		
		//1.3.一次读写一个字符数组；
		int lenR;//用于存储读到的字符个数；
		char[] chsR = new char[1024];
		while ((lenR = frR.read(chsR)) != -1)
		{
			fwR.write(chsR, 0, lenR);
			fwR.flush();
		}
		
		//1.4.释放资源；
		fwR.close();
		frR.close();
		
		//2.使用字节流：
		//2.1.创建字节输入流对象；
		FileInputStream fis = new FileInputStream("CodeMonkey.png");
		//2.2.创建字节输出流对象；
		FileOutputStream fos = new FileOutputStream("d:\\StreamCodeMonkey.png");
		
		//2.3.一次读写一个字符数组；
		int lenS;//用于存储读到的字符个数；
		byte[] bys = new byte[1024];
		while ((lenS = fis.read(bys)) != -1)
		{
			fos.write(bys, 0, lenS);
		}
		
		//2.4.释放资源；
		fos.close();
		fis.close();
		
		System.out.println("--------------------------6.字节流复制文本文件；-----------------------");
		
		//使用字节流复制文本文件；
		//数据源     Copy.java				目的地         d:\\file\\StreamCopy.java；
		
		//1.创建字节输入流对象；
		FileInputStream fisS = new FileInputStream("Copy.java");
		//2.创建字节输出流对象；
		FileOutputStream fosS = new FileOutputStream("d:\\file\\StreamCopy.java");
		
		//3.1.一次读写一个字节；
		//		int by;
		//		while ((by = fisS.read()) != -1)
		//		{
		//			fosS.write(by);
		//		}
		
		//3.2.一次读写一个字符数组；
		int lenSF;//用于存储读到的字符个数；
		byte[] bysF = new byte[1024];
		while ((lenSF = fisS.read(bysF)) != -1)
		{
			fosS.write(bysF, 0, lenSF);
		}
		
		//4.释放资源；
		fosS.close();
		fisS.close();
		
		System.out.println("--------------------------7.将指定目录(包含内容)复制到另一个目录中（案例分析）；-----------------------");
		
		//需求：将指定目录（包含内容）复制到另一个目录中；
		//源目录 			目标目录；
		//分析：1.首先要获取源目录下所有的文件和子目录；
		//		1.1.把源目录封装成一个File对象；
		//		1.2.调用File类的listFiles()方法；
		//		1.3.获取源目录下所有的文件和子目录所对应的File对象；
		//	  2.若获取到的是文件；
		//		2.1.先在目标目录中创建该文件所对应的目录；
		//		2.2.进行文件的复制；
		//	  3.若获取到的子目录；
		//		3.1.检查子目录下是否还有其他的文件和更深层次的子目录；
		
		System.out.println("--------------------------8.将指定目录(包含内容)复制到另一个目录中（案例实现）；-----------------------");
		
		//源目录：d:\win10ActivationTool
		File src = new File("d:\\win10ActivationTool");
		//目标目录：d:\file
		File dest = new File("d:\\file");
		
		copyDir(src, dest);
		
	}
	
	/** @throws IOException
	 * @Title: copyDir @Description: TODO(将指定目录（包含内容）复制到另一个目录中；) @param @param
	 *         src @param @param dest 参数 @return void 返回类型 @throws */
	
	private static void copyDir(File src, File dest) throws IOException
	{
		//1.为了严谨起见，首先要对源目录和目标目录进行判断，检查其是否为目录；
		if (src.isDirectory() && dest.isDirectory())
		{
			File newDir = new File(dest, src.getName());
			if (!newDir.exists())
			{
				newDir.mkdir();
			}
			
			//2.获取源目录下所有的文件和子目录；
			File[] files = src.listFiles();
			for (File file : files)
			{
				if (file.isFile())
				{
					//2.1.如果File对象是文件，就进行文件的复制；
					//假设file对象指向的文件是d:\\win10ActivationTool\\KMSAuto Net.exe
					//要把这个文件复制到：d:\\file\\win10ActivationTool
					
					//src:		d:\\win10ActivationTool
					//dest:		d:\\file
					//file:		d:\\win10ActivationTool\\KMSAuto Net.exe
					//"d:\\file" + "win10ActivationTool" = "d:\\file\\win10ActivationTool"
					
					//d:\\file\\win10ActivationTool
					//					File newDir = new File(dest.getAbsolutePath()+src.getName());
					//					File newDir = new File(dest.getAbsolutePath(), src.getName());
					//					File newDir = new File(dest, src.getName());
					//					if (!newDir.exists())
					//					{
					//						newDir.mkdir();
					//					}
					
					//2.1.1.创建输入流对象；
					FileInputStream fis = new FileInputStream(file);
					//2.1.2.创建输出流对象；
					//"d:\\file\\win10ActivationTool" + "KMSAuto Net.exe" = "d:\\file\\win10ActivationTool\\KMSAuto Net.exe"；
					FileOutputStream fos = new FileOutputStream(new File(newDir, file.getName()));
					
					byte[] bys = new byte[1024];
					int len;
					
					while ((len = fis.read(bys)) != -1)
					{
						fos.write(bys, 0, len);
					}
					
					fis.close();
					fos.close();
					
				}
				else if (file.isDirectory())
				{
					//2.2.如果File对象是子目录，那就采用递归，查看子目录下到底有什么；
					
					//src:			d:\\win10ActivationTool
					//dest:		    d:\\file
					//新的源目录：		d:\\win10ActivationTool\\readme
					//新的目标目录：         d:\\file\\win10ActivationTool
					//					File newDir = new File(dest, src.getName());
					//					if (!newDir.exists())
					//					{
					//						newDir.mkdir();
					//					}
					
					copyDir(file, newDir);
					
				}
			}
		}
	}
	
}
