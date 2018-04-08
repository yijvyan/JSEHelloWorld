
/**    
* @Title: Cat.java  
* @Package com.innerClass  
* @Description: TODO(作为参数传递的类；)  
* @author yijvyan  
* @date 2018年3月11日  
* @version V1.0    
*/

package com.innerClass;

/** @ClassName: Cat
 * @Description: TODO(实现Animal接口，然后new对象传递；)
 * @author yijvyan
 * @date 2018年3月11日 */

public class Cat implements Animal
{
	
	/* (非 Javadoc)
	 * @see com.innerClass.Animal#eat() */
	
	@Override
	public void eat()
	{
		System.out.println("实现Animal接口，作为参数传递，重写eat方法，猫吃鱼；");
		
	}
	
}
