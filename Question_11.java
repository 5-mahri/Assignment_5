package assignment5;

public class Question_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	         
		       for( int row=4; row>=1; row--) {
		    	   for(int i=1; i<=4-row; i++) {
		    		   System.out.print(" ");
		    	   }
		          for (int col=row; col>=1; col--) {
		    	    System.out.print(col+" ");
		          
		       }
		          System.out.println();
		       
		   }
		}
	}

