
/**    
* @Title: VariableDemoAttention.java  
* @Package com.yijvyan  
* @Description: TODO(变量定义的注意事项)  
* @author yijvyan  
* @date 2018年2月2日  
* @version V1.0    
*/

package com.yijvyan;

/** @ClassName: VariableDemoAttention
 * @Description: TODO(关于Java变量定义的注意事项)
 * @author yijvyan
 * @date 2018年2月2日 */

public class VariableDemoAttention
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		int a = 10;
		System.out.println(a);
		
		int b;
		//1.变量未赋值不能使用
		//		System.out.println(b);
		b = 20;
		System.out.println(b);
		
		{
			//代码块
			int c = 30;
			System.out.println(c);
		}
		//2.变量只在它所属的范围内有效（即所属的大括号内）
		//		System.out.println(c);
		
		//3.一行上可以定义多个变量，但不建议
		/*int aa, bb;
		aa = 10;
		bb = 20;
		System.out.println(aa);
		System.out.println(bb);*/
		//以下建议
		int aa = 10;
		int bb = 20;
		System.out.println(aa);
		System.out.println(bb);
	}
	
}
