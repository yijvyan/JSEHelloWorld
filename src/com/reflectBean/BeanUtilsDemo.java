
/**    
* @Title: BeanUtilsDemo.java  
* @Package com.reflectBean  
* @Description: TODO(对BeanUtils的学习；)  
* @author yijvyan  
* @date 2018年4月5日  
* @version V1.0    
*/

package com.reflectBean;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;


/** @ClassName: BeanUtilsDemo
 * @Description: TODO(简化开发的流程；)
 * @author yijvyan
 * @date 2018年4月5日 */

public class BeanUtilsDemo
{
	
	/** @throws ReflectiveOperationException
	 * @throws IllegalAccessException
	 * @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args) throws IllegalAccessException, ReflectiveOperationException
	{
		System.out.println("------------------------------1.BeanUtils的概述；-------------------------");
		
		//BeanUtils ：Apache commons提供的一个组件，主要功能就是为了简化JavaBean封装数据的操作；
		
		System.out.println("------------------------------2.BeanUtils的常用方法；-------------------------");
		
		//BeanUtils的常用方法；
		Person p = new Person();
		System.out.println("输出创建好的标准类（未赋值），即：" + p);
		
		//1.static void setProperty(Object bean, String name, Object value)：
		//给JavaBean对象的成员变量进行赋值；
		BeanUtils.setProperty(p, "name", "Alice");
		BeanUtils.setProperty(p, "age", 29);
		System.out.println("<1>.使用BeanUtils赋值后的JavaBean，即：" + p);
		
		//2.static String getProperty(Object bean, String name)：
		//通过JavaBean对象的成员变量名获取对应的成员变量值；
		String name = BeanUtils.getProperty(p, "name");
		System.out.println("<2>.通过JavaBean对象（p）的成员变量名（name）获取对应的成员变量值，即：" + name);
		
		//注意：BeanUtils的setProperty和getProperty方法底层并不是直接操作成员变量，而是通过反射的方式，来
		//操作和成员变量名有关的get和set方法；
		
		//3.static void populate(Object bean, Map properties)；
		Person pp = new Person();
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Bob");
		map.put("age", 28);
		map.put("gender", "man");
		//		map.put("birthday", "2018年4月6日");
		
		BeanUtils.populate(pp, map);
		System.out.println("<3>.使用BeanUtils的populate方法，对JavaBean的成员变量进行赋值，即：" + pp);
		
		System.out.println("------------------------------3.自定义BeanUtils的赋值和获取方法实现；-------------------------");
		
		//1.public static void setProperty(Object bean, String name, Object value)；
		
		//1.1.创建JavaBean对象；
		Person pM = new Person();
		
		//1.2.赋值；
		MyBeanUtils.setProperty(pM, "name", "Christina");
		MyBeanUtils.setProperty(pM, "age", 27);
		
		//1.3.输出；
		System.out.println("<1.3>.输出通过自定义工具类的方法，对JavaBean的成员变量进行赋值，即：" + pM);
		
		//2.public static String getProperty(Object bean, String name)；
		
		//2.1.获取；
		String nameM = MyBeanUtils.getProperty(pM, "name");
		String ageM = MyBeanUtils.getProperty(pM, "age");
		
		//2.2.输出；
		System.out.println("<2.2.1>.通过自定义工具类的方法，由JavaBean对象（pM）的成员变量名（name）获取对应的成员变量值，即：" + nameM);
		System.out.println("<2.2.2>.通过自定义工具类的方法，由JavaBean对象（pM）的成员变量名（age）获取对应的成员变量值，即：" + ageM);
		
		System.out.println("------------------------------4.自定义BeanUtils的populate方法实现；-------------------------");
		
		//1.public static void populate(Object bean, Map properties)；
		
		//1.1.创建JavaBean对象；
		Person ppM = new Person();
		
		//1.2.准备数据；
		Map mapM = new HashMap();
		
		mapM.put("name", "Danny");
		mapM.put("age", 20);
		mapM.put("gender", "other");
		mapM.put("birthday", "2018-4-6");
		
		MyBeanUtils.populate(ppM, mapM);
		System.out.println("<1>.使用自定义MyBeanUtils的populate方法，对JavaBean的成员变量进行赋值，即：" + ppM);
	}
	
}
