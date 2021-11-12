import java.lang.*;
import java.util.Scanner;
class Quad{
public static void main(String args[]){
System.out.println("Program to find the roots of quadratic equation ax^2+bx+c");
double a,b,c,r1,r2;
Scanner y=new Scanner(System.in);
System.out.print("Enter the coefficient of x^2 : ");
a=y.nextDouble();
System.out.print("Enter the coefficient of x^1 : ");
b=y.nextDouble();
System.out.print("Enter the constant value : ");
c=y.nextDouble();
double D=(b*b)-(4*a*c);
if(D==0){
System.out.println("The roots are real and equal");
System.out.println("The roots of the equation are:");
r1=-b/(2*a);
r2=-b/(2*a);
System.out.println(r1+" and "+r2);
}
else if(D>0){
System.out.println("The roots of the equation are real");
System.out.println("The roots of the equation are:");
r1=(-b+Math.sqrt(D))/(2*a);
r2=(-b-Math.sqrt(D))/(2*a);
System.out.println(r1+" and "+r2);
}
else{
System.out.println("The roots of the equation are not real");
}
}
}
