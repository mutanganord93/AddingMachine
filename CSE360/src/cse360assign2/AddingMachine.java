/**
 * Author: Bill Nkunzumwami
 * //Class ID: 360-85141
 * Program to practice with version control using github
 */

package cse360assign2;

public class AddingMachine 
{
	/**
	 * create a private variable Myhistory to keep track of all history operation
	 */
	private int total;
	private String Myhistory;
	
	public AddingMachine () 
	{
		total = 0;  
		Myhistory = "";
	}
	
	public int getTotal () 
	{
		return total;
	}
	
	public void add (int value) 
	{
		total = total + value;
		/**Concatenate value and sign to Myhistory*/
		Myhistory += " + " + value;
	}
	
	public void subtract (int value) 
	{
		total = total - value;
		Myhistory += " - " + value;
	}
	
	public String toString () 
	{
		/**return a string which start with 0*/
		return "0" + Myhistory ;
	}
	
	public void clear() 
	{
		
	}
}