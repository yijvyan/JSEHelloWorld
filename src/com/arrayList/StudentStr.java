
/**    
* @Title: StudentStr.java  
* @Package com.arrayList  
* @Description: TODO(学生类对象，只是属性不同)  
* @author yijvyan  
* @date 2018年3月1日  
* @version V1.0    
*/

package com.arrayList;

/** @ClassName: StudentStr
 * @Description: TODO(这次为方便起见，属性都是String)
 * @author yijvyan
 * @date 2018年3月1日 */

public class StudentStr
{
	private String	name;
	private String	age;
	
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
	
	/** 创建一个新的实例 StudentStr.
	 * 
	 * @param name
	 * @param age
	 */
	
	public StudentStr(String name, String age)
	{
		super();
		this.name = name;
		this.age = age;
	}
	
	/** 创建一个新的实例 StudentStr. */
	
	public StudentStr()
	{
		super();
		// TODO Auto-generated constructor stub
	}
}
