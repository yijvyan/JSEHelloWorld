
/**    
* @Title: RecurFile.java  
* @Package com.recurrence  
* @Description: TODO(递归方法的应用；)  
* @author yijvyan  
* @date 2018年3月25日  
* @version V1.0    
*/

package com.recurrence;

import java.io.File;


/** @ClassName: RecurFile
 * @Description: TODO(主要是获取文件file时使用到了递归；)
 * @author yijvyan
 * @date 2018年3月25日 */

public class RecurFile
{
	
	/** @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("-----------------------1.输出指定目录下所有的java文件名（包含子目录）；--------------------");
		
		//需求：输出指定目录下所有的java文件名（包含子目录）；
		File file = new File("src\\com\\array");
		//		File file = new File("src\\com\\array\\ArrayDemo.java");
		methoudNoRecur(file);
		
		File allFile = new File("src");
		//		File allFile = new File("D:\\eclipse-workspace\\JSEHelloWorld");
		methoudRecur(allFile);
		
		System.out.println("-----------------------2.删除指定的目录（包含子目录）；--------------------");
		
		//需求：删除指定的目录（包含子目录）；
		//注意：若要删除一个目录，则需先删除此目录下的所有子文件和子目录；
		File delFile = new File("D:\\eclipse-workspace\\JSEHelloWorld\\bin\\com\\yijvyan");
		deleteRecur(delFile);
		
	}
	
	//删除指定目录下所有文件和目录；
	public static void deleteRecur(File file)
	{
		if (file.isDirectory())
		{
			//1.先删除所有的子文件和子目录；
			//1.1.获取所有的子文件和子目录；
			File[] listFiles = file.listFiles();
			for (File f : listFiles)
			{
				if (f.isFile())
				{
					//1.1.1若是子文件，直接删除；
					System.out.println("<2.2>.若是子文件，直接删除；即：" + f.getName());
					f.delete();
				}
				else if (f.isDirectory())
				{
					//1.1.2继续查看是否还有子子文件和子子目录；
					deleteRecur(f);
				}
			}
			
			//2.再删除自己本身；
			System.out.println("<2.1>.删除完所有子文件和子目录后，再删除自己本身；即：" + file.getName());
			file.delete();
		}
	}
	
	public static void methoudNoRecur(File file)
	{
		if (file.isDirectory())
		{
			File[] files = file.listFiles();
			for (File f : files)
			{
				//判断是否是文件对象；
				if (f.isFile())
				{
					if (f.getName().endsWith(".java"))
					{
						System.out.println("<1.1>.输出指定目录下所有的java文件名（包含子目录），即（无递归）：" + f.getName());
					}
				}
			}
		}
	}
	
	public static void methoudRecur(File file)
	{
		if (file.isDirectory())
		{
			File[] files = file.listFiles();
			for (File f : files)
			{
				//判断是否是文件对象；
				if (f.isFile())
				{
					if (f.getName().endsWith(".java"))
					{
						System.out.println("<1.2>.输出指定目录下所有的java文件名（包含子目录），即（有递归）：" + f.getName());
					}
				}
				else if (f.isDirectory())
				{
					System.out.println(f);
					//是一个目录对象（或者称文件夹对象）；
					methoudRecur(f);
				}
			}
		}
	}
}
