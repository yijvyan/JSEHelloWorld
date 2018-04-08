
/**    
* @Title: ODAssignment.java  
* @Package com.operator  
* @Description: TODO(The Assignment就是赋值运算)  
* @author yijvyan  
* @date 2018年2月2日  
* @version V1.0    
*/

package com.operator;

/** @ClassName: ODAssignment
 * @Description: TODO(主要是赋值运算和扩展赋值运算)
 * @author yijvyan
 * @date 2018年2月2日 */

public class ODAssignment
{
	
	/** @Title: main @Description: TODO(体现=和-=，+=，*=，/= ...) @param @param args
	 *         参数 @return void 返回类型 @throws */
	
	public static void main(String[] args)
	{
		//把10赋值给int类型的变量a
		int a = 10;
		
		//取+=的左边和右边的数据做+，然后把结果赋值给左边
		a += 20;
		System.out.println("a: " + a);
		
		//扩展的赋值运算符，隐含了强制类型转换         a += 20;  <=>  a = (a的数据类型)(a + 20); 
		short s = 1;
		s += 1;
		System.out.println(s);
	}
	
}
