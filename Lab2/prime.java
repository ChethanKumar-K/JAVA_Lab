import java.lang.*;
import java.util.Scanner;

//Print the prime numbers between two integers

class Prime{
	public static void main(String args[]){
		int a,b,flag=0,j,k=2;
		Scanner x=new Scanner(System.in);
		System.out.print("Enter the first number :");
		a=x.nextInt();
		System.out.print("Enter the second number :");
		b=x.nextInt();
		for(int i=a;i<=b;i++){
			while(k<=i/2){
				if(i%k==0){
					flag=1;break;
				}
				k++;
			}
			if(flag==0){
				System.out.print(i+" ");
			}
		}
	}
}
