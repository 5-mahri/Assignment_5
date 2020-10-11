package assignment5;
import java.util.Scanner;
public class Question_8 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number:");

		 int sum=0, num, i;
		 
          num =scan.nextInt();
         for (i=1; i<=num; i++) {
        	 sum+=i;
        }
         System.out.println(sum);
		}
	}
