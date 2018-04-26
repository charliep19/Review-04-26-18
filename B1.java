import java.util.Scanner;
import java.util.Scanner;
public class B1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		Scanner scan=new Scanner(System.in);
		
			System.out.println("Enter 8 different numbers");
			for(int i=0; i<9; i++) {
				
			
					int nums =scan.nextInt();
				
				
				sum=sum+nums;
				
				System.out.println("Average:"+ sum/8);
				
				
			}	


	}

}
