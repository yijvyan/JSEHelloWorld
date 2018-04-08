
/**    
* @Title: ODAutoIncrMinus.java  
* @Package com.operator  
* @Description: TODO(自增和自减)  
* @author yijvyan  
* @date 2018年2月2日  
* @version V1.0    
*/

package com.operator;

/** @ClassName: ODAutoIncrMinus
 * @Description: TODO(其实就是++和--)
 * @author yijvyan
 * @date 2018年2月2日 */

public class ODAutoIncrMinus
{
	
	/** @Title: main @Description: TODO(具体内容) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		int a = 10;
		System.out.println("a: " + a);
		
		//		a++;
		/* ++a; System.out.println("a: " + a); */
		
		//		int b = a;
		//		int b = a++; 先取变量做操作，然后变量在++  下面的正好相反
		int b = ++a;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	
}
