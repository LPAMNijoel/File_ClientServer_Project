/**
 * 
 */
package myfolder;

import java.util.HashMap;
import instructor.*;

/**
 * @author This will create the list of users 
 *
 */
public class UserList 
{
	// make a dictonary  of users with app userName and userToken
	private static HashMap<String,String> UserDictonary = new HashMap<>(); 
	
	public static void addUser(String name,String token)
	{
						// key 			key value
		UserDictonary.put(name,token);
	}
	public static String getUserToken(String userName) 
	{
		return UserDictonary.get(userName);
	}
	
	
}
