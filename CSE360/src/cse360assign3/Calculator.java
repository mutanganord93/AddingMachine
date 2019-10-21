package cse360assign3;

public class Calculator extends AddingMachine
{
	/*public Calculator() 
	{
		String history = this.Myhistory;
		int total = this.total;
	}*/
	
	public void mult (int value) 
	{
		total = total * value;
		/**Concatenate value and sign to Myhistory*/
		Myhistory += " * " + value;
	}
	
	public void div (int value) 
	{
		if(value == 0) {
			total = 0;	
		}
		
		else 
			total = total / value;
		
		Myhistory += " / " + value;
	}
	
	public void power(int value)
	{
		if(value < 0) {
			total = 0;
		}
		else
			total = total^(value);
		Myhistory += " ^ " + value;
	}
}
