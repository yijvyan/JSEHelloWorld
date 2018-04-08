
/**    
* @Title: StudentBack.java  
* @Package com.object 
* @Description: TODO(回顾学生类)  
* @author yijvyan  
* @date 2018年3月5日  
* @version V1.0    
*/

package com.object;

/** @ClassName: StudentBack
 * @Description: TODO(比以前的学生类多了一个性别成员变量)
 * @author yijvyan
 * @date 2018年3月5日 */

public class StudentBack
{
	private String	name;
	private int		age;
	private String	gender;
	
	/** 创建一个新的实例 StudentBack.
	 * 
	 * @param name
	 * @param age
	 * @param gender
	 */
	
	public StudentBack(String name, int age, String gender)
	{
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
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
	
	/** @return gender */
	
	public String getGender()
	{
		return gender;
	}
	
	/** @param paramtheparamthe{bare_field_name}
	 *            to set */
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	/** 创建一个新的实例 StudentBack. */
	
	public StudentBack()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void show()
	{
		System.out.println(name + "," + age + "," + gender);
	}
}
