
/**    
* @Title: Person.java  
* @Package com.reflectBean  
* @Description: TODO(创建一个标准类；)  
* @author yijvyan  
* @date 2018年4月5日  
* @version V1.0    
*/

package com.reflectBean;

import java.io.Serializable;


/** @ClassName: Person
 * @Description: TODO(学习JavaBean标准类的用法；)
 * @author yijvyan
 * @date 2018年4月5日 */

public class Person implements Serializable
{
	//JavaBean ：一个标准的Java类；主要用于封装数据；
	//		1.类使用公共（public）进行修饰；	2.提供私有（private）修饰的成员变量；
	//		3.为成员变量提供公共的getter和setter方法；
	//		4.提供公共无参的构造方法；		5.实现序列号接口；
	
	/** @Fields field:field:{todo}(为了实现序列化；) */
	
	private static final long	serialVersionUID	= 336063668257442872L;
	private String				name;
	private int					age;
	private String				gender;
	
	/** 创建一个新的实例 Person. */
	
	public Person()
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
	
	/* (非 Javadoc)
	 * @return
	 * @see java.lang.Object#toString() */
	
	@Override
	public String toString()
	{
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
