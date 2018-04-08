
/**    
* @Title: StudentManager.java  
* @Package com.studentManager  
* @Description: TODO(学生管理系统的主类)  
* @author yijvyan  
* @date 2018年3月1日  
* @version V1.0    
*/

package com.studentManager;

import java.util.ArrayList;
import java.util.Scanner;


/** @ClassName: StudentManager
 * @Description: TODO(学生管理系统的所有东西)
 * @author yijvyan
 * @date 2018年3月1日 */

public class StudentManager
{
	public static void main(String[] args)
	{
		//存储学生的集合
		ArrayList<Student> arrayList = new ArrayList<Student>();
		
		while (true)
		{
			//主界面
			System.out.println("---------------欢迎来到学生管理系统-------------");
			System.out.println("1查看所有学生");
			System.out.println("2添加学生");
			System.out.println("3删除学生");
			System.out.println("4修改学生");
			System.out.println("5退出");
			System.out.println("请输入你的选择：");
			
			Scanner sc = new Scanner(System.in);
			String choiceString = sc.nextLine();
			
			switch (choiceString)
			{
				case "1":
					
					findAllStudent(arrayList);
					break;
				
				case "2":
					
					addStudent(arrayList);
					break;
				
				case "3":
					
					deleteStudent(arrayList);
					break;
				
				case "4":
					
					updateStudent(arrayList);
					break;
				case "5":
					
					//利用case的穿透作用，注释掉case "5"
					//System.out.println("谢谢你的使用！");
					//break;
					
				default:
					System.out.println("谢谢你的使用！");
					
					//case中的break，只是为了推出switch语句的，退出不了while循环
					//break;
					
					//JVM退出，即所有程序退出
					System.exit(0);
			}
			
		}
		
	}
	
	/** @Title: updateStudent @Description: TODO(按学号修改学生的信息) @param @param
	 * arrayList 参数 @return void 返回类型 @throws */
	
	public static void updateStudent(ArrayList<Student> arrayList)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要修改的学生的学号：");
		String id = sc.nextLine();
		
		int index = -1;
		for (int x = 0; x < arrayList.size(); x++)
		{
			Student s = arrayList.get(x);
			if (s.getId().equals(id))
			{
				index = x;
				break;
			}
		}
		
		if (index == -1)
		{
			System.out.println("不好意思，你要修改的学号对应的学生信息不存在，请回去重新你的选择！");
		}
		else
		{
			System.out.println("请输入学生的新姓名：");
			String name = sc.nextLine();
			System.out.println("请输入学生的新年龄：");
			String age = sc.nextLine();
			System.out.println("请输入学生的新居住地：");
			String address = sc.nextLine();
			
			Student s = new Student();
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);
			
			//根据索引修改集合对应处的元素对象
			arrayList.set(index, s);
			System.out.println("修改学生成功！");
		}
	}
	
	/** @Title: deleteStudent @Description: TODO(按学号删除学生) @param @param
	 *         arrayList 参数 @return void 返回类型 @throws */
	
	public static void deleteStudent(ArrayList<Student> arrayList)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要删除的学生的学号：");
		String id = sc.nextLine();
		
		int index = -1;
		for (int x = 0; x < arrayList.size(); x++)
		{
			Student s = arrayList.get(x);
			if (s.getId().equals(id))
			{
				index = x;
				break;
			}
		}
		
		if (index == -1)
		{
			System.out.println("不好意思，你要删除的学号对应的学生信息不存在，请回去重新你的选择！");
		}
		else
		{
			arrayList.remove(index);
			System.out.println("删除学生成功！");
		}
		
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
	
	/** @Title: findAllStudent @Description: TODO(查询所有学生) @param @param
	 *         arrayList 参数 @return void 返回类型 @throws */
	
	public static void findAllStudent(ArrayList<Student> arrayList)
	{
		if (arrayList.size() == 0)
		{
			System.out.println("不好意思，目前没有学生信息可供查询，请回去重新选择你的操作！");
			
			//没有元素了，要让这个方法在这里就结束，不要再继续往下执行；
			//采取return的方式，可以实现；此方法返回值是void，则在此使用下面的的方式：
			return;
		}
		
		// \t 就是一个tab键的位置
		System.out.println("学号\t\t姓名\t年龄\t居住地");
		for (int x = 0; x < arrayList.size(); x++)
		{
			Student s = arrayList.get(x);
			System.out.println(s.getId() + "\t\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
		}
	}
}
