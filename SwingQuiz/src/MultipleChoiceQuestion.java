/* This is class that will be used for the multiple choice question provided in the Quiz.java class. */


// All the imports used in this file.
import java.awt.*;
import javax.swing.*;

/* This file is used declare a class for 
 * multiple choice questions used in the Quiz.java file */


// Definition of the class name MultipleChoiceQuestion.
public class MultipleChoiceQuestion extends Question
{
	/* All the methods of this class. */

	// This constructor takes 7 parameters.
	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer)
	{
		// Calling the Question constructor to be executed.
		super(query);

		// Adding the choices to the dialog box
		addChoice("A", a);
		addChoice("B", b);
		addChoice("C", c);
		addChoice("D", d);
		addChoice("E", e);


		// Initializing the questions
		initQuestionDialog();


		// Assigning the answer variable to the correctAnswer instance variable in the class 'Question'.
		super.correctAnswer = answer;
	}


	// A method used to add a choice to choose from.
	public void addChoice(String name, String label)
	{
		// Instantiating a JPanel to arrange all the objects on.
		JPanel choice = new JPanel(new BorderLayout());

		// Instantiating a new button
		JButton button = new JButton(name);

		// Giving it access to the event event listener.
		button.addActionListener(question);

		// Adding the button to the choice panel with a layout.
		choice.add(button, BorderLayout.WEST);

		// Positioning the label.
		choice.add(new JLabel(label + " ", JLabel.LEFT), BorderLayout.CENTER);

		// Adding the panel that's holding the button and answer label to the dialog box
		question.add(choice);
	}
}