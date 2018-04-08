
/**    
* @Title: RecurrenceDemo.java  
* @Package com.recurrence  
* @Description: TODO(递归的学习；)  
* @author yijvyan  
* @date 2018年3月17日  
* @version V1.0    
*/

package com.recurrence;

/** @ClassName: RecurrenceDemo
 * @Description: TODO(自己调自己的方法；)
 * @author yijvyan
 * @date 2018年3月17日 */

public class RecurrenceDemo
{
	
	/** @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("-------------------------1.递归的概述；---------------------------");
		
		//需求：5的阶乘；
		// 5！= 5 * 4 * 3 * 2 * 1；      120
		// 5！= 5 * 4！；                                120
		//      4！= 4 * 3！；                    24
		//         3！= 3 * 2！；            6
		//              2！= 2 * 1！；2
		//                  1！= 1；   1
		
		// n! = n * (n-1)!；
		
		//递归：1.把大问题拆成小问题，然后把小问题拆成更小的问题；2.当把更多小问题解决了，小问题也解决了；
		//3.随着小问题解决了，大问题也随之解决了；
		//    ：在方法本身不断的调用方法自己；
		
		//递归的注意事项：1.递归一定要有出口，不然内存溢出；2.递归次数不宜过多，不然内存溢出；
		
		//		public void show(int n) {
		//			//出口
		//			if (n == 0)
		//			{
		//				return;
		//			}
		//			show(n-1);
		//		}
		
		int result = recurrenceMethod(5);
		System.out.println("递归求出5的阶乘是：" + result);
		
		System.out.println("-------------------------3.使用Debug分析递归算法执行流程；---------------------------");
		System.out.println("-------------------------4.斐波那契列数；---------------------------");
		
		//古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
		//假如兔子都不死，问第二十个月的兔子对数是多少？
		
		//1 1 2 3 5 8 13 
		
		//规律：除了第一个月和第二个月以外，其余每个月都是前两个月之和；斐波那契数列；
		
		int rabbitNum = immortalRabbit(20);
		System.out.println("递归求出第二十个月的兔子数是：" + rabbitNum);
	}
	
	public static int immortalRabbit(int n)
	{
		//出口：若是第一个月，只有一对兔子；
		if (n == 1)
		{
			return 1;
		}
		//出口：若是第二个月，也只有一对兔子；
		else if (n == 2)
		{
			return 1;
		}
		else
		{
			//若不是第一个月和第二个月，则兔子的数量是前两个月之和；
			return immortalRabbit(n - 1) + immortalRabbit(n - 2);
		}
	}
	
	//求一个数的阶乘；
	public static int recurrenceMethod(int n)
	{
		//必须要有出口
		if (n == 1)
		{
			return 1;
		}
		else
		{
			return n * recurrenceMethod(n - 1);
		}
	}
	
}
