
/**    
* @Title: UDPSend.java  
* @Package com.netProgramme  
* @Description: TODO(使用UDP协议发送数据；)  
* @author yijvyan  
* @date 2018年4月1日  
* @version V1.0    
*/

package com.netProgramme;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


/** @ClassName: UDPSend
 * @Description: TODO(发送流程的学习；)
 * @author yijvyan
 * @date 2018年4月1日 */

//UDP协议收发数据的注意事项：1.端口号错误，数据可以正常发出，不会出现异常，但是收不到数据；
//2.Exception in thread "main" java.net.BindException: Address already in use: Cannot bind
//		端口号绑定了；

public class UDPSend
{
	
	/** @throws IOException
	 * @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("----------------------------4.UDP协议发送数据；-------------------------");
		
		//使用UDP协议发送数据；
		
		//DatagramSocket：此类表示用来发送和接收数据，基于UDP协议；
		//DatagramSocket()：创建Socket对象并随机分配端口号；
		//DatagramSocket(int port)：创建Socket对象并指定端口号；
		
		//1.创建发送端Socket对象；
		DatagramSocket ds = new DatagramSocket();
		
		//2.创建数据并打包；
		//DatagramPacket：此类表示数据包；
		//2.1.数据byte[]；
		//2.2.设备的地址ip；
		//2.3.进程的地址，即端口号；
		//DatagramPacket(byte[] buf, int length, InetAddress address, int port);
		
		//		String s = "Hello UDP,I'm coming!";
		//		byte[] bys = s.getBytes();
		//		int length = bys.length;
		//		InetAddress address = InetAddress.getByName("YIJVYAN-20180119DI");
		//		int port = 8888;
		
		//2.4.打包；
		//		DatagramPacket dp = new DatagramPacket(bys, length, address, port);
		
		byte[] bys = "UDPSendData,NoticeSomeThing.".getBytes();
		DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("YIJVYAN-20180119DI"), 9999);
		//		DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("aaa"), 9999);
		
		//3.发送数据；
		ds.send(dp);
		
		//4.释放资源；
		ds.close();
	}
	
}
