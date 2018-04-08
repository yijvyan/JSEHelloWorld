
/**    
* @Title: PropertiesIODemo.java  
* @Package com.ioStream  
* @Description: TODO(属性集和IO流结合使用；)  
* @author yijvyan  
* @date 2018年3月29日  
* @version V1.0    
*/

package com.ioStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;


/** @ClassName: PropertiesIODemo
 * @Description: TODO(和打印流结合使用；)
 * @author yijvyan
 * @date 2018年3月29日 */

public class PropertiesIODemo
{
	
	/** @throws IOException
	 * @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("--------------------------1.Properties和IO流结合的功能；-----------------------");
		
		//Properties和IO流结合的功能；
		//1.void list(PrintWriter out)；只能接收打印流；
		//2.void load(Reader reader)；输入流；
		//3.void store(Writer writer, String comments)；输出流；comments表示对输出后的文本的描述；
		
		propList();
		
		propLoad();
		
		propStore();
		
	}
	
	/** @Title: propStore @Description:
	 *         TODO(属性集合的store方法输出数据到文本文件，使用输出流，还可以加上描述；) @param @throws
	 *         IOException 参数 @return void 返回类型 @throws */
	
	private static void propStore() throws IOException
	{
		//1.创建属性列表对象；
		Properties prop = new Properties();
		
		//2.添加映射关系；
		prop.setProperty("Alice", "28");
		prop.setProperty("Bob", "29");
		prop.setProperty("Christina", "27");
		
		//3.创建输出流对象；
		FileWriter fw = new FileWriter("propertiesFileWriter.txt");
		//void store(Writer writer, String comments)；输出流；
		//		prop.store(fw, null);
		prop.store(fw, "ISO-8859-1:hello World,explain 解释;");
		
		//4.释放资源；
		fw.close();
	}
	
	/** @Title: propLoad @Description:
	 *         TODO(通过属性集合的load方法加载输入流对象获取数据；) @param @throws
	 *         FileNotFoundException @param @throws IOException 参数 @return void
	 *         返回类型 @throws */
	
	private static void propLoad() throws FileNotFoundException, IOException
	{
		//1.创建属性列表对象；
		Properties prop = new Properties();
		
		//2.创建一个输入流对象；
		FileReader fr = new FileReader("propertiesPrintWriter.txt");
		
		//3.void load(Reader reader)；输入流；
		prop.load(fr);
		
		//4.释放资源；
		fr.close();
		
		System.out.println("通过属性集合的load方法加载输入流对象获取数据，即：" + prop);
	}
	
	/** @Title: propList @Description: TODO(属性集合输出到文本文件，使用打印流输出；) @param @throws
	 *         FileNotFoundException 参数 @return void 返回类型 @throws */
	
	private static void propList() throws FileNotFoundException
	{
		//1.创建属性列表对象；
		Properties prop = new Properties();
		
		//2.添加映射关系；
		prop.setProperty("Alice", "28");
		prop.setProperty("Bob", "29");
		prop.setProperty("Christina", "27");
		
		//3.创建打印流对象；
		PrintWriter out = new PrintWriter("propertiesPrintWriter.txt");
		//void list(PrintWriter out)；只能接收打印流；
		prop.list(out);
		
		//4.释放资源；
		out.close();
	}
	
}
