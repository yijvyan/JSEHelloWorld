
/**    
* @Title: StringBuilderDemo.java  
* @Package com.string  
* @Description: TODO(StringBuilder类的学习)  
* @author yijvyan  
* @date 2018年3月1日  
* @version V1.0    
*/

package com.string;

import java.util.Scanner;


/** @ClassName: StringBuilderDemo
 * @Description: TODO(拼接，反转，交换的功能)
 * @author yijvyan
 * @date 2018年3月1日 */

public class StringBuilderDemo
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		//StringBuiler:可变的字符串，也叫字符串缓冲类；内容可变
		//String:内容固定
		StringBuilder sb = new StringBuilder();
		System.out.println("输出的是sb的内容（此时为空）：" + sb);
		System.out.println("sb.capacity返回的是字符串的容量，就是能存几个字符：  " + sb.capacity());
		System.out.println("sb.length返回的是字符串的实际长度，就是已经存了几个字符：  " + sb.length());
		
		System.out.println("-----------StringBuilder的append添加功能，append(任意类型)，添加数据，并返回自身对象---------");
		StringBuilder sb2 = sb.append("hello");
		System.out.println("sb的内容：" + sb);
		System.out.println("sb2的内容：" + sb2);
		System.out.println("sb与sb2指向同一个引用，相同；若是String类的话，也是比较引用的地址值:（sb==sb2）  " + (sb == sb2));
		
		sb.append("world");
		sb.append(true);
		sb.append(100);
		System.out.println("sb拼接了字符串，Boolean，int，值为： " + sb);
		
		sb2.append("world").append(true).append(100);
		System.out.println("sb2使用链式编程；append方法返回的是一个StringBuilder对象，所以返回值还可以继续调方法，值为：  " + sb2);
		
		System.out.println("-----------StringBuilder的reverse反转功能，将字符串的字符反转----------");
		sb.reverse();
		System.out.println("sb的反转之后的值为： " + sb);
		
		System.out.println("-----------练习一：StringBuilder和String的相互转换，方便使用各自的方法-----------");
		String strSbTo = sb.toString();
		System.out.println("StringBuilder的toString方法，可以将sb转换成strSbTo，strSbTo为： " + strSbTo);
		
		StringBuilder sbStrTo = new StringBuilder(strSbTo);
		System.out.println("strSb要转换成sbStrTo，使用StringBuilder的构造方法，sbStrTo为： " + sbStrTo);
		
		System.out.println("-----------练习二：数组元素按格式拼接，这次使用StringBuilder，可以节省内存---------");
		int[] arr = { 1, 2, 3 };
		String strArrTo = arrayToString(arr);
		System.out.println("StringBuilder将数组按格式拼接后输出的字符串： " + strArrTo);
		
		System.out.println("-----------练习三：字符串反转----------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个需要反转的字符串：");
		String strReverse = sc.nextLine();
		strReverse = sbReverse(strReverse);
		System.out.println("反转后的字符串strReverse为： " + strReverse);
		
		System.out.println("-----------练习四：判断是否是对称字符串，就是反转后的字符串与反转前相同-----------");
		System.out.println("请输入一个需要判断是否对称的字符串：");
		String strSymmetry = sc.nextLine();
		
		boolean b = isSymmetry(strSymmetry);
		System.out.println("字符串strSymmetry的判断结果：" + b);
		
	}
	
	//使用StringBuilder拼接元素
	public static String arrayToString(int[] arr)
	{
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int x = 0; x < arr.length; x++)
		{
			if (x == arr.length - 1)
			{
				sb.append(arr[x]);
			}
			else
			{
				sb.append(arr[x]).append(", ");
			}
		}
		sb.append("]");
		String str = sb.toString();
		
		return str;
	}
	
	//将String转换成StringBuilder，然后使用sb的reverse方法，最后再转换成String
	public static String sbReverse(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String strSbTo = sb.toString();
		
		return strSbTo;
	}
	
	public static boolean isSymmetry(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String strSbReverse = sb.toString();
		
		return strSbReverse.equals(str);
	}
}
