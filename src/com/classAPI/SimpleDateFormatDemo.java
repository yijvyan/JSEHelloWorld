
/**    
* @Title: SimpleDateFormatDemo.java  
* @Package com.classAPI  
* @Description: TODO(SimpleDateFormate类的常用方法；)  
* @author yijvyan  
* @date 2018年3月12日  
* @version V1.0    
*/

package com.classAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/** @ClassName: SimpleDateFormatDemo
 * @Description: TODO(主要就是用来把日期进行格式化输出的；)
 * @author yijvyan
 * @date 2018年3月12日 */

public class SimpleDateFormatDemo
{
	
	/** @throws ParseException
	 * @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args) throws ParseException
	{
		System.out.println("-------------------------1.SimpleDateFormat的概述；---------------------");
		
		//SimpleDateFormat: 格式化：把日期对象转换成字符串；
		//         Date-----String : 2018-3-12-----2018年3月12日；
		//             String format(Date date);
		
		//解析：把字符串转换成日期对象；
		//         String-----Date  : "2018-3-12";
		//             Date parse(String source);
		//注意：解析的字符串，模式必须和构建对象的模式一样；
		
		System.out.println("-------------------------2.SimpleDateFormat的功能测试；---------------------");
		
		//构造方法：1. SimpleDateFormat()：使用默认的模式进行对象的构建；
		//2. SimpleDateFormat(String pattern)：使用指定的模式进行对象的构建；
		
		System.out.println("---------1>使用默认的模式进行对象的构建，然后格式化，再解析；-------------");
		SimpleDateFormat sdf = new SimpleDateFormat();
		//创建日期对象
		Date d = new Date();
		
		String s = sdf.format(d);
		System.out.println("格式化：把日期对象转换成字符串；此时日期对象是当前系统时间：" + s);
		
		Date dParse = sdf.parse("18-3-12 下午4:19");
		System.out.println("解析：把字符串转换成日期对象；指定字符串解析，按一定格式输出字符串对象：" + dParse.toLocaleString());
		
		System.out.println("---------2>使用指定的模式（1999年9月1日）进行对象的构建，然后格式化，再解析；-------------");
		//1999年9月1日
		SimpleDateFormat sdfAppoint = new SimpleDateFormat("yyyy年MM月dd日");
		//创建日期对象
		Date d2 = new Date();
		
		String sAppoint = sdfAppoint.format(d);
		System.out.println("格式化：把日期对象转换成字符串，按指定格式；此时日期对象是当前系统时间：" + sAppoint);
		
		Date dParseAppint = sdfAppoint.parse("2018年03月12日");
		System.out.println("解析：把字符串转换成日期对象；指定（指定格式）字符串解析，按一定格式输出字符串对象：" + dParseAppint.toLocaleString());
		
		System.out.println("---------3>使用指定的模式（1999年9月1日 10：10：10）进行对象的构建，然后格式化，再解析；-------------");
		//1999年9月1日 10：10：10；
		SimpleDateFormat sdfAMinute = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		//创建日期对象
		Date d3 = new Date();
		
		String sAMinute = sdfAMinute.format(d3);
		System.out.println("格式化：把日期对象转换成字符串，按指定格式(具体到时分秒)；此时日期对象是当前系统时间：" + sAMinute);
		
		Date dParseAMinute = sdfAMinute.parse("2018年03月12日 16:34:21");
		System.out.println("解析：把字符串转换成日期对象；指定字符串(具体到时分秒)解析，按一定格式输出字符串对象：" + dParseAMinute.toLocaleString());
		
		System.out.println("-------------------------3.求出你来这个世界上多少天；---------------------");
		
		//出生日期；
		String birthday = "1993-08-20";
		//今天日期；
		String now = "2018-03-12";
		
		SimpleDateFormat sdfDay = new SimpleDateFormat("yyyy-MM-dd");
		//将字符串转换成日期对象；
		Date bParse = sdfDay.parse(birthday);
		Date nParse = sdfDay.parse(now);
		
		//将日期对象转换成long类型数据；
		long bTime = bParse.getTime();
		long nTime = nParse.getTime();
		
		System.out.println("一共活了多少天呢： " + ((nTime - bTime) / 1000 / 60 / 60 / 24));
		
	}
	
}
