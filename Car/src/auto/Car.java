// Package being used in this program.
package auto;

// Main class in this program.
public class Car 
{
	// All the data members of this class.
	private String make;
	private String model;
	private int year;
	
	
	// All the member methods and constructors used in this class.
	
	// First constructor of this class.
	public Car(String make, String model, int year)
	{
		// Assigning the arguments to the data members.
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	
	// Second constructor of the class.
	public Car(String model, int year)
	{
		// Assigning the arguments to the data members.
		this.model = model;
		this.year = year;
	}
	
	
	// All the set methods 
	
	// A set method for the make of the car.
	public String setMake(String make)
	{
		// Assigning the argument to the data member.
		this.make = make;
		
		// Returning the argument value.
		return make;
	}
	
	
	// A set method for the model of the car.
	public String setModel(String model)
	{
		// Assigning the argument to the data member.
		this.model = model;
		
		// Returning the argument value.
		return model;
	}
	
	
	// A set method for the year of the car.
	public int setCarYear(int year)
	{
		// Assigning the argument to the data member.
		this.year = year;
		
		// Return the argument value.
		return year;
	}
	
	
	// All the get methods used to retrieve the data.
	
	// A get method used to get the make of the car.
	public String getMake()
	{
		// Return the data member.
		return make;
	}
	
	
	// A get method used to get the model of the car.
	public String getModel()
	{
		// Returning the model data member.
		return model;
	}
	
	
	// A get method used to get the year of the car.
	public int getCarYear()
	{
		// Returning the year data member of the car.
		return year;
	}
	
	
	// A method to concatenate and display the output in a formatted way.
	public String toString()
	{
		return "Car make: " + make + " Car model: " + model + " Car year: " + year + "\n";
	}
	
	
	// Main method used in this program.
	public static void main(String[] args)
	{
		// Instantiating all the car opjects.
		Car car1 = new Car("Ford", "F150", 2015);
		Car car2 = new Car("Chevy", "Corvette", 2010);
		Car car3 = new Car("Jeep", "Rubicon", 2020);
		
		Options option1 = new Options("Satelite", "AutoDrive", "FlexFuel");
		Options option2 = new Options("Terestrial", "Standard", "Gas");
		Options option3 = new Options("Satelite", "Standard", "DualFuel");
		
		// Outputting all the concatenated values.
		System.out.println(car1.toString());
		System.out.println(car2.toString());
		System.out.println(car3.toString());
		
		// Ouputting all the option values.
		System.out.println(option1.toString());
		System.out.println(option2.toString());
		System.out.println(option3.toString());
	}
}
