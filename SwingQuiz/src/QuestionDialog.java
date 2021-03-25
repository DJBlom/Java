/* This class is used to demonstrate the use of a button choice instead of typing in your choice. */

// All the packages used in this class.
import java.awt.event.*;
import javax.swing.*;

// Declaring the class QuestionDialog that will inherit from the imported class JDialog,
// and it will also implement the method actionPerformed declared in the interface class
// ActionListener.
public class QuestionDialog extends JDialog implements ActionListener
{
	// Declaring an instance variable.
	public String answer;

	// Overriding the method actionPerformed declared in the interface class ActionListener.
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// Assigning the argument to the instance variable created.
		this.answer = e.getActionCommand();

		// Closing the dialog box.
		dispose();
	}
}