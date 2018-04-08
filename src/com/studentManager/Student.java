
/**    
* @Title: Student.java  
* @Package com.studentManager  
* @Description: TODO(学生类)  
* @author yijvyan  
* @date 2018年3月1日  
* @version V1.0    
*/

package com.studentManager;

/** @ClassName: Student
 * @Description: TODO(类的所有属性类型都是String)
 * @author yijvyan
 * @date 2018年3月1日 */

public class Student
{
	//学号
	private String	id;
	
	private String	name;
	
	private String	age;
	
	private String	address;
	
	/** @return id */
	
	public String getId()
	{
		return id;
	}
	
	/** @param paramtheparamthe{bare_field_name}
	 *            to set */
	
	public void setId(String id)
	{
		this.id = id;
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
	
	public String getAge()
	{
		return age;
	}
	
	/** @param paramtheparamthe{bare_field_name}
	 *            to set */
	
	public void setAge(String age)
	{
		this.age = age;
	}
	
	/** @return address */
	
	public String getAddress()
	{
		return address;
	}
	
	/** @param paramtheparamthe{bare_field_name}
	 *            to set */
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	/** 创建一个新的实例 Student.
	 * 
	 * @param id
	 * @param name
	 * @param age
	 * @param address
	 */
	
	public Student(String id, String name, String age, String address)
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	/** 创建一个新的实例 Student. */
	
	public Student()
	{
		super();
		// TODO Auto-generated constructor stub
	}
}
