
/**    
* @Title: TypeCastDemo.java  
* @Package com.yijvyan  
* @Description: TODO(Java的类型转换)  
* @author yijvyan  
* @date 2018年2月2日  
* @version V1.0    
*/

package com.yijvyan;

/** @ClassName: TypeCastDemo
 * @Description: TODO(类型转换案例)
 * @author yijvyan
 * @date 2018年2月2日 */

public class TypeCastDemo
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		int a = 3;
		int b = 4;
		int c = a + b;
		System.out.println(c);
		
		byte bb = 2;
		int cc = 5;
		System.out.println(bb + cc);
		
		//		byte dd = bb + cc;   可能损失精度
		int ee = bb + cc;
		//		System.out.println(dd);
		System.out.println(ee);
		
		//强制类型转换（一般不建议做这个）
		byte d = (byte) (a + b);
		System.out.println(d);
		
	}
	
}
