
/**    
* @Title: MyException.java  
* @Package com.exception  
* @Description: TODO(自定义异常的学习；)  
* @author yijvyan  
* @date 2018年3月17日  
* @version V1.0    
*/

package com.exception;

/** @ClassName: MyException
 * @Description: TODO(运行时异常和编译时异常；)
 * @author yijvyan
 * @date 2018年3月17日 */

public class MyException extends /* RuntimeException */ Exception
{
	
	/** 创建一个新的实例 MyException. */
	
	public MyException()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	/** 创建一个新的实例 MyException.
	 * 
	 * @param message
	 */
	
	public MyException(String message)
	{
		super(message);
		// TODO Auto-generated constructor stub
	}
	//	public MyException()
	//	{
	//		super();
	//	}
	//	
	//	public MyException(String s)
	//	{
	//		super(s);
	//	}
}
