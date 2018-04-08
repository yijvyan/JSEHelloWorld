
/**    
* @Title: InnerDemo.java  
* @Package com.innerClass  
* @Description: TODO(内部类的学习)  
* @author yijvyan  
* @date 2018年3月9日  
* @version V1.0    
*/

package com.innerClass;

//import com.innerClass.Outer.Inner;

/** @ClassName: InnerDemo
 * @Description: TODO(成员，局部，匿名（内部类）的学习)
 * @author yijvyan
 * @date 2018年3月9日 */

public class InnerDemo
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("--------------------1.成员内部类的概述和使用；-----------------");
		
		//成员内部类：1.在类的成员位置，和成员变量以及成员方法所在的位置是一样的；
		//2.在内部类中，可以直接访问外部类的成员，包括私有成员；
		
		Outer o = new Outer();
		o.method();
		
		Outer.Inner i = new Outer().new Inner();
		i.function();
		
		System.out.println("--------------------2.成员内部类的修饰符；public,private,static,abstract,final等等；-----------------");
		
		//成员内部类的修饰符：权限修饰符：1.private，无法在其他类中访问；
		//2.static，不需要再创建外部类的对象了；
		
		//可使用abstract,final修饰成员内部类；
		
		//		Outer.Inner2 i2;
		Outer.Inner3 i3 = new Outer.Inner3();
		i3.function();
		
		Outer.Inner3.function2();
		
		System.out.println("--------------------3.局部内部类的概述和使用；-----------------");
		
		//局部内部类：在方法内，出了方法之后就无法使用；
		
		Outer oLocal = new Outer();
		oLocal.method();
		
		System.out.println("--------------------4.匿名内部类的概述和格式；-----------------");
		
		//匿名内部类：1.可看成是一个没有名字的局部内部类；
		//2.定义在外部类的方法中；
		//3.必须在定义匿名内部类的时候创建它的对象；
		
		//格式： new 类/接口（）{
		//          1.若创建了继承这个类的子类对象，则可重写父类的方法；
		//          2.若创建了实现这个接口的子类对象，则必须实现该接口的所有方法；
		//     }
		
		//原理：创建了继承这个类的子类对象或创建了实现这个接口的子类对象；
		
		Outer oAnonymous = new Outer();
		oAnonymous.method();
		
		System.out.println("--------------------5.匿名内部类的应用场景；-----------------");
		
		//匿名内部类的应用场景：作为参数进行传递；
		method(new Dog());
		method(new Cat());
		
		method(new Animal()
		{
			
			@Override
			public void eat()
			{
				System.out.println("匿名内部类作为参数传递，减少.java文件的编写，重写eat方法，猫吃鱼；");
			}
		});
	}
	
	public static void method(Animal a)
	{
		a.eat();
	}
	
}


//匿名内部类
interface InnerAnonymous
{
	public void functionAnonymous();
}


//普通类Outer类
class Outer
{
	private int num = 10;
	
	public void method()
	{
		//		int numLocal = 20;
		
		Inner i = new Inner();
		i.function();
		
		Inner2 i2 = new Inner2();
		i2.function();
		
		Inner3 i3 = new Inner3();
		i3.function();
		
		//局部内部类
		class InnerLocal
		{
			public void functionLocal()
			{
				System.out.println("局部内部类的成员方法，functionLocal；");
			}
		}
		
		InnerLocal iL = new InnerLocal();
		iL.functionLocal();
		
		//匿名内部类创建对象：有两种方式
		//方式一：直接调用重写了之后的方法
		new InnerAnonymous()
		{
			
			@Override
			public void functionAnonymous()
			{
				System.out.println("1.匿名内部类创建对象的第一种方式，直接调用重写了抽象方法的functionAnonymous()方法；");
			}
		}.functionAnonymous();
		
		//方式二：使用其父类接口的对象的引用指向new出来的匿名内部类对象，即多态；
		InnerAnonymous iAnonymous = new InnerAnonymous()
		{
			
			@Override
			public void functionAnonymous()
			{
				System.out.println("2.匿名内部类创建对象的第二种方式，使用其父类接口的对象的引用指向new出来的匿名内部类对象；");
			}
		};
		
		iAnonymous.functionAnonymous();
		
	}
	
	//成员内部类
	class Inner
	{
		public void function()
		{
			//			System.out.println("成员内部类的成员方法，function；");
			System.out.println("普通（外部）类私有的成员变量num，值为：" + num);
		}
	}
	
	//成员内部类2
	private class Inner2
	{
		public void function()
		{
			System.out.println("private修饰的成员内部类的成员方法，function；");
		}
	}
	
	//成员内部类3
	static class Inner3
	{
		public void function()
		{
			System.out.println("static修饰的成员内部类的成员方法，function；");
		}
		
		public static void function2()
		{
			System.out.println("static修饰的成员内部类，同时static修饰成员方法，function2；");
		}
	}
	
	public void test()
	{
		//		InnerLocal iL = new InnerLocal();
		//		System.out.println("局部内部类测试成员变量，numLocal："+numLocal);
		
	}
}
