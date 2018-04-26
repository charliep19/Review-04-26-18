import java.util.Scanner;

public class B3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int [] numlist= new int[5];
		 
		 
		for (int i=0; i<numlist.length; i++) 
		{
		numlist[i] = scan.nextInt();
		}
		
for (int i=0; i<numlist.length; i++) {
	if(numlist[i]%2==0) {
		System.out.println(numlist[i]);
	}
}
		}
	}


