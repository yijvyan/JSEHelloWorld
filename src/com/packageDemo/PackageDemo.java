
/**    
* @Title: PackageDemo.java  
* @Package com.packageDemo  
* @Description: TODO(包的学习)  
* @author yijvyan  
* @date 2018年3月8日  
* @version V1.0    
*/

package com.packageDemo;

import java.util.ArrayList;


//import java.util.ArrayList;

/** @ClassName: PackageDemo
 * @Description: TODO(包的特点；权限；等等；)
 * @author yijvyan
 * @date 2018年3月8日 */

public class PackageDemo
{
	
	/** @Title: main @Description: TODO(主方法) @param @param args 参数 @return void
	 * 返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("-----------------1.包的作用和特点；--------------------");
		
		//包的特点：1.可以有多层；2.不同包下的文件名可以重复；3.包的声明必须是第一行代码；
		
		System.out.println("-----------------2.不同包之间的相互访问；--------------------");
		
		//相同包下的类可以直接访问，不需要做其他的操作；
		PackageDemo pD = new PackageDemo();
		
		//不同包之间的互相访问：1.使用类的全名；2.使用关键字import将类导入；
		
		//1.类的全名：包名.类名
		java.util.ArrayList list = new java.util.ArrayList();
		
		//2.。。。import java.util.ArrayList;
		
		//import java.util.*;
		//注意：* 代表通配符，代表导入了这个包下所有的类，并没有导入子包下的类；
		
		ArrayList<Object> listPackage = new ArrayList<>();
		
	}
	
}
