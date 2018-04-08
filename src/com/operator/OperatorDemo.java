
/**    
* @Title: OperatorDemo.java  
* @Package com.operator  
* @Description: TODO(Java的运算符)  
* @author yijvyan  
* @date 2018年2月2日  
* @version V1.0    
*/

package com.operator;

/** @ClassName: OperatorDemo
 * @Description: TODO(五种运算符以及表达式)
 * @author yijvyan
 * @date 2018年2月2日 */

public class OperatorDemo
{
	
	/** @Title: main @Description: TODO(具体的表示出内容) @param @param args 参数 @return
	 *         void 返回类型 @throws */
	
	public static void main(String[] args)
	{
		int a = 3;
		int b = 4;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		
		//整数相除只能得到整数，要想得到小数，必须有浮点数参与运算
		System.out.println(3.0 / 4);
		System.out.println(3 / 4.0);
		
		int aa = 3;
		int bb = 5;
		System.out.println(bb / aa);
		//取余
		System.out.println(bb % aa);
		System.out.println("-----------------------------------");
		
		//字符参与加法运算     就是拿字符在计算机中存储的数据值来参与运算的
		// A 65      a 97     0  48
		char c = 'A';
		System.out.println(aa + c);
		
		//字符串参与加法运算，其实就是字符串拼接
		System.out.println("hello" + aa);
		System.out.println("hello" + aa + bb);
		//从左往右运算，先做加法，再做拼接
		System.out.println(aa + bb + "hello");
		
	}
	
}
