import java.util.Scanner;

public class sq_cube {
		
     public static void main(String[] args) {
    	 
    	 System.out.println("Enter the number :");
    	 
    	 Scanner scan = new Scanner (System.in);
    	 double nbr = scan.nextDouble();
    		
    	 System.out.println("The sqaure root of the "+nbr+" is : "+Math.sqrt(nbr));
    	 System.out.println("The sqaure root of the "+nbr+" is : "+Math.cbrt(nbr));
    	 	 
	}
}
