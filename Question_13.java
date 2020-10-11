package assignment5;

public class Question_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for(int j=1; j<=8; j++) {
	   if (j%2 == 1) {	
	
		for(int i=1; i<=8; i++) {
			if (i%2 == 1) {
				System.out.print("W");
			}else {
				System.out.print("B");
			}
			System.out.print(" ");
		}
		}else { 
		for(int i=1; i<=8; i++) {
			if (i%2 == 1) {
				System.out.print("B");
			}else {
				System.out.print("W");
			}
			System.out.print(" ");
		}
		}
	   System.out.println();
	}
	}
}
