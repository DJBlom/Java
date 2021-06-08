/**
 * Contents: This file contains the class App and the main method.
 * 
 * Author: Dawid Blom.
 * 
 * Date 17/05/2021.
 */

package client;

import java.util.*;



/**
 * The purpose of this program is to represent a CLChat-client/server interface.
 * The user can either connect to the server via command line argument, however,
 * if no command line argument is given the user will be prompt to enter a computer
 * to connect to.
 */
public class App 
{
	/**
	 * By calling this method, it should
	 * start the program and check if the 
	 * user specified a command line argument 
	 * as the computer to connect to, however, 
	 * if the user did not specify a computer
	 * to connect to, then the user will be prompt
	 * to give a computer to connect to.
	 */
	public static void main(String[] args)
	{
		if (args.length > 0)
		{
			Client client = new Client(args[0]);
			client.makeConnection();
		}
		else
		{
			Client client = new Client(userInput(args));
			client.makeConnection();
		}	
	}
	
	

	
	
	
	
	/**
	 * By calling this method, it should
	 * ask the user for a computer name or
	 * IP address to connect to.
	 */
	public static String userInput(String[] CLArgument)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter computer name or IP address:> ");
		
		return input.nextLine();
	}
}
