
/**    
* @Title: WrapperClassInteger.java  
* @Package com.classAPI  
* @Description: TODO(学习包装类的使用；)  
* @author yijvyan  
* @date 2018年3月12日  
* @version V1.0    
*/

package com.classAPI;

import java.util.ArrayList;


/** @ClassName: WrapperClassInteger
 * @Description: TODO(这里主要是int的包装类Integer的用法；)
 * @author yijvyan
 * @date 2018年3月12日 */

public class WrapperClassInteger
{
	
	/** @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("-------------------1.包装类的概述和基本使用；-------------------");
		//需求：判断一个数是否符合int类型的范围；
		//1.由于基本数据类型只能做一些简单的操作和运算，故Java为此封装了基本数据类型，为每种基本数据类型提供了包装类；
		//2.包装类就是封装了基本数据类型的类，提供了更多复杂的方法和一些变量；
		
		//byte---Byte  short---Short  char---Character  int---Integer  long---Long
		//float---Float  double---Double   boolean---Boolean
		
		//Integer:  1.String --- int ;  
		//              方式一：int intValue();   方式二：static int parseInt(String s);
		//2.int --- String;
		//              方式一： + "";   方式二：String toString();
		
		//构造方法：1.Integer(int value);
		//2.Integer(String s);
		
		int n = 10;
		if (n >= Math.pow(-2, 31) && n <= Math.pow(2, 31) - 1)
		{
			System.out.println("若-2^31 <= n <= 2^31-1，则符合int类型的范围");
		}
		else
		{
			System.out.println("反之，不符合int类型的范围");
		}
		
		//Integer(String s);
		Integer i = new Integer("10");
		System.out.println("Integer的构造方法，将字符串转换成Integer对象：" + i);
		
		//int intValue();
		int a = i.intValue();
		System.out.println("调用Integer的方法intValue（），返回int类型数据：" + (a + 10));
		
		//static int parseInt(String s);
		int aParseInt = Integer.parseInt("30");
		System.out.println("使用Integer的静态方法parseInt(s)，返回int类型数据：" + (aParseInt + 10));
		
		//Integer(int value);
		Integer iInt = new Integer(50);
		
		String s = iInt.toString();
		System.out.println("调用Integer的方法toString()，返回字符串对象：" + s);
		
		//static String toString(int i);
		String sInt = Integer.toString(60);
		System.out.println("使用Integer的静态方法toString(60)，返回字符串对象：" + sInt);
		
		System.out.println("-------------------2.自动装箱和拆箱；-------------------");
		
		//JDK1.5的特性：自动装箱和拆箱；
		
		//自动装箱
		Integer iAutoBoxing = 10;
		//相当于     Integer iAutoBoxing = new Integer(10);
		
		//自动拆箱
		int iAutoUnBoxing = iAutoBoxing;
		//相当于    int iAutoUnBoxing = iAutoBoxing.intValue();
		
		Integer i1 = 10;
		Integer i2 = 20;
		Integer i3 = i1 + i2;
		//相当于   Integer i3 = new Integer( i1.intValue() + i2.intValue() );
		
		ArrayList arrayList = new ArrayList();
		arrayList.add(1);
		//集合只能添加对象，这里用到了自动装箱：arrayList.add(new Integer(1));
	}
	
}
