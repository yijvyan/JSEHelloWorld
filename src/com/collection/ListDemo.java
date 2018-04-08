
/**    
* @Title: ListDemo.java  
* @Package com.collection  
* @Description: TODO(Collection的子接口List列表的学习)  
* @author yijvyan  
* @date 2018年3月13日  
* @version V1.0    
*/

package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/** @ClassName: ListDemo
 * @Description: TODO(List的API的学习；即增删改查；)
 * @author yijvyan
 * @date 2018年3月13日 */

public class ListDemo
{
	
	/** @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("---------------------------1.List的特点和特有功能；ArrayList增删改查；-----------------------");
		
		//List的特点：1.有序的（存储和读取的顺序是一致的）；
		//2.有整数索引；3.允许重复；
		
		//List的特有功能：增删改查；
		
		//创建列表对象
		List list = new ArrayList();
		
		//1.增；void add(int index,E element)  : 在指定索引位置添加指定元素；
		list.add(0, "hello");
		list.add(0, "world");
		list.add(1, "java");
		
		//2.查；E get(int index)  : 根据索引返回元素；
		System.out.println("<2>.列表list指定索引0处的元素为：" + list.get(0));
		System.out.println("<2>.列表list指定索引1处的元素为：" + list.get(1));
		System.out.println("<2>.列表list指定索引2处的元素为：" + list.get(2));
		
		//索引超范围异常：Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 3, Size: 3
		//		System.out.println("列表list指定索引3处的元素为：" + list.get(3));
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println("<2>.列表list指定索引处的元素（使用for循环）：" + list.get(i));
		}
		
		//3.删；E remove(int index)  : 删除指定索引处的元素并将其返回；
		System.out.println("<3>.删除列表list指定索引0处的元素（world）并将其返回：" + list.remove(0));
		
		//4.改；E set(int index,E element)  : 将指定索引位置的元素替换为指定元素，并将原先的元素返回；
		System.out.println("<4>.将列表list指定索引0处的元素（java）替换为android，并返回被替换的元素：" + list.set(0, "android"));
		
		System.out.println("列表list的元素为：" + list);
		
		System.out.println("---------------------------2.List的子类概述和LinkedList的特有功能；-----------------------");
		
		//List的常用子类：        ArrayList -----底层是数组结构，查询快，增删慢；
		//LinkedList -----底层结构是链表，查询慢，增删快；
		
		//使用不同的集合的情况：1.若查询多，增删少，选ArrayList;
		//2.若查询少，增删多，选LinkedList;   3.不知道使用时，就选ArrayList;
		
		//LinkedList特有的功能：增删查；
		
		LinkedList linkedList = new LinkedList();
		linkedList.add("hello");
		linkedList.add("world");
		
		//<1.1>.增；void addFirst(E e) : 将元素添加到索引为0的位置；  
		//<1.2>.增；void addLast(E e) : 将元素添加到索引为size()-1的位置；
		linkedList.addFirst("java");
		linkedList.addLast("android");
		
		//<2.1>.查；E getFirst() : 获取索引为0的元素；  
		//<2.2>.查；E getLast() : 获取索引为size()-1的元素；
		System.out.println("<2.1>获取列表linkedList索引为0的元素：" + linkedList.getFirst());
		System.out.println("<2.2>获取列表linkedList索引为size()-1的元素：" + linkedList.getLast());
		
		//<3.1>.删；E removeFirst() : 删除索引为0的元素并返回；  
		//<3.2>.删；E removeLast() : 删除索引为size()-1的元素并返回；
		System.out.println("<3.1>删除列表linkedList索引为0的元素（java）并返回：" + linkedList.removeFirst());
		System.out.println("<3.2>删除列表linkedList索引为size()-1的元素（android）并返回：" + linkedList.removeLast());
		
		System.out.println("输出列表linkedList的元素：" + linkedList);
	}
	
}
