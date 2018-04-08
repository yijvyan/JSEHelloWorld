
/**    
* @Title: Dom4JDemo.java  
* @Package com.xmlDtdSchema  
* @Description: TODO(使用Dom4J来解析XML；)  
* @author yijvyan  
* @date 2018年4月7日  
* @version V1.0    
*/

package com.xmlDtdSchema;

import java.io.IOException;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;


/** @ClassName: Dom4JDemo
 * @Description: TODO(解析cityDom.xml文档；)
 * @author yijvyan
 * @date 2018年4月7日 */

public class Dom4JDemo
{
	
	/** @throws DocumentException
	 * @throws IOException
	 * @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args) throws DocumentException, IOException
	{
		System.out.println("-------------------------1.Dom4J的方法概述；-----------------------");
		
		//Dom4J的常用方法：	1.Document：		Element getRootElement()：获取根元素对象（根标签）；
		//		2.Element	2.1.List elements()：获取所有的子元素；
		//	2.2.List elements(String name)：根据指定的元素名称来获取相应的所有的子元素；
		//  2.3.Element	element(String name)：根据指定的元素名称来获取子元素对象；如果元素名称重复，则获取第一个元素；
		//	2.4.String elementText(String name)：根据指定的子元素名称，来获取子元素中的文本；
		//	2.5.String getText()：获取当前元素对象的文本；
		//	2.6.void setText(String text)：设置当前元素对象的文本；
		//	2.7.String attributeValue(String name)：根据指定的属性名称获取其对应的值；
		//	2.8.public Element addAttribute(String name,String value)：根据指定的属性名称和值进行添加或者修改；
		//	2.9.Element addElement(String name)：添加元素；
		//	3.DocumentHelper：		static Element createElement(String name)：创建元素；
		
		System.out.println("-------------------------2.Dom4J的案例（获取）；-----------------------");
		
		//1.得到某个具体的节点内容：打印“郑州”；
		//		SAXReader reader = new SAXReader();
		//		Document document = reader.read("src/com/xmlDtdSchema/cityDom.xml");
		//		System.out.println("<1>.输出Document的对象：" + document);
		
		getCityName();
		
		System.out.println("-------------------------------------------------");
		//2.遍历所有的元素节点：打印他们的元素名称；
		
		getAllElementName();
		
		System.out.println("-------------------------3.Dom4J的案例（修改和删除）；-----------------------");
		//3.修改某个元素节点的主体内容：信阳-->安阳；
		
		//		updateElementText();
		
		System.out.println("-------------------------------------------------");
		//6.删除指定元素节点：删除元素开封；
		
		//		deleteElement();
		
		System.out.println("-------------------------4.Dom4J的案例（添加）；-----------------------");
		//4.向指定元素节点中增加子元素节点：添加一个新城市<City>南阳</City>；
		
		//		addElement();
		
		System.out.println("-------------------------------------------------");
		//5.向指定元素节点上增加同级元素节点：在洛阳前面，添加一个<City>三门峡</City>；
		
		//		addElementDesignated();
		
		System.out.println("-------------------------5.Dom4J的案例（属性获取和添加）；-----------------------");
		//7.操作XML文件属性：打印State的Name；
		
		getAttributeName();
		
		System.out.println("-------------------------------------------------");
		//8.添加属性：State：GDP=“99999亿”；
		
		//		addAttribute();
		
	}
	
	/** @Title: addAttribute @Description:
	 * TODO(8.添加属性：State：GDP=“99999亿”；) @param @throws
	 * DocumentException @param @throws IOException 参数 @return void
	 * 返回类型 @throws */
	
	private static void addAttribute() throws DocumentException, IOException
	{
		//1.获取Document的对象；
		Document document = Dom4JUtils.getDocument();
		//2.获取根元素；
		Element rootElement = document.getRootElement();
		//3.添加新的属性和对应的值；
		rootElement.addAttribute("GDP", "99999亿");
		//4.写回文件；
		Dom4JUtils.write2XML(document);
	}
	
	/** @Title: getAttributeName @Description:
	 *         TODO(7.操作XML文件属性：打印State的Name；) @param @throws DocumentException
	 *         参数 @return void 返回类型 @throws */
	
	private static void getAttributeName() throws DocumentException
	{
		//1.获取Document的对象；
		Document document = Dom4JUtils.getDocument();
		//2.获取根元素；
		Element rootElement = document.getRootElement();
		//3.根据属性名称获取值；
		String value = rootElement.attributeValue("Name");
		//4.输出；
		System.out.println("<4>.操作XML文件属性：打印State的Name；即：" + value);
	}
	
	/** @Title: addElementDesignated @Description:
	 *         TODO(5.向指定元素节点上增加同级元素节点：在洛阳前面，添加一个<City>三门峡</City>；) @param @throws
	 *         DocumentException @param @throws IOException 参数 @return void
	 *         返回类型 @throws */
	
	private static void addElementDesignated() throws DocumentException, IOException
	{
		//1.创建一个新的元素对象；
		Element cityElement = DocumentHelper.createElement("City");
		//2.设置文本；
		cityElement.setText("三门峡");
		//3.获取Document的对象；
		Document document = Dom4JUtils.getDocument();
		//4.获取根元素；
		Element rootElement = document.getRootElement();
		//5.获取根元素下的所有子元素；
		List<Element> es = rootElement.elements();
		//6.将新的元素添加到子元素列表中；
		es.add(1, cityElement);
		//7.写回文件；
		Dom4JUtils.write2XML(document);
	}
	
	/** @Title: addElement @Description:
	 *         TODO(4.向指定元素节点中增加子元素节点：添加一个新城市<City>南阳</City>；) @param @throws
	 *         DocumentException @param @throws IOException 参数 @return void
	 *         返回类型 @throws */
	
	private static void addElement() throws DocumentException, IOException
	{
		//1.获取Document的对象；
		Document document = Dom4JUtils.getDocument();
		//2.获取根元素；
		Element rootElement = document.getRootElement();
		//3.添加元素；
		Element cityElement = rootElement.addElement("City");
		//5.设置文本；
		cityElement.setText("南阳");
		//6.写回文件；
		Dom4JUtils.write2XML(document);
	}
	
	/** @Title: deleteElement @Description:
	 *         TODO(6.删除指定元素节点：删除元素开封；) @param @throws
	 *         DocumentException @param @throws IOException 参数 @return void
	 *         返回类型 @throws */
	
	private static void deleteElement() throws DocumentException, IOException
	{
		//1.获取Document的对象；
		Document document = Dom4JUtils.getDocument();
		//2.获取根元素；
		Element rootElement = document.getRootElement();
		//3.获取根元素下的所有子元素；
		List<Element> es = rootElement.elements();
		//4.根据索引可以获取到指定的元素；
		Element cityElement = es.get(1);
		//5.无法自杀（自己删除自己），必须找到他爹（父元素）；
		Element parentElement = cityElement.getParent();
		parentElement.remove(cityElement);
		//6.写回文件；
		Dom4JUtils.write2XML(document);
	}
	
	/** @Title: updateElementText @Description:
	 *         TODO(3.修改某个元素节点的主体内容：信阳-->安阳；) @param @throws
	 *         DocumentException @param @throws IOException 参数 @return void
	 *         返回类型 @throws */
	
	private static void updateElementText() throws DocumentException, IOException
	{
		//1.获取Document的对象；
		Document document = Dom4JUtils.getDocument();
		//2.获取根元素；
		Element rootElement = document.getRootElement();
		//3.获取根元素下的所有子元素；
		List<Element> es = rootElement.elements();
		//4.根据索引可以获取到指定的元素；
		Element cityElement = es.get(3);
		//5.修改文本；
		cityElement.setText("安阳");
		//6.写回文本；
		Dom4JUtils.write2XML(document);
	}
	
	/** @Title: getAllElementName @Description:
	 *         TODO(2.遍历所有的元素节点：打印他们的元素名称；) @param @throws DocumentException
	 *         参数 @return void 返回类型 @throws */
	
	private static void getAllElementName() throws DocumentException
	{
		//1.获取Document的对象；
		Document document = Dom4JUtils.getDocument();
		//2.获取根元素；
		Element rootElement = document.getRootElement();
		//3.递归遍历所有元素节点，打印其元素名称；
		treeWalk(rootElement);
	}
	
	//2.递归遍历所有元素节点，打印其元素名称；
	public static void treeWalk(Element element)
	{
		//1.输出元素的名称；
		System.out.println("输出元素的名称：" + element.getName());
		
		//2.获取指定元素的所有子元素；
		List<Element> es = element.elements();
		for (Element e : es)
		{
			treeWalk(e);
		}
	}
	
	/** @Title: getCityName @Description:
	 *         TODO(1.得到某个具体的节点内容：打印“郑州”；) @param @throws DocumentException
	 *         参数 @return void 返回类型 @throws */
	
	private static void getCityName() throws DocumentException
	{
		//1.获取Document的对象；
		Document document = Dom4JUtils.getDocument();
		//2.获取根元素；
		Element rootElement = document.getRootElement();
		//3.获取根元素下的所有子元素；
		List<Element> elements = rootElement.elements();
		//4.根据索引获取第一个City元素；
		Element cityElement = elements.get(0);
		//5.根据子元素的名称来获取子元素的文本；
		String text = cityElement.elementText("Name");
		System.out.println("<1.5>.根据根元素下的第一个子元素名称Name获取到该子元素的文本：" + text);
	}
	
}
