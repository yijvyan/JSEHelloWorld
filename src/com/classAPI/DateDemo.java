
/**    
* @Title: DateDemo.java  
* @Package com.classAPI  
* @Description: TODO(Date类的常用API的学习；)  
* @author yijvyan  
* @date 2018年3月12日  
* @version V1.0    
*/

package com.classAPI;

import java.util.Date;


/** @ClassName: DateDemo
 * @Description: TODO(主要是设置和获取时间的方法的学习；)
 * @author yijvyan
 * @date 2018年3月12日 */

public class DateDemo
{
	
	/** @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("-------------------------1.Date类的概述和构造；-------------------------------");
		
		//Date:表示特定的瞬间，精确到毫秒；1.可通过方法来设定所要表示的时间，表示任意的时间；
		//2.以1970-1-1 0：0：0 为基准；
		
		//构造方法：Date()   :创建的是一个表示当前系统时间的Date对象；
		//        Date(long date)   :根据“指定时间”创建Date对象；
		
		Date d = new Date();//Mon Mar 12 15:18:14 CST 2018
		System.out.println("返回当前系统时间，以1970-1-1 0:0:0 为基准：" + d);
		System.out.println("按一定的格式输出：" + d.toLocaleString());
		
		Date d2 = new Date(0);
		//		Date d2 = new Date(1000 * 60 * 60);
		//		Date d2 = new Date(1000 * 60 * 60 * 24);
		System.out.println("返回计算机的原点时间，即1970-1-1 0:0:0（由于现在所处的时区是东八区，故加上八小时） ：" + d2);
		System.out.println("按一定的格式输出：" + d2.toLocaleString());
		
		System.out.println("-------------------------2.Date类的常用方法；-------------------------------");
		
		//Date类的常用方法：
		//  毫秒值----Date
		//      设置：1.void setTime(long time);   2.Date(long date);
		
		//  Date----毫秒值
		//      获取：long getTime()
		
		Date dSet = new Date();//默认当前系统时间；
		//		dSet.setTime(0);
		dSet.setTime(1000 * 60 * 60 * 24 * 2);
		System.out.println("输出设置好的时间，以1970-1-1 0(8)：0：0为基准（东八区），加上两天：" + dSet.toLocaleString());
		//172800000
		System.out.println("输出设置好的时间距离基准时间的时长，以毫秒值返回：" + dSet.getTime());
		
		dSet.setTime(172800000L);
		System.out.println("输出设置好的时间，以1970-1-1 0(8)：0：0为基准（东八区），加上两天：" + dSet.toLocaleString());
		
	}
	
}
