
/**    
* @Title: StudentDemo.java  
* @Package com.objectArray  
* @Description: TODO(对象数组的练习)  
* @author yijvyan  
* @date 2018年3月1日  
* @version V1.0    
*/

package com.objectArray;

/** @ClassName: StudentDemo
 * @Description: TODO(其实就是为了引出集合)
 * @author yijvyan
 * @date 2018年3月1日 */

public class StudentDemo
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("------------学生数组中存储学生对象，并遍历--------------");
		Student[] students = new Student[3];
		
		Student s1 = new Student("Alice", 26);
		Student s2 = new Student("Bob", 27);
		Student s3 = new Student("Crystina", 29);
		
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		for (int x = 0; x < students.length; x++)
		{
			Student s = students[x];
			System.out.println("输出的是地址s: " + s);
			System.out.println("姓名： " + s.getName() + " 年龄： " + s.getAge());
		}
	}
	
}
