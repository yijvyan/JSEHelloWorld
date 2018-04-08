
/**    
* @Title: StudentMap.java  
* @Package com.map  
* @Description: TODO(学生类；)  
* @author yijvyan  
* @date 2018年3月15日  
* @version V1.0    
*/

package com.map;

/** @ClassName: StudentMap
 * @Description: TODO(Map的案例（Map嵌套Collection）；单列集合存储学生对象；)
 * @author yijvyan
 * @date 2018年3月15日 */

public class StudentMap
{
	
	/* (非 Javadoc)
	 * @return
	 * @see java.lang.Object#toString() */
	
	@Override
	public String toString()
	{
		return "StudentMap [num=" + num + ", name=" + name + "]";
	}
	
	private String	num;
	private String	name;
	
	/** @return num */
	
	public String getNum()
	{
		return num;
	}
	
	/** @param paramtheparamthe{bare_field_name}
	 *            to set */
	
	public void setNum(String num)
	{
		this.num = num;
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
	
	/** 创建一个新的实例 StudentMap.
	 * 
	 * @param num
	 * @param name
	 */
	
	public StudentMap(String num, String name)
	{
		super();
		this.num = num;
		this.name = name;
	}
	
	/** 创建一个新的实例 StudentMap. */
	
	public StudentMap()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
}
