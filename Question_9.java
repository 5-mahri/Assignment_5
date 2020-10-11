package assignment5;
import java.util.Scanner;
public class Question_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
				System.out.println("Enter number:");
		int num, i=1;
		String odd="";
		num =scan.nextInt();
		while (i <= num) {
			if (i%2 != 0)
				odd += i;
			else if (i==num) {
				odd+="";
			}else {
				odd+=", ";
			}
				
			i++;
		}
		System.out.println(odd);
		}
		}


