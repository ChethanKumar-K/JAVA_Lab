import java.util.Scanner;
abstract class Account{
    double bal=0;
    String name,ac_num;
    Scanner x= new Scanner(System.in);
    Account(){
        System.out.print("Enter the name : ");
        name=x.nextLine();
        System.out.print("Enter the account number : ");
        ac_num=x.nextLine();
    }
    abstract void deposit();
    abstract void withdraw();
    abstract void display();
    abstract void chequebook();
}
class SavAcct extends Account{
    SavAcct(){
        super();
    }
    double amt,wamt;
    Scanner x=new Scanner(System.in);
    void deposit(){
        System.out.print("Enter the amount you will need to deposit : ");
        amt=x.nextDouble();
        bal=bal+amt;
        System.out.println("Balance amount is "+bal);
    }
    void withdraw(){
        System.out.print("Enter the amount you need to withdraw : ");
        wamt=x.nextDouble();
        if(bal-wamt>=0){
            bal=bal-wamt;
            System.out.println("Current balance is "+bal);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    void chequebook(){
        System.out.println("Cheque book facility is not available for this account ");
    }
    void display(){
        System.out.println("Account holder name : "+name);
        System.out.println("Account number : "+ac_num);
        System.out.println("Your Savings Account balance is "+bal);
    }
}
class CurrAcct extends Account{
    CurrAcct(){
        super();
    }
    double amt,wamt;
    Scanner x=new Scanner(System.in);
    void deposit(){
        System.out.print("Enter the amount you will need to deposit : ");
        amt=x.nextDouble();
        bal=bal+amt;
        System.out.println("Balance amount is "+bal);
    }
    void withdraw(){
        System.out.print("Enter the amount you need to withdraw : ");
        wamt=x.nextDouble();
        if(bal-wamt>=500){
            bal=bal-wamt;
            System.out.println("Current balance is "+bal);
        }
        else{
            System.out.println("Transaction failed because Transaction leads to Insufficient balance");
        }
    }
    void chequebook(){
        System.out.println("Cheque book facility is available for this account ");
    }
    void display(){
        System.out.println("Account holder name : "+name);
        System.out.println("Account number : "+ac_num);
        System.out.println("Your Savings Account balance is "+bal);
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner x=new Scanner(System.in);
	    int ac_choice,func;
		System.out.println("1.Savings Account \n2.Current Account\n3.Exit");
		System.out.print("Enter the type of account : ");
		ac_choice=x.nextInt();
		if(ac_choice==3){
		    System.exit(1);
		}
		else if(ac_choice==2){
		    CurrAcct curac=new CurrAcct();
		    System.out.println("1.Deposit\n2.Withdraw\n3.Cheque Book\n4.Display\n5.Exit");
		    System.out.print("Enter your choice : ");
		    func=x.nextInt();
		    while(func!=5){
		        switch(func){
		            case 1:
		                curac.deposit();
		                break;
		            case 2:
		                curac.withdraw();
		                break;
		            case 3:
		                curac.chequebook();
		                break;
                    case 4:
                        curac.display();
                        break;
                    case 5:
                        System.exit(1);
                    default:
                        System.out.println("Please Enter Correct Choice");
                        break;
		        }
		        System.out.print("Enter your choice : ");
		        func=x.nextInt();
		    }
		}
		else if(ac_choice==1){
		    SavAcct savac=new SavAcct();
		    System.out.println("1.Deposit\n2.Withdraw\n3.Cheque Book\n4.Display\n5.Exit");
		    System.out.print("Enter your choice : ");
		    func=x.nextInt();
		    while(func!=5){
		        switch(func){
		            case 1:
		                savac.deposit();
		                break;
		            case 2:
		                savac.withdraw();
		                break;
		            case 3:
		                savac.chequebook();
		                break;
                    case 4:
                        savac.display();
                        break;
                    case 5:
                        System.exit(1);
                    default:
                        System.out.println("Please Enter Correct Choice");
                        break;
		        }
		        System.out.print("Enter your choice : ");
		        func=x.nextInt();
		    }
		}
		else{
		    System.out.println("Invalid Choice ");
		}
	}
}
