
/**    
* @Title: LDoWhere.java  
* @Package com.flowControl  
* @Description: TODO(Do...While的用法)  
* @author yijvyan  
* @date 2018年2月5日  
* @version V1.0    
*/

package com.flowControl;

/** @ClassName: LDoWhere
 * @Description: TODO(Do...While以及三种循环的区别)
 * @author yijvyan
 * @date 2018年2月5日 */

public class LDoWhere
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		int x = 1;
		do
		{
			System.out.println("HelloWorld");
			x++;
		}
		while (x <= 10);
		System.out.println("---------------");
		
		int y = 3;
		while (y < 3)
		{
			System.out.println("Love Life,Love Java");
			y++;
		}
		
		int z = 3;
		do
		{
			System.out.println("Love Life,Love Java");
			z++;
		}
		while (z < 3);
		System.out.println("-----------------------------");
		
		for (int i = 1; i <= 10; i++)
		{
			System.out.println("Love Life,Love Java");
		}
		//		System.out.println("i:"+i);
		System.out.println("-----------------------------");
		
		int j = 1;
		while (j <= 10)
		{
			System.out.println("Love Life,Love Java");
			j++;
		}
		System.out.println("j:" + j);
		
		//推荐 for > while > do...while
	}
	
}
