// Package used in this program.
package myDate;
import java.util.Date;

// Main class in this program.
public class RunDate 
{
	// Method member to return the sum of the arguments.
	public String myAddit(String greet, int additive, int art)
	{
		String myGreet = greet;
		int my_intx = additive;
		int my_inty = art;
		int sum = my_intx + my_inty;
		
		return myGreet + ", the sum is: " + sum;
	}
	
	
	
	// Main method in this program.
	public static void main(String[] args)
	{
		// Instantiating a new date object.
		Date dt = new Date();
		
		// Instantiating a new RunDate object.
		RunDate  rundt = new RunDate();
		
		// Giving the myAddit method's parameters arguments.
		String baseStr = rundt.myAddit("Welcome", 7, 4);
		
		// Printing out all the information.
		System.out.println("The date is, " + dt + "\n" + baseStr);
		
	}

}
