import java.util.Scanner;

class checkPin{
    BankAccount bA = new BankAccount(2000);
    ATMMachine atm = new ATMMachine(bA);
    int PIN = 4895;
    Scanner sc = new Scanner (System.in);

    public checkPin(){
        System.out.println("   --: WELCOME to ATM! :--");
        System.out.print("Enter your 4 digit PIN: ");
        int enteredPIN = sc.nextInt();
        while(PIN != enteredPIN){
                System.out.println("Please Enter the valid PIN.");
                enteredPIN = sc.nextInt();
        }
        run();
    }
    public void run(){
        atm.start();
    }
}

class ATMMachine{
    private BankAccount bankAccount;
    Scanner  sc = new Scanner(System.in);
    
    public ATMMachine(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }
    
    public void menu(){
        System.out.println("   :--Menu--: ");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. EXIT");
    }
    public void withdraw(){
        System.out.println("Enter amount to Withdraw: ");
        double amount = sc.nextDouble();
        bankAccount.withdraw(amount);
    }
    public void deposit(){
        System.out.println("Enter amount to Deposit: ");
        double amount = sc.nextDouble();
        bankAccount.deposit(amount);
    }
    public void checkBalance(){
        System.out.println("Your Current balance is: "+bankAccount.getBalance());
    }
    
    public void start(){
        int choice =100;
        while(choice != 4){
            menu();
            choice = sc.nextInt();

            while (choice != 9 && choice != 7){
                switch (choice){
                    case 1 :
                    withdraw();
                    System.out.println("1. Withdraw Money");
                    System.out.println("9. GO BACK TO Menu");
                    choice = sc.nextInt();
                    break;
                    case 2 :
                    deposit();
                    System.out.println("2. Deposit Money");
                    System.out.println("9. GO BACK TO Menu");
                    choice = sc.nextInt();
                    break;
                    case 3 :
                    checkBalance();
                    System.out.println("3. Check Balance");
                    System.out.println("9. GO BACK TO Menu");
                    choice = sc.nextInt();
                    break;
                    case 4:
                    System.out.println(" Have a Good Day..");
                    break;
                    default :
                    System.out.println("Enter valid choice");
                    break;
                }
            }
        }
    }

}

class BankAccount{
    private double accBaln;
    
    public BankAccount(double balance){
        this.accBaln = balance;
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= accBaln){
            accBaln -= amount;
            System.out.println("Rs."+amount+" is Successfully Withdrawn.Now Reamining balance is: "+ accBaln);
        }else{
            System.out.println("Insufficient Balance to Withdraw...");
        }
    }

    public void deposit(double amount){
        if(amount > 0 ){
            accBaln += amount;
            System.out.println("Rs."+amount+" is Successfully Deposited.Now Available balance is: "+ accBaln);
        }else{
            System.out.println("Invalid amount to Deposit...");
        }
    }

    public double getBalance(){
        return accBaln;
    }
}

public class ATMInterface {
    public static void main(String []args){
        checkPin cP = new checkPin();
        cP.run();
    }
}