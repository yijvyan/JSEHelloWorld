
/**    
* @Title: SkipControlBreakContinue.java  
* @Package com.flowControl  
* @Description: TODO(跳转控制语句的用法)  
* @author yijvyan  
* @date 2018年2月5日  
* @version V1.0    
*/

package com.flowControl;

/** @ClassName: SkipControlBreakContinue
 * @Description: TODO(这里是break和continue的使用)
 * @author yijvyan
 * @date 2018年2月5日 */

public class SkipControlBreakContinue
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		//		break;
		for (int x = 1; x <= 10; x++)
		{
			if (x == 3)
			{
				break;
			}
			System.out.println("HelloWorld");
		}
		System.out.println("-------------------");
		
		//		continue;
		for (int x = 1; x <= 10; x++)
		{
			if (x == 3)
			{
				continue;
			}
			System.out.println("HelloWorld");
		}
		System.out.println("----------------------");
		
		//		break;
		for (int x = 1; x <= 10; x++)
		{
			if (x % 3 == 0)
			{
				break;
			}
			System.out.println("HelloWorld Count Is Two");
		}
		System.out.println("-------------------");
		
		//		continue;
		for (int x = 1; x <= 10; x++)
		{
			if (x % 3 == 0)
			{
				continue;
			}
			System.out.println("HelloWorld Count Is Seven");
		}
		System.out.println("----------------------");
		
	}
	
}
