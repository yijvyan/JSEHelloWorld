
/**    
* @Title: LWhereSum.java  
* @Package com.flowControl  
* @Description: TODO(while循环语句的用法)  
* @author yijvyan  
* @date 2018年2月5日  
* @version V1.0    
*/

package com.flowControl;

/** @ClassName: LWhereSum
 * @Description: TODO(while循环基本格式和用例求和)
 * @author yijvyan
 * @date 2018年2月5日 */

public class LWhereSum
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		/* for (int x = 1; x <= 10; x++) { System.out.println("HelloWorld");
		 * } */
		int x = 1;
		while (x <= 10)
		{
			System.out.println("HelloWorld");
			x++;
		}
		System.out.println("------------------");
		
		int sum = 0;
		/* for (int y = 0; y <= 100; y++) { sum += y; } */
		int y = 1;
		while (y <= 100)
		{
			sum += y;
			y++;
		}
		System.out.println("sum:" + sum);
	}
	
}
