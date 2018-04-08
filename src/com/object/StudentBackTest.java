
/**    
* @Title: StudentBackTest.java  
* @Package com.object 
* @Description: TODO(StudentBack类的测试类)  
* @author yijvyan  
* @date 2018年3月5日  
* @version V1.0    
*/

package com.object;

/** @ClassName: StudentBackTest
 * @Description: TODO(就是为了回顾类的定义以及成员的学习)
 * @author yijvyan
 * @date 2018年3月5日 */

public class StudentBackTest
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("-----------------练习1.回顾学生类；主要是空参及实参构造，成员变量，方法调用的复习；----------------------");
		StudentBack stuB = new StudentBack();
		stuB.show();
		
		System.out.println("----为成员变量赋值后（空参构造），调用show()方法：");
		stuB.setName("Alice");
		stuB.setAge(27);
		stuB.setGender("male");
		stuB.show();
		
		System.out.println("----直接使用有参构造为成员变量赋值，然后调用show()方法：");
		StudentBack stuB2 = new StudentBack("Bob", 28, "male");
		stuB2.show();
		
	}
	
}
