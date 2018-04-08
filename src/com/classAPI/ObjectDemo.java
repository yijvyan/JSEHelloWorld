
/**    
* @Title: ObjectDemo.java  
* @Package com.classAPI  
* @Description: TODO(Object类的常用api；)  
* @author yijvyan  
* @date 2018年3月11日  
* @version V1.0    
*/

package com.classAPI;

/** @ClassName: ObjectDemo
 * @Description: TODO(一些常用的方法；)
 * @author yijvyan
 * @date 2018年3月11日 */

public class ObjectDemo
{
	
	/** @throws ClassNotFoundException
	 * @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args) throws ClassNotFoundException
	{
		System.out.println("-------------------1.Object的toString方法；--------------------");
		
		//String toString()  :返回该对象的字符串表示
		//return getClass().getName() + "@" + Integer.toHexString(hashCode());
		
		//getClass():返回一个字节码对象；
		//Integer.toHexString():返回指定参数的16进制字符串形式；
		//hashCode():返回该对象的哈希码值（内部地址）
		
		Student s = new Student();
		
		s.name = "Alice";
		s.age = 29;
		
		System.out.println("s.toString()方法输出的内容是： " + s.toString());//com.classAPI.Student@76ccd017
		System.out.println("说明输出一个对象就是默认输出这个对象的toString（）方法：" + s);
		
		System.out.println("-------------------2.获取字节码对象的三种方式；--------------------");
		
		//获取字节码对象的三种方式 ，方式二和三可以不用创建对象，就能完成；
		
		//应用于反射；
		
		//方式一：通过Object类的getClass()方法获取；
		Teacher t = new Teacher();
		Class clazz = t.getClass();
		System.out.println("1.获取字节码对象的方式一：通过Object类的getClass()方法获取： " + clazz);
		
		//方式二：通过类名调用属性class获取；
		Class clazz2 = Teacher.class;
		System.out.println("2.获取字节码对象的方式二：通过类名调用属性class获取： " + clazz2);
		
		//方式三：通过Class类的静态方法forName()来获取；
		Class clazz3 = Class.forName("com.classAPI.Teacher");
		System.out.println("3.获取字节码对象的方式三：通过Class类的静态方法forName()来获取： " + clazz3);
		
		System.out.println("clazz == clazz2的结果 :" + (clazz == clazz2));
		System.out.println("clazz2 == clazz3的结果 :" + (clazz2 == clazz3));
		
		Teacher t2 = new Teacher();
		System.out.println("t.getClass() == t2.getClass()的结果：" + (t.getClass() == t2.getClass()));
		
		System.out.println("-------------------3.Object的equals（）方法；--------------------");
		
		//boolean equals(Object obj):
		//		1.使用 == 来比较引用数据类型（两个对象），比较的是其地址值是否相等；所以一般要重写equals方法，使其不再比较地址值；
		//      2.使用 == 来比较基本数据类型，比较的是其数值是否相等；
		
		Person p = new Person("Alice", 29);
		Person p2 = new Person("Alice", 29);
		
		boolean flag = p.equals(p2);
		//		System.out.println("Person类未重写equals方法之前，两个对象比较的是地址值，故：" + flag);
		System.out.println("Person类重写equals方法之后，两个对象比较的是地址值，故：" + flag);
	}
	
}


class Student extends Object
{
	String	name;
	int		age;
	
	//	@Override
	//	public String toString()
	//	{
	//		return name + "@" + age;
	//	}
	
	/* (非 Javadoc)
	 * @return
	 * @see java.lang.Object#toString() */
	
	@Override
	public String toString()
	{
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}


class Person
{
	String	name;
	int		age;
	
	/** 创建一个新的实例 Person.
	 * 
	 * @param name
	 * @param age
	 */
	
	public Person(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}
	
	/* (非 Javadoc)
	 * @param obj
	 * @return
	 * @see java.lang.Object#equals(java.lang.Object) */
	
	@Override
	public boolean equals(Object obj)
	{
		//1.提高效率，当前对象和传递进来的对象地址值一样，则不用比较；
		if (this == obj) return true;
		if (obj == null) return false;
		
		//2.提高代码的健壮性；
		if (getClass() != obj.getClass()) return false;
		
		//3.向下转型，比较对象的成员是否一样；
		Person other = (Person) obj;
		if (age != other.age) return false;
		if (name == null)
		{
			if (other.name != null) return false;
		}
		else if (!name.equals(other.name)) return false;
		return true;
	}
	
	/* (非 Javadoc)
	 * @param obj
	 * @return
	 * @see java.lang.Object#equals(java.lang.Object) */
	
	//	@Override
	//	public boolean equals(Object o)
	//	{
	//		//1.提高效率，当前对象和传递进来的对象地址值一样，则不用比较；
	//		if (this == o) { return true; }
	//		
	//		//2.提高代码的健壮性；
	//		if (this.getClass() != o.getClass()) { return false; }
	//		
	//		//3.向下转型，比较对象的成员是否一样；
	//		Person other = (Person) o;
	//		
	//		if (!this.name.equals(other.name)) { return false; }
	//		
	//		if (this.age != other.age) { return false; }
	//		
	//		return true;
	//	}
	
}
