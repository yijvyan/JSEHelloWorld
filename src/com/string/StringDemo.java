
/**    
* @Title: StringDemo.java  
* @Package com.string  
* @Description: TODO(对String类的学习)  
* @author yijvyan  
* @date 2018年2月26日  
* @version V1.0    
*/

package com.string;

import java.util.Scanner;


/** @ClassName: StringDemo
 * @Description: TODO(主要String类的api的学习，字符串类的api学习)
 * @author yijvyan
 * @date 2018年2月26日 */

public class StringDemo
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		//字符串类String的构造方法的学习
		//1.把字符串数据封装成字符串对象
		//		String sOrigin = new String("HelloWorld");
		String sOrigin = new String("hello");
		//字符串是一种特殊的引用数据类型，直接输出字符串对象输出的是该对象中的数据，而不是地址值
		System.out.println("sOrigin: " + sOrigin);
		System.out.println("------------------------");
		
		//2.把字符数组的数据封装成字符串对象
		char[] chs = { 'h', 'e', 'l', 'l', 'o' };
		String sChar = new String(chs);
		System.out.println("sChar: " + sChar);
		System.out.println("------------------------");
		
		//3.把字符数组中的一部分数据封装成字符串对象
		//chs字符数组中，从0索引处开始，取5个元素
		//		String sCharIndex = new String(chs, 0, 5);
		String sCharIndex = new String(chs, 1, 3);
		System.out.println("sCharIndex: " + sCharIndex);
		System.out.println("-------------------------");
		
		//4.最常用的，也是最简单的，直接赋值
		String string = "hello";
		System.out.println("string: " + string);
		
		//== 基本数据类型是值相等，引用数据类型是引用地址值相等
		System.out.println("sOrigin==string: " + (sOrigin == string));
		
		//直接赋值时在方法区的常量池，new出来的在堆内存里（但是值还是在常量池）
		//string与string2赋的值都在常量池，且值相同，故引用地址值是相同的
		String string2 = "hello";
		System.out.println("string==string2: " + (string == string2));
		
		//5.String类的成员方法api的学习
		System.out.println("--------------------------------");
		String string3 = "Hello";
		//equals方法比较的是字符串的内容是否相同
		System.out.println(string.equals(string2));
		System.out.println(string.equals(string3));
		
		//equalsIgnoreCase忽略大小写比较内容，一般用于验证码的比较
		System.out.println("--------------------------------");
		System.out.println(string.equalsIgnoreCase(string2));
		System.out.println(string.equalsIgnoreCase(string3));
		
		//startsWith字符串对象是否以指定的str开头
		System.out.println("--------------------------------");
		System.out.println(string.startsWith("he"));
		System.out.println(string.startsWith("ll"));
		
		//模拟用户登陆，三次机会，并提示
		System.out.println("--------------------------------");
		String username = "admin";
		String password = "admin";
		
		for (int x = 0; x < 3; x++)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入用户名：");
			String name = sc.nextLine();
			System.out.println("请输入密码：");
			String pwd = sc.nextLine();
			
			if (username.equals(name) && password.equals(pwd))
			{
				System.out.println("登陆成功");
				break;
			}
			else
			{
				if ((2 - x) == 0)
				{
					System.out.println("用户名和密码被锁定，请与管理员联系！");
				}
				else
				{
					System.out.println("登陆失败,你还有 " + (2 - x) + "次机会");
				}
			}
		}
		
		//length获取字符串的长度，就是字符串的个数
		// charAt(int index)获取指定索引处的字符
		// indexOf(String str)获取str在字符串对象中第一次出现的索引
		// substring(int start)从start索引处开始截取字符串，一直截取到末尾
		// substring(int start,int end)从start开始，到end结束截取字符串
		String string4 = "helloworld";
		System.out.println("-------------------------------");
		System.out.println(string4.length());
		System.out.println(string4.charAt(0));
		System.out.println(string4.charAt(1));
		System.out.println(string4.indexOf("e"));
		System.out.println(string4.indexOf("llo"));
		//不存在的话，就返回索引-1
		System.out.println(string4.indexOf("ak"));
		System.out.println(string4.substring(0));
		System.out.println(string4.substring(5));
		//截取的是[0,3)，是hel，也就是0，1，2
		System.out.println(string4.substring(0, 3));
		System.out.println(string4.substring(0, string4.length()));
		//不能超过范围，不然就报错
		//		System.out.println(string4.substring(0, 11));
		
		//遍历字符串对象（获取字符串中的每一个字符）
		System.out.println("---------------------------------");
		System.out.println(string4.charAt(0));
		System.out.println(string4.charAt(1));
		System.out.println(string4.charAt(2));
		System.out.println(string4.charAt(3));
		System.out.println(string4.charAt(4));
		System.out.println(string4.charAt(5));
		System.out.println(string4.charAt(6));
		System.out.println(string4.charAt(7));
		System.out.println(string4.charAt(8));
		System.out.println(string4.charAt(9));
		
		//		for (int x = 0; x < 10; x++)
		for (int x = 0; x < string4.length(); x++)
		{
			System.out.println(string4.charAt(x));
		}
		
		//统计字符串中，大写字母，小写字母，数字，各出现的次数，其他字符不考虑
		System.out.println("-----------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串数据：");
		String stringCount = sc.nextLine();
		
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;
		
		for (int x = 0; x < stringCount.length(); x++)
		{
			char ch = stringCount.charAt(x);
			if (ch >= 'A' && ch <= 'Z')
			{
				bigCount++;
			}
			else if (ch >= 'a' && ch <= 'z')
			{
				smallCount++;
			}
			else if (ch >= '0' && ch <= '9')
			{
				numberCount++;
			}
			else
			{
				System.out.println("该字符 " + ch + "非法！");
			}
		}
		
		System.out.println("大写字符： " + bigCount + "个");
		System.out.println("小写字符： " + smallCount + "个");
		System.out.println("数字字符： " + numberCount + "个");
		
		//String类的转换功能
		//toCharArray()把字符串转换为字符数组，第二种遍历字符串的方法
		//toLowerCase()把字符串转换为小写字符串
		//toUpperCase()把字符串转换为大写字符串
		System.out.println("------------第二种遍历字符串的方法-----------");
		char[] chsTraverse = string4.toCharArray();
		for (int x = 0; x < chsTraverse.length; x++)
		{
			System.out.println(chsTraverse[x]);
		}
		
		System.out.println("-------------字符串转换大小写---------------");
		System.out.println("HEllo".toLowerCase());
		System.out.println("hello".toUpperCase());
		
		System.out.println("---------练习1：键盘录入字符串，首字母大写，其余小写，输出字符串-------");
		System.out.println("请输入一个字符串：");
		
		String strChange = sc.nextLine();
		String sBegin = strChange.substring(0, 1);
		String sRest = strChange.substring(1);
		
		strChange = sBegin.toUpperCase() + sRest.toLowerCase();
		System.out.println("转换以后的字符串strChange: " + strChange);
		
		System.out.println("--------------------trim()去除字符串两端的空格；split(String str)按照指定的字符或符号分割字符串成字符串数组----------------");
		String string5 = " helloworld ";
		String string6 = " hello world ";
		
		System.out.println("---" + string4 + "---");
		System.out.println("---" + string4.trim() + "---");
		System.out.println("---" + string5 + "---");
		System.out.println("---" + string5.trim() + "---");
		System.out.println("---" + string6 + "---");
		System.out.println("---" + string6.trim() + "---");
		
		String string7 = "aa,bb,cc";
		String[] strArray = string7.split(",");
		for (int x = 0; x < strArray.length; x++)
		{
			System.out.println(strArray[x]);
		}
		
		System.out.println("-----------练习2：数组元素按指定格式拼接输出{1，2，3}---->[1,2,3]----------");
		int[] arr = { 1, 2, 3 };
		String strArrayTo = arrayToString(arr);
		System.out.println("strArrayTo: " + strArrayTo);
		
		System.out.println("------------练习3：字符串的反转 abc--->cba--------------------");
		System.out.println("请输入一个需要反转的字符串：");
		String strReverse = sc.nextLine();
		String strSplitChar = reverseSplitStr(strReverse);
		System.out.println("反转后的字符串(方法一) strSplitChar: " + strSplitChar);
		String strCharArr = reverseCharArrayStr(strReverse);
		System.out.println("反转后的字符串(方法二) strCharArr: " + strSplitChar);
		
	}
	
	//数组元素按自定格式拼接的方法
	public static String arrayToString(int[] arr)
	{
		String str = "";
		str += "[";
		for (int x = 0; x < arr.length; x++)
		{
			if (x == arr.length - 1)
			{
				str += arr[x];
			}
			else
			{
				str += arr[x];
				str += ",";
			}
		}
		str += "]";
		
		return str;
	}
	
	//对字符串遍历然后拼接，来实现反转
	public static String reverseSplitStr(String str)
	{
		String strSplit = "";
		for (int x = str.length() - 1; x >= 0; x--)
		{
			strSplit += str.charAt(x);
		}
		
		return strSplit;
	}
	
	//将字符串转换成字符数组，反转字符数组的数据，再转换成字符串
	public static String reverseCharArrayStr(String str)
	{
		char[] chs = str.toCharArray();
		for (int start = 0, end = chs.length - 1; start <= end; start++, end--)
		{
			char temp = chs[start];
			chs[start] = chs[end];
			chs[end] = temp;
		}
		String strReverse = new String(chs);
		
		return strReverse;
	}
}
