
/**    
* @Title: ThreadDemo.java  
* @Package com.thread  
* @Description: TODO(多线程的学习；)  
* @author yijvyan  
* @date 2018年3月29日  
* @version V1.0    
*/

package com.thread;

/** @ClassName: ThreadDemo
 * @Description: TODO(多线程的实现以及应用；)
 * @author yijvyan
 * @date 2018年3月29日 */

public class ThreadDemo
{
	
	/** @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("-----------------------------1.多线程的概述；-------------------------");
		
		//多线程的概述；
		//进程：当前正在运行的程序，一个应用程序在内存中的执行区域；
		//线程：进程中的一个执行控制单元，执行路径；
		
		//一个进程可以有一个线程，也可以有多个线程；
		
		//单线程：安全性高，但是效率低；
		//多线程：安全性低，效率高；
		
		//多线程案例：360，迅雷等；
		
		System.out.println("-----------------------------2.多线程的实现方式1；-------------------------");
		
		//多线程的实现方式：
		//			方式一：1.将类声明为Thread的子类；	2.该子类应重写Thread类的run方法；
		//				  3.分配并启动该子类的实例；
		
		//Thread	1.String  getName()		返回该线程的名称；
		//			2.void	  setName(String name)		改变线程名称，使之与参数name相同；
		
		//CPU执行程序的随机性；
		
		//1.创建线程实例1；
		MyThread mt = new MyThread();
		
		//1.1.修改线程1的名字；
		mt.setName("这是线程一A");
		
		//2.启动线程1；
		mt.start();
		
		//1.创建线程实例2；
		MyThread mt2 = new MyThread();
		
		//1.1.修改线程2的名字；
		mt2.setName("这是线程二B");
		
		//2.启动线程2；
		mt2.start();
		
		System.out.println("-----------------------------3.主方法是单线程的；-------------------------");
		
		//主方法中代码的执行是单线程的；
		method();
		function();
		
		System.out.println("-----------------------------4.多线程的实现方式2；-------------------------");
		
		//多线程的实现方式二：1.创建声明实现Runnable接口的类；
		//2.该类实现run方法；	3.分配该类的实例；
		//4.在创建Thread时作为一个参数来传递并启动；
		
		//Thread(Runnable target)：创建线程的构造方法；
		//static Thread currentThread() ：返回当前线程对象；
		
		//		threadRunnable();
		
		threadRunnableOne();
		
		System.out.println("-----------------------------5.多线程模拟火车站售票出现问题；-------------------------");
		
		//模拟火车站售票		分析：1.首先要有火车票的总数量，每售出一张则数量减一；
		//2.当火车票的数量小于1的时候，停止售票；	3.使用多线程模拟多个窗口进行售票；
		//4.当火车票全部售完，火车站也一样敞开大门欢迎我们；
		
		//static void sleep(long millis)：让当前线程睡一会；
		
		//1.创建线程对象；
		TicketThread tt = new TicketThread();
		
		Thread t = new Thread(tt);
		t.setName("售票窗口1");
		Thread t2 = new Thread(tt);
		t2.setName("售票窗口2");
		Thread t3 = new Thread(tt);
		t3.setName("售票窗口3");
		
		//2.启动线程对象；
		t.start();
		t2.start();
		t3.start();
		
		System.out.println("-----------------------------6.分析火车站售票出现问题的原因；-------------------------");
		System.out.println("-----------------------------7.同步方法；-------------------------");
	}
	
	/** @Title: threadRunnableOne @Description:
	 *         TODO(创建了一个实现Runnable接口的类的子类对象，然后再创建两个线程实例时可以共用；) @param
	 *         参数 @return void 返回类型 @throws */
	
	private static void threadRunnableOne()
	{
		//1.创建线程实例；
		//		MTRunnable mtR = new MTRunnable();
		MTRunnable mtR = new MTRunnable(300);
		Thread tR = new Thread(mtR);
		tR.setName("这是线程三C");
		
		//2.启动线程；
		tR.start();
		
		//1.创建线程实例；
		//		MTRunnable mtR2 = new MTRunnable();
		Thread tR2 = new Thread(mtR);
		tR2.setName("这是线程四D");
		
		//2.启动线程；
		tR2.start();
	}
	
	/** @Title: threadRunnable @Description:
	 *         TODO(创建了两个实现Runnable接口的类的子类对象；) @param 参数 @return void
	 *         返回类型 @throws */
	
	private static void threadRunnable()
	{
		//1.创建线程实例；
		//		MTRunnable mtR = new MTRunnable();
		MTRunnable mtR = new MTRunnable(100);
		Thread tR = new Thread(mtR);
		tR.setName("这是线程三C");
		
		//2.启动线程；
		tR.start();
		
		//1.创建线程实例；
		//		MTRunnable mtR2 = new MTRunnable();
		MTRunnable mtR2 = new MTRunnable(200);
		Thread tR2 = new Thread(mtR2);
		tR2.setName("这是线程四D");
		
		//2.启动线程；
		tR2.start();
	}
	
	public static void method()
	{}
	
	public static void function()
	{}
}
