// Main package used in this program.
package auto;

// Main class of this program.
public class Options 
{
	// All the data members of this class.
	private String radio;
	private String selfDriving;
	private String fuel;
	
	
	// First constructor used in this class.
	public Options(String radio, String selfDriving, String fuel)
	{
		// Assigning all the arguments to the right data member.
		this.radio = radio;
		this.selfDriving = selfDriving;
		this.fuel = fuel;
	}
	
	
	// All the set methods.
	
	// A method to set the radio option.
	public String setRadioOption(String radio)
	{
		// Assigning the argument to the radio data member.
		this.radio = radio;
		
		// Returning the argument values.
		return radio;
	}
	
	
	// A method to set the selfDriving option
	public String setSelflDrivingOption(String selfDriving)
	{
		// Assigning the argument to the data member selfDriving.
		this.selfDriving = selfDriving;
		
		// Returning the Argument value.
		return selfDriving;
	}
	
	
	// A method to set the fuel
	public String setFeulOption(String fuel)
	{
		// Assigning the argument to the data member fuel.
		this.fuel = fuel;
		
		// Returning the argument value.
		return fuel;
	}
	
	
	// All the get methods.
	
	// A method to get the radio option.
	public String getRadio()
	{
		// Returning the value data member radio.
		return radio;
	}
	
	
	// A method to get the selfDriving option.
	public String getSelfDrivingOption()
	{
		// Returning the data member.
		return selfDriving;
	}
	
	
	// A method to get fuel option.
	public String getFuelOption()
	{
		// Returning the data member.
		return fuel;
	}
	
	
	// A method to concatenate the ouput into a nice format.
	public String toString()
	{
		return "Option radio: " + radio + ", Option self driving: " + selfDriving + ", Option fuel: " + fuel + "\n";
	}
}
