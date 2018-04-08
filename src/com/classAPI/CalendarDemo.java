
/**    
* @Title: CalendarDemo.java  
* @Package com.classAPI  
* @Description: TODO(日历类的学习；)  
* @author yijvyan  
* @date 2018年3月12日  
* @version V1.0    
*/

package com.classAPI;

import java.util.Calendar;


/** @ClassName: CalendarDemo
 * @Description: TODO(对日期的获取 ，修改，添加；)
 * @author yijvyan
 * @date 2018年3月12日 */

public class CalendarDemo
{
	
	/** @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("----------------------1.Calendar的概述和测试；----------------------");
		
		//Calendar：日历，提供了一些操作年月日时的方法；
		//获取；修改；添加；
		
		//static Calendar getInstance()；创建Calendar的对象；
		Calendar c = Calendar.getInstance();
		
		//void set(int field,int value)：把指定的字段修改成指定的值；
		//2018年3月12日--->2018年3月1日;
		c.set(Calendar.DAY_OF_MONTH, 1);
		
		//void add(int field,int amount)：在指定的字段上加上指定的值；
		//		c.add(Calendar.DAY_OF_MONTH, 2);
		c.add(Calendar.DAY_OF_MONTH, -1);
		
		//int get(int field)   返回给定日历字段的值；
		//public static final int YEAR  ---> 1;查看API文档，定义的值；
		System.out.println("输出日历字段YEAR的值：" + Calendar.YEAR);
		
		//		int year = c.get(1);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;//API文档中查到，月份为0-11，故要加1；
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		//		System.out.println(year + "年" + month + "月" + day + "日");
		System.out.println("修改后的日期：" + year + "年" + month + "月" + day + "日");
	}
	
}
