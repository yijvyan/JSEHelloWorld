
/**    
* @Title: MTRunnable.java  
* @Package com.thread  
* @Description: TODO(创建线程的方式之二，实现Runnable接口；)  
* @author yijvyan  
* @date 2018年3月30日  
* @version V1.0    
*/

package com.thread;

/** @ClassName: MTRunnable
 * @Description: TODO(创建一个线程；)
 * @author yijvyan
 * @date 2018年3月30日 */

public class MTRunnable implements Runnable
{
	int num;
	
	/* (非 Javadoc)
	 * @see java.lang.Runnable#run() */
	
	/** 创建一个新的实例 MTRunnable.
	 * 
	 * @param num
	 */
	
	public MTRunnable(int num)
	{
		super();
		this.num = num;
	}
	
	@Override
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			//获取当前线程；
			//			Thread t = Thread.currentThread();
			//			System.out.println("<2>.实现Runnable接口创建的线程，即：" + t.getName() + ":" + i);
			
			//链式编程；
			//			System.out.println("<2>.实现Runnable接口创建的线程，即：" + Thread.currentThread().getName() + ":" + i);
			System.out.println("<2>.实现Runnable接口创建的线程，即：" + Thread.currentThread().getName() + ":" + i + "，此时输出成员变量num为：" + num);
		}
	}
	
}
