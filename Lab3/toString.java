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
        return ("\nname="+name+"\nauthor : "+author+"\nprice : "+price+"\nnum_pages : "+num_pages+"\n");
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
            nam=x.nextLine();
            aut=x.nextLine();
            pri=x.nextInt();
            nump=x.nextInt();
            a[i] =new Book(nam,aut,pri,nump);
        }
        System.out.print("Enter the index of the book array whose details is to be displayed : ");
        int b=x.nextInt();
        System.out.print(toString(a[b]));
    }
}
