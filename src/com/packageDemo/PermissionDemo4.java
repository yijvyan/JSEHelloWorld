
/**    
* @Title: PermissionDemo4.java  
* @Package com.packageDemo  
* @Description: TODO(权限修饰符的学习)  
* @author yijvyan  
* @date 2018年3月9日  
* @version V1.0    
*/

package com.packageDemo;

import com.permission.PermissionsDemo;


/** @ClassName: PermissionDemo4
 * @Description: TODO(不同包下的子类的权限修饰符的作用范围)
 * @author yijvyan
 * @date 2018年3月9日 */

public class PermissionDemo4 extends PermissionsDemo
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 * 返回类型 @throws */
	
	public static void main(String[] args)
	{
		
	}
	
	public void function()
	{
		super.publicMethod();
		super.protectedMethod();
	}
	
}
