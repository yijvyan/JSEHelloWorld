
/**    
* @Title: ScannerDemoInput.java  
* @Package com.scanner  
* @Description: TODO(关于键盘录入的使用)  
* @author yijvyan  
* @date 2018年2月4日  
* @version V1.0    
*/

package com.scanner;

import java.util.Scanner;


/** @ClassName: ScannerDemoInput
 * @Description: TODO(基本的键盘录入)
 * @author yijvyan
 * @date 2018年2月4日 */

public class ScannerDemoInput
{
	
	/** @Title: main @Description: TODO(键盘录入主方法) @param @param args 参数 @return
	 *         void 返回类型 @throws */
	
	public static void main(String[] args)
	{
		/* Scanner sc = new Scanner(System.in);
		 * System.out.println("Please Input Number: "); int i = sc.nextInt();
		 * System.out.println("i: " + i); */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Input First Number: ");
		int a = sc.nextInt();
		
		System.out.println("Please Input Second Number: ");
		int b = sc.nextInt();
		
		int sum = a + b;
		System.out.println("sum： " + sum);
		
		//		boolean flag = (a == b) ? true : false;
		boolean flag = (a == b);
		System.out.println("flag: " + flag);
		
		System.out.println("Please Input Third Number: ");
		int c = sc.nextInt();
		
		int temp = (a > b) ? a : b;
		int max = (temp > c) ? temp : c;
		System.out.println("max: " + max);
		
		//获取键盘录入的字符串数据
		System.out.println("请输入一个字符串数据: ");
		
		/* Scanner类的next()，只读取实际的字符串，就是不读enter，空格，换行tab，
		 * 当然这里指的是在实际字符串之前出现的enter，空格，换行tab，之后的话逗是视为结束， 输入h l会只输出h而无l */
		//		String s = sc.next(); 
		
		/* ，此题中因为有int c = sc.nextInt()，最后以enter键结尾， 所以使用sc.next()可以读取到完整的字符串，
		 * 而sc.nextLine()只要读到enter键就结束，不管是之前还是之后，
		 * 由于sc.nextInt()最后以enter键结尾，则sc.nextLine()在字符串之前读到了，
		 * 就会直接结束，而不管后面的实际的字符串，若还要使用sc.nextLine()的话，
		 * 那就把上面遗留的enter先用nextLine()读完，让真实字符串前面无enter就行，
		 * 最后再次使用nextLine()就能正常读了 */
		sc.nextLine();
		String s = sc.nextLine();
		System.out.println("s: " + s);
	}
	
}
