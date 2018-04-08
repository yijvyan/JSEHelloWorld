
/**    
* @Title: AbstractDemo.java  
* @Package com.objectAbstract  
* @Description: TODO(学习抽象类)  
* @author yijvyan  
* @date 2018年3月6日  
* @version V1.0    
*/

package com.objectAbstract;

/** @ClassName: AbstractDemo
 * @Description: TODO(抽象类的用法，特点，注意事项)
 * @author yijvyan
 * @date 2018年3月6日 */

public class AbstractDemo
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("------------1.抽象类的概述；abstract修饰类，方法；-------------");
		
		//abstract关键字，用于修饰方法和类；
		//抽象方法：不同类的方法相似，但具体内容又不同，所以只抽取他的声明，没有具体的方法体；
		//抽象类：有抽象方法的类必须是抽象类
		
		//注意：一个类继承了抽象类，必须重写其所有的抽象方法；否则，此类是抽象类；
		
		System.out.println("------------2.抽象类的特点；-------------");
		
		//抽象类的特点：1.抽象方法只能在抽象类中；
		//2.抽象类和抽象方法必须被abstract修饰；
		//3.抽象类不能创建对象（不能被实例化）；
		//4.抽象类中可以有非抽象方法；
		//5.抽象类和类之间的关系，也是继承；
		//6.一个类继承了抽象类要么重写所有的抽象方法，要么它自己就是抽象类；
		
		//		Animal a = new Animal();
		
		System.out.println("------------4.抽象类的成员特点；成员变量，成员方法，构造方法；-------------");
		
		//抽象类的成员特点：1.可以有成员变量，常量；
		//2.可以有抽象方法，也可以有非抽象方法；
		//3.可以有构造方法，需要对抽象类的成员变量进行初始化；
		
		Cat cat = new Cat();
		cat.barking();
		
		System.out.println("------------5.抽象类案例（老师）；-------------");
		BasicTeacher bT = new BasicTeacher();
		bT.name = "BT子类成员变量name";
		bT.teach();
		
		JobTeacher jT = new JobTeacher();
		jT.name = "JT子类成员变量name；每创建一个对象，就得重新赋值";
		jT.teach();
		
		System.out.println("------------6.抽象类案例（雇员）；-------------");
		Programmer p = new Programmer();
		p.work();
		Manager m = new Manager();
		m.work();
		
		System.out.println("------------7.抽象类案例（技师）；-------------");
		足疗技师 足疗 = new 足疗技师();
		足疗.service();
		其他技师 其他 = new 其他技师();
		其他.service();
		
	}
	
}


abstract class Animal
{
	
	String		name	= "Ketty";
	final int	NUM		= 10;
	
	public abstract void eat();
	
	//非抽象方法子类可以不重写
	public void run()
	{
		
	}
	
	public Animal()
	{
		System.out.println("抽象父类Animal类的无参构造方法。");
	}
}


class Cat extends Animal
{
	//	public void eat()
	//	{
	//		System.out.println("猫吃鱼");
	//	}
	
	/* (非 Javadoc)
	 * @see com.objectAbstract.Animal#eat() */
	
	@Override
	public void eat()
	{
		System.out.println("子类Cat类继承抽象父类Animal类，重写其抽象方法，eat方法；猫吃鱼");
	}
	
	public void barking()
	{
		System.out.println("子类Cat类的成员方法，输出父类Animal类的成员变量，name值，是：" + name);
		System.out.println("子类Cat类的成员方法，输出父类Animal类的常量，num值，是：" + NUM);
	}
	
}


abstract class Dog extends Animal
{
	//	public void eat()
	//	{
	//		System.out.println("狗吃屎");
	//	}
	
}


//共性抽取出来
abstract class Teacher
{
	String	name;
	int		age;
	String	gender;
	
	public abstract void teach();
}


class BasicTeacher extends Teacher
{
	
	/* (非 Javadoc)
	 * @see com.objectAbstract.Teacher#teach() */
	
	@Override
	public void teach()
	{
		System.out.println(name + "：基础班老师讲课...");
	}
	
}


class JobTeacher extends Teacher
{
	
	/* (非 Javadoc)
	 * @see com.objectAbstract.Teacher#teach() */
	
	@Override
	public void teach()
	{
		System.out.println(name + "：就业班老师讲课...");
	}
	
}


abstract class Employee
{
	String	name;
	String	id;
	double	pay;
	
	public abstract void work();
}


class Programmer extends Employee
{
	
	/* (非 Javadoc)
	 * @see com.objectAbstract.Employee#work() */
	
	@Override
	public void work()
	{
		System.out.println("程序员写代码...");
	}
	
}


class Manager extends Employee
{
	
	/* (非 Javadoc)
	 * @see com.objectAbstract.Employee#work() */
	
	@Override
	public void work()
	{
		System.out.println("项目经理盯着程序员写代码...");
	}
	
}


abstract class 技师
{
	String	name;
	int		age;
	
	public abstract void service();
}


class 足疗技师 extends 技师
{
	
	/* (非 Javadoc)
	 * @see com.objectAbstract.技师#service() */
	
	@Override
	public void service()
	{
		System.out.println("足疗技师：按按脚揉揉肩");
	}
	
}


class 其他技师 extends 技师
{
	
	/* (非 Javadoc)
	 * @see com.objectAbstract.技师#service() */
	
	@Override
	public void service()
	{
		System.out.println("其他技师：你懂的...");
	}
	
}
