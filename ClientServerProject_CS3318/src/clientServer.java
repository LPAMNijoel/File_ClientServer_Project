import java.util.*;

/*
 * this is the clientServer this is suppose to just connect the client to the group server and 
 * Your implementation of this method is responsible for establishing a connection to the group server
 * for connect.
 */
public class clientServer extends EchoServer 
{
	String server = "File Server";
	private static clientServer clientobj;

	void connect(String server, int port)
	{
		this.server = server;
		EchoServer.SERVER_PORT = port;
	}
	
	void disconnect()
	{
		/*
		 * This method is responsible for cleanly tearing down the connection to the group server.
		 * It should be invoked when exiting the client application
		 */
	}
	
	// momhammed implemented this part comment out.
//	UserToken getToken(String username)
//	{
//		
//	}
	public static void main(String[] args)
	{
		clientobj = null;
	 // set the default connect assuming we connect 
	 boolean connect = false;
	if (connect)
	{
		// init the client 
		clientobj.connect("The File Server",EchoServer.SERVER_PORT);
		System.out.println();
	}	
	else
	{
		System.out.println("We did not connect to the server.");
	}
	
}
}


