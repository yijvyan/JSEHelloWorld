
/**    
* @Title: LFWaterGodFlower.java  
* @Package com.flowControl  
* @Description: TODO(for循环实现水仙花数的解法)  
* @author yijvyan  
* @date 2018年2月5日  
* @version V1.0    
*/

package com.flowControl;

/** @ClassName: LFWaterGodFlower
 * @Description: TODO(输出水仙花数和统计个数)
 * @author yijvyan
 * @date 2018年2月5日 */

public class LFWaterGodFlower
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		int count = 0;
		
		for (int x = 100; x < 1000; x++)
		{
			int single = x % 10;
			int ten = x / 10 % 10;
			//			int hundred = x / 100;
			int hundred = x / 10 / 10 % 10;
			
			if ((single * single * single + ten * ten * ten + hundred * hundred * hundred) == x)
			{
				System.out.println(x);
				count++;
			}
		}
		System.out.println("count:" + count);
	}
	
}
