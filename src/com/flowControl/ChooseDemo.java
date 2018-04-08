
/**    
* @Title: ChooseDemo.java  
* @Package com.flowControl  
* @Description: TODO(选择结构，if,switch,do...while)  
* @author yijvyan  
* @date 2018年2月5日  
* @version V1.0    
*/

package com.flowControl;

/** @ClassName: ChooseDemo
 * @Description: TODO(选择结构的学习)
 * @author yijvyan
 * @date 2018年2月5日 */

public class ChooseDemo
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("开始");
		
		int a = 10;
		int b = 20;
		
		if (a == b)
		{
			System.out.println("a等于b");
		}
		
		int c = 10;
		if (a == c)
		{
			System.out.println("a等于c");
		}
		
		//判断数字是奇数还是偶数
		int d = 100;
		//重新赋值
		d = 99;
		
		if (d % 2 == 0)
		{
			System.out.println("d是偶数");
		}
		else
		{
			System.out.println("d是奇数");
		}
		
		//3.if..else if..
		int x = 5;
		
		x = 0;
		x = -5;
		
		int y;
		
		if (x >= 3)
		{
			y = 2 * x + 1;
		}
		else if (x >= -1 && x < 3)
		{
			y = 2 * x;
		}
		else if (x < -1)
		{
			y = 2 * x - 1;
		}
		else
		{
			y = 0;
			System.out.println("不存在这样的x");
		}
		
		System.out.println("y:" + y);
		
		System.out.println("结束");
	}
	
}
