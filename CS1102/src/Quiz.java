/* The purpose of this program is to demonstrate the use of a classes, objects, and constructors. */


// Main class of this program.
public class Quiz 
{
	// Main method used to run the program.
	public static void main(String[] args)
	{
		// Initializing a object of the class MultipleChoiceQuestion
		Question q1 = new MultipleChoiceQuestion("What type of car has a black horse for its emblem?", 
				"Ferarri.", "Posh.", "Lamborghini.", 
				"Mercedes-Benz.", "Bugatti.", "A");
		// Calling the check method to check the answer.
		q1.check();


		// Initializing a object of the class MultipleChoiceQuestion
		q1 = new MultipleChoiceQuestion("Which sea is known to be very salty?", 
				"Black Sea.", "Dead Sea.", "Red Sea.", 
				"Mediterranean Sea.", "Baltic Sea.", "B");
		// Calling the check method to check the answer.
		q1.check();


		// Initializing a object of the class MultipleChoiceQuestion
		q1 = new MultipleChoiceQuestion("Which nut is known to grow in the top part of Brazil close to the Amazon?",
				"Pistachios.", "Hazelnuts.", "Cashews.", 
				"Brazil-nut.", "Walnuts.", "D");
		// Calling the check method to check the answer.
		q1.check();


		q1 = new MultipleChoiceQuestion("Which mountain is the tallest in the world?", 
				"Mt. K2.", "Mt. Kangchenjunga.", "Mt. Lhotse.", 
				"Mt. Everest.", "Mt. Makalu.", "D");
		// Calling the check method to check the answer.
		q1.check();

		// Initializing a object of the class MultipleChoiceQuestion
		q1 = new MultipleChoiceQuestion("Which country is the biggest country in the world?", 
				"Brazil.", "China.", "Russia.", 
				"United States of America.", "Australia.", "C");
		// Calling the check method to check the answer.
		q1.check();



		// Initializing a Question object to be used for true or false answers.
		Question question = new TrueFalseQuestion("Is Charleze Theron a South African?", "TRUE");

		// Calling the check method to check the answer.
		question.check();

		// Initializing a Question object to be used for true or false answers.
		question = new TrueFalseQuestion("Is Spider-man Tom Holland?", "TRUE");

		// Calling the check method to check the answer.
		question.check();

		// Initializing a Question object to be used for true or false answers.
		question = new TrueFalseQuestion("Is Batman Ben Affleck?", "TRUE");

		// Calling the check method to check the answer.
		question.check();

		// Initializing a Question object to be used for true or false answers.
		question = new TrueFalseQuestion("Is Super-man George Forman?", "FALSE");

		// Calling the check method to check the answer.
		question.check();

		// Initializing a Question object to be used for true or false answers.
		question = new TrueFalseQuestion("Is Hulk Bryce Johnson?", "FALSE");

		// Calling the check method to check the answer.
		question.check();

		// Displaying the result of the quiz taken.
		Question.showResults();
	}
}