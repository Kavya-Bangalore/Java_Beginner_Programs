public class Employee {
String name,address;
int year,salary;
    
   Employee(String name,int year,int salary,String address){
	this.name=name;
	this.address=address;
	this.year=year;
	this.salary=salary;
	}
    private void print() {
    	System.out.printf("%-10s %-16d %-8d %-20s",name,year,salary,address);
    	System.out.println();
    }
    public static void main(String args[]) {
    	Employee e1=new Employee("Robert",1994,20000,"64C- Walls Street");
    	Employee e2=new Employee("Sam",2000,30000,"68D- Walls Street");
    	Employee e3=new Employee("John",1999,40000,"26B-Walls Street");
    	System.out.printf("%-10s %-16s %-8s %-20s","Name","Year Of Joining","Salary","Address");
    	System.out.println();
    		e1.print();
    		e2.print();
    		e3.print();
    }
}
/*
Output:
Name       Year Of Joining  Salary   Address             
Robert     1994             20000    64C- Walls Street   
Sam        2000             30000    68D- Walls Street   
John       1999             40000    26B-Walls Street    

*/
