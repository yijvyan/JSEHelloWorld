
/**    
* @Title: RegexDemo.java  
* @Package com.classAPI  
* @Description: TODO(正则表达式的学习；)  
* @author yijvyan  
* @date 2018年3月12日  
* @version V1.0    
*/

package com.classAPI;

/** @ClassName: RegexDemo
 * @Description: TODO(用来匹配校验字符串，是否符合特定规则；)
 * @author yijvyan
 * @date 2018年3月12日 */

public class RegexDemo
{
	
	/** @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("-----------------------1.正则表达式的概述；----------------------");
		
		//校验QQ号：1.要求必须是5-15位； 2. 0不能开头；    3.必须都是数字；
		String qq = "012345";
		//		String qq = "123a45";
		//		String qq = "12345789";
		//		boolean flag = checkQQ(qq);
		
		boolean flag = qq.matches("[1-9][0-9]{4,14}");
		
		System.out.println("qq号是否合规：" + flag);
		
		//正则表达式：一套规则，用于匹配字符串；
		//boolean matches(String regex)：判断当前字符串是否匹配指定的正则表达式，若匹配返回true，否则false；
		
		System.out.println("-----------------------2.判断字符串“qaq”中间的字符是否是元音；----------------------");
		
		//判断字符串“qaq”中间的字符是否是元音：aeiou AEIOU
		//		boolean bool = check("qaq");
		boolean bool = checkRegex("qaq");
		System.out.println("字符串“qaq”中间的字符是否是元音：" + bool);
		
		System.out.println("-----------------------3.切割字符串；----------------------");
		
		//切割字符串：“aa,bb,cc”   “-1 99 4 23”  “-1   99 4     23”
		//String[] split(String regex)：根据给定正则表达式的匹配拆分此字符串
		
		splitComma();
		
		splitBlank();
		
	}
	
	/** @Title: splitBlank @Description: TODO(按空格分割字符串；) @param 参数 @return void
	 * 返回类型 @throws */
	
	private static void splitBlank()
	{
		//		String str = "-1 99 4 23";
		String str = "-1  99 4     23";
		//		String[] array = str.split(" ");
		String[] array = str.split(" +");
		printArr(array);
	}
	
	/** @Title: splitComma @Description: TODO(按逗号分割字符串；) @param 参数 @return void
	 *         返回类型 @throws */
	
	private static void splitComma()
	{
		String str = "aa,bb,cc";
		String[] array = str.split(",");
		printArr(array);
	}
	
	//遍历数组
	public static void printArr(String[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
	
	public static boolean checkRegex(String s)
	{
		return s.matches("\\w[aeiouAEIOU]\\w");
	}
	
	public static boolean check(String s)
	{
		//转换成小写字母，提高效率
		s.toLowerCase();
		
		char ch = s.charAt(1);
		
		//方式一：用字符来判断；
		//		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { return true; }
		//		return false;
		
		//方式二：用字符串来判断，是否包含元音；
		String str = "aeiou";
		return str.contains(ch + "");
	}
	
	/** @Title: checkQQ @Description: TODO(校验QQ号是否合规；) @param 参数 @return boolean
	 *         返回类型 @throws */
	
	public static boolean checkQQ(String qq)
	{
		int length = qq.length();
		
		//1.要求必须是5-15位；
		if (length < 5 || length > 15) { return false; }
		
		//2.0不能开头；
		if (qq.startsWith("0")) { return false; }
		
		//3.必须都是数字；
		for (int i = 0; i < length; i++)
		{
			//得到每一个字符；
			char c = qq.charAt(i);
			if (c < '0' || c > '9') { return false; }
		}
		
		//符合要求；
		return true;
	}
	
}
