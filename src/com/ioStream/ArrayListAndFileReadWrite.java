
/**    
* @Title: ArrayListAndFileReadWrite.java  
* @Package com.ioStream  
* @Description: TODO(集合与文本文件之间的输入和输出)  
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
import java.util.ArrayList;
import java.util.Scanner;

import com.studentManager.Student;


/** @ClassName: ArrayListAndFileReadWrite
 * @Description: TODO(1.将集合中的字符串输出到文本文件中；2.反过来，读取文本文件的数据存入集合中；)
 * @author yijvyan
 * @date 2018年3月3日 */

public class ArrayListAndFileReadWrite
{
	
	/** @throws IOException
	 * @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args) throws IOException
	{
		String destFileName = "arrayListString.txt";
		System.out.println("---------------------练习1.使用缓冲流特殊功能将集合中的数据写入到文本文件中----------------------------------");
		arrayListToFile(destFileName);
		
		System.out.println("---------------------练习2.使用缓冲流特殊功能从文本文件中读取数据到ArrayList集合中，并遍历集合----------------------------------");
		String srcFileName = destFileName;
		fileToArrayList(srcFileName);
		
		System.out.println("---------------------练习3.键盘录入3个学生，存入集合；遍历集合，将学生信息存入文件中（每个学生一行，“，”分割）----------------------");
		ArrayList<Student> arrayListStu = new ArrayList<Student>();
		destFileName = "aLStudent.txt";
		
		//添加三个学生信息，在这里直接复制StudentManager.java中的添加学生的方法
		//addStudent(arrayListStu);
		//addStudent(arrayListStu);
		//addStudent(arrayListStu);
		
		//arrayListToFile(destFileName, arrayListStu);
		
		System.out.println("---------------------练习4.文本文件中的学生信息读取出来存储到集合中，遍历集合，输出到控制台----------------------");
		srcFileName = destFileName;
		fileToArrayListStu(srcFileName);
	}
	
	/** @throws IOException
	 * @Title: fileToArrayListStu @Description:
	 *         TODO(文本文件中的学生信息读取出来存储到集合中，遍历集合，输出到控制台；其实，跟fileToArrayList方法类似，只是这个方法里面读取的是学生对象) @param @param
	 *         srcFileName 参数 @return void 返回类型 @throws */
	
	public static void fileToArrayListStu(String srcFileName) throws IOException
	{
		BufferedReader bR = new BufferedReader(new FileReader(srcFileName));
		
		ArrayList<Student> arrayList = new ArrayList<Student>();
		
		String line;
		while ((line = bR.readLine()) != null)
		{
			//按“，”分割字符串，分割成字符串数组
			String[] strArray = line.split(",");
			
			Student student = new Student();
			student.setId(strArray[0]);
			student.setName(strArray[1]);
			student.setAge(strArray[2]);
			student.setAddress(strArray[3]);
			
			arrayList.add(student);
		}
		
		bR.close();
		
		System.out.println("学号\t\t姓名\t年龄\t居住地");
		for (int x = 0; x < arrayList.size(); x++)
		{
			Student stu = arrayList.get(x);
			System.out.println(stu.getId() + "\t\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
		}
	}
	
	/** @throws IOException
	 * @Title: arrayListToFile @Description:
	 *         TODO(遍历集合，将学生信息存入文件中（每个学生一行，“，”分割）) @param @param
	 *         destFileName @param @param arrayListStu 参数 @return void
	 *         返回类型 @throws */
	
	public static void arrayListToFile(String destFileName, ArrayList<Student> arrayListStu) throws IOException
	{
		BufferedWriter bW = new BufferedWriter(new FileWriter(destFileName));
		
		for (int x = 0; x < arrayListStu.size(); x++)
		{
			Student stu = arrayListStu.get(x);
			StringBuilder sb = new StringBuilder();
			sb.append(stu.getId()).append(",").append(stu.getName()).append(",").append(stu.getAge()).append(",").append(stu.getAddress());
			
			bW.write(sb.toString());
			bW.newLine();
			bW.flush();
		}
		
		bW.close();
	}
	
	/** @Title: addStudent @Description: TODO(添加学生) @param @param arrayList
	 *         参数 @return void 返回类型 @throws */
	
	public static void addStudent(ArrayList<Student> arrayList)
	
	{
		Scanner sc = new Scanner(System.in);
		
		String id;
		while (true)
		{
			System.out.println("请输入学生学号：");
			//String id = sc.nextLine();
			id = sc.nextLine();
			
			boolean flag = false;
			for (int x = 0; x < arrayList.size(); x++)
			{
				Student s = arrayList.get(x);
				if (s.getId().equals(id))
				{
					flag = true;
					//结束for循环
					break;
				}
			}
			
			if (flag)
			{
				System.out.println("你输入的学号已经被占用，请重新输入！");
			}
			else
			{
				//结束while循环
				break;
			}
			
		}
		
		//必须要保证学号的唯一性
		
		System.out.println("请输入学生姓名：");
		String name = sc.nextLine();
		System.out.println("请输入学生年龄：");
		String age = sc.nextLine();
		System.out.println("请输入学生居住地：");
		String address = sc.nextLine();
		
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		
		arrayList.add(s);
		
		System.out.println("添加学生成功！");
	}
	
	/** @throws IOException
	 * @Title: fileToArrayList @Description:
	 *         TODO(从文本文件中读取数据到ArrayList集合中，并遍历集合) @param @param srcFileName
	 *         参数 @return void 返回类型 @throws */
	
	private static void fileToArrayList(String srcFileName) throws IOException
	{
		BufferedReader bR = new BufferedReader(new FileReader(srcFileName));
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		String line;
		while ((line = bR.readLine()) != null)
		{
			arrayList.add(line);
		}
		
		bR.close();
		
		for (int x = 0; x < arrayList.size(); x++)
		{
			String str = arrayList.get(x);
			System.out.println("从文本文件中读取数据到ArrayList集合中，并遍历集合： " + str);
		}
		
	}
	
	/** @throws IOException
	 * @Title: arrayListToFile @Description:
	 *         TODO(将集合中的字符串数据输出到文本文件中) @param @param destFileName 参数 @return
	 *         void 返回类型 @throws */
	
	public static void arrayListToFile(String destFileName) throws IOException
	{
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("原本是一个集合");
		arrayList.add("里面有一些字符串元素数据");
		arrayList.add("现在我要把它输出到文本文件中");
		arrayList.add("使用缓冲流的特殊功能newLine()方法");
		
		BufferedWriter bW = new BufferedWriter(new FileWriter(destFileName));
		
		for (int x = 0; x < arrayList.size(); x++)
		{
			String string = arrayList.get(x);
			bW.write(string);
			bW.newLine();
			bW.flush();
		}
		
		bW.close();
	}
}
