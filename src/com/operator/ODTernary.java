
/**    
* @Title: ODTernary.java  
* @Package com.operator  
* @Description: TODO(关于三元运算符的介绍)  
* @author yijvyan  
* @date 2018年2月4日  
* @version V1.0    
*/

package com.operator;

/** @ClassName: ODTernary
 * @Description: TODO(所有关于三元运算的例子都在这里)
 * @author yijvyan
 * @date 2018年2月4日 */

public class ODTernary
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		
		int c = (a > b) ? a : b;
		System.out.println("c: " + c);
		
		//		boolean flag = (a == b) ? true : false;
		boolean flag = (a == b);
		System.out.println("flag:" + flag);
		
		int d = 15;
		
		int temp = (a > b) ? a : b;
		int max = (temp > d) ? temp : d;
		System.out.println("max:" + max);
	}
	
}
