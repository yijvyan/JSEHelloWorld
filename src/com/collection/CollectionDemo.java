
/**    
* @Title: CollectionDemo.java  
* @Package com.collection  
* @Description: TODO(集合体系结构的学习；)  
* @author yijvyan  
* @date 2018年3月13日  
* @version V1.0    
*/

package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/** @ClassName: CollectionDemo
 * @Description: TODO(主要使用其底层的实现；)
 * @author yijvyan
 * @date 2018年3月13日 */

public class CollectionDemo
{
	
	/** @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("------------------1.集合的体系结构；-----------------");
		
		//集合的体系结构：1.由于不同的数据结构（数据的组织，存储方式），故Java提供了不同的集合；
		//2.但不同的集合其功能是相似的，不断的向上提取，将共性抽取出来，这就是集合体系结构形成的原因；
		
		//体系结构：1.从最顶层开始学习；最顶层包含了所有的共性；
		//2.使用的话，从最底层开始；最底层就是具体的实现；
		
		//Collection----List----ArrayList；
		
		ArrayList arrayList = new ArrayList();
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("java");
		
		for (int i = 0; i < arrayList.size(); i++)
		{
			System.out.println(arrayList.get(i));
		}
		
		System.out.println("------------------2.Collection中的常用功能；-----------------");
		
		//Collection中的常用功能：
		
		//Collection是接口，不能实例化；
		//		Collection c = new Collection();
		//多态，父类引用指向子类对象；
		Collection c = new ArrayList();
		
		//boolean add(E e);
		System.out.println("集合c添加元素“Hello”，是否成功：" + c.add("Hello"));//一直可以添加成功，因为ArrayList允许重复；
		System.out.println("集合c添加元素“World”，是否成功：" + c.add("World"));
		c.add("Java");
		
		//1.void clear()：清空集合；
		//		c.clear();
		
		//2.boolean contains(Object o)：判断集合中是否包含指定元素；
		System.out.println("集合中是否包含指定元素“Java”：" + c.contains("Java"));
		
		//3.boolean isEmpty() ：是否为空；
		System.out.println("集合是否为空：" + c.isEmpty());
		
		//4.boolean remove(Object o)：删除元素；
		System.out.println("删除集合中的元素“Hello”，是否成功：" + c.remove("Hello"));
		
		c.add("Hello");
		
		//5.int size() :返回集合中的元素个数；
		System.out.println("返回集合c中的元素个数：" + c.size());
		
		//6.Object[] toArray()：将集合转换成一个Object类型的数组；
		Object[] objs = c.toArray();
		for (int i = 0; i < objs.length; i++)
		{
			System.out.println(objs[i]);
		}
		
		System.out.println("输出集合c：" + c);
		
		System.out.println("------------------3.迭代器的概述和测试；-----------------");
		
		//集合的遍历方式：1.toArray()，把集合转换成数组，然后遍历数组即可；
		//2.iterator()，可返回一个迭代器对象，然后通过迭代器对象来迭代集合；
		
		//Iterator：可以用于遍历集合；
		//E next()  :返回下一个元素；
		//注意：Exception in thread "main" java.util.NoSuchElementException
		//     使用next方法获取下一个元素，若没有元素可以获取，则会出现：NoSuchElementException；
		
		//获取迭代器对象；
		Iterator it = c.iterator();
		
		//Object next()  :返回下一个元素；
		//		if (it.hasNext()) System.out.println("通过迭代器来遍历集合c，元素是：" + it.next());
		//		if (it.hasNext()) System.out.println("通过迭代器来遍历集合c，元素是：" + it.next());
		//		if (it.hasNext()) System.out.println("通过迭代器来遍历集合c，元素是：" + it.next());
		//		if (it.hasNext()) System.out.println("通过迭代器来遍历集合c，元素是：" + it.next());
		
		//		while (it.hasNext())
		//		{
		//			System.out.println("通过迭代器来遍历集合c，元素是（在此使用while循环）：" + it.next());
		//		}
		
		System.out.println("------------------4.并发修改异常；-----------------");
		
		//需求：判断集合中是否包含元素Java，如果有就添加元素Android；
		
		//1.使用此方法：boolean contains(Object o)：判断集合中是否包含指定元素；
		//		if (c.contains("Java"))
		//		{
		//			c.add("Android");
		//		}
		
		//2.通过迭代器遍历来获取集合中的每一个元素，然后进行比较即可；
		
		//Exception in thread "main" java.util.ConcurrentModificationException；
		//迭代器是依赖于集合的，相当于集合的一个副本，当迭代器在操作的时候，若发现和集合不一样，则抛异常；
		
		//		while (it.hasNext())
		//		{
		//			String s = (String) it.next();
		//			if (s.equals("Java"))
		//			{
		//				c.add("Android");
		//			}
		//		}
		
		//解决方案：在使用 迭代器遍历时，用迭代器来修改；
		List list = (ArrayList) c;
		ListIterator itList = list.listIterator();
		while (itList.hasNext())
		{
			String s = (String) itList.next();
			if (s.equals("Java"))
			{
				itList.add("Android");
			}
		}
		
		System.out.println(c);
		
		System.out.println("------------------5.泛型的概述和体现；-----------------");
		
		//使用集合存储自定义对象并遍历；
		//1.由于集合可以存储任意类型的对象，当存储了不同类型的对象时，就有可能在转换时出现类型转换异常；
		//2.Java为解决此问题，提供了一种机制，即泛型；
		
		//泛型：是一种广泛的类型，把明确数据类型的工作提前到了编译时期，借鉴了数组的特点；
		//泛型的好处：1.避免类型转换的问题；2.可减少黄色警告线；3.可简化代码的书写；
		
		//使用泛型的时机：查看API，当看到<E>，就可使用泛型了；
		
		//		Collection cStu = new ArrayList();
		Collection<Student> cStu = new ArrayList<Student>();
		Student s = new Student("Alice", 29);
		Student s2 = new Student("Bob", 28);
		
		cStu.add(s);
		cStu.add(s2);
		
		//		Iterator itStu = cStu.iterator();
		Iterator<Student> itStu = cStu.iterator();
		while (itStu.hasNext())
		{
			//			String str = (String) itStu.next();
			//			System.out.println(str);
			Student stu = itStu.next();
			System.out.println("迭代器遍历集合，输出学生对象的姓名：" + stu.name);
		}
		
		System.out.println("------------------6.foreach的概述和测试；-----------------");
		
		//foreach：增强for循环，一般用于遍历集合或数组；
		//格式：   for(元素的类型  变量：集合或数组对象){
		//           可以直接使用变量；
		//      }；
		
		//注意：在增强for循环中，不能修改集合，否则会出现并发修改异常；
		//public interface Iterable<T>；实现此接口，允许对象成为“foreach”语句的目标；
		//即foreach的底层是采用迭代器实现的；
		
		//		Collection cFor = new ArrayList();
		Collection<String> cFor = new ArrayList<String>();
		cFor.add("Hello");
		cFor.add("World");
		cFor.add("Java");
		
		//		for (Object obj : cFor)
		//		{
		//			System.out.println("增强for循环遍历集合，输出元素：" + obj);
		//		}
		
		for (String str : cFor)
		{
			//			cFor.add("Android");
			System.out.println("增强for循环遍历集合，输出元素（全部转大写字母）：" + str.toUpperCase());
		}
		
		System.out.println("------------------7.常见的数据结构：数组，链表，栈&队列；-----------------");
		
		//数组：查询快，增删慢；
		//链表：查询慢，增删快；
		//栈：    先进后出；如弹夹，胡同；
		//队列：先进先出；如排队；
	}
	
}


class Student
{
	String	name;
	int		age;
	
	/** 创建一个新的实例 Student.
	 * 
	 * @param name
	 * @param age
	 */
	
	public Student(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}
	
}
