// To check if an input number is prime or not.
import java.util.Scanner;

public class CheckPrime {
    public static void main(String args[])
	   {		
		int temp;
		boolean isPrime=true;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		if(isPrime)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");
	   }
	}
  
  /*
  Output 1:
  Enter the number:
3
3 is a Prime Number

Output 2:
Enter the number:
4
4 is not a Prime Number

  */
