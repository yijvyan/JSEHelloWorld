
/**    
* @Title: FileDemo.java  
* @Package com.ioStream  
* @Description: TODO(对File类的学习；)  
* @author yijvyan  
* @date 2018年3月20日  
* @version V1.0    
*/

package com.ioStream;

import java.io.File;
import java.io.IOException;
import java.util.Date;


/** @ClassName: FileDemo
 * @Description: TODO(构造方法和常用功能；)
 * @author yijvyan
 * @date 2018年3月20日 */

public class FileDemo
{
	
	/** @throws IOException
	 * @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("--------------------1.File类的概述和常用功能；------------------------");
		
		//1.File(String pathname)：将指定的路径名转换成一个File对象；
		File f = new File("D:\\file\\firstFile.txt");
		
		//2.File(String parent,String child)：根据指定的父路径和文件路径创建File对象；
		//		File f2 = new File("D:\\file", "\\firstFile.txt");
		File f2 = new File("D:\\", "file\\firstFile.txt");
		
		//3.File(File parent,String child)：根据指定的父路径对象和文件路径创建File对象；
		File parent = new File("D:\\file");
		File f3 = new File(parent, "firstFile.txt");
		
		File f4 = new File(new File("D:\\file"), "firstFile.txt");
		
		System.out.println("--------------------2.File类的创建和删除功能；------------------------");
		
		File f5 = new File("D:\\file\\firstFile.txt");//绝对路径；
		File f6 = new File("relativeFile.txt");//相对路径；
		
		//绝对路径：固定不可改变的路径，以盘符开头；
		//相对路径：相对某个参照物，不能以盘符开头；在eclipse中相对路径相对应当前项目的根路径；
		
		//1.创建功能；
		
		//1.1.boolean createNewFile()：当指定文件不存在时，创建文件并返回true，否则返回false；
		System.out.println("<1.1>.当指定文件relativeFile.txt不存在时，创建文件并返回true，否则返回false；此时，返回：" + f6.createNewFile());
		
		//1.2.boolean mkdir()：当指定文件夹不存在时，创建文件并返回true，否则返回false；
		File f7 = new File("folderFile");
		System.out.println("<1.2>.当指定文件夹folderFile不存在时，创建文件并返回true，否则返回false；此时，返回：" + f7.mkdir());
		
		File f8 = new File("folderFile.txt");
		System.out.println("<1.2>.注意：此时是创建指定文件夹folderFile.txt，不是文本文件；返回：" + f8.mkdir());
		
		//1.3.boolean mkdirs()：创建指定文件夹，当文件夹所在目录不存在时，则顺便一起创建了；
		File f9 = new File("folderC\\folderD\\folderE");
		System.out.println("<1.2>.当指定文件夹folderE不存在时，创建文件并返回true，否则返回false；此时，返回false，创建不了：" + f9.mkdir());
		System.out.println("<1.3>.创建指定文件夹folderE，当文件夹所在目录不存在时，则顺便一起创建了；此时，返回：" + f9.mkdirs());
		
		//2.删除功能；
		
		//2.1.boolean delete()：当指定的文件或文件夹存在时，删除文件或文件夹，返回true，否则返回false；
		System.out.println("<2.1>.删除上面已经创建好的文件relativeFile.txt；此时，返回：" + f6.delete());
		System.out.println("<2.1>.删除上面已经创建好的文件夹folderFile；此时，返回：" + f7.delete());
		
		//注意：删除一个文件夹，这个文件夹下面不能有其他的文件或文件夹；
		//使用delete()方法删除文件或文件夹，是不走windows或linux回收站的；
		File f10 = new File("folderC");
		System.out.println("注意：删除一个文件夹folderC，这个文件夹下面不能有其他的文件或文件夹；此时，返回：" + f10.delete());
		
		System.out.println("--------------------3.File类的判断功能；------------------------");
		
		//1.boolean exists()：判断文件或文件夹是否存在，若存在返回true，否则返回false；
		File f11 = new File("existsFile.txt");
		f11.createNewFile();
		System.out.println("<3.1>.判断文件existsFile.txt是否存在，若存在返回true，否则返回false；此时，返回：" + f11.exists());
		
		//2.boolean isAbsolute()：判断File对象指向的路径是否是绝对路径，若是返回true，否则返回false；
		System.out.println("<3.2>.判断File对象f11指向的路径是否是绝对路径，若是返回true，否则返回false；此时，返回：" + f11.isAbsolute());
		System.out.println("<3.2>.判断File对象f5指向的路径是否是绝对路径，若是返回true，否则返回false；此时，返回：" + f5.isAbsolute());
		
		//3.1.boolean isDirectory()：判断File对象指向的路径是否是文件夹，若是返回true，否则返回false；
		System.out.println("<3.3.1>.判断File对象f8指向的路径是否是文件夹，若是返回true，否则返回false；此时，返回：" + f8.isDirectory());
		System.out.println("<3.3.1>.判断File对象f11指向的路径是否是文件夹，若是返回true，否则返回false；此时，返回：" + f11.isDirectory());
		
		//3.2.boolean isFile()：判断File对象指向的路径是否是文件，若是返回true，否则返回false；
		System.out.println("<3.3.2>.判断File对象f8指向的路径是否是文件，若是返回true，否则返回false；此时，返回：" + f8.isFile());
		System.out.println("<3.3.2>.判断File对象f11指向的路径是否是文件，若是返回true，否则返回false；此时，返回：" + f11.isFile());
		
		//4.boolean isHidden()：判断File对象指向的路径是否有隐藏属性，若是返回true，返回false；
		File f12 = new File("D:\\file\\hiddenFile.txt");
		System.out.println("<4>.判断File对象指向的路径是否有隐藏属性，若是返回true，返回false；此时，返回：" + f12.isHidden());
		
		System.out.println("--------------------4.File类的获取功能和修改名字功能；------------------------");
		
		//1.File getAbsoluteFile() ：以File对象的形式返回当前File对象所指向的绝对路径；
		System.out.println("<4.1.1>.以File对象的形式返回当前File对象f5所指向的绝对路径；则f5返回File对象：" + f5.getAbsoluteFile());
		System.out.println("<4.1.2>.以File对象的形式返回当前File对象f11所指向的绝对路径；则f11返回File对象：" + f11.getAbsoluteFile());
		
		//2.String getAbsolutePath() ：返回File对象所指向的绝对路径；
		System.out.println("<4.2.1>.返回File对象f5所指向的绝对路径；为：" + f5.getAbsolutePath());
		System.out.println("<4.2.2>.返回File对象f11所指向的绝对路径；为：" + f11.getAbsolutePath());
		
		File f13 = new File("folderFile2", "getParent.txt");
		//		System.out.println(f13.createNewFile());
		
		File parentFile = new File("folderFile2");
		File f14 = new File(parentFile, "getParent.txt");
		if (!parentFile.exists())
		{
			parentFile.mkdirs();
		}
		System.out.println("<4.3>.当指定文件getParent.txt不存在时，创建文件并返回true，否则返回false；此时，返回：" + f14.createNewFile());
		
		//3.String getParent() ：以字符串形式返回File对象的父路径；
		System.out.println("<4.3.1>.以字符串形式返回File对象f11的父路径，即：" + f11.getParent());
		System.out.println("<4.3.2>.以字符串形式返回File对象f13的父路径，即：" + f13.getParent());
		System.out.println("<4.3.3>.以字符串形式返回File对象f14的父路径，即：" + f14.getParent());
		
		//4.File getParentFile() ：以File对象的形式返回File对象的父文件对象；
		System.out.println("<4.4.1>.以File对象的形式返回File对象f11的父文件对象，即：" + f11.getParentFile());
		System.out.println("<4.4.2>.以File对象的形式返回File对象f13的父文件对象，即：" + f13.getParentFile());
		System.out.println("<4.4.3>.以File对象的形式返回File对象f14的父文件对象，即：" + f14.getParentFile());
		
		//5.String getName() ：获取文件和文件夹的名称；
		System.out.println("<4.5.1>.获取File对象f11的文件名：" + f11.getName());
		System.out.println("<4.5.2>.获取File对象f5的文件名：" + f5.getName());
		System.out.println("<4.5.3>.获取File对象f8的文件夹名：" + f8.getName());
		
		//6.String getPath() ：返回创建File对象时给的路径；
		System.out.println("<4.6.1>.返回创建File对象f11时给的路径：" + f11.getPath());
		System.out.println("<4.6.2>.返回创建File对象f5时给的路径：" + f5.getPath());
		System.out.println("<4.6.3>.返回创建File对象f8时给的路径：" + f8.getPath());
		
		//7.long lastModified()：以毫秒值的形式返回最后修改时间；
		System.out.println("<4.7>.以毫秒值的形式返回文件existsFile.txt最后修改时间：" + f11.lastModified());
		//1521722752375
		Date date = new Date(1521722752375L);
		System.out.println("将毫秒值转换成标准时间显示：" + date.toLocaleString());
		
		//8.long length()：返回文件的字节数；
		System.out.println("<4.8.1>.返回文件existsFile.txt的字节数：" + f11.length());
		System.out.println("<4.8.2>.返回文件getParent.txt的字节数：" + f14.length());
		
		//9.boolean renameTo(File dest) ：将当前File对象所指向的路径 修改为 指定File所指向的路径；
		//注意：要修改的文件路径不能存在，若存在则修改失败；
		File f15 = new File("existsFileRename.txt");
		System.out.println("<4.9>.将当前File对象f11所指向的路径 修改为 指定File对象f15所指向的路径；即：" + f11.renameTo(f15));
		
		System.out.println("--------------------5.File类的重要获取功能；------------------------");
		
		//1.String[] list()：返回当前路径下所有文件和文件夹名称；
		//注意：只有指向文件夹的File对象才可以调用该方法；
		//		File f16 = new File("D:\\win10激活工具");
		File f16 = new File("D:\\win10ActivationTool");
		
		//		String[] files = parentFile.list();
		String[] files = f16.list();
		//		String[] files = f15.list();
		for (int i = 0; i < files.length; i++)
		{
			System.out.println("<5.1>.返回当前路径下所有文件和文件夹名称：" + files[i]);
		}
		
		//2.File[] listFiles()：以File对象数组的形式返回当前路径下的所有文件或文件夹对象；
		//		File[] listFiles = parentFile.listFiles();
		File[] listFiles = f16.listFiles();
		//		File[] listFiles = f15.listFiles();
		for (File file : listFiles)
		{
			System.out.println("<5.2>.以File对象数组的形式返回当前路径下的所有文件或文件夹对象，即：" + file);
		}
		
		//3.static File[] listRoots()：返回的是所有盘符；
		File[] listRoots = File.listRoots();
		for (File file : listRoots)
		{
			System.out.println("<5.3>.返回的是所有盘符：" + file);
		}
	}
	
}
