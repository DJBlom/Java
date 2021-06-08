/**
 * Contents: Random sentence generator.
 * 
 * @author: Dawid Blom
 * 
 * Date: 15/04/2021
 */



/**
 * This program generates random sentences using the following BNF syntax rules:
 * <sentence> ::= <simple_sentence> [ <conjunction> <sentence> ]
 * 
 * <simple_sentence> ::= <noun_phrase> <verb_phrase>
 * 
 * <noun_phrase> ::= <proper_noun> | <determiner> [ <adjective> ]. <common_noun> [ who <verb_phrase> ]
 * 
 * <verb_phrase> ::= <intransitive_verb> 
 * | <transitive_verb> <noun_phrase> 
 * | is <adjective> 
 * | believes that <simple_sentence>
 * 
 * 
 * <conjunction> ::= and | or | but | because
 * 
 * <proper_noun> ::= Fred | Jane | Richard Nixon | Miss America
 * 
 * <common_noun> ::= man | woman | fish | elephant | unicorn
 * 
 * <determiner> ::= a | the | every | some
 *
 * <adjective> ::= big | tiny | pretty | bald
 * 
 * <intransitive_verb> ::= runs | jumps | talks | sleeps
 * 
 * <transitive_verb> ::= loves | hates | sees | knows | looks for | finds
 * 
 * 
 * 
 * This program will generate random sentences using the above 
 * BNF rules.
 */
public class Random 
{
	/**
	 * The following are private class variables used to hold all the 
	 * data needed to make this program perform correctly.
	 */
	private static final String[] conjunction = {"and", "or", "but", "because"};
	private static final String[] properNoun= {"Fred", "Jane", "Richard Nixon", "Miss", "America"};
	private static final String[] commonNoun = {"man", "woman", "fish", "elephant", "unicorn"}; 
	private static final String[] adjective = {"big", "tiny", "pretty", "bald"};
	private static final String[] intransitiveVerb = {"runs", "jumps", "talks", "sleeps"};
	private static final String[] transitiveVerb = {"loves", "hates", "sees", "knows", "looks for", "find"};

	
	
	
	
	
	/**
	 * This method is used to initiate the start of the whole program.
	 * Upon calling this method it will enter a infinite loop,
	 * calling the randomSentence() method to generate random sentences.
	 * It will also try to let the thread sleep for 2000 milliseconds 
	 * before printing out the sentence to have some control over the 
	 * output of the program. I an exception occurs it will catch it and get 
	 * stack trace for further analysis.
	 * @param args
	 */
	public static void main(String[] args)
	{
		while (true)
		{
			sentence();
			System.out.println("\n\n");
			
			try
			{
				Thread.sleep(3000);
			}
			catch (InterruptedException e)
			{
				e.getStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	/**
	 * By calling this method it will generate a random number to be 
	 * able to choose a random word in the conjunction array to be used.
	 * We then generate another random number to use as a base case so we 
	 * can exit the recursive call. Furthermore, this random number must be
	 * a natural number (it must be a positive integer).
	 * 
	 * This method implements the following BNF rule:
	 * <sentence> ::= <simple_sentence> [ <conjunction> <sentence> ]
	 */
	public static void sentence()
	{
		int indexC = (int) (Math.random() * conjunction.length);
		
		if (Math.random() > 0.2)
		{
			simpleSentence();
		}
		else
		{
			System.out.print(" " + conjunction[indexC]);
			sentence();
		}
	}
	
	
	
	
	
	
	
	/**
	 * By calling this method we will invoke the noun() method and
	 * the verb method() that will in return display a random
	 * noun and verb according to their rules.
	 * 
	 * This method implements the following BNF rule:
	 * <simple_sentence> ::= <noun_phrase> <verb_phrase>
	 */
	public static void simpleSentence()
	{
		nounPhrase();
		verbPhrase();
	}
	
	

	
	
	
	
	/**
	 * By calling this method we will create two random indexes
	 * that will be used to access the data at a random place.
	 * Furthermore, we will print the first rule followed by a 
	 * check to make sure that the random number that was generated 
	 * is indeed a natural number or an unsigned int (a non negative integer).
	 * Moreover, we will continue to print the second rule. Finally, we will
	 * generate another random number, check that it's a unsigned int and continue
	 * on to the third rule of this method. 
	 * 
	 * This method implements the following BNF rule:
	 * <noun_phrase> ::= <proper_noun> 
	 * | <determiner> [ <adjective> ]. <common_noun> [ who <verb_phrase> ]
	 */
	public static void nounPhrase()
	{
		int indexPn = (int) (Math.random() * properNoun.length);
		int indexCn = (int) (Math.random() * commonNoun.length);
		
		System.out.print(" " + properNoun[indexPn]);
		if (Math.random() > 0.75)
		{
			System.out.print(" " + commonNoun[indexCn]);
		}
		
		if (Math.random() > 0.5)
		{
			System.out.print(" who");
			verbPhrase();
		}
	}
	
	
	
	
	
	
	
	/**
	 * When this method is called three random indexes
	 * will be created and used to access the data randomly.
	 * Furthermore, we will access the data randomly through
	 * generating another random number to check which statement 
	 * should be run. Finally, we will initiate an 
	 * indirect recursive call (through simpleSentence,
	 * this method will be called again and again).
	 * 
	 * This method implements the following BNF rules:
	 * <verb_phrase> ::= <intransitive_verb> 
	 * | <transitive_verb> <noun_phrase> 
	 * | is <adjective> 
	 * | believes that <simple_sentence>
	 */
	public static void verbPhrase()
	{
		int indexIv = (int) (Math.random() * intransitiveVerb.length);
		int indexT = (int) (Math.random() * transitiveVerb.length);
		int indexA = (int) (Math.random() * adjective.length);
		
		System.out.print(" " + intransitiveVerb[indexIv]);
		if (Math.random() > 0.75)
		{
			System.out.print(" " + transitiveVerb[indexT]);
		}
		
		System.out.print(" is " + adjective[indexA]);
		if (Math.random() > 0.5)
		{
			System.out.print(" Believes that");
			simpleSentence();
		}
	}
}
