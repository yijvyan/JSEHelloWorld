
/**    
* @Title: FileReaderDemo.java  
* @Package com.ioStream  
* @Description: TODO(输入流FileReader的学习)  
* @author yijvyan  
* @date 2018年3月2日  
* @version V1.0    
*/

package com.ioStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/** @ClassName: FileReaderDemo
 * @Description: TODO(学习输入流的api)
 * @author yijvyan
 * @date 2018年3月2日 */

public class FileReaderDemo
{
	
	/** @throws IOException
	 * @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("-------------------------FileReader输入流的学习-------------------------------------------------");
		
		//1.创建输入流对象
		//		FileReader fr = new FileReader("fRFirst.txt");
		FileReader fr = new FileReader("FileWriterDemo.java");
		
		//2.调用输入流对象的读取方法;
		//int read():一次读取一个字符，返回值还是字符对应的asc码值
		
		//2.1第一次读取
		//		int ch = fr.read();
		//		System.out.println("输出的是字符对应的asc码值：" + ch);
		//		System.out.println("强转成字符，是： " + ((char) ch));
		
		//2.2第二次读取
		//		ch = fr.read();
		//		System.out.println("输出的是字符对应的asc码值：" + ch);
		//		System.out.println("强转成字符，是： " + ((char) ch));
		
		//2.3第三次读取
		//		ch = fr.read();
		//		System.out.println("输出的是字符对应的asc码值：" + ch);
		//		System.out.println("强转成字符，是： " + ((char) ch));
		
		//2.4第四次读取
		//		ch = fr.read();
		//		System.out.println("输出的是字符对应的asc码值：" + ch);
		//		System.out.println("强转成字符，是： " + ((char) ch));
		
		//当输出的ch对应的asc码值为-1时，说明没有数据了，即循环的结束条件；
		//一次全部读完的话，就是：
		int ch;
		while ((ch = fr.read()) != -1)
		{
			//			System.out.println("读取到的数据经强转后的字符，是：" + ((char) ch));
			
			//不需要换行
			//			System.out.print(" 读取到的数据经强转后的字符，是：" + ((char) ch));
			System.out.print(((char) ch));
		}
		
		//3.释放资源
		fr.close();
		
		System.out.println(
				"---------------------------练习1.FileReader&FileWriter一次读写一个字符复制文本文件；将项目路径下的FileWriterDemo.java中的内容复制到同路径下的Copy.java中--------------------------------------------------");
		
		FileReader fRFW = new FileReader("FileWriterDemo.java");
		FileWriter fWC = new FileWriter("Copy.java");
		
		int chF;
		while ((chF = fRFW.read()) != -1)
		{
			fWC.write(chF);
		}
		
		//两个流对象，先后关闭顺序不影响
		fWC.close();
		fRFW.close();
		
		System.out.println("---------------------------FileReader输入流的第二种读取字符的方法：读数据一次读取一个字符数组----------------------------------------------------------");
		//FileReader fRChs = new FileReader("fRSecond.txt");
		FileReader fRChs = new FileReader("FileWriterDemo.java");
		
		//调用输入流对象的读数据方法;int read(char[] chs),一次读取一个字符数组的数据
		//定义一个大概长度的字符数组，在此长度为5
		//char[] chs = new char[5];
		
		//由于计算机的存储之间的进制都是1024，1GB=1024MB，所以在这定义数组长度是1024的整数倍
		char[] chs = new char[1024];
		
		//第一次读数据；hello；读了5个字符
		//将读取到的字符存储在字符数组（长度为5）中，返回值是读取的字符个数，并不是数组的长度，因为有可能读不到字符，此时返回值为-1
		//		int len = fRChs.read(chs);
		//		System.out.println("读取到的字符个数len为： " + len);
		//System.out.println("输出该字符数组，此时转换成字符串输出： " + new String(chs));
		//		System.out.println("输出该字符数组，此时转换成字符串输出： " + new String(chs, 0, len));
		
		//第二次读数据； \r\n是换行符，可以读取到，但是显示不了，是两个字符，显示是：(\r\n显示出来是换行)wor；也是读了5个字符
		//		len = fRChs.read(chs);
		//		System.out.println("读取到的字符个数len为： " + len);
		//System.out.println("输出该字符数组，此时转换成字符串输出： " + new String(chs));
		//		System.out.println("输出该字符数组，此时转换成字符串输出： " + new String(chs, 0, len));
		
		//第三次读数据；（ld；读了2个字符；输出显示是：ld）
		//我又在fRSecond.txt中，world后面加了一个换行，就是点击了Enter键，让光标换到了下一行，保持和视频里一样
		//此时读到的数据为：ld\r\n；4个字符；输出显示是：ld(\r\n显示换行)r，
		//由于第二次读的时候，字符数组中存储的是\r\nwor，这次读入的数据存入数组中，只是替换掉了\r\nwo，并未替换掉索引4上的元素r
		//但是这个是不对的，正确的显示是：ld(\r\n显示换行)，没有r；
		//输出时转换成字符串，就要用 new String(chs,0,len)，截取读到的个数的字符串输出出来，没读到的就不要输出（如索引4上的元素r）
		//		len = fRChs.read(chs);
		//		System.out.println("读取到的字符个数len为： " + len);
		//System.out.println("输出该字符数组，此时转换成字符串输出： " + new String(chs));
		//		System.out.println("输出该字符数组，此时转换成字符串输出： " + new String(chs, 0, len));
		
		//第四次读数据；此时已经没有数据了，所以读了0个字符，但是此时输出的len的返回值是-1，说明没有数据了，即循环结束的条件
		//然而字符数组中存储的还是第三次读取到的数据，所以输出显示是：和第三次输出显示一样
		//但是这时候若使用 new String(chs,0,len)，由于len长度为-1，故使用此构造方法时，就会报字符串索引越界异常 
		//		len = fRChs.read(chs);
		//		System.out.println("读取到的字符个数len为： " + len);
		//System.out.println("输出该字符数组，此时转换成字符串输出： " + new String(chs));
		//System.out.println("输出该字符数组，此时转换成字符串输出： " + new String(chs, 0, len));
		
		int len;
		while ((len = fRChs.read(chs)) != -1)
		{
			//System.out.println("输出该字符数组，此时转换成字符串输出： " + new String(chs, 0, len));
			//本身就有换行，不需要ln
			//System.out.print("输出该字符数组，此时转换成字符串输出： " + new String(chs, 0, len));
			System.out.print(new String(chs, 0, len));
		}
		
		fRChs.close();
		
		System.out.println(
				"---------------------------练习2.FR&FW一次读写一个字符数组复制文本文件，效率比读写一个字符要高。将项目路径下的FileWriterDemo.java中的内容复制到同路径下的CopyChs.java中--------------------------------------------------");
		
		FileReader fRChsToC = new FileReader("FileWriterDemo.java");
		FileWriter fWCopy = new FileWriter("CopyChs.java");
		
		char[] chsC = new char[1024];
		int lenC;
		while ((lenC = fRChsToC.read(chsC)) != -1)
		{
			fWCopy.write(chsC, 0, lenC);
		}
		
		fWCopy.close();
		fRChsToC.close();
	}
	
}
