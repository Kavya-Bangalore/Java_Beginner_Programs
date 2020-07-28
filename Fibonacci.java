//To find fibonacci series of n terms.
import java.util.Scanner;
public class Fibonacci {
   public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
        int n,t1 = 0, t2 = 1,i=0;
        System.out.println("Enter the required number of terms:");
        n=sc.nextInt();
        System.out.println("First " + n + " terms: ");
        while (i < n)
        {
            System.out.print(t1 + " , ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            ++i;
        }
    }
}
/*Output:
Enter the required number of terms:
10
First 10 terms: 
0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34 ,
*/
