
/**    
* @Title: TCPServerReceive.java  
* @Package com.netProgramme  
* @Description: TODO(使用TCP协议接收数据；)  
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
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;


/** @ClassName: TCPServerReceive
 * @Description: TODO(接收数据的流程；)
 * @author yijvyan
 * @date 2018年4月2日 */

public class TCPServerReceive
{
	
	/** @throws IOException
	 * @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("-------------------------8.TCP协议接收数据；----------------------------");
		
		//使用TCP协议接收数据；
		//ServerSocket：接收端，服务端Socket；
		//ServerSocket(int port);
		//Socket accept();
		
		simpleReceive();
		
		System.out.println("----------------------------9.用TCP协议发送数据并将接收到的数据转换成大写并返回；--------------------");
		
		receiveReturn();
		
		System.out.println("----------------------------10.模拟用户登陆；--------------------");
		
		//1.创建服务器端Socket对象；
		ServerSocket ss = new ServerSocket(8888);
		
		//2.监听(阻塞)；
		System.out.println("<2.1>.正在接收消息...");
		Socket s = ss.accept();
		System.out.println("<2.2>.接收消息完毕。");
		
		//3.获取输入流对象；
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//4.获取用户名和密码；
		String username = br.readLine();
		String password = br.readLine();
		
		//5.判断用户名和密码是否正确；
		boolean flag = false;
		//		if ("yijvyan".equals(username) && "123456".equals(password))
		//		{
		//			flag = true;
		//		}
		
		List<User> users = UserDB.getUsers();
		User user = new User(username, password);
		if (users.contains(user))
		{
			//匹配成功；
			flag = true;
		}
		
		//6.获取输出流对象；
		PrintWriter out = new PrintWriter(s.getOutputStream(), true);
		
		//7.返回判断信息；
		if (flag)
		{
			out.println("<7.1>.服务器端返回登陆信息-->登陆成功！");
		}
		else
		{
			out.println("<7.2>.服务器端返回登陆信息-->登陆失败！");
		}
		
		//7.释放资源；
		s.close();
		//服务器端一般不关闭；
		//		ss.close();
		
	}
	
	/** @Title: receiveReturn @Description:
	 *         TODO(服务器端将客户端发送的数据接收后进行转换然后返回给客户端；) @param @throws IOException
	 *         参数 @return void 返回类型 @throws */
	
	private static void receiveReturn() throws IOException
	{
		//1.创建接收端Socket对象；
		ServerSocket ss = new ServerSocket(10010);
		
		//2.监听（阻塞）；
		System.out.println("<2.1>.正在接收消息...");
		Socket s = ss.accept();
		System.out.println("<2.2>.接收消息完毕。");
		
		//3.获取输入流对象；
		InputStream is = s.getInputStream();
		
		//4.获取数据；
		byte[] bys = new byte[1024];
		int len;//用于存储读取到的字节个数；
		len = is.read(bys);
		
		//5.输出数据；
		InetAddress address = s.getInetAddress();
		System.out.println("<5.1>.发送端（客户端）主机名client--> " + address.getHostName());
		String str = new String(bys, 0, len);
		System.out.println("<5.2>.发送端（客户端）发送的消息：" + str);
		
		//6.转换数据；
		String upperStr = str.toUpperCase();
		
		//7.获取输出流对象；
		OutputStream os = s.getOutputStream();
		
		//8.返回数据；
		os.write(upperStr.getBytes());
		
		//9.释放资源；
		s.close();
		//服务端一般不关闭；
		//		ss.close();
	}
	
	/** @Title: simpleReceive @Description: TODO(简单的接收数据的流程；) @param @throws
	 *         IOException 参数 @return void 返回类型 @throws */
	
	private static void simpleReceive() throws IOException
	{
		//1.创建接收端Socket对象；
		ServerSocket ss = new ServerSocket(10086);
		
		//2.监听（阻塞）；
		System.out.println("<2.1>.正在接收消息...");
		Socket s = ss.accept();
		System.out.println("<2.2>.接收消息完毕。");
		
		//3.获取输入流对象；
		InputStream is = s.getInputStream();
		
		//4.获取数据；
		byte[] bys = new byte[1024];
		int len;//用于存储读取到的字节个数；
		len = is.read(bys);
		
		//5.输出数据；
		InetAddress address = s.getInetAddress();
		System.out.println("<5.1>.发送端（客户端）主机名client--> " + address.getHostName());
		System.out.println("<5.2>.发送端（客户端）发送的消息：" + new String(bys, 0, len));
		
		//6.释放资源；
		s.close();
		ss.close();
	}
	
}
