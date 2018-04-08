
/**    
* @Title: CDIfTest.java  
* @Package com.flowControl  
* @Description: TODO(选择结构的练习，使用if)  
* @author yijvyan  
* @date 2018年2月5日  
* @version V1.0    
*/

package com.flowControl;

import java.util.Scanner;


/** @ClassName: CDIfTest
 * @Description: TODO(if选择的练习)
 * @author yijvyan
 * @date 2018年2月5日 */

public class CDIfTest
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		/* System.out.println("Please Input First Number:"); int a =
		 * sc.nextInt(); System.out.println("Please Input Second Number:"); int
		 * b = sc.nextInt(); */
		
		/* if (a > b) { System.out.println("大的值是：" + a); } else {
		 * System.out.println("大的值是：" + b); } */
		
		/* int max; if (a > b) { max = a; } else { max = b; } // max += 100;
		 * System.out.println("大的值是：" + max); */
		
		//第二个测试题
		System.out.println("Please Input Student Score：");
		int score = sc.nextInt();
		
		/* if (score >= 90 && score <= 100) { System.out.println("优秀"); } else
		 * if (score >= 80 && score < 90) { System.out.println("好"); } else if
		 * (score >= 70 && score < 80) { System.out.println("良"); } else if
		 * (score >= 60 && score < 70) { System.out.println("及格"); } else {
		 * System.out.println("不及格"); } */
		
		if (score > 100 || score < 0)
		{
			System.out.println("The Data You Have Entered is incorrect！");
		}
		else if (score >= 90 && score <= 100)
		{
			System.out.println("优秀");
		}
		else if (score >= 80 && score < 90)
		{
			System.out.println("好");
		}
		else if (score >= 70 && score < 80)
		{
			System.out.println("良");
		}
		else if (score >= 60 && score < 70)
		{
			System.out.println("及格");
		}
		else
		{
			System.out.println("不及格");
		}
	}
	
}
