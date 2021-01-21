// All the packages used in this program.
package PizzaApp;

// All the imports used in this program.
import java.util.ArrayList;
import java.util.Iterator;

// Child class of PizzaApp. This class Inherits PizzaApp.
public class Calzone extends PizzaApp
{
	// Declaring member data members.
	public String itemName = "Calzones";
	private String[] cheeseType = {"Ricotta", "Cottage", "Goat"};
	ArrayList<Integer> calSize = new ArrayList<Integer>();
	
	
	// Declaring all the member methods used in this class.
	public String calzoneSize()
	{
		// Do we have ingredients in stock. True is yes and false is no.
		boolean ingredientInStock = true;
		int csize = 0;
		String calzoneSizeList = "";
		
		calSize.add(4);
		calSize.add(6);
		calSize.add(10);
		
		Iterator<Integer> cal_itr = calSize.iterator();
		
		// If there are ingredients in stock, or if ingredientsInStock is true, build the size list.\
		if (ingredientInStock)
		{
			while (cal_itr.hasNext())
			{
				csize = cal_itr.next();
				calzoneSizeList += csize + " ";
			}
		}
		
		return calzoneSizeList;
	}
	
	
	
	// Build the getCalCheeses to list the cheeses entered into cheese type array.
	public String getCalCheeses()
	{
		int ilength = cheeseType.length;
		
		String mycalzones = "";
		String mycals = "";
		
		for (int i = 0; i < ilength; i++)
		{
			mycals = cheeseType[i];
			mycalzones += " " + mycals;
		}
		
		return mycalzones;
	}
	
	
}
