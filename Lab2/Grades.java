import java.lang.*;
import java.util.Scanner;

class Grades{
public static void main(String args[]){
int see;
int cie;
Scanner x=new Scanner(System.in);
System.out.print("Enter the cie marks below 51: ");
cie=x.nextInt();
System.out.print("Enter the see marks : ");
see=x.nextInt();
int total=cie+(see/2);
if(total>=90) System.out.println("The grade secured by student is S");
else if(total>=80) System.out.println("The grade secured by student is A");
else if(total>=70) System.out.println("The grade secured by student is B");
else if(total>=60) System.out.println("The grade secured by student is C");
else if(total>=50) System.out.println("The grade secured by student is D");
else if(total>=40) System.out.println("The grade secured by student is E");
else System.out.println("The student has failed in the subject. F Grade");
}
}
