
/**    
* @Title: Test.java  
* @Package com.object  
* @Description: TODO(Student,Teacher的测试类)  
* @author yijvyan  
* @date 2018年2月26日  
* @version V1.0    
*/

package com.object;

/** @ClassName: Test
 * @Description: TODO(就是为了测试teacher类的test方法)
 * @author yijvyan
 * @date 2018年2月26日 */

public class Test
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		Teacher t = new Teacher();
		//		Student s = new Student();
		
		//方法的返回值是类名，返回的是该类的对象
		Student s = t.getStudent();
		
		//类名作为形式参数，传递的是该类对象
		t.test(s);
		
		System.out.println(t.getStudent());
	}
	
}
