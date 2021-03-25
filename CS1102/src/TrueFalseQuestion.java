/* The purpose of this file is to give the user TRUE or FALSE question. */

// All the imports used in this file.
import javax.swing.*;


// This class inherits from class 'Question'
public class TrueFalseQuestion extends Question 
{	
	// Constructor for this class that takes two parameters.
	TrueFalseQuestion(String question, String answer)
	{	
		// Calling the Question constructor to be executed.
		super(question);

		// Assigning the instance variable in the super class to argument answer.
		super.correctAnswer = answer;


		// Instantiating a JPanel that will hold the buttons.
		JPanel buttons = new JPanel();

		// Adding the true/false buttons.
		addButton(buttons, "TRUE");
		addButton(buttons, "FALSE");

		// Adding the button panel to the dialog box.
		super.question.add(buttons);

		// Making sure the dialog box stays in control until it is disposed.
		super.question.setModal(true);

		super.initQuestionDialog();
	}


	// A method used to instantiate a new button.
	public void addButton(JPanel buttons, String label)
	{
		// Instantiating a new button.
		JButton button = new JButton(label);

		// Adding it to the actionListener to be able to know when the button is clicked.
		button.addActionListener(super.question);

		// Adding the button to the buttons panel.
		buttons.add(button);
	}
}