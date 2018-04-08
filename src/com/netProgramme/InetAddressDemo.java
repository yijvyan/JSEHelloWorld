
/**    
* @Title: InetAddressDemo.java  
* @Package com.netProgramme  
* @Description: TODO(对网络编程的学习；)  
* @author yijvyan  
* @date 2018年4月1日  
* @version V1.0    
*/

package com.netProgramme;

import java.net.InetAddress;
import java.net.UnknownHostException;


/** @ClassName: InetAddressDemo
 * @Description: TODO(主要用来获取Adress对象；)
 * @author yijvyan
 * @date 2018年4月1日 */

public class InetAddressDemo
{
	
	/** @throws UnknownHostException
	 * @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args) throws UnknownHostException
	{
		System.out.println("---------------------------3.InetAddress的概述和测试；--------------------");
		
		//InetAddress：此类表示互联网协议（IP）地址；
		
		//1.static InetAddress getByName(String host)：在给定主机名的情况下确定主机的IP地址；
		InetAddress address = InetAddress.getByName("YIJVYAN-20180119DI");
		//		InetAddress address = InetAddress.getByName("192.168.1.126");//ip地址是唯一的；
		
		//YIJVYAN-20180119DI/192.168.1.126		ipconfig
		System.out.println("<1>.在给定主机名的情况下确定主机的IP地址：" + address);
		
		//2.192.168.1.126	返回IP地址；
		String hostAddress = address.getHostAddress();
		
		//3.YIJVYAN-20180119DI	返回主机名；
		String hostName = address.getHostName();
		
		System.out.println("<2>.返回IP地址：" + hostAddress);
		System.out.println("<3>.返回主机名：" + hostName);
		
	}
	
}
