
/**    
* @Title: ArrayDemo.java  
* @Package com.array  
* @Description: TODO(数组的学习)  
* @author yijvyan  
* @date 2018年2月6日  
* @version V1.0    
*/

package com.array;

/** @ClassName: ArrayDemo
 * @Description: TODO(数组学习案例)
 * @author yijvyan
 * @date 2018年2月6日 */

public class ArrayDemo
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		//动态初始化，是长度固定，内容动态变化；静态反之
		int[] arr = new int[3];
		
		//输出数组名,是地址值，无意义
		System.out.println("arr:" + arr);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println("------------------");
		
		arr[0] = 100;
		arr[2] = 200;
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		int[] arr1 = new int[2];
		int[] arr2 = new int[3];
		
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println("----------------------------------");
		
		arr1[1] = 100;
		
		arr2[0] = 200;
		arr2[2] = 300;
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println("--------------------------------");
		
		int[] arr3 = new int[3];
		
		arr3[0] = 100;
		arr3[1] = 200;
		arr3[2] = 300;
		
		System.out.println(arr3);
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		
		int[] arr4 = arr3;
		
		arr4[0] = 111;
		arr4[1] = 222;
		arr4[2] = 333;
		
		System.out.println(arr3);
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		
		System.out.println(arr4);
		System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
		System.out.println("----------------------------");
		
		int[] arr5 = { 1, 2, 3 };
		
		System.out.println(arr5);
		System.out.println(arr5[0]);
		System.out.println(arr5[1]);
		System.out.println(arr5[2]);
		
		System.out.println("---------------练习1.数组的回顾；定义一个元素类型为int的数组，遍历数组并求和；------------------------");
		
		//数组：用于存储多个元素的一种容器
		//数组的特点：1.元素类型必须一致；2.元素有整数索引；
		//3.一旦定义好长度则无法改变；4.存基本或引用数据类型，都行；
		
		int[] arrSum = { 1, 2, 3, 4, 5 };
		System.out.println("数组的回顾；定义一个元素类型为int的数组，遍历数组并求和，值为：" + arraySum(arrSum));
		
	}
	
	/** @Title: arraySum @Description: TODO(遍历数组并求和) @param @param
	 * arrSum @param @return 参数 @return int 返回类型 @throws */
	
	public static int arraySum(int[] arrSum)
	{
		int sum = 0;
		for (int i = 0; i < arrSum.length; i++)
		{
			sum += arrSum[i];
		}
		return sum;
	}
	
}
