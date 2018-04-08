
/**    
* @Title: MapDemo.java  
* @Package com.map  
* @Description: TODO(双列集合Map的学习；)  
* @author yijvyan  
* @date 2018年3月14日  
* @version V1.0    
*/

package com.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


/** @ClassName: MapDemo
 * @Description: TODO(与Collection集合没有关系；)
 * @author yijvyan
 * @date 2018年3月14日 */

public class MapDemo
{
	
	/** @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("----------------------------1.Map接口的概述；-------------------------");
		
		//需求：实现学号和姓名这种有对应关系的数据存储；
		//一对一：一个学号对应一个学生；
		//用以前的内容可以完成，但Java有专门用于存储对应关系的集合：Map;
		
		//Map：将键映射到值的对象；一个映射不能包含重复的键，每个键最多只能映射到一个值；
		
		//Map：双列集合；常用于处理有对应关系的数据，key是不能重复的，也称夫妻集合；
		//Collection：单列集合；Collection有不同的子体系，List允许重复且有序有索引，
		//Set不允许重复且无序无索引，也称单身汉集合；
		
		System.out.println("----------------------------2.Map的功能概述和测试；-------------------------");
		
		//Map的常用功能：
		
		//创建Map对象
		Map<String, String> map = new HashMap<String, String>();
		
		//1.添加映射关系；V put(K key, V value)：
		//将key映射到value，若key存在，则覆盖value，并将原来的value返回；反之，返回null；
		System.out.println("<1.1>.将key01映射到value01，此时key01不存在，返回null。即：" + map.put("key01", "value01"));
		System.out.println("<1.2>.将key02映射到value02，此时key02不存在，返回null。即：" + map.put("key02", "value02"));
		System.out.println("<1.3>.将key01映射到value03，此时key01存在，则覆盖value01，并将原来的value01返回；即：" + map.put("key01", "value03"));
		
		//2.判断指定key是否存在；boolean containsKey(Object key)；
		System.out.println("<2>.判断指定键key03是否存在：" + map.containsKey("key03"));
		
		//3.判断指定value值是否存在；boolean containsValue(Object value)；
		System.out.println("<3>.判断指定值value03是否存在：" + map.containsValue("value03"));
		
		//4.判断集合是否有对应关系；boolean isEmpty()；
		System.out.println("<4>.判断集合map是否有对应关系：" + map.isEmpty());
		
		//5.清空集合所有的对应关系；void clear()；
		//		map.clear();
		
		//6.移除功能；V remove(Object key)：
		//根据指定的key删除对应关系，并返回key所对应的值，若没有删除成功，则返回null；
		System.out.println("<6>.根据指定的key03删除对应关系，并返回key03所对应的值，若没有删除成功，则返回null；即：" + map.remove("key03"));
		
		//7.返回对应关系的个数；int size()；
		System.out.println("<7>.返回集合map对应关系的个数：" + map.size());
		
		//8.根据指定的key返回对应的value；V get(Object key)；
		System.out.println("<8>.根据指定的键key01返回对应的值value03；即：" + map.get("key01"));
		
		System.out.println("双列集合map对象是：" + map);
		
		System.out.println("----------------------------3.keySet和values的测试；-------------------------");
		
		map.put("key03", "value03");
		
		//1.Set<K> keySet()：以Set的形式返回所有的key；
		keySetMethod(map);
		
		//2.Collection<V> values()：以Collection的形式返回所有的value；
		valuesMethod(map);
		
		System.out.println("----------------------------4.Map的第一种遍历方式；-------------------------");
		
		//Map的第一种遍历方式：
		//遍历Map对象；
		
		keySetTraverse(map);
		
		System.out.println("----------------------------5.Map的第二种遍历方式；-------------------------");
		
		//Map的第二种遍历方式：通过结婚证Entry对象来获取丈夫key和媳妇value；
		
		//Map的内部类：
		//		class 结婚证<K, V>
		//		{
		//			K	丈夫;
		//			V	媳妇;
		//			public 结婚证(K 丈夫, V 媳妇)
		//			{
		//				super();
		//				this.丈夫 = 丈夫;
		//				this.媳妇 = 媳妇;
		//			}
		//			public K get丈夫()
		//			{
		//				return 丈夫;
		//			}
		//			public V get媳妇()
		//			{
		//				return 媳妇;
		//			}
		//		}
		
		//Set<Map.Entry<K,V>> entrySet()
		
		entrySetTraverse(map);
		
		System.out.println("----------------------------6.HashMap存储数据并遍历（String作为key）；-------------------------");
		
		HashMap<String, String> hMap = new HashMap<String, String>();
		hMap.put("编号1", "字符串1");
		hMap.put("编号2", "字符串2");
		hMap.put("编号3", "字符串3");
		hMap.put("编号3", "字符串4");
		
		//遍历Map对象：
		//方式一：获取所有的key，通过key来获取value；
		keySetTraverse(hMap);
		System.out.println("----------------------------------------");
		//方式二：获取所有的结婚证对象，然后通过结婚证对象来获取丈夫和媳妇；
		entrySetTraverse(hMap);
		
		System.out.println("----------------------------7.HashMap存储数据并遍历（自定义对象作为key）；-------------------------");
		
		//1.创建Map对象；
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		
		//2.创建key对象；
		Student s = new Student("Alice", 28);
		Student s2 = new Student("Bob", 29);
		//自定义对象未重写hashCode和equals方法时，可以添加成员相同的对象作为key；
		//重写之后就不行了；
		Student s3 = new Student("Bob", 29);
		
		//3.添加映射关系；
		hashMap.put(s, "value01");
		hashMap.put(s2, "value02");
		hashMap.put(s3, "value02");
		
		//4.遍历Map对象；
		//方式一：获取所有的key，通过key来获取value；
		Set<Student> keys = hashMap.keySet();
		for (Student key : keys)
		{
			String value = hashMap.get(key);
			System.out.println("<4.1>.HashMap存储数据并遍历（自定义对象作为key）,方式一：" + key + " = " + value);
		}
		
		System.out.println("----------------------------------------");
		//方式二：获取所有的结婚证对象，然后通过结婚证对象来获取丈夫和媳妇；
		Set<Entry<Student, String>> entrys = hashMap.entrySet();
		for (Entry<Student, String> entry : entrys)
		{
			Student key = entry.getKey();
			String value = entry.getValue();
			System.out.println("<4.2>.HashMap存储数据并遍历（自定义对象作为key）,方式二：" + key + " = " + value);
		}
		
		System.out.println("----------------------------8.Map的案例（Map嵌套Map）；-------------------------");
		
		//学校：基础班，就业班；
		//基础班：01 Alice； 02 Bob；                   就业班：01 Christina；  02 Danny；
		
		//分析：1.学校需要有班级和学生，班级和学生之间是一种对应关系（映射关系）；
		//2.有对应关系，故使用Map集合来存储这样的数据；班级为key，学生为value；
		//3.Map中的key只能对应一个value，但一个班级中有多个学生；
		//4.可创建一个包含多个学生的集合，让班级和此集合产生一一对应的关系；
		//5.学生信息分为学号和姓名，这也是一种对应关系，故使用Map集合来存储学生信息；
		
		//学校Map:
		//      基础班 ---基础班学生Map；         就业班---就业班学生Map；
		
		//Map嵌套Map
		
		//1.学校Map；
		Map<String, Map<String, String>> school = new HashMap<String, Map<String, String>>();
		
		//2.基础班学生Map;
		Map<String, String> base = new HashMap<String, String>();
		base.put("学号01", "姓名Alice");
		base.put("学号02", "姓名Bob");
		
		//3.就业班学生Map;
		Map<String, String> job = new HashMap<String, String>();
		job.put("学号01", "姓名Christina");
		job.put("学号02", "姓名Danny");
		
		//4.将学生信息Map添加到学校Map中；
		school.put("基础班", base);
		school.put("就业班", job);
		
		//5.遍历学校Map，查看有多少个班级和对应的学生；
		//5.1.先获取所有的班级；
		Set<String> keyClass = school.keySet();
		for (String key : keyClass)
		{
			//输出班级名称
			System.out.println("班级名称：" + key);
			
			//5.2.根据班级获取对应的所有学生；
			Map<String, String> stus = school.get(key);
			//5.3获取所有学生的学号；
			Set<String> nums = stus.keySet();
			for (String num : nums)
			{
				//5.4.根据学号获取学生姓名；
				String name = stus.get(num);
				
				System.out.println("学号： " + num + " ,姓名：" + name);
			}
		}
		
		System.out.println("----------------------------9.Map的案例（Map嵌套Collection）；-------------------------");
		
		//学校：基础班，就业班；
		//基础班：01 Alice； 02 Bob；                   就业班：01 Christina；  02 Danny；
		
		//更为面向对象；
		
		//学校Map:
		//      基础班 ---基础班学生List；         就业班---就业班学生List；
		
		//Map嵌套Collection；
		
		//1.学校Map；
		Map<String, List<StudentMap>> sList = new HashMap<String, List<StudentMap>>();
		
		//2.基础班学生List;
		ArrayList<StudentMap> baseList = new ArrayList<StudentMap>();
		baseList.add(new StudentMap("学号01", "姓名Alice"));
		baseList.add(new StudentMap("学号02", "姓名Bob"));
		
		//3.就业班学生List;
		ArrayList<StudentMap> jobList = new ArrayList<StudentMap>();
		jobList.add(new StudentMap("学号01", "姓名Christina"));
		jobList.add(new StudentMap("学号02", "姓名Danny"));
		
		//4.将包含了学生对象的List添加到学校Map中；
		sList.put("基础班", baseList);
		sList.put("就业班", jobList);
		
		//5.遍历学校Map，查看有多少个班级和对应的学生；
		//5.1.先获取所有的Entry对象；
		Set<Entry<String, List<StudentMap>>> entrysList = sList.entrySet();
		for (Entry<String, List<StudentMap>> entry : entrysList)
		{
			//5.2获取班级；
			String key = entry.getKey();
			System.out.println("班级名称：" + key);
			
			//5.3获取包含了学生对象的list;
			List<StudentMap> value = entry.getValue();
			for (StudentMap studentMap : value)
			{
				System.out.println(studentMap);
			}
			
		}
		
	}
	
	/** @Title: entrySetTraverse @Description: TODO(Map的第二种遍历方式：) @param @param
	 *         map 参数 @return void 返回类型 @throws */
	
	private static void entrySetTraverse(Map<String, String> map)
	{
		//1.获取所有的结婚证对象entry；
		Set<Entry<String, String>> entrys = map.entrySet();
		
		//2.遍历包含了结婚证对象entry的集合entrys；
		for (Entry<String, String> entry : entrys)
		{
			//3.获取每个单独的结婚证对象entry；
			//4.通过结婚证对象entry获取丈夫key和媳妇value；
			String key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println("Map的第二种遍历方式：丈夫：" + key + "----------" + "媳妇：" + value);
		}
	}
	
	/** @Title: keySetTraverse @Description: TODO(Map的第一种遍历方式：) @param @param
	 *         map 参数 @return void 返回类型 @throws */
	
	private static void keySetTraverse(Map<String, String> map)
	{
		//1.召集所有的丈夫key；
		Set<String> keys = map.keySet();
		
		//2.遍历所有的丈夫key；
		for (String key : keys)
		{
			//3.让每个丈夫key去找他的媳妇value；
			String value = map.get(key);
			System.out.println("Map的第一种遍历方式：丈夫：" + key + "----------" + "媳妇：" + value);
		}
	}
	
	/** @Title: valuesMethod @Description:
	 *         TODO(以Collection的形式返回所有的value；) @param @param map 参数 @return void
	 *         返回类型 @throws */
	
	private static void valuesMethod(Map<String, String> map)
	{
		Collection<String> values = map.values();
		for (String string : values)
		{
			System.out.println("<2>.集合map所有的值value：" + string);
		}
	}
	
	/** @Title: keySetMethod @Description: TODO(以Set的形式返回所有的key；) @param @param
	 *         map 参数 @return void 返回类型 @throws */
	
	private static void keySetMethod(Map<String, String> map)
	{
		Set<String> keys = map.keySet();
		for (String string : keys)
		{
			System.out.println("<1>.集合map所有的键key：" + string);
		}
	}
	
}
