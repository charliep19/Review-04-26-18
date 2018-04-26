import java.util.Scanner;
public class B2x {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
while(true)
{
	System.out.println("New app for Insurance");
	System.out.println("Whats's your age?");
	int age=scan.nextInt();
	System.out.println("What is your weight?");
	double weight=scan.nextDouble();
	System.out.println("What's your yearly income?");
	double income=scan.nextDouble();
	if(age<18)
	{
		System.out.println("You will be in the minor category");
	
	}
	else if((age>=18)&&(age<38)&&(weight<200))
	{
		System.out.println(" You will be in the healthy category");
	}
	else if ((age>=38)&&(age<58)&&(income>50000))
	{
		System.out.println("You will be in the low category");
	}
	else if (age>58)
	{
		System.out.println("add high risk catrgory");
	}
	else
	{
		System.out.println("error");
	}
	
	
	
}
	
	}

}
