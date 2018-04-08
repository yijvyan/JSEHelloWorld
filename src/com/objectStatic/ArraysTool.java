
/**    
* @Title: ArraysTool.java  
* @Package com.objectStatic  
* @Description: TODO(自定义的数组工具类)  
* @author yijvyan  
* @date 2018年3月5日  
* @version V1.0    
*/

package com.objectStatic;

/** @ClassName: ArraysTool
 * @Description: TODO(工具类全部都被static修饰)
 * @author yijvyan
 * @date 2018年3月5日 */

public class ArraysTool
{
	//工具类不能创建对象，所以私有它的构造
	private ArraysTool()
	{}
	
	/* 返回数组中最大的元素 */
	public static int getMax(int[] arr)
	{
		int max = 0;
		for (int x = 0; x < arr.length; x++)
		{
			if (arr[x] > max)
			{
				max = arr[x];
			}
		}
		return max;
	}
	
	/* 返回数组中指定参数的索引 */
	public static int getIndex(int[] arr, int a)
	{
		for (int x = 0; x < arr.length; x++)
		{
			if (arr[x] == a) { return x; }
		}
		
		//查不到指定参数，返回不存在的索引值：-1
		return -1;
	}
}
