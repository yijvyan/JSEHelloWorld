
/**    
* @Title: SystemDemo.java  
* @Package com.classAPI  
* @Description: TODO(System类的API的学习；)  
* @author yijvyan  
* @date 2018年3月11日  
* @version V1.0    
*/

package com.classAPI;

/** @ClassName: SystemDemo
 * @Description: TODO(System类的常用方法；)
 * @author yijvyan
 * @date 2018年3月11日 */

public class SystemDemo
{
	
	/** @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("-------------------------1.System类的概述；-------------------");
		
		//System：1.包含一些有用的类字段和方法，static修饰成员变量和方法；
		//它不能被实例化，因为构造方法被私有化了，private修饰；
		
		System.out.println("-------------------------2.System类的arraycopy方法测试；-------------------");
		
		//static void arraycopy(Object src, int  srcPos, Object dest, int destPos, int length);
		//复制数组；     数据源和目的地；
		
		//src: 源数组；
		//srcPos: 指定从源数组的哪个索引位置处开始复制；
		//dest: 目标数组；
		//destPos: 指定目标数组从哪个索引位置处开始接收源数组；
		//length: 目标数组接收源数组元素的个数；
		
		int[] src = { 1, 2, 3, 4, 5 };
		int[] dest = new int[5];
		
		//1.0000--->12345
		//		System.arraycopy(src, 0, dest, 0, 5);
		
		//2.0000--->12300
		//		System.arraycopy(src, 0, dest, 0, 3);
		
		//3.0000--->34500
		System.arraycopy(src, 2, dest, 0, 3);
		
		//length不得超过源数组的要复制的元素个数；否则发生数组索引越界异常；
		//		System.arraycopy(src, 2, dest, 0, 5);
		
		for (int i = 0; i < dest.length; i++)
		{
			System.out.print(dest[i]);
		}
		System.out.println();
		
		System.out.println("-------------------------3.System类的其他方法；-------------------------------");
		
		//static long currentTimeMillis()   1.（以毫秒值）返回当前系统时间；
		//2.1970-1-1 0:0:0 到此刻过了多少秒；           1000毫秒 = 1秒；
		//若系统时间是：1970-1-1 1:1:0  ，则返回毫秒值为： 1000*60*60 + 1000*60；
		
		long now = System.currentTimeMillis();
		System.out.println("（以毫秒值）返回当前系统时间，1970-1-1 0:0:0 到此刻过了多少秒：" + now);
		
		runTime();
		
		//static void exit(int status)   终止虚拟机的运行；
		exitJVM();
		
	}
	
	/** @Title: exitJVM @Description: TODO(当条件满足时，终止虚拟机；) @param 参数 @return void
	 *         返回类型 @throws */
	
	private static void exitJVM()
	{
		for (int i = 0; i < 10000; i++)
		{
			System.out.println(i);
			if (i == 50)
			{
				System.exit(0);
			}
		}
	}
	
	/** @Title: runTime @Description: TODO(输出10000行Hello World用时（毫秒数）) @param
	 *         参数 @return void 返回类型 @throws */
	
	private static void runTime()
	{
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
		{
			System.out.println("Hello World;");
		}
		long end = System.currentTimeMillis();
		System.out.println("输出10000行Hello World用时（毫秒数）：" + (end - start));
	}
	
}
