
/**    
* @Title: Student.java  
* @Package com.objectArray  
* @Description: TODO(对象数组的学习)  
* @author yijvyan  
* @date 2018年3月1日  
* @version V1.0    
*/

package com.objectArray;

/** @ClassName: Student
 * @Description: TODO(简而言之，就是存储对象的数组)
 * @author yijvyan
 * @date 2018年3月1日 */

public class Student
{
	private String	name;
	private int		age;
	
	/** 创建一个新的实例 Student. */
	
	public Student()
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
}
