
/**    
* @Title: ExtendsDemo.java  
* @Package com.objectExtends  
* @Description: TODO(类继承的学习)  
* @author yijvyan  
* @date 2018年3月5日  
* @version V1.0    
*/

package com.objectExtends;

/** @ClassName: ExtendsDemo
 * @Description: TODO(继承的用法)
 * @author yijvyan
 * @date 2018年3月5日 */

public class ExtendsDemo
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("------------1.继承的概述；简单的继承-----------------------");
		DotA d = new DotA();
		d.start();
		
		LOL l = new LOL();
		l.start();
		
		System.out.println("------------2.继承的特点；单一继承和多层继承；-----------------------");
		
		//Java中继承的特点：1.只支持单一继承，只能继承一个父类（一个儿子只能有一个亲爹）；
		//2.支持多层继承（一个儿子只能有一个亲爹，还可以有一个亲爷爷）；
		
		LOLPC lolpc = new LOLPC();
		lolpc.update();
		lolpc.start();
		
		System.out.println("------------3.继承中成员变量的特点；就近原则和this，super等；-----------------------");
		
		//继承中成员变量的特点：1.子类只能获取父类非私有成员；
		//2.子父类成员变量名一样，获取子类的成员变量；不一样，获取父类成员变量；
		
		//就近原则：谁离在调用的主体近，就用谁
		//（变量名相同的前提）1.局部变量；》2.子类成员变量，this.xxx；》3.父类成员变量,super.xxx；
		
		Kid k = new Kid();
		k.show();
		
		System.out.println("------------4.继承中成员方法的特点；就是方法重写；-----------------------");
		
		//继承中成员方法的特点：1.子类中无此方法，则调用父类中此方法；2.子类重写了此方法，则调用子类中此方法；
		
		//方法重写：在子父类当中，子类方法与父类的完全一样，是子类重写（覆盖）了父类的方法，之后，使用子类对象调用的就是子类的方法；
		//方法重载：在一个类中，有多个重名的方法，但其参数不一样（参数个数，类型，顺序），和返回值无关
		
		Kid k2 = new Kid();
		k2.eat();
		
		System.out.println("------------5.方法重写的应用场景和注意事项；super.xxx；-----------------------");
		
		//方法重写的应用场景：当父类方法不能满足子类使用时，子类重写父类方法；
		//并可在子类方法中使用关键字super调用父类的方法，即保留父类方法，又有子类特有功能
		
		//方法重写的注意事项：1.不能重写父类私有的方法；2.权限必须大于等于父类方法的权限；
		
		//注解：@Override
		Kid k3 = new Kid();
		k3.eat();
		
		System.out.println("------------6.继承中的构造方法执行顺序；子类构造的第一行this，super，无；-----------------------");
		
		//继承中的构造方法执行顺序：（在有子父类继承关系的类中，创建子类的对象，调用子类的构造方法）
		//1.若子类构造方法的第一行代码没有调用父类的构造方法，则默认调用父类的无参构造；
		//（先执行父类的构造，因为要先给父类的成员变量进行初始化，子类可能会用到）
		
		//super()：在子类构造方法的第一行中调用父类的（无参）构造方法
		
		//		Father father = new Father();
		Son son = new Son();
		
		System.out.println("------------7.this和super的区别；this子类，super父类；-----------------------");
		Son son2 = new Son();
		son2.function();
		
		System.out.println("------------8.匿名对象的概述和应用场景；new XXX()调方法，以及赋值；-----------------------");
		
		//匿名对象：没有名字的对象；没有变量引用的对象；
		//匿名对象的应用场景：1.当方法只调用一次的时候，可使用匿名对象；
		//2.可当作参数进行传递，但无法在参数传递之前做其他事情；
		
		//注意：匿名对象可以调用成员变量并赋值，但是赋值没有什么意义；不能在下面得到使用，因为没有引用；
		
		//		Student s = new Student();
		//		s.study();
		//		s.study();
		
		new Student().study();
		new Student().study();
		
		new Student().age = 28;
		System.out.println("对匿名对象的成员变量赋值无意义，不能输出。new出的匿名对象的age赋值后，为：" + new Student().age);
		
		//		Student stu = new Student();
		//		stu.age = 29;
		//		stu.name = "Alice";
		//		method(stu);
		
		method(new Student());
		
		System.out.println("------------9.final的概述和作用；final修饰类，方法，变量；-----------------------");
		
		//final:修饰符，可用于修饰类，成员方法，成员变量；
		//1.所修饰类：不能被继承，不能有子类；
		//2.所修饰成员方法：不能被重写；
		//3.所修饰成员变量：是不可修改的，是常量；
		
		//常量：          1>.字面值常量：1，2，3
		//         2>.自定义常量：被final所修饰的成员变量，一旦初始化则不可改变；
		
		//注意：自定义常量必须被初始化，可选择（1）.显示初始化（直接赋值）；
		//（2）.构造初始化（构造方法赋值）；
		
		Dog dog = new Dog();
		dog.eat();
		
		/* dog.num = 20; */
		//		System.out.println("Dog类的对象dog的成员变量（被final修饰），num的值，是：" + dog.num);
		
		System.out.println("Dog类的对象dog的成员变量（被final修饰），num的值，是：" + dog.NUM);
		
	}
	
	public static void method(Student s)
	{
		
	}
	
}


//继承：多个类有共同的成员变量和成员方法，抽取到另一个类（父类）中，再让多个类去继承这个父类，则多个类就可获取到父类中的成员了

class Game
{
	String	name;
	double	version;//版本号
	String	agent;																																																																										//代理商
	
	public void start()
	{
		System.out.println("游戏启动了，来自父类Game类");
	}
	
	public void stop()
	{
		System.out.println("游戏关闭了，来自父类Game类");
	}
	
}


class PCGame extends Game
{
	public void update()
	{
		System.out.println("PC端游戏更新了，来自父类PCGame");
	}
}


class MobileGame
{
	public void update()
	{
		System.out.println("Mobile手机端游戏更新了，来自父类MobileGame");
	}
}


class DotA extends Game
{
	//	String	name;
	//	double	version;//版本号
	//	String	agent;	//代理商
	//	
	//	public void start()
	//	{
	//		System.out.println("游戏启动了，来自DotA类");
	//	}
	//	
	//	public void stop()
	//	{
	//		System.out.println("游戏关闭了，来自DotA类");
	//	}
	
}


class LOL extends Game
{
	//	String	name;
	//	double	version;//版本号
	//	String	agent;	//代理商
	//	
	//	public void start()
	//	{
	//		System.out.println("游戏启动了，来自LOL类");
	//	}
	//	
	//	public void stop()
	//	{
	//		System.out.println("游戏关闭了，来自LOL类");
	//	}
	
}


class LOLPC extends PCGame
{
	
}


class Dad
{
	//	private String name = "王健林";
	String name = "王健林";
	
	void eat()
	//	public void eat()
	//	private void eat()
	{
		System.out.println("父类的成员方法，工作养家");
		System.out.println("父类的成员方法，回家吃饭");
	}
}


class Kid extends Dad
{
	String	nameKid	= "王五聪";
	String	name	= "王四聪";
	
	public void show()
	{
		String name = "王六聪";
		//		System.out.println("成员变量的值，是（获取父类的非私有成员变量）：" + name);
		System.out.println("子类成员变量nameKid的值，是：" + nameKid);
		//		System.out.println("就近原则，获取子类的成员变量值，是：" + name);
		System.out.println("就近原则，获取子类的局部变量值，是：" + name);
		System.out.println("获取子类的成员变量值（this.xxx），是：" + this.name);
		System.out.println("获取父类的成员变量值（super.xxx），是：" + super.name);
	}
	
	//方法重写
	@Override
	//	void eat()
	public void eat()
	{
		System.out.println("子类Kid类的成员方法（方法重写），好好吃饭");
		super.eat();
	}
}


class Father
{
	int num = 10;
	
	public Father()
	{
		System.out.println("父类Father类的无参构造；");
	}
	
	public Father(int a)
	{
		System.out.println("父类Father类的有参构造；");
	}
	
	public void method()
	{
		System.out.println("父类Father类的方法");
	}
}


class Son extends Father
{
	//注释了子类的成员变量后，this.num调用的是父类的成员变量num
	//int num = 30; 
	
	public Son()
	{
		//调用父类的有参构造；
		//		super(1); 
		//直接调用子类的有参构造；
		//第一行不调用子类其他构造或者父类构造，默认调用父类无参构造；
		this(1);
		System.out.println("子类Son类的无参构造；");
	}
	
	public Son(int a)
	{
		super(1);
		System.out.println("子类Son类的有参构造；");
	}
	
	/* (非 Javadoc)
	 * @see com.objectExtends.Father#method() */
	
	@Override
	public void method()
	{
		//		super.method();
		System.out.println("子类Son类的方法");
	}
	
	public void function()
	{
		//		this.num = 50;
		//		System.out.println("成员变量num的值，是：" + num);
		System.out.println("成员变量num的值，是：" + this.num);
		this.method();
		
		//		super.num = 80;
		super.method();
	}
}


class Student
{
	String	name;
	int		age;
	
	public void study()
	{
		System.out.println("匿名对象的学习。");
	}
}


/* final */ class Animal
{
	public final void eat()
	{
		System.out.println("父类Animal类的方法，吃东西");
	}
}


class Dog extends Animal
{
	
	/* (非 Javadoc)
	 * @see com.objectExtends.Animal#eat() */
	
	/* @Override public void eat() { } */
	//	final int num = 10;
	//	final int NUM = 10;
	final int NUM;
	
	public Dog()
	{
		NUM = 10;
	}
}
