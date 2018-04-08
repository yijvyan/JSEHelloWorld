
/**    
* @Title: InterfaceDemo.java  
* @Package com.objectInterface  
* @Description: TODO(接口的学习)  
* @author yijvyan  
* @date 2018年3月7日  
* @version V1.0    
*/

package com.objectInterface;

/** @ClassName: InterfaceDemo
 * @Description: TODO(接口的特点；成员特点，思想，优点；)
 * @author yijvyan
 * @date 2018年3月7日 */

public class InterfaceDemo
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("---------------1.接口的概述；接口和继承的关系；--------------------------");
		
		//Java语言的继承：单一继承，一个子类只能有一个父类（一个儿子只能有一个亲爹）；
		//Java语言给我们提供了一种机制，用于处理单一继承的局限性的方式：接口；
		//接口interface：接口是一个比抽象类还抽象的类，接口里所有的方法全是抽象方法，接口和类的关系是实现，implements；
		
		BillGates gates = new BillGates();
		gates.code();
		
		System.out.println("---------------2.接口的成员特点；抽象方法；成员变量；--------------------------");
		
		//接口的成员特点：1.只有抽象方法；2.只有常量；3.默认且只能用public&abstract修饰方法；
		//4.默认使用public static final来修饰成员变量；
		
		//注意：1.建议手动加上默认修饰符；2.接口不能创建对象（不能实例化）；
		//3.类与接口是实现关系，一个类实现一个接口必须实现它所有的方法；
		
		//Animal a = new Animal();
		Cat c = new Cat();
		c.eat();
		//Animal.NUM;
		
		System.out.println("---------------3.接口和类之间的各种关系；--------------------------");
		
		//类与类：-->继承关系：1.单一继承；2.多层继承！
		//类与接口：-->实现关系：多实现；
		//接口与接口：-->继承关系：多继承；
		
		System.out.println("---------------4.运动员案例实现；--------------------------");
		BasketBallPlayer bBP = new BasketBallPlayer();
		bBP.name = "姚明";
		bBP.age = 36;
		bBP.gender = "男";
		bBP.sleep();
		bBP.study();
		bBP.speak();
		
		PingpongCoach ppC = new PingpongCoach();
		ppC.name = "刘国梁";
		ppC.age = 56;
		ppC.gender = "男";
		ppC.sleep();
		ppC.teach();
		//		ppC.speak();
		
	}
	
}


class Boss
{
	public void mange()
	{
		System.out.println("老板：管理公司；");
	}
}


class Programmer
{
	public void code()
	{
		System.out.println("程序员：写代码；");
	}
}


class BillGates extends Programmer
{
	
}


interface Animal
{
	//	final int NUM = 10;
	//public final int NUM = 10;
	public static final int NUM = 10;
	
	//	public void eat();
	//	public abstract void eat();
	void eat();
}


class Cat implements Animal
{
	
	/* (非 Javadoc)
	 * @see com.objectInterface.Animal#eat() */
	
	@Override
	public void eat()
	{
		System.out.println("猫吃鱼；");
	}
	
}


interface InterA extends InterB
{
	public abstract void method();
}


interface InterB
{
	//	public abstract void method();
	public abstract void function();
}


//interface InterC extends InterA, InterB
interface InterC extends InterA
{
	
}


class Demo implements InterA, InterB
{
	
	/* (非 Javadoc)
	 * @see com.objectInterface.InterA#method() */
	
	@Override
	public void method()
	{
		// TODO Auto-generated method stub
		
	}
	
	/* (非 Javadoc)
	 * @see com.objectInterface.InterB#function() */
	
	@Override
	public void function()
	{
		// TODO Auto-generated method stub
		
	}
	
}


class People
{
	String	name;
	int		age;
	String	gender;
	
	public People()
	{}
	
	public People(String name, int age, String gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void eat()
	{
		System.out.println("People类的方法：吃饭。");
	}
	
	public void sleep()
	{
		System.out.println("People类的方法：睡觉。");
	}
}


abstract class Player extends People
{
	public abstract void study();
}


abstract class Coach extends People
{
	public abstract void teach();
}


interface SpeakEnglish
{
	public abstract void speak();
}


class BasketBallPlayer extends Player implements SpeakEnglish
{
	
	/* (非 Javadoc)
	 * @see com.objectInterface.Player#study() */
	
	@Override
	public void study()
	{
		System.out.println("BasketBallPlayer类继承抽象类Player，实现其抽象方法：学习扣篮");
		
	}
	
	/* (非 Javadoc)
	 * @see com.objectInterface.SpeakEnglish#speak() */
	
	@Override
	public void speak()
	{
		System.out.println("BasketBallPlayer类实现接口SpeakEnglish,实现其抽象方法：说英语");
	}
	
}


class PingpongPlayer extends Player
{
	
	/* (非 Javadoc)
	 * @see com.objectInterface.Player#study() */
	
	@Override
	public void study()
	{
		System.out.println("PingpongPlayer类继承抽象类Player，实现其抽象方法：学习抽球");
	}
	
}


class BasketBallCoach extends Coach implements SpeakEnglish
{
	
	/* (非 Javadoc)
	 * @see com.objectInterface.Coach#teach() */
	
	@Override
	public void teach()
	{
		
		System.out.println("BasketBallCoach类继承抽象类Coach，实现其抽象方法：教扣篮");
	}
	
	/* (非 Javadoc)
	 * @see com.objectInterface.SpeakEnglish#speak() */
	
	@Override
	public void speak()
	{
		System.out.println("BasketBallCoach类实现接口SpeakEnglish，实现其抽象方法：说英语。");
	}
	
}


class PingpongCoach extends Coach
{
	
	/* (非 Javadoc)
	 * @see com.objectInterface.Coach#teach() */
	
	@Override
	public void teach()
	{
		System.out.println("PingpongCoach类继承抽象类Coach，实现其抽象方法：教抽球");
		
	}
	
}
