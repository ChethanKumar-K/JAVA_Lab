import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int a,b;
	    String prime="The prime nos are: ";
	    int flag=0;
	    Scanner x=new Scanner(System.in);
		System.out.print("Enter the number a:");
		a=x.nextInt();
		System.out.print("Enter the number b:");
		b=x.nextInt();
		for(int i=a;i<=b;i++){
		    flag=0;
		    for(int j=2;j<=i/2;j++){
		        if(i%j==0) flag=1;
		    }
		    if(flag == 0) prime = prime+i+" ";
	    }
	    System.out.println(prime);
	}
}
