
/**    
* @Title: Student.java  
* @Package com.object  
* @Description: TODO(学习面向对象的思想)  
* @author yijvyan  
* @date 2018年2月25日  
* @version V1.0    
*/

package com.object;

/** @ClassName: Student
 * @Description: TODO(代表学生类)
 * @author yijvyan
 * @date 2018年2月25日 */

public class Student
{
	//	String		name;
	//	int		age;
	private int		age;
	private String	name;
	
	/** @return name */
	
	public String getName()
	{
		return name;
	}
	
	/** 创建一个新的实例 Student. 有参的构造方法
	 * 
	 * @param age
	 * @param name
	 */
	//有参的构造方法进行赋值
	public Student(int age, String name)
	{
		super();
		this.age = age;
		this.name = name;
	}
	
	/** 创建一个新的实例 Student. */
	//无参构造方法
	public Student()
	{
		super();
		System.out.println("无参的构造方法");
	}
	
	/** @param paramtheparamthe{bare_field_name}
	 *            to set */
	
	public void setName(String name)
	{
		//局部变量名与成员变量名相同，就近原则，都视为局部变量
		//使用this，代表所在类对象的引用，其实就是代表该类
		//this.name就代表new Student().name
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
		if (age < 0 || age > 200)
		{
			System.out.println("你输入的年龄有误！");
		}
		else
		{
			this.age = age;
		}
		//		this.age = age;
	}
	
	public void study()
	{
		System.out.println("Good Good Study,Day Day Up!");
	}
	
	public void eat()
	{
		System.out.println("Learning For A While,Hungry To Eat!");
	}
	
	public void show()
	{
		System.out.println("姓名是： " + name + " ，年龄是： " + age);
	}
}
