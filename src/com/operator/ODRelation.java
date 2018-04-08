
/**    
* @Title: ODRelation.java  
* @Package com.operator  
* @Description: TODO(关系运算符的使用)  
* @author yijvyan  
* @date 2018年2月2日  
* @version V1.0    
*/

package com.operator;

/** @ClassName: ODRelation
 * @Description: TODO(其实就是比较关系，返回值true或false)
 * @author yijvyan
 * @date 2018年2月2日 */

public class ODRelation
{
	
	/** @Title: main @Description: TODO(详细的例子) @param @param args 参数 @return
	 *         void 返回类型 @throws */
	
	public static void main(String[] args)
	{
		//关系运算符的结果是boolean类型
		int a = 10;
		int b = 20;
		int c = 10;
		
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println("----------------------");
		
		System.out.println(a != b);
		System.out.println(a != c);
		System.out.println("----------------------");
		
		System.out.println(a > b);
		System.out.println(a > c);
		System.out.println("----------------------");
		
		System.out.println(a >= b);
		System.out.println(a >= c);
		System.out.println("----------------------");
		
		//注意事项
		System.out.println(a == b);
		//把b的值赋值给a,然后把a的值输出
		System.out.println(a = b);
		System.out.println("-----------------------LogicalOperato");
		
		int aa = 3;
		int bb = 4;
		int cc = 5;
		
		System.out.println((aa > bb) & (aa > cc));
		System.out.println((aa < bb) & (aa > cc));
		System.out.println((aa > bb) & (aa < cc));
		System.out.println((aa < bb) & (aa < cc));
		System.out.println("------------------------");
		
		System.out.println((aa > bb) | (aa > cc));
		System.out.println((aa < bb) | (aa > cc));
		System.out.println((aa > bb) | (aa < cc));
		System.out.println((aa < bb) | (aa < cc));
		System.out.println("------------------------");
		
		System.out.println((aa > bb) ^ (aa > cc));
		System.out.println((aa < bb) ^ (aa > cc));
		System.out.println((aa > bb) ^ (aa < cc));
		System.out.println((aa < bb) ^ (aa < cc));
		System.out.println("------------------------");
		
		System.out.println((aa > bb));
		System.out.println(!(aa > bb));
		System.out.println(!!(aa > bb));
		System.out.println("------------------------");
		
		System.out.println((aa > bb) && (aa > cc));
		System.out.println((aa < bb) && (aa > cc));
		System.out.println((aa > bb) && (aa < cc));
		System.out.println((aa < bb) && (aa < cc));
		System.out.println("------------------------");
		
		System.out.println((aa > bb) || (aa > cc));
		System.out.println((aa < bb) || (aa > cc));
		System.out.println((aa > bb) || (aa < cc));
		System.out.println((aa < bb) || (aa < cc));
		System.out.println("------------------------Compare");
		
		int x = 10;
		int y = 20;
		//		System.out.println((x++ > 10) & (y++ > 20));
		System.out.println((x++ > 10) && (y++ > 20));
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		
	}
	
}
