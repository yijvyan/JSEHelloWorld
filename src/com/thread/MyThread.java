
/**    
* @Title: MyThread.java  
* @Package com.thread  
* @Description: TODO(线程的创建方式之一；)  
* @author yijvyan  
* @date 2018年3月30日  
* @version V1.0    
*/

package com.thread;

/** @ClassName: MyThread
 * @Description: TODO(线程的学习；)
 * @author yijvyan
 * @date 2018年3月30日 */

public class MyThread extends Thread
{
	
	/* (非 Javadoc)
	 * @see java.lang.Thread#run() */
	
	@Override
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("<1>.继承Thread类创建的线程，即：" + getName() + ":" + i);
		}
	}
}
