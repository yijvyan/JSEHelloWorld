
/**    
* @Title: Student.java  
* @Package com.map  
* @Description: TODO(学生类；)  
* @author yijvyan  
* @date 2018年3月15日  
* @version V1.0    
*/

package com.map;

/** @ClassName: Student
 * @Description: TODO(HashMap存储数据并遍历（自定义对象作为key）；)
 * @author yijvyan
 * @date 2018年3月15日 */

public class Student
{
	String	name;
	int		age;
	
	/* (非 Javadoc)
	 * @return
	 * @see java.lang.Object#toString() */
	
	@Override
	public String toString()
	{
		return "Student [name=" + name + ", age=" + age + "]";
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
	
	/* (非 Javadoc)
	 * @return
	 * @see java.lang.Object#hashCode() */
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	/* (非 Javadoc)
	 * @param obj
	 * @return
	 * @see java.lang.Object#equals(java.lang.Object) */
	
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Student other = (Student) obj;
		if (age != other.age) return false;
		if (name == null)
		{
			if (other.name != null) return false;
		}
		else if (!name.equals(other.name)) return false;
		return true;
	}
}
