
/**    
* @Title: UserDB.java  
* @Package com.netProgramme  
* @Description: TODO(模拟一个保存用户的数据库；)  
* @author yijvyan  
* @date 2018年4月3日  
* @version V1.0    
*/

package com.netProgramme;

import java.util.ArrayList;
import java.util.List;


/** @ClassName: UserDB
 * @Description: TODO(获取用户对象；)
 * @author yijvyan
 * @date 2018年4月3日 */

public class UserDB
{
	private static List<User> users = new ArrayList<User>();
	
	static
	{
		users.add(new User("Alice", "111111"));
		users.add(new User("Bob", "222222"));
		users.add(new User("yijvyan", "123456"));
		users.add(new User("admin", "password"));
	}
	
	public static List<User> getUsers()
	{
		return users;
	}
	
}
