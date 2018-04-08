
/**    
* @Title: Phone.java  
* @Package com.object  
* @Description: TODO(手机类)  
* @author yijvyan  
* @date 2018年2月25日  
* @version V1.0    
*/

package com.object;

/** @ClassName: Phone
 * @Description: TODO(手机类的成员：变量和方法)
 * @author yijvyan
 * @date 2018年2月25日 */

public class Phone
{
	String	brand;
	int		price;
	String	color;
	
	public void call(String name)
	{
		System.out.println("给 " + name + " 打电话！");
	}
	
	public void setMessage()
	{
		System.out.println("群发短信！");
	}
}
