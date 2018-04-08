
/**    
* @Title: JavaSEExcercises.java  
* @Package com.javaSEExercises  
* @Description: TODO(JavaSE的基础语法的练习题)  
* @author yijvyan  
* @date 2018年2月23日  
* @version V1.0    
*/

package com.javaSEExercises;

import java.util.Scanner;


/** @ClassName: JavaSEExcercises
 * @Description: TODO(判断季度，回文数，不死神兔，数组查找，代码加密等等)
 * @author yijvyan
 * @date 2018年2月23日 */

public class JavaSEExcercises
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		//判断月份
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Input Month(1-12):");
		int month = sc.nextInt();
		
		ifMonth(month);
		ifMonthSimplify(month);
		
		switchMonth(month);
		switchMonthSimplify(month);
		
		//回文数
		palindromeNumber();
		
		//不死神兔
		immortalRabbit();
		
		//限定的元素数组求和
		int[] arr = { 171, 72, 19, 16, 118, 51, 210, 7, 18 };
		int sum = arraySum(arr);
		System.out.println("sum: " + sum);
		
		//评委打分
		int[] arrScore = new int[6];
		
		for (int x = 0; x < arrScore.length; x++)
		{
			System.out.println("Please Input No." + (x + 1) + " Judges'Score (1-100):");
			int score = sc.nextInt();
			arrScore[x] = score;
		}
		
		int max = getMax(arrScore);
		int min = getMin(arrScore);
		int sumScore = sum(arrScore);
		
		int avg = (sumScore - max - min) / (arrScore.length - 2);
		System.out.println("The Final Score Of The Player: " + avg);
		
		//对数组元素反转后遍历
		int[] arrReversal = new int[5];
		for (int x = 0; x < arrReversal.length; x++)
		{
			System.out.println("Please Input No." + (x + 1) + " Element Value:");
			int value = sc.nextInt();
			arrReversal[x] = value;
		}
		
		printArray(arrReversal);
		reverse(arrReversal);
		printArray(arrReversal);
		
		//查找指定元素第一出现的索引
		int[] arrFind = { 5, 7, 3, 2, 5 };
		System.out.println("Please Enter The Data That Is Queried:");
		int number = sc.nextInt();
		
		int index = getIndex(arrFind, number);
		System.out.println("index: " + index);
		
		//对指定的四位数数字加密并输出
		System.out.println("Please Input A Four Digit Number (1000-9999):");
		int fourDigit = sc.nextInt();
		encrypt(fourDigit);
		
	}
	
	public static void ifMonth(int month)
	{
		if (month > 12 || month < 1)
		{
			System.out.println("The Month You Entered Was Wrong!");
		}
		else if (month == 1)
		{
			System.out.println("Winter");
		}
		else if (month == 2)
		{
			System.out.println("Winter");
		}
		else if (month == 3)
		{
			System.out.println("Spring");
		}
		else if (month == 4)
		{
			System.out.println("Spring");
		}
		else if (month == 5)
		{
			System.out.println("Spring");
		}
		else if (month == 6)
		{
			System.out.println("Summer");
		}
		else if (month == 7)
		{
			System.out.println("Summer");
		}
		else if (month == 8)
		{
			System.out.println("Summer");
		}
		else if (month == 9)
		{
			System.out.println("Autumn");
		}
		else if (month == 10)
		{
			System.out.println("Autumn");
		}
		else if (month == 11)
		{
			System.out.println("Autumn");
		}
		else if (month == 12)
		{
			System.out.println("Winter");
		}
		
	}
	
	public static void ifMonthSimplify(int month)
	{
		if (month == 12 || month == 1 || month == 2)
		{
			System.out.println("Winter");
		}
		else if (month == 3 || month == 4 || month == 5)
		{
			System.out.println("Spring");
		}
		else if (month == 6 || month == 7 || month == 8)
		{
			System.out.println("Summer");
		}
		else if (month == 9 || month == 10 || month == 11)
		{
			System.out.println("Autumn");
		}
		else
		{
			System.out.println("The Month You Entered Was Wrong!");
		}
	}
	
	public static void switchMonth(int month)
	{
		switch (month)
		{
			case 1:
				System.out.println("Winter");
				break;
			case 2:
				System.out.println("Winter");
				break;
			case 3:
				System.out.println("Spring");
				break;
			case 4:
				System.out.println("Spring");
				break;
			case 5:
				System.out.println("Spring");
				break;
			case 6:
				System.out.println("Summer");
				break;
			case 7:
				System.out.println("Summer");
				break;
			case 8:
				System.out.println("Summer");
				break;
			case 9:
				System.out.println("Autumn");
				break;
			case 10:
				System.out.println("Autumn");
				break;
			case 11:
				System.out.println("Autumn");
				break;
			case 12:
				System.out.println("Winter");
				break;
			
			default:
				System.out.println("The Month You Entered Was Wrong!");
				break;
		}
	}
	
	public static void switchMonthSimplify(int month)
	{
		switch (month)
		{
			case 12:
			case 1:
			case 2:
				System.out.println("Winter");
				break;
			
			case 3:
			case 4:
			case 5:
				System.out.println("Spring");
				break;
			
			case 6:
			case 7:
			case 8:
				System.out.println("Summer");
				break;
			
			case 9:
			case 10:
			case 11:
				System.out.println("Autumn");
				break;
			
			default:
				System.out.println("The Month You Entered Was Wrong!");
				break;
		}
	}
	
	public static void palindromeNumber()
	{
		for (int x = 10000; x < 100000; x++)
		{
			int single = x % 10;
			int ten = x / 10 % 10;
			int thousand = x / 10 / 10 / 10 % 10;
			int million = x / 10 / 10 / 10 / 10 % 10;
			
			if ((single == million) && (ten == thousand))
			{
				System.out.println(x);
			}
		}
	}
	
	public static void immortalRabbit()
	{
		int[] arr = new int[20];
		arr[0] = 1;
		arr[1] = 1;
		
		for (int x = 2; x < arr.length; x++)
		{
			arr[x] = arr[x - 1] + arr[x - 2];
		}
		
		System.out.println("Twentieth Months Of Rabbit Logarithm Is: " + arr[19]);
	}
	
	public static int arraySum(int[] arr)
	{
		int sum = 0;
		
		for (int x = 0; x < arr.length; x++)
		{
			if ((arr[x] % 10 != 7) && (arr[x] / 10 % 10 != 7) && (arr[x] % 2 == 0))
			{
				sum += arr[x];
			}
		}
		return sum;
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
	
	public static int getMin(int[] arr)
	{
		int min = arr[0];
		for (int x = 1; x < arr.length; x++)
		{
			if (arr[x] < min)
			{
				min = arr[x];
			}
		}
		return min;
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
	
	public static void reverse(int[] arr)
	{
		for (int start = 0, end = arr.length - 1; start <= end; start++, end--)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
	
	//遍历数组
	public static void printArray(int[] arr)
	{
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
	
	public static int getIndex(int[] arr, int value)
	{
		for (int x = 0; x < arr.length; x++)
		{
			if (arr[x] == value) { return x; }
		}
		
		//如果不存在元素，就返回索引-1，然而不存在这样的索引，也就表明没有查询出来
		return -1;
	}
	
	public static void encrypt(int value)
	{
		int[] arr = new int[4];
		
		arr[0] = value / 10 / 10 / 10 % 10;
		arr[1] = value / 10 / 10 % 10;
		arr[2] = value / 10 % 10;
		arr[3] = value % 10;
		
		for (int x = 0; x < arr.length; x++)
		{
			arr[x] += 5;
			arr[x] %= 10;
		}
		
		int temp = arr[0];
		arr[0] = arr[3];
		arr[3] = temp;
		
		temp = arr[1];
		arr[1] = arr[2];
		arr[2] = temp;
		
		for (int x = 0; x < arr.length; x++)
		{
			System.out.print(arr[x]);
		}
		
		//换行，光标换到下一行
		System.out.println();
	}
}
