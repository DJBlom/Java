/**
 * Contents: This file contains the class Client.
 * 
 * Author: Dawid Blom.
 * 
 * Date: 17/05/2021.
 */
package client;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 * This class is used to represent a client side network socket
 * This socket will be used to connect to the server, as well as,
 * to send messages to the server.
 */
public class Client 
{
	/**
	 * Instance properties used in this class.
	 */
	private static final int LISTENING_PORT = 20210;
	private static String hostName;
	private static Socket conn;
	private static BufferedReader in;

	
	
	
	
	
	
	/**
	 * This constructor takes one argument of type String
	 * and it will assign it to he hostName property.
	 */
	public Client(String hostName)
	{
		this.hostName = hostName;
	}
	
	
	
	
	
	
	
	

	
	
	
	
	/**
	 * By calling this method, it should
	 * take the information the user provided
	 * make the connection to the other computer
	 * and display a line of text.
	 */
	public void makeConnection()
	{
		try
		{
			conn = new Socket(hostName, LISTENING_PORT);
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String serverMessage = in.readLine();
			if (serverMessage == null)
				throw new IOException("Connection was opened. However, no data was sent by the server.");
			
			System.out.println("Server Message");
			System.out.println(serverMessage);
			System.out.println();
			
			in.close();
		}
		catch (Exception e)
		{
			System.out.println("Error: " + e);
		}
	}
}
