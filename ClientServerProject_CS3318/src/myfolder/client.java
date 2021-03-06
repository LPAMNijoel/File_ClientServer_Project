package myfolder;
import instructor.Message;
import instructor.EchoServer;
import java.util.*;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket; 
import java.net.Socket;
import java.lang.Thread; 
import java.io.ObjectInputStream;   // Used to read objects sent from the server
import java.io.ObjectOutputStream;  // Used to write objects to the server
/*
 * this is the clientServer this is suppose to just connect the client to the group server and 
 * Your implementation of this method is responsible for establishing a connection to the group server
 * for connect.
 */
public class client 
{
	private Socket clientSocket;  // The  clientSocket that we'll be talking over
	  /**
     * Constructor that sets up the socket we'll chat over this method init a empty unconnected socket
     *
     * @param 
     */
	public client() 
	{
		clientSocket = new Socket();	
	}

	
	public Message sendMessageToServer(String msg)
	{
		 // Set up I/O streams with the server
	    try 
	    {
			
	    	
	    	final ObjectOutputStream output = new ObjectOutputStream(clientSocket.getOutputStream());
			final ObjectInputStream input = new ObjectInputStream(clientSocket.getInputStream());
			 
			 
			 // send a message to test
			 output.writeObject(new Message(msg));			 
			 
			 // recieving end from server 
			 return (Message)input.readObject();
		}
	    
	    catch (IOException | ClassNotFoundException e) 
	    {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   return null;
	}
	
	
	boolean connect(String server, int port)
	{
		try 
		{
			
			clientSocket.connect(new InetSocketAddress(server,port));
			
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (clientSocket.isConnected()) 
			System.out.println("We're connected...");
		else	
			System.err.println("Error Don't work...");	
		
		return clientSocket.isConnected();
	
	}	
	
	
	public String getToken(String username)
	{
		return sendMessageToServer(username).theMessage;	
	}
	
	
	void disconnect()
	{
		/*
		 * This method is responsible for cleanly tearing down the connection to the group server.
		 * It should be invoked when exiting the client application
		 * 
		 *  // Close and cleanup
		 */
		
		try {
			clientSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	// momhammed implemented this part comment out.
//	UserToken getToken(String username)
//	{
//		
//	}
	public static void main(String[] args)
{
	
		 // set the default connect assuming we connect 	
		 // make the clientobj
		
		 client clientobj = new client();
		 // make the connection 
		 clientobj.connect("", EchoServer.SERVER_PORT);
		 
		 
		  // now close the connection 
		 clientobj.disconnect();
		 
		 
		 
		 // call the clientobj method to connect 
		// clientobj.connect("", EchoServer.SERVER_PORT);
		 //clientobj.connect("",EchoServer.SERVER_PORT);
		 
		 
		 // close the scanner.
		// input.close();
}


}


