
/**    
* @Title: PropertiesDemo.java  
* @Package com.map  
* @Description: TODO(也是Map的一个子实现，双列集合；)  
* @author yijvyan  
* @date 2018年3月29日  
* @version V1.0    
*/

package com.map;

import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;


/** @ClassName: PropertiesDemo
 * @Description: TODO(跟HashMap差不多，但是是Hashtable的子类；)
 * @author yijvyan
 * @date 2018年3月29日 */

public class PropertiesDemo
{
	
	/** @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("---------------------------1.Properties的概述；-------------------------");
		
		//Properties:表示了一个持久的属性集，属性列表中每个键及其对应值都是一个字符串；
		
		//构造方法：Properties()
		
		//1.创建属性列表对象；
		Properties prop = new Properties();
		
		//2.添加映射关系；
		prop.put("Alice", "28");
		prop.put("Bob", "29");
		prop.put("Christina", "27");
		
		//3.遍历属性列表；
		//3.1获取所有的key，通过key获取value；
		Set<Object> keys = prop.keySet();
		for (Object key : keys)
		{
			Object value = prop.get(key);
			System.out.println("<3.1>.获取所有的key，通过key获取value；即： " + key + " == " + value);
		}
		
		System.out.println("-------------------------------------------");
		
		//3.2获取所有结婚证对象；
		Set<Entry<Object, Object>> entrys = prop.entrySet();
		for (Entry<Object, Object> entry : entrys)
		{
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println("<3.2>.获取所有结婚证对象；即： " + key + " == " + value);
		}
		
	}
	
}
