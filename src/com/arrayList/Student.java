
/**    
* @Title: Student.java  
* @Package com.arrayList  
* @Description: TODO(学生类对象)  
* @author yijvyan  
* @date 2018年3月1日  
* @version V1.0    
*/

package com.arrayList;

/** @ClassName: Student
 * @Description: TODO(自定义的对象)
 * @author yijvyan
 * @date 2018年3月1日 */

public class Student
{
	private String	name;
	private int		age;
	
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
	{
		super();
		// TODO Auto-generated constructor stub
	}
}
