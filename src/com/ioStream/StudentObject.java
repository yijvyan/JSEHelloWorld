
/**    
* @Title: StudentObject.java  
* @Package com.ioStream  
* @Description: TODO(用来学习对象操作流所创建的学生类；)  
* @author yijvyan  
* @date 2018年3月28日  
* @version V1.0    
*/

package com.ioStream;

import java.io.Serializable;


/** @ClassName: StudentObject
 * @Description: TODO(就是一个简单的学生类；)
 * @author yijvyan
 * @date 2018年3月28日 */

public class StudentObject implements Serializable
{
	
	/** @Fields field:field:{todo}(生产的序列化版本号；) */
	
	private static final long	serialVersionUID	= -6512985088610963319L;
	
	String						name;
	int							age;
	String						gender;
	
	/* (非 Javadoc)
	 * @return
	 * @see java.lang.Object#toString() */
	
	//	@Override
	//	public String toString()
	//	{
	//		return "StudentObject [name=" + name + ", age=" + age + "]";
	//	}
	
	/** 创建一个新的实例 StudentObject.
	 * 
	 * @param name
	 * @param age
	 */
	
	public StudentObject(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}
	
	/* (非 Javadoc)
	 * @return
	 * @see java.lang.Object#toString() */
	
	@Override
	public String toString()
	{
		return "StudentObject [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}
