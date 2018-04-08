
/**    
* @Title: ReflectDemo.java  
* @Package com.reflect  
* @Description: TODO(对反射机制的学习；)  
* @author yijvyan  
* @date 2018年4月3日  
* @version V1.0    
*/

package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/** @ClassName: ReflectDemo
 * @Description: TODO(学习反射的使用；)
 * @author yijvyan
 * @date 2018年4月3日 */

public class ReflectDemo
{
	
	/** @throws ClassNotFoundException
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws NoSuchFieldException
	 * @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException
	{
		System.out.println("----------------------------1.反射机制的概述和字节码对象的获取方式；--------------------------");
		
		//反射：1.在运行时，可以获取任意一个类的所有方法和属性；
		//2.在运行时，可以让我们调用任意一个对象的所有方法和属性；
		
		//反射的前提：要获取类的对象（Class对象）；
		
		//1.通过Object的getClass()方法获取，必须要有对象；
		Student s = new Student();
		Class clazz = s.getClass();
		
		//2.通过类名获取字节码对象；
		Class clazz2 = Student.class;
		
		//3.推荐：static Class<?> forName(String className)，只要字符串就行了；
		Class<?> clazz3 = Class.forName("com.reflect.Student");
		
		System.out.println("<1.1>.由第一种和第二种方式各获取到的字节码对象，进行比较：" + (clazz == clazz2));
		System.out.println("<1.2>.由第一种和第三种方式各获取到的字节码对象，进行比较：" + (clazz == clazz3));
		System.out.println("<1.3>.由第一种方式获取的字节码对象，为：" + clazz);
		
		System.out.println("----------------------------2.通过反射获取构造方法并使用；--------------------------");
		
		//Constructor：T newInstance(Object...initargs);
		
		//通过反射获取构造方法并使用；
		
		//1.Constructor<?>[] getConstructors();返回所有的public修饰的构造方法；
		Constructor[] cs = clazz.getConstructors();
		for (int i = 0; i < cs.length; i++)
		{
			System.out.println("<1>.返回所有的public修饰的构造方法，即：" + cs[i]);
		}
		
		//2.Constructor<T> getConstructors(Class<?>...parameterTypes);根据指定对象获取构造方法；
		//可变参数 ，可以给也可以不给；
		//2.1.获取无参构造；
		Constructor c = clazz.getConstructor();
		System.out.println("<2.1.1>.根据指定对象获取构造方法；此时是无参构造的获取，即：" + c);
		Object obj = c.newInstance();
		System.out.println("<2.1.2>.由无参构造方法来获取实例（对象），即：" + obj);
		
		//2.2.获取有参构造；
		//参数1类型为String，参数2类型为int；
		Constructor cParameter = clazz.getConstructor(String.class, int.class);
		System.out.println("<2.2.1>.根据参数的字节码获取构造方法；此时是有参构造的获取，即：" + cParameter);
		//		Object objPara = cParameter.newInstance();
		Object objPara = cParameter.newInstance("Bob", 29);
		System.out.println("<2.2.2>.由有参构造方法来获取实例（对象），即：" + objPara);
		
		//3.T newInstance();直接使用字节码对象创建其表示的类的实例（对象）；
		Object objClass = clazz.newInstance();
		System.out.println("<3>.直接使用字节码对象创建其表示的类的实例（对象），即：" + objClass);
		
		System.out.println("----------------------------3.通过反射获取成员变量并使用；--------------------------");
		
		//通过反射获取成员变量并使用；
		
		//1.Field[] getFields()	：获取公共（public修饰）的成员变量；
		Field[] fs = clazz3.getFields();
		for (int i = 0; i < fs.length; i++)
		{
			System.out.println("<1>.获取公共（public修饰）的成员变量，即：" + fs[i]);
		}
		
		//2.Field[] getDeclaredFields() ：获取所有的成员变量，私有公有都可以获取到；
		Field[] fsD = clazz3.getDeclaredFields();
		for (int i = 0; i < fsD.length; i++)
		{
			System.out.println("<2>.获取所有的成员变量，私有公有都可以获取到，即：" + fsD[i]);
		}
		
		//3.Field getField(String name) ：根据字段名称获取公共（public修饰）的字段对象；
		//		Field f = clazz3.getField("name");
		Field fAge = clazz3.getField("age");//获取成员变量对象；
		System.out.println("<3>.根据字段名称获取公共（public修饰）的字段对象，即：" + fAge);
		
		//5.void set(Object obj, Object value) ：
		//将指定（学生）对象变量上此Field对象（f）表示的字段（age）设置为指定的新值；
		fAge.set(objClass, 29);
		
		//4.Object get(Object obj) ：根据对象获取成员变量的值；
		Object age = fAge.get(objClass);
		//		System.out.println("<4>.根据（学生）对象获取成员变量（age）的值（已经进行了显示初始化），即：" + age);
		System.out.println("<4>.根据（学生）对象获取成员变量（age）的值（此时已经重新设定），即：" + age);
		
		System.out.println("----------------------------4.通过反射获取私有成员变量并使用；--------------------------");
		
		//通过反射获取私有成员变量并使用；
		//1.Field getDeclaredField(String name) ：获取私有的字段对象；
		Field fName = clazz3.getDeclaredField("name");
		System.out.println("<1>.获取私有的字段对象（name），即：" + fName);
		
		//3.设置反射时取消Java的访问检查，即暴力反射；取消后，就能愉快地使用私有变量了；
		fName.setAccessible(true);
		
		//4.取消后，再更新私有变量的值；
		fName.set(objClass, "Christina");
		
		//2.输出私有变量初始值；
		Object name = fName.get(objClass);
		//		System.out.println("<2>.输出字段对象对应的（学生对象）的私有变量（初始值），即：" + name);
		System.out.println("<2>.输出字段对象对应的（学生对象）的私有变量（已重新赋值），即：" + name);
		
		System.out.println("----------------------------5.通过反射获取成员方法并使用；--------------------------");
		
		//通过反射获取成员方法并使用；
		//		Method getMethod(String name, Class<?> ... parameterTypes);
		
		//4.Method ：Method的方法，去执行指定（学生）对象的（通过getMethod获取到的，有参传参，无参不传）方法；
		//		Object invoke(Object obj, Object ... args);
		
		//1.获取无参无返回值的方法；
		Method m = clazz3.getMethod("method");
		m.invoke(objClass);
		
		//2.获取有参无返回值的方法；
		Method mPara = clazz3.getMethod("setName", String.class);
		mPara.invoke(objClass, "Danny");
		System.out.println("<2>.获取有参无返回值的（setName）方法并执行此方法，同时传入所需参数，即（学生）对象为：" + objClass);
		
		//3.获取无参有返回值的方法；
		Method mReturn = clazz3.getMethod("getName");
		Object iName = mReturn.invoke(objClass);
		System.out.println("<3>.获取无参有返回值的（getName）方法，接收返回值，即返回值：" + iName);
		
	}
	
}
