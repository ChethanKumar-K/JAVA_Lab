import java.lang.*;
import java.util.Scanner;

class Book{
    String name,author;
    int price,num_pages;
    Book(String n,String a,int pr,int np){
        name=n;
        author=a;
        price=pr;
        num_pages=np;
    }
    public String toString(){
        return ("\nname :"+name+"\nauthor : "+author+"\nprice : "+price+"\nnum_pages : "+num_pages+"\n");
    }
}
class Main{
    public static void main(String args[]){
        String nam,aut;
        int pri,nump;
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the number of books in the array: ");
        int j=x.nextInt();
        Book[] a=new Book[j];
        for(int i=0;i<j;i++){
            System.out.println("Enter the name of the book "+(i+1)+":");
            nam=x.nextLine();
            System.out.println("Enter the author of the book "+(i+1)+":");
            aut=x.nextLine();
            System.out.println("Enter the price of the book "+(i+1)+":");
            pri=x.nextInt();
            System.out.println("Enter the number of pages of the book "+(i+1)+":");
            nump=x.nextInt();
            a[i] =new Book(nam,aut,pri,nump);
        }
        System.out.print("Enter the index of the book array whose details is to be displayed : ");
        int b=x.nextInt();
        if(b>=0 && b<=j){
            System.out.print(a[b]);
        }
        else{
            System.out.println("No such index exist");
        }
    }
}
