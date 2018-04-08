
/**    
* @Title: CollectionsDemo.java  
* @Package com.collection  
* @Description: TODO(Collections工具类的学习；)  
* @author yijvyan  
* @date 2018年3月14日  
* @version V1.0    
*/

package com.collection;

import java.util.ArrayList;
import java.util.Collections;


/** @ClassName: CollectionsDemo
 * @Description: TODO(用于操作Collection集合；)
 * @author yijvyan
 * @date 2018年3月14日 */

public class CollectionsDemo
{
	
	/** @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	public static void main(String[] args)
	{
		System.out.println("----------------------1.Collections工具类；--------------------");
		
		//Collections：是个工具类，其方法都是用来操作Collection的；
		//Collection：是集合体系的最顶层，包含了集合体系的共性；
		
		//1.static int binarySearch(List list, Object key)；
		//使用二分法查找指定元素在指定列表中的索引位置；
		
		binarySearchCollections();
		
		//2.static void copy(List dest, List src)；
		//把源列表中的数据覆盖到目标列表；
		//注意：目标列表的长度至少要等于源列表的长度；
		
		copyCollections();
		
		//3.static void fill(List list, Object obj)；
		//使用指定的对象填充指定列表的所有元素；
		fillCollections();
		
		//4.static void reverse(List list)：反转；
		reverseCollections();
		
		//5.static void shuffle(List list)：傻否，即随机置换元素的位置；
		shuffleCollections();
		
		//6.static void sort(List<T> list)：按照列表中元素的自然顺序进行排序，即升序；
		sortCollections();
		
		//7.static void swap(List list, int i, int j)：
		//将指定列表中的两个索引进行位置互换；
		swapCollections();
		
		System.out.println("----------------------2.模拟斗地主发牌；--------------------");
		
		//1.买牌；
		//2.定义花色；
		String[] color = { "黑桃", "红桃", "方片", "梅花" };
		
		//3.定义数字；
		String[] num = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		
		//4.定义牌盒；
		ArrayList<String> box = new ArrayList<String>();
		//		box.add("黑桃A");
		
		//5.定义纸牌；
		//5.1.获得花色；
		for (int i = 0; i < color.length; i++)
		{
			//5.2.获得数字；
			for (int j = 0; j < num.length; j++)
			{
				box.add(color[i] + num[j]);
			}
		}
		box.add("大王");
		box.add("小王");
		
		//6.洗牌；
		Collections.shuffle(box);
		System.out.println("洗好的牌：" + box);
		
		//7.找三个牌搭子（牌友）；
		ArrayList<String> 郑爽 = new ArrayList<String>();
		ArrayList<String> 娜扎 = new ArrayList<String>();
		ArrayList<String> 热巴 = new ArrayList<String>();
		
		//8.发牌；
		//每个牌友17张牌，留3张底牌；
		for (int i = 0; i < box.size(); i++)
		{
			//i%3 得到的余数，是0，1，2；正好对应三个牌友；
			if (i % 3 == 0)
			{
				郑爽.add(box.get(i));
			}
			else if (i % 3 == 1)
			{
				娜扎.add(box.get(i));
			}
			else if (i % 3 == 2)
			{
				热巴.add(box.get(i));
			}
		}
		
		System.out.println("郑爽的牌：" + 郑爽);
		System.out.println("娜扎的牌：" + 娜扎);
		System.out.println("热巴的牌：" + 热巴);
		
		//9.三张底牌；
		System.out.println("底牌：");
		//		System.out.println(box.get(box.size() - 1));
		//		System.out.println(box.get(box.size() - 2));
		//		System.out.println(box.get(box.size() - 3));
		
		for (int i = box.size() - 3; i < box.size(); i++)
		{
			System.out.println(box.get(i));
		}
		
	}
	
	/** @Title: swapCollections @Description: TODO(将指定列表中的两个索引进行位置互换；) @param
	 *         参数 @return void 返回类型 @throws */
	
	private static void swapCollections()
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(4);
		
		Collections.swap(arrayList, 0, 1);
		System.out.println("<7>.使用swap方法将列表arrayList中索引0和索引1处的元素互换，则互换后列表元素：" + arrayList);
	}
	
	/** @Title: sortCollections @Description: TODO(按照列表中元素的自然顺序进行排序，即升序；) @param
	 *         参数 @return void 返回类型 @throws */
	
	private static void sortCollections()
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(4);
		arrayList.add(3);
		arrayList.add(2);
		
		Collections.sort(arrayList);
		System.out.println("<6>.使用sort方法按照列表arrayList中元素的自然顺序进行排序，则排序后列表元素：" + arrayList);
	}
	
	/** @Title: shuffleCollections @Description: TODO(傻否，即随机置换元素的位置；) @param
	 *         参数 @return void 返回类型 @throws */
	
	private static void shuffleCollections()
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		
		Collections.shuffle(arrayList);
		System.out.println("<5>.使用shuffle方法随机置换列表arrayList中元素的位置，则置换后列表元素：" + arrayList);
	}
	
	/** @Title: reverseCollections @Description: TODO(反转；) @param 参数 @return
	 *         void 返回类型 @throws */
	
	private static void reverseCollections()
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		
		Collections.reverse(arrayList);
		System.out.println("<4>.使用reverse方法反转列表arrayList，则反转后列表元素：" + arrayList);
	}
	
	/** @Title: fillCollections @Description: TODO(使用指定的对象填充指定列表的所有元素；) @param
	 *         参数 @return void 返回类型 @throws */
	
	private static void fillCollections()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		
		System.out.println("<3.1>.指定列表list（此时尚未使用fill方法，即未填充）的所有元素：" + list);
		Collections.fill(list, "fillWithAndroid");
		
		System.out.println("<3.2>.使用指定的对象“fillWithAndroid”填充指定列表list，则list的所有元素：" + list);
	}
	
	/** @Title: copyCollections @Description: TODO(把源列表中的数据覆盖到目标列表；) @param
	 *         参数 @return void 返回类型 @throws */
	
	private static void copyCollections()
	{
		//创建源列表；
		ArrayList<String> src = new ArrayList<String>();
		src.add("hello");
		src.add("world");
		src.add("java");
		
		//创建目标列表；
		ArrayList<String> dest = new ArrayList<String>();
		dest.add("dest");
		dest.add("dest");
		dest.add("dest");
		dest.add("dest");
		
		Collections.copy(dest, src);
		System.out.println("<2>.把源列表src中的数据覆盖到目标列表dest，输出目标列表dest：" + dest);
	}
	
	/** @Title: binarySearchCollections @Description:
	 *         TODO(使用二分法查找指定元素在指定列表中的索引位置；) @param 参数 @return void
	 *         返回类型 @throws */
	
	private static void binarySearchCollections()
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		
		int index = Collections.binarySearch(arrayList, 4);
		System.out.println("<1>.使用二分法查找指定元素4在指定列表arrayList中的索引位置，是：" + index);
	}
	
}
