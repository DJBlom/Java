
/* The purpose of this class is to abstract the questions asked to the user when they are doing the quiz. */

// All the imports used in this file.
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;


// Declaring the abstract class Question that will inherit from the MultipleChoiceQuestion class.
public abstract class Question
{
	// Instance variables.
	public String correctAnswer;
	public QuestionDialog question;

	// Class variables.
	static int nQuestions = 0, nCorrect = 0;


	public Question(String question)
	{
		// Creating a new Question dialog box.
		this.question = new QuestionDialog();

		// Setting the layout of the dialog box and anything that will be placed in it,
		// with a grid format of 0, 1.
		this.question.setLayout(new GridLayout(0, 1));

		// Adding a label to the dialog box with the question that will be updated each time.
		this.question.add(new JLabel(" 	 " + question + "	", JLabel.CENTER));
	}


	// A method used to ask the user questions.
	public String ask()
	{
		// Setting the dialog box to be shown.
		question.setVisible(true);

		// Return the answer.
		return question.answer;
	}



	// A instance method to check the answers of the user.
	public void check()
	{
		// Increment the nQuestion member variable each time this method is used.
		nQuestions++;

		// Variable to hold the answer to be checked.
		String answer = ask();


		if (answer.equals(correctAnswer))
		{
			// Increment the member variable nCorrect if the answer is correct.
			nCorrect++;

			// If the answer is correct we will display a message saying it's correct.
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		else
		{
			// If the answer is incorrect the loop will keep running.
			JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is '" + correctAnswer + "'.");
		}
	}


	// A method used to initialize the instance variable question.
	public void initQuestionDialog()
	{
		this.question.setModal(true);
		this.question.pack();
		this.question.setLocationRelativeTo(null);
	}


	// A class method used to show the results of the quiz
	static void showResults()
	{
		// A dialog box to display the result of the quiz.
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions +" questions");
	}
}