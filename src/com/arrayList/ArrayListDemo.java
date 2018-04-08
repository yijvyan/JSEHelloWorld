
/**    
* @Title: ArrayListDemo.java  
* @Package com.arrayList  
* @Description: TODO(ArrayList集合的学习)  
* @author yijvyan  
* @date 2018年3月1日  
* @version V1.0    
*/

package com.arrayList;

import java.util.ArrayList;
import java.util.Scanner;


/** @ClassName: ArrayListDemo
 * @Description: TODO(集合类的使用，如crud，遍历，查找指定元素)
 * @author yijvyan
 * @date 2018年3月1日 */

public class ArrayListDemo
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("---------ArrayList集合是长度可变的数组的实现；泛型E作用是用来限定集合中存储元素的类型，如String，则存储的元素类型为String------------");
		ArrayList<String> array = new ArrayList<String>();
		System.out.println("输出集合中的元素，而不是引用地址值，array（此时为空）： " + array);
		
		array.add("Alice");
		array.add("Bob");
		array.add("Crystina");
		
		System.out.println("用add方法添加元素，array： " + array);
		
		array.add(1, "Danny");
		System.out.println("用add方法在指定的1索引处添加元素，array：" + array);
		
		System.out.println("获取0索引处的元素，用get（0），则元素为： " + array.get(0));
		System.out.println("获取1索引处的元素，用get（1），则元素为： " + array.get(1));
		System.out.println("获取2索引处的元素，用get（2），则元素为： " + array.get(2));
		
		System.out.println("用size方法来返回集合中元素的个数，为： " + array.size());
		
		System.out.println("用remove（E）方法，删除集合指定元素E-->Bob，返回删除是否成功： " + array.remove("Bob"));
		System.out.println("用remove（E）方法，删除集合指定元素E-->Bob，返回删除是否成功（上一步已经删除了，故）： " + array.remove("Bob"));
		System.out.println("输出删除后的集合中的元素，array为： " + array);
		
		System.out.println("用remove（1）删除1索引处的元素，并返回此处元素，为：" + array.remove(1));
		System.out.println("输出删除后的集合中的元素，array为： " + array);
		
		System.out.println("用set（0，“Elisa”）方法，修改0索引处的元素Alice，返回被修改的元素，为： " + array.set(0, "Elisa"));
		System.out.println("输出修改后的集合中的元素，array为： " + array);
		
		System.out.println("--------------ArrayList集合的遍历-------------------------------------------------------------------");
		
		//		for (int x = 0; x < 2; x++)
		for (int x = 0; x < array.size(); x++)
		{
			//			System.out.println("集合遍历，元素为 ： " + array.get(x));
			String s = array.get(x);
			System.out.println("集合遍历，元素为 ： " + s);
		}
		
		System.out.println("--------------练习1.输出满足要求的元素-------------------------------------------------------------------------");
		String[] strArray = { "张三丰", "宋远桥", "张无忌", "殷梨亭", "张翠山", "莫声谷" };
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		for (int x = 0; x < strArray.length; x++)
		{
			arrayList.add(strArray[x]);
		}
		
		for (int x = 0; x < arrayList.size(); x++)
		{
			String str = arrayList.get(x);
			if (str.startsWith("张"))
			{
				System.out.println("以“张”开头的元素为： " + str);
			}
		}
		
		System.out.println("----------------练习2.存储自定义对象并遍历---------------------------------------------------------------------------------------------");
		ArrayList<Student> arrayListStu = new ArrayList<Student>();
		
		Student s1 = new Student("Frank", 28);
		Student s2 = new Student("Grace", 27);
		Student s3 = new Student("Hans", 26);
		Student s4 = new Student("Iris", 29);
		
		arrayListStu.add(s1);
		arrayListStu.add(s2);
		arrayListStu.add(s3);
		arrayListStu.add(s4);
		
		for (int x = 0; x < arrayListStu.size(); x++)
		{
			Student student = arrayListStu.get(x);
			System.out.println("遍历存储自定义对象的集合，元素为：" + student.getName() + "---------" + student.getAge());
		}
		
		System.out.println("---------------练习3.键盘录入学生对象数据（为方便，属性都是String类型），遍历集合-------------------------------------------------------------------");
		ArrayList<StudentStr> arrayListSCStu = new ArrayList<StudentStr>();
		addStudnetStr(arrayListSCStu);
		addStudnetStr(arrayListSCStu);
		addStudnetStr(arrayListSCStu);
		
		for (int x = 0; x < arrayListSCStu.size(); x++)
		{
			StudentStr studentStr = arrayListSCStu.get(x);
			System.out.println("遍历键盘录入的学生对象的集合，元素为： " + studentStr.getName() + "-----------" + studentStr.getAge());
		}
		
	}
	
	public static void addStudnetStr(ArrayList<StudentStr> arrayList)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生对象的姓名：");
		String name = sc.nextLine();
		System.out.println("请输入学生对象的年龄：");
		String age = sc.nextLine();
		
		//		StudentStr studentStr = new StudentStr(name, age);
		StudentStr s = new StudentStr();
		s.setName(name);
		s.setAge(age);
		
		arrayList.add(s);
	}
	
}
