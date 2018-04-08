
/**    
* @Title: Variable.java  
* @Package com.object  
* @Description: TODO(成员变量与局部变量)  
* @author yijvyan  
* @date 2018年2月26日  
* @version V1.0    
*/

package com.object;

/** @ClassName: Variable
 * @Description: TODO(成员变量与局部变量的不同)
 * @author yijvyan
 * @date 2018年2月26日 */

public class Variable
{
	//成员变量有默认值（存在于堆中，也就是new 对象时，随对象的消失而消失）
	int x;
	
	public void show()
	{
		//局部变量要使用的话必须先赋值（存在于栈中，随着方法的调用完毕而消失）
		int y = 0;
		System.out.println(x);
		System.out.println(y);
	}
}
