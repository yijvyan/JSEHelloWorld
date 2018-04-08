
/**    
* @Title: CDSwitch.java  
* @Package com.flowControl  
* @Description: TODO(switch语句格式的学习)  
* @author yijvyan  
* @date 2018年2月5日  
* @version V1.0    
*/

package com.flowControl;

import java.util.Scanner;


/** @ClassName: CDSwitch
 * @Description: TODO(switc的学习和练习)
 * @author yijvyan
 * @date 2018年2月5日 */

public class CDSwitch
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 * 返回类型 @throws */
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Input A Number(1-7):");
		int weekday = sc.nextInt();
		
		switch (weekday)
		{
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			
			default:
				System.out.println("The Data You Have Entered Is Incorrect!");
				break;
		}
		
	}
	
}
