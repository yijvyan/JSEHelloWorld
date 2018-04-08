
/**    
* @Title: LoopFor.java  
* @Package com.flowControl  
* @Description: TODO(循环结构的学习，这里是for循环)  
* @author yijvyan  
* @date 2018年2月5日  
* @version V1.0    
*/

package com.flowControl;

/** @ClassName: LoopFor
 * @Description: TODO(for循环的学习和练习)
 * @author yijvyan
 * @date 2018年2月5日 */

public class LoopFor
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		for (int x = 1; x <= 10; x++)
		{
			System.out.println("Hello World");
		}
		
		System.out.println("--------------------");
		
		for (int x = 1; x <= 5; x++)
		{
			System.out.println(x);
		}
		
		System.out.println("--------------------");
		
		for (int x = 5; x >= 1; x--)
		{
			System.out.println(x);
		}
		
		System.out.println("--------------------");
		
		int sum = 0;
		/* for (int x = 1; x <= 5; x++) { // sum = sum + x; sum += x; } */
		
		for (int x = 1; x <= 100; x++)
		{
			if (x % 2 == 0)
			{
				sum += x;
			}
		}
		System.out.println("sum:" + sum);
		
		System.out.println("--------------------");
		
	}
	
}
