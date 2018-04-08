
/**    
* @Title: ObjectInOutputStreamDemo.java  
* @Package com.ioStream  
* @Description: TODO(对象操作流的学习；)  
* @author yijvyan  
* @date 2018年3月28日  
* @version V1.0    
*/

package com.ioStream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/** @ClassName: ObjectInOutputStreamDemo
 * @Description: TODO(对象操作流的读写操作；)
 * @author yijvyan
 * @date 2018年3月28日 */

public class ObjectInOutputStreamDemo
{
	
	/** @throws IOException
	 * @throws ClassNotFoundException
	 * @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		System.out.println("---------------------------1.对象操作流的概述；------------------------");
		
		//对象操作流：用于读写任意类型的对象；
		//		ObjectOutputStream     1.writeObject;	2.ObjectOutputStream(OutputStream out);
		//		ObjectInputStream      1.readObject;	2.ObjectInputStream(InputStream in);
		
		//注意：1.使用对象输出流写出对象，只能使用对象输入流来读取对象；
		//2.只能将支持(实现)java.io.Serializable 接口的对象写入流中；
		
		System.out.println("---------------------------2.使用对象操作流的读写对象；------------------------");
		
		//使用对象输出流输出对象和对象输入流读取对象；
		//1.Exception in thread "main" java.io.NotSerializableException: com.ioStream.StudentObject；
		//2.Serializable：序列号，是一个标识接口，只起标识作用，没有方法；
		//				     当一个类的对象需要IO流进行读写的时候，这个类必须实现该接口；
		//3.Exception in thread "main" java.io.EOFException：当输入过程中意外到达文件或流的末尾时，抛出此异常；
		
		//		objectOutput();
		
		//		objectInput();
		
		System.out.println("---------------------------3.解决对象输入流读取对象出现异常的问题；------------------------");
		
		//解决对象输入流读取对象出现异常的问题；
		
		//		objectOutputArrayList();
		
		//		objectInputArrayList();
		
		System.out.println("---------------------------4.解决对实现序列化接口出现的黄色警告问题；------------------------");
		
		//解决对实现序列化接口出现的黄色警告问题；
		//1.Exception in thread "main" java.io.InvalidClassException:
		//2.当Serialization 运行时检测到某个类具有以下问题之一时，抛出此异常；
		//				2.1.该类的序列版本号与从流中读取数据的类描述符的版本号不匹配；
		//				2.2.该类包含未知数据类型；
		//				2.3.该类没有可访问的无参数构造方法；
		
		//		objectOutputArrayList();
		objectInputArrayList();
	}
	
	/** @Title: objectInputArrayList @Description:
	 *         TODO(使用对象输入流来读取集合对象；) @param @throws IOException @param @throws
	 *         FileNotFoundException @param @throws ClassNotFoundException
	 *         参数 @return void 返回类型 @throws */
	
	private static void objectInputArrayList() throws IOException, FileNotFoundException, ClassNotFoundException
	{
		//1.创建对象输入流的对象；
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objectIOSArrayList.txt"));
		
		//2.读取对象（数据）；
		Object obj = ois.readObject();
		//		System.out.println("<3.2>.使用对象输入流读取集合对象，即：" + obj);
		
		//2.1.向下转型，获取具体的子类对象；
		ArrayList<StudentObject> arrayList = (ArrayList<StudentObject>) obj;
		for (StudentObject student : arrayList)
		{
			System.out.println("<3.2>.使用对象输入流读取集合对象，即：" + student);
		}
		
		//3.释放资源；
		ois.close();
	}
	
	/** @Title: objectOutputArrayList @Description:
	 *         TODO(使用对象输出流来输出集合对象；) @param @throws IOException @param @throws
	 *         FileNotFoundException 参数 @return void 返回类型 @throws */
	
	private static void objectOutputArrayList() throws IOException, FileNotFoundException
	{
		//1.创建对象输出流对象；
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objectIOSArrayList.txt"));
		
		//2.创建集合对象；
		ArrayList<StudentObject> arrayList = new ArrayList<StudentObject>();
		
		//3.添加学生对象；
		arrayList.add(new StudentObject("Christina", 29));
		arrayList.add(new StudentObject("Danny", 28));
		
		//4.写出集合对象；
		oos.writeObject(arrayList);
		
		//5.释放资源
		oos.close();
	}
	
	/** @Title: objectInput @Description: TODO(使用对象输入流读入对象；) @param @throws
	 *         IOException @param @throws FileNotFoundException @param @throws
	 *         ClassNotFoundException 参数 @return void 返回类型 @throws */
	
	private static void objectInput() throws IOException, FileNotFoundException, ClassNotFoundException
	{
		//1.创建对象输入流的对象；
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objectInOutputStream.txt"));
		
		//2.读取对象；
		//		Object obj = ois.readObject();
		//		System.out.println("<2.2>.使用对象输入流读取对象，即：" + obj);
		//		
		//		Object obj2 = ois.readObject();
		//		System.out.println("<2.2>.使用对象输入流读取对象，即：" + obj2);
		//		
		//		Object obj3 = ois.readObject();
		//		System.out.println("<2.2>.使用对象输入流读取对象，即：" + obj3);
		
		try
		{
			while (true)
			{
				Object obj = ois.readObject();
				System.out.println("<2.2>.使用对象输入流读取对象，即：" + obj);
			}
		}
		catch (EOFException e)
		{
			System.out.println("<2.3>.当输入过程中意外到达文件或流的末尾时，发生异常，在此捕获；");
		}
		
		//3.释放资源；
		ois.close();
	}
	
	/** @Title: objectOutput @Description: TODO(使用对象输出流写出对象；) @param @throws
	 *         IOException @param @throws FileNotFoundException 参数 @return void
	 *         返回类型 @throws */
	
	private static void objectOutput() throws IOException, FileNotFoundException
	{
		//1.创建对象输出流对象；
		//		FileOutputStream fos = new FileOutputStream("objectInOutputStream.txt");
		//		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objectInOutputStream.txt"));
		
		//2.创建学生对象；
		StudentObject s = new StudentObject("Alice", 28);
		StudentObject s2 = new StudentObject("Bob", 29);
		
		//3.写出学生对象；
		oos.writeObject(s);
		oos.writeObject(s2);
		
		//4.释放资源
		oos.close();
	}
	
}
