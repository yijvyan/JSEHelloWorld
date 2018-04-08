
/**    
* @Title: MethodPractice.java  
* @Package com.method  
* @Description: TODO(对于方法的学习)  
* @author yijvyan  
* @date 2018年2月22日  
* @version V1.0    
*/

package com.method;

import java.util.Scanner;


/** @ClassName: MethodPractice
 * @Description: TODO(主要是方法的定义和一些使用练习)
 * @author yijvyan
 * @date 2018年2月22日 */

public class MethodPractice
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println(MethodPractice.sum(1, 2));
		
		//单独调用无意义
		//		sum(10, 20);
		
		//输出调用
		//		System.out.println(sum(10, 20));
		
		//赋值调用
		int result = sum(10, 20);
		
		result += 10;
		System.out.println("result: " + result);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Input First Data:");
		int a = sc.nextInt();
		System.out.println("Please Input Second Data:");
		int b = sc.nextInt();
		
		int max = getMax(a, b);
		System.out.println("max: " + max);
		
		//		boolean bool = compare(a, b);
		boolean bool = compare(10, 20);
		System.out.println("bool: " + bool);
		System.out.println("compare byte------------------>  " + compare((byte) 10, (byte) 20));
		System.out.println("compare short------------------>  " + compare((short) 10, (short) 20));
		System.out.println("compare long------------------>  " + compare(10L, 20L));
		
		System.out.println("Please Input Third Data:");
		int c = sc.nextInt();
		
		//		int result2 = sum2(a, b, c);
		int result2 = sum(a, b, c);
		System.out.println("result2: " + result2);
		
		int maxThree = getMaxThree(a, b, c);
		System.out.println("max: " + maxThree);
		
		//void修饰的方法只能单独调用
		printHelloWorld();
		
		//输出调用不能用
		//		System.out.println(printHelloWorld());
		
		//赋值调用不能用
		//		Void v = printHelloWorld();
		
		printNumber(3);
		System.out.println("-----------------------------");
		printNumber(10);
		
		System.out.println("-----------------------------");
		printWaterGodFlower();
		
		System.out.println("-----------------------------");
		
		System.out.println("a:" + a + ",b:" + b);
		change(a, b);
		System.out.println("a:" + a + ",b:" + b);
		
		//参数是引用数据类型，形参的改变会影响实参
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		for (int x = 0; x < arr.length; x++)
		{
			System.out.println(arr[x]);
		}
		change(arr);
		for (int x = 0; x < arr.length; x++)
		{
			System.out.println(arr[x]);
		}
		
		System.out.println("-------------------------------");
		printArray(arr);
		
		int[] arr2 = { 24, 36, 90, 75, 81 };
		/* int maxArr = arr2[0]; for (int x = 1; x < arr2.length; x++) { if
		 * (arr2[x] > maxArr) { maxArr = arr2[x]; } } */
		int maxArr = getMax(arr2);
		System.out.println("maxArr: " + maxArr);
		
		//求和
		int[] arr3 = { 1, 2, 3, 4, 5 };
		/* int sum = 0; for (int x = 0; x < arr3.length; x++) { sum += arr3[x];
		 * } */
		int sum = sum(arr3);
		System.out.println("sum: " + sum);
		
		System.out.println("--------------------练习1.方法的回顾；求两个数的和，并在主方法中调用；-----------------------------------");
		//方法：类中的一段具有特定功能的程序，提高了代码的复用性和可维护性
		
		//形参：方法声明的变量，只能是变量，接收方法调用时传递进来的数据；就是定义方法时的参数
		//实参：调用方法时传递的数据，可以是常量也可以是变量
		
		//赋值调用
		int sumBack = sum(10, 20);
		System.out.println("方法的回顾；求两个数的和，并在主方法中调用；此时，赋值调用：" + sumBack);
		
		//输出调用
		int aB = 10;
		int bB = 30;
		
		System.out.println("同上，就不打那么多字了；此时，是输出调用：" + sum(aB, bB));
		
	}
	
	public static int sum(int a, int b)
	{
		//		int c = a + b;
		//		return c;
		
		//直接返回求和结果
		return a + b;
	}
	
	public static int sum(int[] arr)
	{
		int sum = 0;
		for (int x = 0; x < arr.length; x++)
		{
			sum += arr[x];
		}
		return sum;
	}
	
	//	public static int sum2(int a, int b, int c)
	public static int sum(int a, int b, int c)
	{
		return a + b + c;
	}
	
	public static float sum(float a, float b)
	{
		return a + b;
	}
	
	public static int getMax(int a, int b)
	{
		if (a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	
	public static int getMax(int[] arr)
	{
		int max = arr[0];
		for (int x = 1; x < arr.length; x++)
		{
			if (arr[x] > max)
			{
				max = arr[x];
			}
		}
		return max;
	}
	
	public static boolean compare(int x, int y)
	{
		System.out.println("int");
		if (x == y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean compare(byte a, byte b)
	{
		System.out.println("byte");
		return a == b;
	}
	
	public static boolean compare(short a, short b)
	{
		System.out.println("short");
		return a == b;
	}
	
	public static boolean compare(long a, long b)
	{
		System.out.println("long");
		return a == b;
	}
	
	public static int getMaxThree(int a, int b, int c)
	{
		if (a > b)
		{
			if (a > c)
			{
				return a;
			}
			else
			{
				return c;
			}
		}
		else
		{
			if (b > c)
			{
				return b;
			}
			else
			{
				return c;
			}
		}
	}
	
	public static void printHelloWorld()
	{
		for (int x = 0; x < 10; x++)
		{
			System.out.println(x + 1 + " HelloWorld");
		}
		
		for (int x = 1; x <= 10; x++)
		{
			System.out.println(x + " HelloWorld");
		}
	}
	
	public static void printNumber(int n)
	{
		for (int x = 1; x <= n; x++)
		{
			System.out.println(x);
		}
	}
	
	public static void printWaterGodFlower()
	{
		for (int x = 100; x < 1000; x++)
		{
			int single = x % 10;
			int ten = x / 10 % 10;
			int hundred = x / 10 / 10 % 10;
			
			if (single * single * single + ten * ten * ten + hundred * hundred * hundred == x)
			{
				System.out.println(x);
			}
		}
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
	
	public static void printArray(int[] arr)
	{
		/* for (int x = 0; x < arr.length; x++) { System.out.println(arr[x]);
		 * } */
		System.out.print("[");
		for (int x = 0; x < arr.length; x++)
		{
			if (x == arr.length - 1)
			{
				System.out.println(arr[x] + "]");
			}
			else
			{
				System.out.print(arr[x] + ", ");
			}
		}
	}
	
}
