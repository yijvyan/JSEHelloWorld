
/**    
* @Title: PermissionDemo3.java  
* @Package com.packageDemo  
* @Description: TODO(权限修饰符的学习)  
* @author yijvyan  
* @date 2018年3月9日  
* @version V1.0    
*/

package com.packageDemo;

import com.permission.PermissionsDemo;


/** @ClassName: PermissionDemo3
 * @Description: TODO(不同包下的不同类)
 * @author yijvyan
 * @date 2018年3月9日 */

public class PermissionDemo3
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 * 返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("-------------------不同包下的不同类其权限修饰符的作用范围；------------");
		PermissionsDemo pD = new PermissionsDemo();
		pD.publicMethod();
		//		pD.defaultMethod();
		//		pD.privateMethod();
		//		pD.protectedMethod();
	}
	
}
