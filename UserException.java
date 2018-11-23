/*Generate user defined exception NegativeAgeException if the user 
inputs negative value of age*/

package mypackage;

import java.io.*;

//Creating user defined execption 
class NegativeAgeException extends Exception
	{
		private int age;
		
		//Defining constructor
		NegativeAgeException(int num)
		{
			age=num;
		}
		
		//To print the user defined exception message when age is negative
		public String toString()
			{
			return "Negative Age:"+age;
			}
		
	}


public class UserException {
	//Defining static method
	static void verifyNumber(int num) throws NegativeAgeException
	{
		if(num < 0)//check if age is less than 0
			//Throwing the userdefined exception
			throw new NegativeAgeException(num);
		else
			System.out.println("User not entered negative number.");
	}
		//Declaration of main method
	public static void main(String[] args) throws IOException
		{
	
		System.out.println("Enter the Age:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int age=Integer.parseInt(br.readLine());
		
		//Handling user defined exception
		try
			{
			verifyNumber(age);
			}
		catch(NegativeAgeException e)
			{
			System.out.println("User entered "+e);
			}
		
		}

} //End of program
