/**
 * Contents: This file contains the Server's class App with it's main method.
 * 
 * Author: Dawid Blom.
 * 
 * Date: 17/05/2021.
 */
package server;

public class App 
{
	/**
	 * By calling this method, it should start
	 * the server for the client to connect to
	 * it.
	 */
	public static void main(String[] args)
	{
		Server server = new Server();
		server.startServer();
	}
}
