
/**    
* @Title: Dom4JUtils.java  
* @Package com.xmlDtdSchema  
* @Description: TODO(封装成一个类，主要是用来获取Document的对象；)  
* @author yijvyan  
* @date 2018年4月8日  
* @version V1.0    
*/

package com.xmlDtdSchema;

import java.io.FileOutputStream;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;


/** @ClassName: Dom4JUtils
 * @Description: TODO(工具类，方便后续的使用；)
 * @author yijvyan
 * @date 2018年4月8日 */

public class Dom4JUtils
{
	private Dom4JUtils()
	{}
	
	public static Document getDocument() throws DocumentException
	{
		SAXReader reader = new SAXReader();
		Document document = reader.read("src/com/xmlDtdSchema/cityDom.xml");
		System.out.println("<1>.输出Document的对象：" + document);
		return document;
	}
	
	//2-->to；将内存中的数据写出到XML文档中；
	public static void write2XML(Document document) throws IOException
	{
		OutputFormat format = OutputFormat.createPrettyPrint();
		//		format.setEncoding("UTF-8");//默认编码就是UTF-8;
		XMLWriter writer = new XMLWriter(new FileOutputStream("src/com/xmlDtdSchema/cityDom.xml"), format);
		writer.write(document);
	}
}
