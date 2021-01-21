// Packages used in this program.
package PizzaApp;

// All the imports used in this program.
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Date;


// Main class used in this program.
public class PizzaApp 
{
	// Declaring all the data members used in this class.
	public int[] myNum = {10, 20, 30, 40};
	private String[] pizza = {"Cheese", "Pepperoni", "Onions"};
	private String[] drinks = {"Coke", "Sprite", "Diet Coke", "Water", "Ice Tea", "Selzer"};
	
	
	ArrayList<String> miniPizza = new ArrayList<String>();
	public static String myOut;
	public static String thePizza = "";
	public static String theminipizza = "";
	public static String myFullList = "";
	public static String listLen = "";
	
	
	// Declaring all the member method's used in this class.
	
	// A method to get the final price that the client has to pay.
	public String myAddit(String greet, double cost, double tax)
	{
		String myGreet = greet;
		double price = cost;
		double sales_tax = tax;
		double myTax = price * sales_tax;
		double sum = price + myTax;
		
		return myGreet + " : " + sum;
	}
	
	
	
	// A method to display the type of pizzas.
	public String arrayDemo()
	{
		int ilength = pizza.length;
		String myPizza = "";
		
		for (int i = 0; i < ilength; i++)
		{
			myOut = pizza[i];
			myPizza = myPizza + " " + myOut;
		}
		
		return myPizza;
	}
	
	
	
	// A method to keep track of how many pizzas and what size of pizza the client ordered.
	public String arrayListDemo()
	{
		String myList = "";
		String fullList = "";
		int iCount = 0;
		
		ArrayList<String> theSize = new ArrayList<String>();
		
		theSize.add("small");
		theSize.add("medium");
		theSize.add("large");
		theSize.add("X-largee");
		
		Iterator<String> itr = theSize.iterator();
		
		while (itr.hasNext())
		{
			myList = itr.next();
			fullList += myList + " ";
			iCount++;
		}
		
		if (iCount < 5)
		{
			listLen = "The menu list is short.";
		}
		else if (iCount > 5)
		{
			listLen = "The menu list is long";
		}
		else
		{
			listLen = "The menu list is medium length";
		}
		
		int i2 = 5;
		do
		{
			System.out.println("Enjoy Drink: " + drinks[i2]);
			i2--;
		}
		while (i2 > 1);
		
		
		int num = 0;
		switch (num + 1)
		{
			case 1:
				System.out.println("\nSpecial drink of Monday is: " + drinks[num]);
			case 2:
				System.out.println("\nSpecial drink of Tuesday is: " + drinks[num + 1]);
			case 3:
				System.out.println("\nSpecial drink of Wednesday is: " + drinks[num + 2]);
			case 4:
				System.out.println("\nSpecial drink of Thursday is: " + drinks[num + 3]);
			case 5:
				System.out.println("\nSpecial drink of Friday is: " + drinks[num + 4]);
			case 6:
				System.out.println("\nSpecial drink of any day is: " + drinks[num + 5]);
			default:
				System.out.println("Value is: " + drinks[num + 3]);
				
		}
		
		myFullList = fullList;
		return fullList;
	}
	
	
	// Main method of this class.
	public static void main(String[] args)
	{
		// Declaring all the objects.
		Date dt = new Date();
		Date baseDt = new Date();
		String totPrice = "";
		
		// Exception handling if the user entered the wrong date.
		try
		{
			baseDt = new SimpleDateFormat("yyyymmdd").parse("20201005");
		}
		catch (ParseException e)
		{
			e.printStackTrace();
			System.out.println("Incorrect date foramt. Make sure the input has eight numbers.");
		}
		
		
		// Printing out the date.
		System.out.println("Greetings, here are the highlights for today" + dt);
		System.out.println("We will be celebrating our anniversery on: " + baseDt);
		
		// Creating a new order of pizza.
		PizzaApp myPizza = new PizzaApp();
		
		System.out.println(totPrice);
		
		thePizza = myPizza.arrayDemo();
		System.out.println("The pizzas are: " + thePizza);
		theminipizza = myPizza.arrayListDemo();
		System.out.println("\nThe pizza sizes: " + myFullList + "\n");
		
		System.out.println("small pizza: " + myPizza.myAddit(" total prize with one topping", 10, .06));
		System.out.println("small pizza: " + myPizza.myAddit(" total prize with one topping", 14, .06));
		System.out.println("small pizza: " + myPizza.myAddit(" total prize with one topping", 16, .06));
		System.out.println("small pizza: " + myPizza.myAddit(" total prize with one topping", 18, .06));
		
		
		// All the calzone objects and methods used.
		Calzone myCalzones = new Calzone();
		
		String calsize = "";
		String calCheeses = "";
		
		String myitem = myCalzones.itemName;
		System.out.println("\n" + myitem);
		
		calsize = myCalzones.calzoneSize();
		System.out.println("\nCalzone size: " + calsize + " inches");
		
		calCheeses = myCalzones.getCalCheeses();
		System.out.println("\nCalzone cheeses: " + calCheeses + "\n");
		
		System.out.println("The Calzone prices: ");
		System.out.println("4 inch calzone: " + myCalzones.myAddit("total price:", 5.50, .06));
		System.out.println("6 inch calzone: " + myCalzones.myAddit("total price:", 8.00, .06));
		System.out.println("10 inch calzone: " + myCalzones.myAddit("total price:", 10.50, .06));
		
		
	}

}
