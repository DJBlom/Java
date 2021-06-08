/**
 * Contents: Definition of the class Tape.
 * 
 * Author: Dawid Blom
 * 
 * Date: 22/04/2021
 */
package turing;





/**
 * This class contains all the methods needed
 * to get the content of a cell, get the cell, 
 * set the content of a cell, move left and right
 * over the tape as well as display all the contents
 * of the tape. 
 */
public class Tape
{
	/**
	 * A instance variable used to
	 * navigate the tape.
	 */
	private Cell current;
	
	
	
	
	
	
	
	
	/**
	 * By calling this constructor a new cell
	 * will be created with default content
	 * and the cells next and prev pointers will
	 * be set to null. This new cell will also 
	 * be the first cell, as well as, the current cell.
	 */
	public Tape()
	{
		Cell temp = new Cell();
		temp.content = ' ';
		temp.next = null;
		temp.prev = null;
		this.current = temp;
	}
	
	
	
	
	
	
	
	
	/**
	 * By calling this method the current cell
	 * will be returned.
	 */
	public Cell getCurrentCell()
	{
		return this.current;
	}
	
	
	
	
	
	
	
	
	/**
	 * By calling this method, the content
	 * of the current cell will be returned.
	 */
	public char getContent()
	{	
		return this.current.content;
	}
	
	
	
	
	
	
	
	/**
	 * By calling this method we should be 
	 * able to set the content of the current
	 * cell.
	 */
	public void setContent(char ch)
	{
		this.current.content = ch;
	}
	
	
	
	
	
	
	
	
	/**
	 * By calling this method, we should
	 * be able to move left along the tape.
	 * However, if we are currently at the left most
	 * point on the tape, then a new cell will be created.
	 */
	public void moveLeft()
	{	
		if (this.current.prev == null)
		{
			Cell temp = new Cell();
			temp.content = ' ';
			temp.prev = null;
			temp.next = this.current;
			this.current.prev = temp;
		}
		
		this.current = this.current.prev;
	}
	
	
	
	
	
	
	
	/**
	 * By calling this method, we should be
	 * able to move right over the tape.
	 * However, if we are currently at the right most
	 * point on the tape, then a new cell will be created.
	 */
	public void moveRight()
	{	
		if (this.current.next == null)
		{
			Cell temp = new Cell();
			temp.content = ' ';
			temp.next = null;
			temp.prev = this.current;
			this.current.next = temp;
		}
		
		this.current = this.current.next;
	}
	
	
	
	
	
	
	
	/**
	 * By calling this method, we should be
	 * able to traverse the tape and concatenate
	 * all the contents of the cells into one big string
	 * without leading or preceding white spaces and return it.
	 */
	public String getTapeContents()
	{
		Cell temp = this.current;
		
		while (temp.prev != null)
		{
			temp = temp.prev;
		}
		
		String str = "";
		
		while (temp != null)
		{
			str += temp.content;
			
			temp = temp.next;
		}
		
		return str.trim();
	}
}
