
/**    
* @Title: SetDemo.java  
* @Package com.collection  
* @Description: TODO(Collection的子接口Set的学习；)  
* @author yijvyan  
* @date 2018年3月13日  
* @version V1.0    
*/

package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/** @ClassName: SetDemo
 * @Description: TODO(Set的子实现HashSet的学习；)
 * @author yijvyan
 * @date 2018年3月13日 */

public class SetDemo
{
	
	/** @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("-----------------------------1.Set接口的特点；------------------------");
		
		//使用HashSet存储字符串并遍历；
		//Set集合的特点：1.无序（存储和读取的顺序有可能不一样）；
		//2.不允许重复（要求元素唯一）；3.没有索引；
		
		//创建集合对象；
		//		HashSet<String> hSet = new HashSet<String>(); //方式一；
		Set<String> set = new HashSet<String>(); //方式二：父接口引用指向子类对象；
		
		set.add("hello");
		set.add("world");
		System.out.println("Set集合add（）方法的返回值（不允许重复）：" + set.add("java"));
		System.out.println("Set集合add（）方法的返回值（不允许重复），此时再次添加元素“java”：" + set.add("java"));
		
		//遍历集合对象：三种方式；
		
		//1.转数组；
		setArray(set);
		
		//2.迭代器；
		setIterator(set);
		
		//3.增强for；
		setForeach(set);
		
		System.out.println("-----------------------------2.HashSet存储自定义对象并遍历；------------------------");
		
		HashSet<StudentSet> hSet = new HashSet<StudentSet>();
		StudentSet s = new StudentSet("Alice", 29);
		StudentSet s2 = new StudentSet("Bob", 28);
		StudentSet s3 = new StudentSet("Bob", 28);
		
		hSet.add(s);
		hSet.add(s2);
		hSet.add(s3);
		
		for (StudentSet studentSet : hSet)
		{
			System.out.println("HashSet存储自定义对象studentSet并遍历：" + studentSet);
		}
		
		System.out.println("-----------------------------3.通过查看HashSet的add()方法查找不能去重的原因；------------------------");
		
		//通过查看源码得知：HashSet方法的add()方法；
		//1.首先会使用集合当前集合中的每一个元素和新添加的元素进行hash值比较；
		//2.若hash值不同，则直接添加新元素；3.反之，再比较地址值或使用equals方法进行比较；
		//4.比较结果一致，则认为是重复，即不添加；5.所有比较结果都不一样，则添加；
		
		System.out.println("-----------------------------4.重写hashCode方法和equals方法实现HashSet存储自定义对象去重；------------------------");
		System.out.println("-----------------------------5.hashCode方法和equals方法的优化；------------------------");
		
		//hashCode方法：1.当hashCode方法永远返回整数1时，所有对象的hash值是一样的；
		//2.然而有的对象，其成员变量完全不同，但仍需进行hashCode方法和equals方法的比较；
		//3.若可使成员变量不同的对象，其hash值也不同，就可减少一部分equals方法的比较，从而提高程序的效率；
		
		//解决方式：让hashCode方法的返回值和对象的成员变量有关；
		//即：返回值是所有成员变量的之和；（基本数据类型直接相加，引用数据类型获取其hashCode方法的返回值再相加（boolean类型不可参与运算））；
		
	}
	
	/** @Title: setForeach @Description:
	 *         TODO(<1.3>.遍历集合的第三种方式：增强for；) @param @param set 参数 @return void
	 *         返回类型 @throws */
	
	private static void setForeach(Set<String> set)
	{
		for (String string : set)
		{
			System.out.println("<1.3>.遍历集合的第三种方式：增强for；集合对象为：" + string);
		}
	}
	
	/** @Title: setIterator @Description:
	 *         TODO(<1.2>.遍历集合的第二种方式：迭代器；) @param @param set 参数 @return void
	 *         返回类型 @throws */
	
	private static void setIterator(Set<String> set)
	{
		Iterator<String> it = set.iterator();
		while (it.hasNext())
		{
			String string = it.next();
			System.out.println("<1.2>.遍历集合的第二种方式：迭代器；集合对象为：" + string);
		}
	}
	
	/** @Title: setArray @Description: TODO(<1.1>.遍历集合的第一种方式：转数组；) @param @param
	 *         set 参数 @return void 返回类型 @throws */
	
	private static void setArray(Set<String> set)
	{
		Object[] array = set.toArray();
		for (int i = 0; i < array.length; i++)
		{
			System.out.println("<1.1>.遍历集合的第一种方式：转数组；集合对象为：" + array[i]);
		}
	}
	
}


class StudentSet
{
	String	name;
	int		age;
	
	/* (非 Javadoc)
	 * @return
	 * @see java.lang.Object#toString() */
	
	@Override
	public String toString()
	{
		return "StudentSet [name=" + name + ", age=" + age + "]";
	}
	
	/** 创建一个新的实例 StudentSet.
	 * 
	 * @param name
	 * @param age
	 */
	
	public StudentSet(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}
	
	/* (非 Javadoc)
	 * @return
	 * @see java.lang.Object#hashCode() */
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	/* (非 Javadoc)
	 * @param obj
	 * @return
	 * @see java.lang.Object#equals(java.lang.Object) */
	
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		StudentSet other = (StudentSet) obj;
		if (age != other.age) return false;
		if (name == null)
		{
			if (other.name != null) return false;
		}
		else if (!name.equals(other.name)) return false;
		return true;
	}
	
	//	/* (非 Javadoc)
	//	 * @param obj
	//	 * @return
	//	 * @see java.lang.Object#equals(java.lang.Object) */
	//	
	//	@Override
	//	public boolean equals(Object obj)
	//	{
	//		
	//		System.out.println("----调用了重写后的equals方法；----");
	//		
	//		//0.提高效率；
	//		if (this == obj) { return true; }
	//		
	//		//0.1.提高健壮性；(对象的类型进行比较)；
	//		if (this.getClass() != obj.getClass()) { return false; }
	//		
	//		//1.向下转型，可获取子类的成员；
	//		StudentSet sSet = (StudentSet) obj;
	//		
	//		//2.比较年龄是否相等，如果不等则返回false;
	//		if (this.age != sSet.age) { return false; }
	//		
	//		//3.比较名字是否相等，如果不等则返回false;
	//		if (!this.name.equals(sSet.name)) { return false; }
	//		
	//		//4.默认返回true，说明两个学生是相等的；
	//		return true;
	//	}
	//	
	//	/* (非 Javadoc)
	//	 * @return
	//	 * @see java.lang.Object#hashCode() */
	//	
	//	@Override
	//	public int hashCode()
	//	{
	//		//		return 1;
	//		return age + name.hashCode();
	//	}
}
