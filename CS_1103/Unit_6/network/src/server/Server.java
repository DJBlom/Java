/**
 * Contents: This file contains the Server class.
 * 
 * Author: Dawid Blom.
 * 
 * Date: 17/05/2021.
 */

package server;

import java.net.*;
import java.util.*;
import java.io.*;







/**
 * This class represents the server side of
 * the client/server command line chat network.
 * The client will connect to this server in order
 * to exchange information.
 */
public class Server 
{
	/**
	 * Instance properties of the server.
	 */
	private final int LISTENING_PORT = 20210;
	private ServerSocket listener;
	private Socket conn;

	
	
	
	
	
	
	/**
	 * By calling this method, it should start
	 * the server for the client to connect to it.
	 * This server will continue to run until some error
	 * occurs. (Note: errors that occur while communicating
	 * with the client, is handled in the sendDate method())
	 */
	public void startServer()
	{
		try
		{
			listener = new ServerSocket(LISTENING_PORT);
			System.out.println("Listening on port number: " + LISTENING_PORT);
			
			while (true)
			{
				conn = listener.accept();
				sendDate(conn);
			}
		}
		catch (Exception e)
		{
			System.out.println("Error: System Shut Down.");
			System.out.println("Information: " + e);
			return;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * By calling this method, it should send
	 * a date stamp with each message. Furthermore,
	 * it will also handle some exceptions that might 
	 * arise in the startServer() method.
	 */
	public void sendDate(Socket conn)
	{
		try
		{
			System.out.println("Connection from: " + conn.getInetAddress().toString());
			Date currentDateTime = new Date();
			PrintWriter out = new PrintWriter(conn.getOutputStream());
			out.println(currentDateTime);
			out.flush();
			
			conn.close();
		}
		catch (Exception e)
		{
			System.out.println("Error: " + e);
		}
	}
}
