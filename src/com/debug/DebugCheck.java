
/**    
* @Title: DebugCheck.java  
* @Package com.debug  
* @Description: TODO(关于eclipse的断点调试的学习)  
* @author yijvyan  
* @date 2018年2月23日  
* @version V1.0    
*/

package com.debug;

import java.util.Scanner;


/** @ClassName: DebugCheck
 * @Description: TODO(debug查看循环，方法调用，形式参数等执行流程情况)
 * @author yijvyan
 * @date 2018年2月23日 */

public class DebugCheck
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("c: " + c);
		
		int sum = 0;
		for (int x = 1; x <= 5; x++)
		{
			sum += x;
		}
		System.out.println("sum: " + sum);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Input First Data:");
		int x = sc.nextInt();
		System.out.println("Please Input Second Data:");
		int y = sc.nextInt();
		
		int result = sum(x, y);
		System.out.println("result: " + result);
		
		System.out.println("a:" + a + ",b:" + b);
		change(a, b);
		System.out.println("a:" + a + ",b:" + b);
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		change(arr);
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	
	public static int sum(int a, int b)
	{
		int c = a + b;
		return c;
	}
	
	public static void change(int a, int b)
	{
		System.out.println("a:" + a + ",b:" + b);
		a = b;
		b = a + b;
		System.out.println("a:" + a + ",b:" + b);
	}
	
	public static void change(int[] arr)
	{
		for (int x = 0; x < arr.length; x++)
		{
			if (arr[x] % 2 == 0)
			{
				arr[x] *= 2;
			}
		}
	}
	
}
