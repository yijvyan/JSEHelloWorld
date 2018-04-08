
/**    
* @Title: BlockDemo.java  
* @Package com.objectStatic  
* @Description: TODO(代码块的学习)  
* @author yijvyan  
* @date 2018年3月5日  
* @version V1.0    
*/

package com.objectStatic;

/** @ClassName: BlockDemo
 * @Description: TODO(1.局部；2.构造；3.静态（代码块）)
 * @author yijvyan
 * @date 2018年3月5日 */

public class BlockDemo
{
	
	static
	{
		System.out.println("BlockDemo的静态代码块是最先执行的，先于所有输出！只执行一次；");
	}
	
	{
		System.out.println("BlockDemo的构造代码块，只有在创建对象时才会执行，并且每次创建对象都会执行");
	}
	
	public BlockDemo()
	{
		System.out.println("BlockDemo的无参构造，只有在创建对象时才会执行；");
	}
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		//1.局部代码块：存在于方法中，控制变量的生命周期（作用域）
		{
			for (int i = 0; i < 10; i++)
			{
				System.out.println("-----1.局部代码块，就是变量的作用范围只在”{}“中，出了范围就没用了；-----");
			}
			int num = 10;
		}
		//		System.out.println("出了局部代码块的范围，变量就没用了；num在这里无用"+num);
		
		Teacher t = new Teacher();
		Teacher t2 = new Teacher("Alice", 18);
		
		System.out.println("----------练习1.静态代码块，构造代码块，构造方法的执行顺序-------------------------------------------");
		Teacher t3 = new Teacher();
		//BlockDemo静态代码块---BD的主函数---Teacher的静态代码块---Teacher的构造代码块---Teacher的构造函数---Teacher的构造代码块---Teacher的构造函数
	}
	
}


class Teacher
{
	String	name;
	int		age;
	
	//2.构造代码块：提取构造方法中的共性，每次创建对象都会执行，并且在构造方法执行之前执行
	{
		//		for (int i = 0; i < 10; i++)
		//		{
		//			//			System.out.println("2.构造代码块，无参构造，输出10次");
		//			System.out.println("2.构造代码块，输出10次");
		//		}
		System.out.println("2.构造代码块，在创建对象之前执行，并且每次创建对象都会执行");
	}
	
	//3.静态代码块：随着类的加载而加载，只加载一次，加载类时需要做一些初始化，比如加载驱动
	static
	{
		System.out.println("3.静态代码块，在创建对象之前执行，只执行一次");
	}
	
	public Teacher()
	{
		//		for (int i = 0; i < 10; i++)
		//		{
		//			System.out.println("2.构造代码块，无参构造，输出10次");
		//		}
		System.out.println("无参构造，创建对象时执行");
	}
	
	public Teacher(String name, int age)
	{
		//		for (int i = 0; i < 10; i++)
		//		{
		//			System.out.println("2.构造代码块，有参构造，输出10次");
		//		}
		System.out.println("有参构造，创建对象时执行");
		
	}
}
