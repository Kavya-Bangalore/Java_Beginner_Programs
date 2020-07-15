import java.util.Scanner;
public class CalculateYears {
	 static int minutesPerYear=365*24*60;
 static int getYears(int mins) {
	
	int numOfYears=mins/minutesPerYear;
	return numOfYears;
	 }
 static int getDays(int mins) {
	 int minutesPerDay=24*60;
	 int remainder=mins%minutesPerYear;
	 int numOfDays=remainder/minutesPerDay;
	 return numOfDays;
 }
 
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number of minutes:");
	 int minutes=sc.nextInt();
	 int years=getYears(minutes);
	 int days=getDays(minutes);
	 System.out.println(minutes+" minutes="+years+" Years and "+ days+" Days");                                       
	 }
}
/*
One year=? mins
=365days*24 hours*60 minutes
=525600 mins
one day=? mins
=24 hours*60 minutes
=1440 mins
for eg:
3456789 MINS=3456789/525600=6 days
rem=303189

rem/1440=303189/1440=210 days
*/
/*Output:
 
Enter the number of minutes:
3456789
3456789 minutes=6 Years and 210 Days

 */
