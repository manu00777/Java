
//Java Program to demonstrate the working of a banking-system  
//where we deposit and withdraw amount from our account.  
//Creating an Account class which has deposit() and withdraw() methods 


class Account{

    int acno;
    String name;
    float amount;
 
    //Method to initialize object  
    void insert(int a,String n,float am)
    {
        acno =  a;
        name = n ;
        amount =  am;

    }

    void deposit(float amt)
    {
        amount = amount + amt;
        System.out.println(amt +" Deposited");
    }
    void withdraw(float amt)
    {
            if(amt > amount )
            {
                System.out.println("insufficient Balance");
            }
            else
            {
             amount = amount - amt;
             
             System.out.println(amt + "withdrawn");
            }

    }
    void display()
    {
    System.out.println("ACCOUNT NO ="+ acno +" NAME = "+ name +" AMOUNT "+ amount);
    }
    void balance()
    {
        System.out.println(amount +" Total Balance");
    }
}


public class BankingClass {
    public static void main(String[] args) {
        Account r1 = new Account();
        
        r1.insert(123456, "manoj", 85000);
        r1.display();
        r1.deposit(5000);
        r1.balance();
        r1.withdraw(2000);
        r1.balance();

        
        
    }
}
