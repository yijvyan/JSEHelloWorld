
/**    
* @Title: Teacher.java  
* @Package com.classAPI  
* @Description: TODO(学习获取字节码对象，所定义的类；)  
* @author yijvyan  
* @date 2018年3月11日  
* @version V1.0    
*/

package com.classAPI;

/** @ClassName: Teacher
 * @Description: TODO(就是一个普通的Teacher类；)
 * @author yijvyan
 * @date 2018年3月11日 */

public class Teacher
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
	
	/** 创建一个新的实例 Teacher.
	 * 
	 * @param name
	 * @param age
	 */
	
	public Teacher(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}
	
	/** 创建一个新的实例 Teacher. */
	
	public Teacher()
	{
		super();
		// TODO Auto-generated constructor stub
	}
}
