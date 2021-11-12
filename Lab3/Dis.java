import java.lang.*;
import java.util.Scanner;
class Book{
String name,author;
double price,num_pages;
Book(String name,String author,double price,double num_pages){
this.name=name;
this.author=author;
this.price=price;
this.num_pages=num_pages;
}
static void toDis(){
println("Name:"+Book.name+"\nAuthor:"+this.author+"\nPrice:"+this.price+"\nNumber of Pages:"+this.num_pages);
}
}
class Display{
public static void main(String args[]){
Book x=new Book("Ignited Minds","Kalam",55.00,124);
x.toDis();
}
}
