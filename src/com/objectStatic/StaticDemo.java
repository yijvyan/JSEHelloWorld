
/**    
* @Title: StaticDemo.java  
* @Package com.objectStatic  
* @Description: TODO(static静态关键字修饰的类)  
* @author yijvyan  
* @date 2018年3月5日  
* @version V1.0    
*/

package com.objectStatic;

/** @ClassName: StaticDemo
 * @Description: TODO(static修饰了成员变量以后，他的值就固定不变了)
 * @author yijvyan
 * @date 2018年3月5日 */

public class StaticDemo
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("--------------静态的概述和特点------------");
		
		//static：是个关键字，用于修饰成员变量和成员方法
		//   特点：1.被所有的对象所共享；就是new出来的对象都可以拥有这个变量或方法，不管是p1还是p2；
		//        2.可以使用类名调用，就是Person.xxx，不用new对象；
		//        3.静态的加载优先于对象，随着类的加载而加载；也就是说是直接加载到内存方法区中，此时对象还未new，就已经有成员变量或方法了；
		
		Person.graduateFrom = "TokyoHot";
		
		Person p = new Person();
		p.name = "Alice";
		p.age = 18;
		//		p.graduateFrom = "TokyoHot";
		p.speak();
		
		Person p2 = new Person();
		p2.name = "Bob";
		p2.age = 20;
		//		p2.graduateFrom = "OneWay";
		p2.speak();
		
		System.out.println("--------------静态的注意事项；静态方法和非静态方法的区别，主要是调用范围；---------------------");
		
		//static的注意事项：静态方法      1.可调用静态成员（变量和方法）且只能调用静态成员；2.不可调用非静态成员；
		//             非静态方法        1.可调用静态成员，也可调用非静态成员；
		
		//问：静态方法中是否有this这个对象？      答：没有；this是成员变量，是随对象加载而加载的，static方法是随着
		//内存方法区加载而加载，是在new对象之前就有的，而此时没有对象，更不用说对象的成员变量，除非成员变量被static修饰；
		
		Student.graduateFrom = "CMCC";
		Student.study();
		//		Student.sleep();
		
		System.out.println("------非静态方法调用静态成员：");
		new Student().eat();
		
		System.out.println("---------------练习1.静态类Math类的api的学习---------------------");
		
		System.out.println("PI的值是：" + Math.PI);
		System.out.println("-10的绝对值是：" + Math.abs(-10));
		
		System.out.println("1.01向上取整是：" + Math.ceil(1.01));
		System.out.println("1.2向上取整是：" + Math.ceil(1.2));
		System.out.println("1.6向上取整是：" + Math.ceil(1.6));
		
		System.out.println("1.01向下取整是：" + Math.floor(1.01));
		System.out.println("1.2向下取整是：" + Math.floor(1.2));
		System.out.println("1.6向下取整是：" + Math.floor(1.6));
		
		System.out.println("1.01四舍五入是：" + Math.round(1.01));
		System.out.println("1.2四舍五入是：" + Math.round(1.2));
		System.out.println("1.6四舍五入是：" + Math.round(1.6));
		
		System.out.println("3和4两者之间的较大值是：" + Math.max(3, 4));
		System.out.println("2的3次方（幂）值是：" + Math.pow(2, 3));
		System.out.println("返回一个随机数，大于0小于1的double类型数：" + Math.random());
		
		System.out.println("----------------练习2.自定义数组工具类--------------------");
		int[] arr = { 3, 5, 8, 10, 1 };
		int max = ArraysTool.getMax(arr);
		System.out.println("返回数组中最大的元素，是：" + max);
		
		int index = ArraysTool.getIndex(arr, 8);
		System.out.println("返回数组中指定参数8的索引，是：" + index);
	}
	
}


class Person
{
	String			name;
	int				age;
	//	String	graduateFrom;
	static String	graduateFrom;
	
	public void speak()
	{
		System.out.println("内部类的成员变量的值：" + name + "----------" + graduateFrom);
	}
}


class Student
{
	String			name;
	int				age;
	static String	graduateFrom;
	
	public static void study()
	{
		System.out.println("静态方法：学习，成员变量：" + graduateFrom);
		sleep();
		
		//不行
		//		System.out.println(name);
		//		eat();
	}
	
	public static void sleep()
	{
		System.out.println("静态方法：睡觉");
	}
	
	public void eat()
	{
		System.out.println("静态方法：学习，成员变量：" + graduateFrom);
		sleep();
		
		System.out.println("非静态方法：吃饭");
		
	}
}
