
/**    
* @Title: ExceptionDemo.java  
* @Package com.exception  
* @Description: TODO(异常处理的学习；)  
* @author yijvyan  
* @date 2018年3月15日  
* @version V1.0    
*/

package com.exception;

import java.io.FileWriter;
import java.io.IOException;


/** @ClassName: ExceptionDemo
 * @Description: TODO(异常的分类和处理；)
 * @author yijvyan
 * @date 2018年3月15日 */

public class ExceptionDemo
{
	
	/** @throws IOException
	 * @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("----------------------------1.异常的概述和体系结构；-----------------------------");
		
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//at com.exception.ExceptionDemo.main(ExceptionDemo.java:28)
		//写代码时，经常出现的一些小问题，为方便去处理这些问题，java为此提供了异常机制；
		
		//异常包含了错误的类型，原因以及位置；
		
		//异常：不正常，写代码时出现的编译或运行时的错误；
		//异常的体系结构：
		//          Throwable(最顶层)：
		//                 Error：出现的不能处理的严重问题；（电脑坏了：系统中毒；重装系统。）
		//                 Exception：可以处理的问题；         （电脑坏了：主板坏了；只能拿去维修店换了。）
		
		//		int a = 10 / 0;
		//		System.out.println(a);
		
		//		FileWriter fw = new FileWriter("a.txt");
		
		System.out.println("----------------------------2.jvm处理异常的方式和try...catch处理异常；-----------------------------");
		
		//jvm处理异常的方式：1.若出现异常未被处理，jvm会自动处理，会将异常的类型，原因还有位置显示在命令行；
		//2.并且终止了异常，异常后面的代码将不再执行；
		
		//异常的处理方式：1.捕获处理：try...catch语句；
		//                try{
		//                      有可能出现问题的代码；
		//                } catch(ArithmeticException ae)  {
		//                      处理异常；
		//                }；
		//             try...catch的执行顺序：1.首先执行try语句；
		//2.若发现异常，异常下面的代码不再执行，直接跳入catch语句中，catch语句结束后，整个try...catch结束；
		//3.若没发现异常，try语句执行结束后，try...catch直接结束，不再执行catch语句；
		
		try
		{
			System.out.println("try语句中，异常出现之前的代码；");
			System.out.println(2 / 0);
			System.out.println("try语句中，异常出现之后的代码；");
		}
		catch (ArithmeticException e)
		{
			System.out.println("catch语句中，异常：除数不能为0；");
		}
		
		System.out.println("捕获异常后，执行异常下面的代码；");
		
		System.out.println("----------------------------3.异常的抛出；-----------------------------");
		
		//异常的处理方式：2.抛出去：
		//       <1>.当我们不想处理异常，或者没有能力处理的时候，可以选择抛出异常，谁调用方法谁处理异常；
		//       <2>.使用关键字throws在方法的声明处抛异常；
		
		function();
		
		System.out.println("----------------------------4.如何处理多个异常；-----------------------------");
		
		//如何处理多个异常：1.可以使用多个try...catch语句；2.使用一个try和多个catch；
		
		//多个catch之间的顺序：1.多个catch之间可以有子父类；2.平级之间没有顺序关系；
		//3.如果有子父类，父类异常必须放在后面；
		
		//		exceptionMethod();
		
		try
		{
			//			String s = null;
			//			System.out.println(s.length());
			
			//			int[] arr = new int[5];
			//			System.out.println(arr[8]);
			
			System.out.println(2 / 0);
		}
		//		catch (Exception e)
		//		{
		//			System.out.println("<3>.出现异常了；");
		//		}
		catch (NullPointerException e)
		{
			System.out.println("<1>.出现空指针（异常）了；");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("<2>.出现数组越界（异常）了；");
		}
		catch (Exception e)
		{
			System.out.println("<3>.出现异常了；");
		}
		
		//		try
		//		{
		//			
		//		}
		//		catch (ArrayIndexOutOfBoundsException e)
		//		{
		//			System.out.println("<2>.出现数组越界（异常）了；");
		//		}
		
		System.out.println("----------------------------5.Throwable的常用方法；-----------------------------");
		
		//Throwable的常用方法：
		
		try
		{
			System.out.println(2 / 0);
		}
		catch (ArithmeticException e)
		{
			//1.String getMessage() ：原因 ；
			System.out.println("自定义异常处理：<1>.getMessage()方法，输出原因：" + e.getMessage());
			
			//2.String toString() ：类型和原因；
			System.out.println("自定义异常处理：<2>.toString()方法，输出类型和原因：" + e.toString());
			
			//3.void printStackTrace() : 类型原因和位置；
			//			e.printStackTrace();
		}
		
		System.out.println("----------------------------6.finally的概述和应用场景；-----------------------------");
		
		//finally：组合try...catch使用，用于释放资源等收尾工作，无论try...catch语句如何执行，finally的代码一定会执行；
		
		//try{
		//   有可能出现问题的代码；
		//} catch(异常对象) {
		//   处理异常；
		//} finally {
		//   释放资源；
		//   清理垃圾；
		//}
		
		arithmeticExceMethod();
		
		//		FileWriter fW;
		FileWriter fW = null;
		try
		{
			//			FileWriter fW = new FileWriter("exception.txt");
			//			System.out.println(2 / 0);
			fW = new FileWriter("exception.txt");
			fW.write("1.异常处理，finally语句的执行情况；");
			fW.write("2.遇到读写文本的处理思路，不再抛出去，而是自己去处理；");
			//			System.out.println(2 / 0);
			fW.write("3.如果上面遇到处理异常了，在这就不执行了；");
			//			fW.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			//释放资源
			try
			{
				if (fW != null)
				{
					
					fW.close();
				}
				//				fW.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		System.out.println("----------------------------7.异常的分类；-----------------------------");
		
		//异常的分类：1.运行时期异常：RuntimeException的子类就是运行时期异常，在编译时期可以自由选择处理或者不处理；
		//2.编译时期异常：是Exception的子类，非RuntimeException的子类，在编译时期必须处理；
		
		//1.
		//		System.out.println(2/0);
		//		String s = null;
		//		System.out.println(s.length());
		
		//2.
		try
		{
			FileWriter fWriter = new FileWriter("excNotRuntime.txt");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("----------------------------8.自定义异常；-----------------------------");
		
		//需求：写一个方法，接受考试成绩，若考试成绩的范围在0-100之间则属正常，否则属于异常；
		
		//throws：处理异常的一种方式，把异常抛出，由调用者来处理；（在方法处抛出；）
		//throw ：制造异常的方式，并且结束方法；（自己定义的逻辑；）
		
		//注意：若制造（throw）的是编译时期的异常，必须在方法声明处抛出（throws）；
		
		//自定义异常：定义一个类去继承Exception或者RuntimeException，然后实现 多个构造即可；
		
		boolean flag = checkScore(110);
		System.out.println("<1>.分数110是否符合范围：" + flag);
		
		//		checkScoreExce(110);
		try
		{
			checkScoreExce(110);
		}
		catch (Exception e)
		{
			//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		//		checkScoreExce(110);
		
	}
	
	public static void checkScoreExce(int score) throws Exception
	{
		if (score < 0 || score > 100)
		{
			//			throw new RuntimeException(); 
			//			throw new RuntimeException("<2>.考试成绩不符合要求；（运行时异常）；");
			//			throw new Exception("<2>.考试成绩不符合要求；（编译时异常）；");
			
			//			throw new MyException("<2>.考试成绩不符合要求；（运行时异常）；");
			throw new MyException("<2>.考试成绩不符合要求；（编译时异常）；");
		}
		
		System.out.println("<2>.考试成绩符合要求；");
	}
	
	public static boolean checkScore(int score)
	{
		//判断考试成绩是否符合范围，若不符合则返回false；
		if (score < 0 || score > 100) { return false; }
		
		//符合；
		return true;
	}
	
	/** @Title: arithmeticExceMethod @Description: TODO(这里用一句话描述这个方法的作用) @param
	 *         参数 @return void 返回类型 @throws */
	
	private static void arithmeticExceMethod()
	{
		try
		{
			System.out.println(2 / 0);
		}
		catch (ArithmeticException e)
		{
			System.out.println("catch语句异常处理：除数不能为0（异常）；");
		}
		finally
		{
			System.out.println("finally语句肯定执行：清理垃圾；");
		}
	}
	
	/** @Title: exceptionMethod @Description: TODO(两个异常处理抽取成了方法；) @param
	 *         参数 @return void 返回类型 @throws */
	
	private static void exceptionMethod()
	{
		try
		{
			String s = null;
			System.out.println(s.length());
		}
		catch (NullPointerException e)
		{
			System.out.println("<1>.出现空指针（异常）了；");
		}
		
		try
		{
			int[] arr = new int[5];
			System.out.println(arr[8]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("<2>.出现数组越界（异常）了；");
		}
	}
	
	public static void function() throws IOException
	{
		FileWriter fW = new FileWriter("exception.txt");
	}
	
}
