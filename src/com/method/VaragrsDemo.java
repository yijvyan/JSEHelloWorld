
/**    
* @Title: VaragrsDemo.java  
* @Package com.method  
* @Description: TODO(可变参数的学习；)  
* @author yijvyan  
* @date 2018年3月15日  
* @version V1.0    
*/

package com.method;

/** @ClassName: VaragrsDemo
 * @Description: TODO(就是一个高级点的数组)
 * @author yijvyan
 * @date 2018年3月15日 */

public class VaragrsDemo
{
	
	/** @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("-------------------------1.可变参数；------------------------");
		
		//需求：定义一个方法，参数为两个int类型的变量，对参数求和并返回；
		//     定义一个方法，参数为三个int类型的变量，对参数求和并返回；
		//     ......
		
		//JDK1.5特性：
		//可变参数：当参数个数不确定的时候，类型要明确，Java可把多个参数直接转成数组；
		//实参：一个参数一个参数的传递；（就是调用方法时传入的参数：实际参数；）
		//形参：类型...变量名；（定义方法时的参数要求格式：形式参数；）
		
		//注意：1.在可变参数之后，不能再追加参数；反之可以；
		//2.参数的数量自定义，可以有多个，甚至也可以一个都不给；
		
		int result = sum(1, 2);
		System.out.println("<1>.两个数1，2的和是：" + result);
		
		int result2 = sum(1, 2, 3);
		System.out.println("<2>.三个数1，2，3的和是：" + result2);
		
		//		int[] arr = { 1, 2, 3 };
		//		int result3 = sum(arr);
		//		System.out.println("<3>.使用数组接收参数1，2，3求和，此时参数个数为传入的数组长度；即：" + result3);
		
		int result4 = sum(1, 2, 3, 4);
		//		int result4 = sum();
		System.out.println("<4>.使用可变参数的形式定义方法，求参数1，2，3，4的和：" + result4);
		
	}
	
	public static int sum(int a, int b)
	{
		return a + b;
	}
	
	public static int sum(int a, int b, int c)
	{
		return a + b + c;
	}
	
	//	public static int sum(int[] arr)
	//	{
	//		int sum = 0;
	//		for (int i = 0; i < arr.length; i++)
	//		{
	//			sum += i;
	//		}
	//		return sum;
	//	}
	
	public static int sum(int... arr)
	{
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
		{
			sum += i;
		}
		return sum;
		//		System.out.println(arr);
		//		return 0;
	}
	
}
