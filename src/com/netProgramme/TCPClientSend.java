
/**    
* @Title: TCPClientSend.java  
* @Package com.netProgramme  
* @Description: TODO(使用TCP协议发送数据；)  
* @author yijvyan  
* @date 2018年4月2日  
* @version V1.0    
*/

package com.netProgramme;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


/** @ClassName: TCPClientSend
 * @Description: TODO(发送数据的流程；)
 * @author yijvyan
 * @date 2018年4月2日 */

public class TCPClientSend
{
	
	/** @throws IOException
	 * @throws UnknownHostException
	 * @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args) throws UnknownHostException, IOException
	{
		System.out.println("----------------------------7.TCP协议发送数据；----------------------");
		
		//使用TCP协议发送数据；
		//Socket(InetAddress address,int port);
		//Exception in thread "main" java.net.ConnectException: Connection refused: connect
		
		simpleSend();
		
		System.out.println("----------------------------9.用TCP协议发送数据并将接收到的数据转换成大写并返回；--------------------");
		
		//需求：使用TCP协议发送数据，并将接收到的数据转换成大写返回；
		
		//1.客户端发送数据；	2.服务端接收数据；	3.服务端转换数据；	4.服务端发出数据；	5.客户端接收数据；
		
		sendReturn();
		
		System.out.println("----------------------------10.模拟用户登陆；--------------------");
		
		//模拟用户登陆；
		//1.创建客户端Socket对象；
		//		Socket s = new Socket(InetAddress.getByName("YIJVYAN-20180119DI"), 8888);
		Socket s = new Socket("YIJVYAN-20180119DI", 8888);
		
		//2.获取用户名和密码；
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("<2.1>.客户端（发送端）-->请输入用户名：");
		String username = br.readLine();
		System.out.println("<2.2>.客户端（发送端）-->请输入密码：");
		String password = br.readLine();
		
		//3.获取输出流对象；
		//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		//true是开关，表示可以自动换行；
		PrintWriter out = new PrintWriter(s.getOutputStream(), true);
		
		//4.写出数据；
		out.println(username);
		out.println(password);
		
		//5.获取收入流对象；
		BufferedReader serverBr = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//6.获取服务器返回的数据；
		String result = serverBr.readLine();
		System.out.println("<6>.客户端获取服务端返回的登陆信息：" + result);
		
		//7.释放资源；
		s.close();
	}
	
	/** @Title: sendReturn @Description:
	 *         TODO(客户端发送数据后接收到服务器端的返回数据；) @param @throws
	 *         IOException @param @throws UnknownHostException 参数 @return void
	 *         返回类型 @throws */
	
	private static void sendReturn() throws IOException, UnknownHostException
	{
		//1.创建发送端Socket对象（创建连接）；
		Socket s = new Socket(InetAddress.getByName("YIJVYAN-20180119DI"), 10010);
		
		//2.获取输出流对象；
		OutputStream os = s.getOutputStream();
		
		//3.发送数据；
		os.write("<3>.Example: Hello TCP,I'm coming again!".getBytes());
		
		//4.获取输入流对象；
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len;//用于存储读取到的字节个数；
		
		//5.接收数据；
		len = is.read(bys);
		
		//6.输出数据；
		System.out.println("<6>.发送端接收到服务端转换成大写的数据--> " + new String(bys, 0, len));
		
		//7.释放资源；
		//		os.close();
		s.close();
	}
	
	/** @Title: simpleSend @Description: TODO(简单的发送数据流程；) @param @throws
	 *         IOException @param @throws UnknownHostException 参数 @return void
	 *         返回类型 @throws */
	
	private static void simpleSend() throws IOException, UnknownHostException
	{
		//1.创建发送端Socket对象（创建连接）；
		Socket s = new Socket(InetAddress.getByName("YIJVYAN-20180119DI"), 10086);
		
		//2.获取输出流对象；
		OutputStream os = s.getOutputStream();
		
		//3.发送数据；
		String str = "Hello TCP,I'm coming!";
		os.write(str.getBytes());
		
		//4.释放资源；
		//		os.close();
		s.close();
	}
	
}
