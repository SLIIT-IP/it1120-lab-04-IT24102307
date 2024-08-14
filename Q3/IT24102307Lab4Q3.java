import java.util.Scanner;

public class IT24102307Lab4Q3
{
    public static void main(String[] args) 
    {

	Scanner input = new Scanner(System.in);
	
	//Input the number
	System.out.print("Enter a number: ");
	int number = input.nextInt();

	//Ternary expression
	String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";

	System.out.println("The number is: " + result);

    }
}