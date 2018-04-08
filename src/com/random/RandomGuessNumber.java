
/**    
* @Title: RandomGuessNumber.java  
* @Package com.random  
* @Description: TODO(Random的学习和使用)  
* @author yijvyan  
* @date 2018年2月6日  
* @version V1.0    
*/

package com.random;

import java.util.Random;
import java.util.Scanner;


/** @ClassName: RandomGuessNumber
 * @Description: TODO(学习random和做个猜数字的小练习)
 * @author yijvyan
 * @date 2018年2月6日 */

public class RandomGuessNumber
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		Random r = new Random();
		
		for (int x = 1; x <= 10; x++)
		{
			
			int number = r.nextInt(10);
			System.out.println(number);
		}
		
		System.out.println("-------------------");
		
		//1-100之间的随机数，但是下面的区间是【0-99】
		//		int i = r.nextInt(100);
		int i = r.nextInt(100) + 1;
		System.out.println(i);
		System.out.println("--------------------");
		
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			System.out.println("Please Input The Number You Wanna Guess(1-100):");
			
			int guessNumber = sc.nextInt();
			
			if (guessNumber > i)
			{
				System.out.println("Your Number :" + guessNumber + " Is Big!");
			}
			else if (guessNumber < i)
			{
				System.out.println("Your Number :" + guessNumber + " Is Small!");
			}
			else
			{
				System.out.println("Congratulations!Shoot It!");
				break;
			}
		}
		
	}
	
}
