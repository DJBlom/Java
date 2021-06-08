/**
 * Contents: This file contains the class DirectoryList with the main method.
 * 
 * Author: Dawid Blom.
 * 
 * Date: 18/05/2021
 */
package listing;

import java.io.*;
import java.util.Scanner;







/**
 * This program will list all the files from
 * the current directory recursively. Meaning,
 * if will list all the files in the current directory,
 * and if the current directory has a sub-directory it will
 * enter the sub-directory and list all the file in that directory.
 * Hence, by doing this recursively we will get all the current directory
 * as well as all the information in the sub-directories as well.
 */
public class DirectoryList 
{
	/**
	 * By calling this method, it should
	 * start the program and continue on to
	 * list all the file recursively from the
	 * current directory. If the user provides
	 * a command-line argument then that argument
	 * will be used to specify the current directory,
	 * else if the user will be prompt to give a current
	 * directory path from which the program will start to 
	 * run through the files and directories.
	 */
	public static void main(String[] args)
	{
		if (args.length > 0)
		{
			File path = commandLineInput(args[0]);
			DirectoryList.directoryList(path);
		}
		else
		{
			File path = userInput();
			DirectoryList.directoryList(path);
		}
	}
	
	
	
	
	
	
	
	
	
	
	/**
	 * By calling this method, it should recursively
	 * traverse the path given by the user and display
	 * all the files from the current directory and it's
	 * sub-directories.
	 */
	public static void directoryList(File path)
	{
		try
		{
			File[] fileNames = path.listFiles();
			for (File fileName : fileNames)
			{
				if (fileName.isDirectory())
				{
					System.out.println("Directory: " + fileName.getCanonicalPath());
					directoryList(fileName);
				}
				else
					System.out.println("	Files: " + fileName.getName());
			}
		}
		catch (Exception e)
		{
			System.out.println("");
		}
		
	}
	
	
	
	
	
	
	
	
	
	/**
	 * By calling this method, it should 
	 * convert the command-line argument 
	 * that the user provided into a File
	 * object.
	 */
	public static File commandLineInput(String path)
	{	
		File directory = new File(path);
			
		return directory;
	}
	
	
	
	
	
	
	
	
	
	/**
	 * By calling this method, it should
	 * prompt user for input. If the user
	 * does no specify the absolute path of the
	 * directory they want to list then it will 
	 * prompt them again.
	 */
	public static File userInput()
	{
		File directory;
		System.out.println("Enter directory path: ");
		while (true)
		{
			Scanner scanner= new Scanner(System.in);
			String path = scanner.nextLine().trim();
			directory = new File(path);
			if (directory.isDirectory() == false && directory.exists() == false)
				System.out.println("Please enter the full path to the directory: ");
			else
				break;
		}
			
		return directory;
	}
}
