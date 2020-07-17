//Voting system using switch case.
import java.util.Scanner;
public class SwitchCase {
	public static void main(String args[]) {
		boolean checkVoted;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to E-Voting");
		System.out.println("Enter you name: ");
		String voterName=sc.next();
		
		do {
			checkVoted=true;
			System.out.println("Enter the number accordingly:\n1 for BJP\n2 for Congress\n3 for AAP");
			int party=sc.nextInt();
		switch(party) {
		case 1:System.out.println(voterName+" voted for BJP");
	       break;
		case 2:System.out.println(voterName+" voted for Congress");
	       break;
		case 3:System.out.println(voterName+" voted for AAP");
	       break;
	     default:System.out.println("Entry invalid.Enter the number again");
	             checkVoted=false;
	             
		}
		}while(checkVoted!=true);
		System.out.println("Voted Successfully!");
		
	}
}
/*Sample Output:
Welcome to E-Voting
Enter you name: 
Kavya
Enter the number accordingly:
1 for BJP
2 for Congress
3 for AAP
5
Entry invalid.Enter the number again
Enter the number accordingly:
1 for BJP
2 for Congress
3 for AAP
2
Kavya voted for Congress
Voted Successfully!

*/
