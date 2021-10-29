import java.lang.*;
import java.util.Scanner;


/*Program to accept a number n from the user and print n rows of output as given below */

class Myclass{
	public static void main(String args[]){
		int n,j=1;
		System.out.printf("Enter the number of entries you need: ");
		Scanner x= new Scanner(System.in);
		n=x.nextInt();
		for(int i=1;i<=n;i++){
			for(int k=1;k<=i;k++){
				System.out.print(j+"\t");
				j=j+1;
			}
		System.out.println();
		}
	}
}
