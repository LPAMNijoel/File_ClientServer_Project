package myfolder;
import instructor.EchoServer;

public class User
{
	private String userName;
	private client clientobj;
	private String userToken;
	// make the default user
	public User(String userName)
	{
	this.userName = userName;
	clientobj = new client();
	userToken = null;
	}
	
	// get user name
	public String getUserName()
	{
		return userName;
	}
	
	// set the user name
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	
	public static void main(String[] args) 
	{
		
		User user1 = new User("Nijoel");
		UserList.addUser("Nijoel", "This is my token");
		
		user1.clientobj.connect("", EchoServer.SERVER_PORT);
		
		user1.userToken = user1.clientobj.getToken(user1.userName);
		
		user1.clientobj.disconnect();
		
		System.out.println(user1.userToken);
		// TODO Auto-generated method stub

	}

}
