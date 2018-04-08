
/**    
* @Title: Teacher.java  
* @Package com.object  
* @Description: TODO(Teacher类)  
* @author yijvyan  
* @date 2018年2月26日  
* @version V1.0    
*/

package com.object;

/** @ClassName: Teacher
 * @Description: TODO(其实没什么好注释的，这一看就知道是个类，是Teacher)
 * @author yijvyan
 * @date 2018年2月26日 */

public class Teacher
{
	public void test(Student s)
	{
		s.study();
	}
	
	public Student getStudent()
	{
		Student s = new Student();
		return s;
	}
}
