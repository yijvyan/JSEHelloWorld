
/**    
* @Title: JavaBeanTest.java  
* @Package com.reflectBean  
* @Description: TODO(用来学习标准的Java类；)  
* @author yijvyan  
* @date 2018年4月5日  
* @version V1.0    
*/

package com.reflectBean;

/** @ClassName: JavaBeanTest
 * @Description: TODO(测试标准类Person类；)
 * @author yijvyan
 * @date 2018年4月5日 */

public class JavaBeanTest
{
	
	/** @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("--------------------------1.JavaBean的概述和规范；----------------------");
		
		//JavaBean ：一个标准的Java类；主要用于封装数据；
		//		1.类使用公共（public）进行修饰；	2.提供私有（private）修饰的成员变量；
		//		3.为成员变量提供公共的getter和setter方法；
		//		4.提供公共无参的构造方法；		5.实现序列号接口；
		
		//1.创建一个标准的Person类，在主方法中创建对象并使用；
		
		Person p = new Person();
		p.setName("Elisa");
		p.setAge(29);
		p.setGender("woman");
		
		System.out.println("<1>.输出创建好的标准类，即：" + p);
	}
	
	public static void method(String name, int age, String gender)
	{
		
	}
	
	public static void method(Person p)
	{
		
	}
	
}
