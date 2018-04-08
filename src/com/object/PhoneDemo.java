
/**    
* @Title: PhoneDemo.java  
* @Package com.object  
* @Description: TODO(使用手机类)  
* @author yijvyan  
* @date 2018年2月25日  
* @version V1.0    
*/

package com.object;

/** @ClassName: PhoneDemo
 * @Description: TODO(就是手机类的测试类)
 * @author yijvyan
 * @date 2018年2月25日 */

public class PhoneDemo
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		Phone p = new Phone();
		
		System.out.println("品牌：（初始值） " + p.brand);
		System.out.println("价格：（初始值） " + p.price);
		System.out.println("颜色：（初始值） " + p.color);
		
		System.out.println(p.brand + "-----" + p.price + "-----" + p.color);
		
		System.out.println("---------------------------");
		
		p.brand = "Xiaomi6";
		p.price = 2999;
		p.color = "blue";
		
		System.out.println("品牌：（赋值后） " + p.brand);
		System.out.println("价格：（赋值后） " + p.price);
		System.out.println("颜色：（赋值后） " + p.color);
		
		System.out.println(p.brand + "-----" + p.price + "-----" + p.color);
		
		System.out.println("---------------------------");
		
		p.call("Alice");
		p.setMessage();
		
		System.out.println("---------------------------");
		
		Phone p2 = new Phone();
		
		p2.brand = "Iphone7P";
		p2.price = 4999;
		p2.color = "土豪金";
		
		System.out.println("品牌：（赋值后） " + p2.brand);
		System.out.println("价格：（赋值后） " + p2.price);
		System.out.println("颜色：（赋值后） " + p2.color);
		
		System.out.println(p2.brand + "-----" + p2.price + "-----" + p2.color);
		
		System.out.println("---------------------------");
		
		p2.call("Bob");
		p2.setMessage();
		
		System.out.println("---------------------------");
		
		//两个引用指向同一个对象（栈里的两个引用指向堆里的同一个new出来的对象）
		Phone p3 = p;
		
		p3.brand = "OPPO";
		p3.price = 2999;
		p3.color = "白色";
		
		System.out.println("品牌：（赋值后） " + p3.brand);
		System.out.println("价格：（赋值后） " + p3.price);
		System.out.println("颜色：（赋值后） " + p3.color);
		
		System.out.println(p3.brand + "-----" + p3.price + "-----" + p3.color);
		
		System.out.println("---------------------------");
	}
	
}
