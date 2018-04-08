
/**    
* @Title: UDPReceive.java  
* @Package com.netProgramme  
* @Description: TODO(使用UDP协议接收数据；)  
* @author yijvyan  
* @date 2018年4月1日  
* @version V1.0    
*/

package com.netProgramme;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


/** @ClassName: UDPReceive
 * @Description: TODO(接收流程的学习；)
 * @author yijvyan
 * @date 2018年4月1日 */

public class UDPReceive
{
	
	/** @throws IOException
	 */
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("------------------------5.UDP协议接收数据；----------------------");
		
		//使用UDP协议接收数据；
		
		//1.创建接收端Socket对象；
		//		DatagramSocket ds = new DatagramSocket(8888);
		DatagramSocket ds = new DatagramSocket(9999);
		
		//2.接收数据；
		//DatagramPacket(byte[] buf, int length);
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys, bys.length);
		
		System.out.println("<2.1>.正在接收消息...");
		ds.receive(dp);//阻塞；
		System.out.println("<2.2>.消息接收完毕。");
		
		//3.解析数据；
		//3.1.InetAddress getAddress()：获取发送端的IP对象；
		InetAddress address = dp.getAddress();
		
		//3.2.byte[] getData()：获取接收到的数据，也可以直接使用创建包对象时的数组；
		byte[] data = dp.getData();
		
		//3.3.int getLength()：获取具体收到数据的长度；
		int length = dp.getLength();
		
		//4.输出数据；
		System.out.println("<4.1>.发送端地址sender-->：" + address.getHostAddress());
		System.out.println("<4.1>.发送端主机名sender-->：" + address.getHostName());
		//		System.out.println("<4.2>.发送端发送的消息：" + new String(data));
		//		System.out.println("<4.2>.发送端发送的消息：" + new String(data, 0, length));
		System.out.println("<4.2>.发送端发送的消息：" + new String(bys, 0, length));
		
		//5.释放资源；
		ds.close();
		
	}
	
}
