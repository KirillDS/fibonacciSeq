package fibonacciSeq;

//Necessary import for scanner feature
import java.util.Scanner;

public class fibonacci {

//By Kirill David Sorokin
	
	//Global variable
	private static Scanner scanInput;
	private static int number;
	
	/* The main method that calls the constructor method,
	 * the sequence's length will match the user's input.*/
	public static void main(String[] args) {
		scanInput = new Scanner(System.in);
		System.out.println("Input an Integer Value: ");
		number = scanInput.nextInt();
		fibonacciSeq(number);
	}
	/* The sequence constructor; 
	 * takes the user input and loops into and then increments 
	 * the value, then takes the previous value and adds it to 
	 * the new value until the new value is greater than the input, 
	 * to which the loop halts and the value is set to a variable 
	 * that is then printed.*/
	public static void fibonacciSeq(int number) {
		int i, firstValue = 0, secondValue = 1, nextValue;
			for(i=0;i<number;++i) {
				if(i<=1) {
					nextValue = i;
				}
				else {
					nextValue = firstValue+secondValue;
					firstValue = secondValue;
					secondValue = nextValue;
				}
				System.out.print(nextValue+" ");
			}
		}
}
