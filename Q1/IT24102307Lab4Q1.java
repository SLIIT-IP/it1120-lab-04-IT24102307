import java.util.Scanner;

public class IT24102307Lab4Q1 
{
    public static void main(String[] args) 
    { 

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	if (number < 0) 
	// negative
	System.out.println("The Number is : Negative");

	else if (number > 0)
	// it's a positive
	System.out.println("The Number is : Positive");

	else if (number == 0)
	// Number is a zero
	System.out.println("The Number is Zero");

    }
}