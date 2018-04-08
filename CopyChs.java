
/**    
* @Title: FileWriterDemo.java  
* @Package com.ioStream  
* @Description: TODO(IO流的学习，这里是输出流)  
* @author yijvyan  
* @date 2018年3月2日  
* @version V1.0    
*/

package com.ioStream;

import java.io.FileWriter;
import java.io.IOException;


/** @ClassName: FileWriterDemo
 * @Description: TODO(用来写文件，将数据写入硬盘中)
 * @author yijvyan
 * @date 2018年3月2日 */

public class FileWriterDemo
{
	
	/** @throws IOException
	 * @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("----------------------FileWriter写数据的步骤:四步走1，2，3，4-----------------------");
		//1.创建输出流对象
		FileWriter fw = new FileWriter("d:\\fileWriterFirst.txt");
		
		//2.调用输出流对象写数据的方法；写一个字符串
		fw.write("2.IO调用输出流对象写数据的方法；写一个字符串");
		
		//3.数据没有直接写文件，而是写到了内存缓冲区；需要刷新一下才可以
		fw.flush();
		
		//4.释放资源；通知系统释放和该文件相关的资源，可以删除文件
		fw.close();
		
		//while (true){}
		System.out.println("----------------------FileWriter中相对路径和绝对路径，flush和close之间的联系--------------------------------");
		//		FileWriter fwRA = new FileWriter("d:\\fWSecondAbsolute.txt");
		FileWriter fwRA = new FileWriter("fWSecondRelative.txt");
		
		//相对路径：相对当前项目而言的，在项目的根目录下（fwSecondRelative.txt）
		//绝对路径：以盘符开始的路径（d:\\fwSecondAbsolute.txt）
		
		fwRA.write("就是为了测试fw写入数据");
		//		fwRA.flush();
		fwRA.flush();
		fwRA.write("；flush刷新数据后，继续调用流对象写入数据，则两次写入的数据拼接在一起");
		fwRA.flush();
		
		//flush():刷新缓冲区；数据量大时，为保证写入数据，必须调用此方法。流对象还可以继续用
		//close():先刷新缓冲区，然后通知系统释放资源。数据量小时，可以不写flush（），直接close（）关闭，数据也可以写入；流对象不可以继续使用了
		
		fwRA.close();
		
		System.out.println("----------------------FW写数据的五种方法，1，2，3，4，5-------------------------------------------------------");
		FileWriter fwMethods = new FileWriter("fWThirdFiveMethods.txt");
		
		fwMethods.write("1.write(String str)写一个字符串数据；");
		fwMethods.write("2.wirte(String str,int index,int len)写一个字符串的一部分数据，从索引index开始，写长度len个字符", 0, 49);
		
		//3.write(int ch)写一个字符数据，写int类型是为了：1.可写成char类型的数据；（‘a’）;2.或者写char对应的int类型的值；（97）输出是是（‘a’）;
		fwMethods.write('a');
		fwMethods.write(97);
		
		//4.write(char[] chs)写一个字符数组数据；输出时是字符串
		char[] chs = { '；', '4', '.', '字', '符', '数', '组', '数', '据', '；', '输', '出', '时', '是', '字', '符', '串', '；' };
		fwMethods.write(chs);
		
		//5.write(char[] chs,int index,int len)写一个字符数组的一部分数据，从索引index开始，写长度len个字符
		fwMethods.write(chs, 3, 6);
		
		fwMethods.close();
		
		System.out.println("----------------------FW写数据时的换行和追加写----------------------------------------------------------");
		//		FileWriter fwLineAdd = new FileWriter("fWFourth.txt");
		FileWriter fwLineAdd = new FileWriter("fWFourth.txt", true);
		
		//实现数据的追加写入，就是写入的数据在txt中一直积累，不会消失
		//使用构造方法 FileWriter(String fileName,boolean append);boolean值默认为false，即不追加
		
		for (int x = 0; x < 10; x++)
		{
			fwLineAdd.write("换行操作和追加写" + x);
			//			fwLineAdd.write("\n");
			fwLineAdd.write("\r\n");
			
			// \n可实现换行，但是windows系统自带的记事本打开时，并未换行；这是由于：
			//windows识别的换行时 \r\n，不是\n
			//而linux识别的时 \n
			//mac : \r
		}
		
		fwLineAdd.close();
	}
	
}
