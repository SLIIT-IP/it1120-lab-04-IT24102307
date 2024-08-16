import java.util.Scanner;

public class IT24102307Lab4Q2 
{
    public static void main(String[] args) 
    { 
	double totalexam=0;
	Scanner input = new Scanner(System.in);

	System.out.print("Please enter the exam marks (out of 100): ");
	int exammarks = input.nextInt();

	if (exammarks > 100) 
	// Marks is greater than 100
	System.out.println("Invalid input for exam marks. Terminating program."); 

	else if (exammarks < 101)
	// Marks is less than 100
	System.out.print("Please enter lab sumbission marks (out of 100): ");
	int labmarks = input.nextInt();

	if (labmarks > 100) 
	// Marks is greater than 100
	System.out.println("Invalid input for lab marks. Terminating program.");

	else if (labmarks < 101)
	// Marks is less than 100
	System.out.print("Please enter the percentage given for the exam: ");
	int examper = input.nextInt();

	//Input Percentage
	System.out.print("Please enter the percentage given for the lab: ");
	int labper = input.nextInt();

	totalexam = (exammarks * (examper/100.0)) + (labmarks * (labper/100.0)) ;

	int totalper = examper+labper;

	if (totalper > 100) 
	System.out.println("The percentages must add up to 100. Terminating program");
	
	else if (totalper < 101)
	System.out.println("Final Exam Mark is: " + totalexam); 

    }
}