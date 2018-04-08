
/**    
* @Title: PermissionsDemo2.java  
* @Package com.permission  
* @Description: TODO(权限修饰符的学习)  
* @author yijvyan  
* @date 2018年3月9日  
* @version V1.0    
*/

package com.permission;

/** @ClassName: PermissionsDemo2
 * @Description: TODO(相同包下的不同类其权限修饰符的作用范围)
 * @author yijvyan
 * @date 2018年3月9日 */

public class PermissionsDemo2
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("-------------------相同包下的不同类其权限修饰符的作用范围；------------");
		PermissionsDemo pD = new PermissionsDemo();
		pD.publicMethod();
		pD.defaultMethod();
		//		pD.privateMethod();
		pD.protectedMethod();
	}
	
}
