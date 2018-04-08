
/**    
* @Title: TicketThread.java  
* @Package com.thread  
* @Description: TODO(多线程的案例学习，创建一个实现Runnable接口的类；)  
* @author yijvyan  
* @date 2018年3月30日  
* @version V1.0    
*/

package com.thread;

/** @ClassName: TicketThread
 * @Description: TODO(用来创建多个线程的类；)
 * @author yijvyan
 * @date 2018年3月30日 */

//问题出现的原因：1.有多个线程；2.有被多个线程所共享的数据；3.多个线程并发的访问共享的数据；

//例子：在火车上上厕所，1.张三来了，一看门是绿的，他就进去了，把门锁上了，门就变红了；
//2.李四来了，一看门是红的，他就只能憋着；	3.张三用完了厕所，把锁打开了，门就变成了绿色；
//4.李四一看门变绿了，他就进去了，把门锁上，门就变红了；		5.王五来了，一看门是红色的，他也只能憋着；
//6.李四用完了厕所，把锁打开了，肚子又不舒服了，扭头回去了，又把门锁上了；

//synchronized：1.同步（锁），可以修饰代码块和方法。
//2.被修饰的代码块和方法一旦被某个线程访问，则直接锁住，其他的线程将无法访问；

//解决方式一：同步代码块：		synchronized(锁对象){
//							}

//注意：锁对象需要被所有的线程所共享；

//同步：安全性高，效率低；
//非同步：效率高，但是安全性低；

//解决方式二：同步方法：1.使用关键字synchronized修饰的方法；
//2.一旦被一个线程访问，则整个方法全部锁住，其他线程无法访问；

//synchronized：注意：	1.非静态同步方法的锁对象是this；
//						2.静态的同步方法的锁对象是当前类的字节码对象；

public class TicketThread implements Runnable
{
	
	//	int		tickets	= 100;																								//火车票的数量；
	static int	tickets	= 100;																																	//火车票的数量；
	Object		obj		= new Object();
	
	/* (非 Javadoc)
	 * @see java.lang.Runnable#run() */
	
	@Override
	public void run()
	{
		//1.出售火车票；
		while (true)
		{
			//1.同步代码块；
			//			synchronized (obj)
			//			{
			//				nonSyncSell();
			//			}
			
			//2.非静态的同步方法；
			//			syncSellNonStatic();
			
			//3.静态的同步方法；
			syscSellStatic();
		}
	}
	
	/** @Title: syscSellStatic @Description: TODO(3.静态的同步方法解决问题；) @param
	 *         参数 @return void 返回类型 @throws */
	
	private static synchronized void syscSellStatic()
	{
		//2.当火车票数量小于0张时，则停止售票；
		if (tickets > 0)
		{
			//线程t1,t2,t3；
			//1.假设只剩一张票；
			//2.t1判断有票，就进入了if语句中了，此时遇到sleep方法，就去休息了一会儿；
			//3.t2也判断有票，就也进入了if语句中了，此时也遇到sleep方法，就也去休息了一会儿；
			
			//4.t1休息完后，开始售票：tickets = 0；
			//5.t2也休息完后，也开始售票：tickets = -1；
			
			try
			{
				Thread.sleep(100);
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName() + ":" + tickets--);
		}
	}
	
	/** @Title: syncSellNonStatic @Description: TODO(2.非静态的同步方法来解决问题；) @param
	 *         参数 @return void 返回类型 @throws */
	
	private synchronized void syncSellNonStatic()
	{
		//2.当火车票数量小于0张时，则停止售票；
		if (tickets > 0)
		{
			//线程t1,t2,t3；
			//1.假设只剩一张票；
			//2.t1判断有票，就进入了if语句中了，此时遇到sleep方法，就去休息了一会儿；
			//3.t2也判断有票，就也进入了if语句中了，此时也遇到sleep方法，就也去休息了一会儿；
			
			//4.t1休息完后，开始售票：tickets = 0；
			//5.t2也休息完后，也开始售票：tickets = -1；
			
			try
			{
				Thread.sleep(100);
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName() + ":" + tickets--);
		}
	}
	
	/** @Title: nonSyncSell @Description: TODO(1.使用同步代码块的方式解决问题；) @param
	 *         参数 @return void 返回类型 @throws */
	
	private void nonSyncSell()
	{
		//2.当火车票数量小于0张时，则停止售票；
		if (tickets > 0)
		{
			//线程t1,t2,t3；
			//1.假设只剩一张票；
			//2.t1判断有票，就进入了if语句中了，此时遇到sleep方法，就去休息了一会儿；
			//3.t2也判断有票，就也进入了if语句中了，此时也遇到sleep方法，就也去休息了一会儿；
			
			//4.t1休息完后，开始售票：tickets = 0；
			//5.t2也休息完后，也开始售票：tickets = -1；
			
			try
			{
				Thread.sleep(100);
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName() + ":" + tickets--);
		}
	}
	
}
