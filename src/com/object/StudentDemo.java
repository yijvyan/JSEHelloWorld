
/**    
* @Title: StudentDemo.java  
* @Package com.object  
* @Description: TODO(学生类的使用)  
* @author yijvyan  
* @date 2018年2月25日  
* @version V1.0    
*/

package com.object;

/** @ClassName: StudentDemo
 * @Description: TODO(使用学生类的成员变量和成员方法)
 * @author yijvyan
 * @date 2018年2月25日 */

public class StudentDemo
{
	
	/** @Title: main @Description: TODO(主方法里使用学生类成员) @param @param args
	 *         参数 @return void 返回类型 @throws */
	
	public static void main(String[] args)
	{
		Student s = new Student();
		System.out.println("s: " + s);
		
		//		System.out.println("姓名（初始值）：" + s.name);
		//		System.out.println("年龄（初始值）：" + s.age);
		System.out.println("年龄（初始值）：" + s.getAge());
		System.out.println("姓名（初始值）：" + s.getName());
		
		s.show();
		System.out.println("------------------------------");
		//		s.name = "Alice";
		s.setName("Alice");
		//		s.age = 18;
		//		s.age = -18;
		s.setAge(18);
		//		s.setAge(-18);
		
		//		System.out.println("姓名（赋值后）：" + s.name);
		//		System.out.println("年龄（赋值后）：" + s.age);
		System.out.println("年龄（赋值后）：" + s.getAge());
		System.out.println("姓名（赋值后）：" + s.getName());
		
		s.show();
		System.out.println("------------------------------");
		s.study();
		s.eat();
		
		System.out.println(s.getName() + "---------" + s.getAge());
		
		//有参构造
		Student s2 = new Student(25, "Over");
		s2.show();
		
	}
	
}
