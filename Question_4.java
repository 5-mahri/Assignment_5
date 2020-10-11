package assignment5;
import java.util.Scanner;
public class Question_4 {

public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	int result = 0;
	while(result < 100) {
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		result=num*10;
        System.out.println("Final value is:"+ result);
	}
	
	System.out.println("The end");
	
}
}
