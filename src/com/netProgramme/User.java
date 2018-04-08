
/**    
* @Title: User.java  
* @Package com.netProgramme  
* @Description: TODO(对用户登陆进行改写，使其更为面向对象；)  
* @author yijvyan  
* @date 2018年4月3日  
* @version V1.0    
*/

package com.netProgramme;

/** @ClassName: User
 * @Description: TODO(使用User对象来接收用户名和密码；)
 * @author yijvyan
 * @date 2018年4月3日 */

public class User
{
	private String	username;		//用户名；
	private String	password;		//密码；
	
	/** 创建一个新的实例 User.
	 * 
	 * @param username
	 * @param password
	 */
	
	public User(String username, String password)
	{
		super();
		this.username = username;
		this.password = password;
	}
	
	/** 创建一个新的实例 User. */
	
	public User()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	/* (非 Javadoc)
	 * @param obj
	 * @return
	 * @see java.lang.Object#equals(java.lang.Object) */
	
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		User other = (User) obj;
		if (password == null)
		{
			if (other.password != null) return false;
		}
		else if (!password.equals(other.password)) return false;
		if (username == null)
		{
			if (other.username != null) return false;
		}
		else if (!username.equals(other.username)) return false;
		return true;
	}
	
}
