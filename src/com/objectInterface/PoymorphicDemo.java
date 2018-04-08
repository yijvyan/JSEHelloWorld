
/**    
* @Title: PoymorphicDemo.java  
* @Package com.objectInterface  
* @Description: TODO(多态Poymorphic的学习)  
* @author yijvyan  
* @date 2018年3月8日  
* @version V1.0    
*/

package com.objectInterface;

/** @ClassName: PoymorphicDemo
 * @Description: TODO(多态的特点的学习)
 * @author yijvyan
 * @date 2018年3月8日 */

public class PoymorphicDemo
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("---------------1.多态的概述和实现；------------------");
		
		//多态的前提：1.子父类的继承关系；2.方法的重写；3.父类引用指向子类对象；
		
		CatPoymorphic catP = new CatPoymorphic();
		catP.eat();
		
		//父类引用     AnimalPoymorphic aP
		//指向        =
		//子类对象     new CatPoymorphic();
		
		//动态绑定：运行期间调用的方法，是根据其具体的类型；
		//此时具体的类型是CatPoymorphic类，故调用子类的成员方法；
		AnimalPoymorphic aP = new CatPoymorphic();
		aP.eat();
		
		System.out.println("---------------2.多态的成员特点；（成员）变量，方法，静态方法；------------------");
		
		//多态的成员特点：
		//1.成员变量：   编译时看左边，运行时也是看左边；
		//2.成员方法：   编译时看左边，运行时看右边；涉及到动态绑定；
		//3.静态方法：   编译时看左边，运行时也是看左边；使用变量去调用静态方法，其实相当于用变量类型的类名去调用；
		// d.function();相当于 Dad.function();
		
		//编译时看的都是左边，运行时只有成员方法看的是右边，其他的（成员变量和静态方法）看的是左边；
		
		Dad d = new Kid();
		System.out.println("输出父类Dad类成员变量num，值是：" + d.num);
		d.method();
		d.function();
		
		System.out.println("---------------3.多态的中向上转型和向下转型；------------------");
		
		//多态的中向上转型和向下转型: 主要是引用数据类型之间的转换；
		//1.向上转型：由小到大（子类型转换成父类型）；2.向下转型：由大到小；
		
		//和基本数据类型的转换类似；1.自动类型转换：由小到大；byte short char int long float double
		//2.强制类型转换：由大到小；
		
		AnimalPoymorphic aPD = new DogPoymorphic(); //向上转型；
		aPD.eat();
		DogPoymorphic dP = (DogPoymorphic) aPD;
		dP.swim();
		
		System.out.println("---------------4.多态的优缺点；------------------");
		
		//多态的优缺点：1.优点：提高可维护性（多态的前提所保证的）；提高代码的可扩展性
		//2.缺点：无法直接访问子类特有的成员；
		
		MiFactory miFactory = new MiFactory();
		miFactory.createPhone(new MiNote());
		miFactory.createPhone(new RedMi());
	}
	
}


class AnimalPoymorphic
{
	public void eat()
	{
		System.out.println("父类AnimalPoymorphic类的成员方法：吃东西。");
	}
}


class CatPoymorphic extends AnimalPoymorphic
{
	@Override
	public void eat()
	{
		System.out.println("子类CatPoymorphic类重写父类AnimalPoymorphic类的成员方法：猫吃鱼。");
	}
}


class DogPoymorphic extends AnimalPoymorphic
{
	@Override
	public void eat()
	{
		System.out.println("子类DogPoymorphic类重写父类AnimalPoymorphic类的成员方法：狗啃骨头。");
	}
	
	public void swim()
	{
		System.out.println("子类DogPoymorphic类中特有的成员方法，父类中没有：狗刨游泳。");
	}
}


class Dad
{
	int num = 20000;
	
	public void method()
	{
		System.out.println("父类Dad类的成员方法；");
	}
	
	public static void function()
	{
		System.out.println("父类Dad类的静态方法；");
	}
}


class Kid extends Dad
{
	int num = 10;
	
	@Override
	public void method()
	{
		System.out.println("子类Kid类的成员方法；");
	}
	
	public static void function()
	{
		System.out.println("子类Kid类的静态方法；");
	}
}


class MiFactory
{
	//	public void createPhone(MiNote mi)
	//	{
	//		mi.call();
	//	}
	//	
	//	public void createPhone(RedMi mi)
	//	{
	//		mi.call();
	//	}
	
	public void createPhone(Phone p)
	{
		p.call();
	}
}


interface Phone
{
	public void call();
}


//class MiNote
class MiNote implements Phone
{
	@Override
	public void call()
	{
		System.out.println("小米Note手机打电话；");
	}
}


//class RedMi
class RedMi implements Phone
{
	@Override
	public void call()
	{
		System.out.println("红米手机打电话；");
	}
}
