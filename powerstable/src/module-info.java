/**
 * 
 */
/**
 * @author erino
 *
 */
import java.util.Scanner;
	public class SquareCubeApp {
	     public static void main(String[] args) {
	           try (Scanner scan = new Scanner(System.in)) {
				System.out.println("Learn your Squares and Cubes");
				   String choice = "Y";
				   while (choice.equalsIgnoreCase("y")) {
					  System.out.print("Enter an integer: ");
				       int n = scan.nextInt();
				             int number = 1;
				              int square;
				              int cube;
				              while (number <=n) {
				              System.out.println("\nNumber\t\tSquare\t\tCubes");
				              System.out.println("======\t       =======\t        =====");
				              while (number <=10&& number <= n ) {
				                  square = number * number;
				                  cube = number * number * number;
				                 
				                  System.out.printf(" %d\t \t%d\t \t%d\n", number, square, cube);
				                  number++;
				                
				              } ;
				       }
				       System.out.print("\nContinue? (y/n): ");
				       choice = scan.next();
			}
	       System.out.println();
	       }
	   }
	}