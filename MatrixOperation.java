import java.util.Scanner;
public class MatrixOperation {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of rows of first martrix:");
		int rowOne=sc.nextInt();
		System.out.println("Enter the number of columns of first martrix:");
		int colOne=sc.nextInt();
		System.out.println("Enter matrix One elements:");
		int a[][]=new int[rowOne][colOne];
		for(int i=0;i<rowOne;i++) 
		    for(int j=0;j<colOne;j++) 
			    a[i][j]=sc.nextInt();
		
		System.out.println("Enter the number of rows of second martrix:");
		int rowTwo=sc.nextInt();
		System.out.println("Enter the number of columns of second martrix:");
		int colTwo=sc.nextInt();
		System.out.println("Enter matrix Two elements:");
		int b[][]=new int[rowTwo][colTwo];
		for(int i=0;i<rowTwo;i++) 
			for(int j=0;j<colTwo;j++) 
				b[i][j]=sc.nextInt();
			
		//	Addition of matrices
		if(rowOne==rowTwo&&colOne==colTwo) {
		 int sums[][]=new int[rowOne][colOne];
		 for(int i=0;i<rowOne;i++) 
			    for(int j=0;j<colOne;j++) 
			    	sums[i][j]=a[i][j]+b[i][j];
		
		 System.out.println("Sum matrix:");
			for(int i=0;i<rowOne;i++) {
			    for(int j=0;j<colOne;j++) 
			    	System.out.print(sums[i][j]+" ");
			System.out.println();
			
		}
	}
		else 
			System.out.println("The matrices are of different order.Addition not possible");
		
		//Multiplication of matrices
		if(colOne==rowTwo) {
			int product[][]=new int[rowOne][colTwo];
			for(int i=0;i<rowOne;i++) {
			    for(int j=0;j<colTwo;j++) { 
			    	product[i][j]=0;
			        for(int k=0;k<rowTwo;k++) {
			    	product[i][j]=product[i][j]+(a[i][k]*b[k][j]);}}}
			    System.out.println("Product matrix:");
				for(int i=0;i<rowOne;i++) {
				    for(int j=0;j<colTwo;j++) 
				    	System.out.print(product[i][j]+" ");
				System.out.println();
				}
		}else
			System.out.println("Multiplication not possible");
		
 }
}
