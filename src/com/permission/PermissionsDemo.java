
/**    
* @Title: PermissionsDemo.java  
* @Package com.permission  
* @Description: TODO(权限修饰符的学习)  
* @author yijvyan  
* @date 2018年3月9日  
* @version V1.0    
*/

package com.permission;

/** @ClassName: PermissionsDemo
 * @Description: TODO(四个权限修饰符的作用范围)
 * @author yijvyan
 * @date 2018年3月9日 */

public class PermissionsDemo
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		
		System.out.println("-------------------权限修饰符修饰的成员方法的作用范围；------------------");
		
		//权限修饰符修饰的成员方法的作用范围：
		//1.public     当前类；  相同包下的不同类；   不同包下的不同类；
		//2.default    当前类；  相同包下的不同类；
		//3.private    当前类；
		//4.protected  当前类；  相同包下的不同类；
		
		//default: 当前包下使用；
		//protected: 让子类对象使用；
		
		PermissionsDemo pD = new PermissionsDemo();
		pD.publicMethod();
		pD.defaultMethod();
		pD.privateMethod();
		pD.protectedMethod();
	}
	
	public void publicMethod()
	{
		System.out.println("public修饰的成员方法；");
	}
	
	void defaultMethod()
	{
		System.out.println("默认不加修饰符的成员方法；");
	}
	
	private void privateMethod()
	{
		System.out.println("private修饰的成员方法；");
	}
	
	protected void protectedMethod()
	{
		System.out.println("protected修饰的成员方法；");
	}
}
