
/**    
* @Title: ArrayOperation.java  
* @Package com.array  
* @Description: TODO(数组操作遇到的东西，越界，比较，最大值)  
* @author yijvyan  
* @date 2018年2月22日  
* @version V1.0    
*/

package com.array;

/** @ClassName: ArrayOperation
 * @Description: TODO(主要用来学习数组常用的操作)
 * @author yijvyan
 * @date 2018年2月22日 */

public class ArrayOperation
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };
		
		//数组越界
		//		System.out.println(arr[3]);
		
		//空指针异常
		//		arr = null;
		//		System.out.println(arr[1]);
		
		//遍历数组
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("-------------------");
		
		//		for (int x = 0; x < arr.length; x++)
		for (int x = 0; x < 3; x++)
		{
			System.out.println(arr[x]);
		}
		System.out.println("Array Have " + arr.length + " Elements.");
		
		//数组获取最值
		int[] arr1 = { 12, 45, 98, 73, 60 };
		
		int max = arr1[0];
		for (int x = 0; x < arr1.length; x++)
		{
			if (arr1[x] > max)
			{
				max = arr1[x];
			}
		}
		System.out.println("max:" + max);
		
		//二维数组
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		System.out.println(arr2[0][0]);
		System.out.println(arr2[1][1]);
		System.out.println(arr2[2][2]);
		
		//二维数组的遍历
		System.out.println(arr2[0][1]);
		System.out.println(arr2[0][2]);
		
		for (int x = 0; x < arr2[0].length; x++)
		{
			System.out.println(arr2[0][x]);
		}
		System.out.println("-------------------------------");
		for (int x = 0; x < arr2[1].length; x++)
		{
			System.out.println(arr2[1][x]);
		}
		System.out.println("-------------------------------");
		for (int x = 0; x < arr2[2].length; x++)
		{
			System.out.println(arr2[2][x]);
		}
		System.out.println("-------------------------------");
		
		//		for (int y = 0; y < 3; y++)
		for (int y = 0; y < arr2.length; y++)
		{
			for (int x = 0; x < arr2[y].length; x++)
			{
				//				System.out.println(arr2[y][x]);
				System.out.print(arr2[y][x] + " ");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		
		System.out.println("hello");
		System.out.println("world");
		System.out.print("helloworld");
		//添加换行
		System.out.println();
		System.out.println("hello");
		System.out.println("world");
		System.out.print("helloworld");
		
	}
	
}
