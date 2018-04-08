
/**    
* @Title: Student.java  
* @Package com.reflect  
* @Description: TODO(用来学习反射机制的类；)  
* @author yijvyan  
* @date 2018年4月3日  
* @version V1.0    
*/

package com.reflect;

/** @ClassName: Student
 * @Description: TODO(要通过反射来获取这个类的属性和方法；)
 * @author yijvyan
 * @date 2018年4月3日 */

public class Student
{
	//	private String	name;
	//	int				age;
	
	//显示初始化；
	private String	name	= "Alice";
	//	int				age		= 28;
	public int		age		= 28;
	
	/** 创建一个新的实例 Student.
	 * 
	 * @param name
	 * @param age
	 */
	
	public Student(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}
	
	/** 创建一个新的实例 Student. */
	
	public Student()
	//	Student()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	/** @return name */
	
	public String getName()
	{
		return name;
	}
	
	/** @param paramtheparamthe{bare_field_name}
	 *            to set */
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	/** @return age */
	
	public int getAge()
	{
		return age;
	}
	
	/** @param paramtheparamthe{bare_field_name}
	 *            to set */
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	/* (非 Javadoc)
	 * @return
	 * @see java.lang.Object#toString() */
	
	@Override
	public String toString()
	{
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	public void method()
	{
		System.out.println("这是一个无参无返回值的方法，在这里的作用就是为了学习反射；");
	}
	
}
