
/**    
* @Title: MyBeanUtils.java  
* @Package com.reflectBean  
* @Description: TODO(自定义工具类；)  
* @author yijvyan  
* @date 2018年4月6日  
* @version V1.0    
*/

package com.reflectBean;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;


/** @ClassName: MyBeanUtils
 * @Description: TODO(主要还是实现BeanUtils的三个方法；)
 * @author yijvyan
 * @date 2018年4月6日 */

public class MyBeanUtils
{
	//自定义的工具类，不能创建对象，即私有构造；
	private MyBeanUtils()
	{
		
	}
	
	//1.public static void setProperty(Object bean, String name, Object value)；
	public static void setProperty(Object bean, String name, Object value) throws ReflectiveOperationException, SecurityException
	{
		//1.根据JavaBean对象获取对应的字节码对象；
		Class clazz = bean.getClass();
		//2.根据字节码对象获取对应的Filed对象；
		Field f = clazz.getDeclaredField(name);
		//3.设置权限，让虚拟机不进行访问检查；
		f.setAccessible(true);
		//4.赋值；
		f.set(bean, value);
	}
	
	//2.public static String getProperty(Object bean, String name)；
	public static String getProperty(Object bean, String name) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException
	{
		Class clazz = bean.getClass();
		Field f = clazz.getDeclaredField(name);
		f.setAccessible(true);
		Object obj = f.get(bean);
		return obj.toString();
	}
	
	//3.public static void populate(Object bean, Map properties)；
	public static void populate(Object bean, Map map) throws ReflectiveOperationException, SecurityException
	{
		//1.通过JavaBean对象来获取对应的字节码对象；
		Class clazz = bean.getClass();
		//2.获取Map中所有的key；
		Set keys = map.keySet();
		for (Object key : keys)
		{
			try
			{
				//3.根据key来获取对应的Filed对象；
				Field f = clazz.getDeclaredField(key.toString());
				//4.根据key来获取Map中对应的value；
				Object value = map.get(key);
				
				f.setAccessible(true);
				f.set(bean, value);
				
			}
			catch (NoSuchFieldException e)
			{
				//				e.printStackTrace();
			}
			
		}
	}
}
