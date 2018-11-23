//Print all the even numbers from array.
package mypackage;

	class Displayeven
		{

		//Declaring an array of numbers
		int[] numbers=new int[10];
		int j;
			
		//Constructor to initialize value
		Displayeven()
			{
			j=1;
			}
		
		//Method to initialize the list of numbers
		void initializeNumbers()
			{
				//Initialize array of numbers
				for(int i=0;i<10;i++)
					{
						numbers[i]=j++;
					}
				System.out.println("The List of Numbers in Array are :");
				System.out.println("**************************************");
				
			  //loop to display the list of numbers to verify for even
				for (int i=0;i<10;i++)
				System.out.println(numbers[i]);
				
			}

		void printEven()
		 {
			System.out.println("The Even Numbers are:");
			System.out.println("**************************************");
			for (int i=0;i<10;i++)
				{
				if(numbers[i]%2==0)
					System.out.println(numbers[i]);
				}
		 }
		
		
		}
		
		
	public class ArrayEven {

		//Declaration of main method
		public static void main(String[] args)
			{
		Displayeven obj=new Displayeven();
		obj.initializeNumbers();
		System.out.println();
		obj.printEven();
			}
}//End of program