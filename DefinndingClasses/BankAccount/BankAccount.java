package DefinndingClasses.BankAccount;

public class BankAccount {
//The class should have private fields for:
//•	Id: int (Starts from 1 and increments for every new account)
//•	Balance: double
//•	Interest rate: double (Shared for all accounts. Default value: 0.02)
    private int id;
    private double balance;
    private static double interest=0.02;
    private static int accountCount=0;//създавам си брояч за акаунтите
    //брояча трябва да бъде statis за да може да бъде споделен от всички банкови сметки

    //The class should also have public methods for:
    //•	setInterestRate(double interest): void (static)
    //•	getInterest(int Years): double
    //•	deposit(double amount): void

    public BankAccount(){
        accountCount++;
        this.id=accountCount;//ИД-то на нашата сметкаа е равно на броя акаунти
        //Първоначалнот започваме от 0;След това си създавме първата банкова сметка ->
        //accountCount ще бъде равно на 1,ID-то на нашата сметка ще бъде равно на 1
        this.balance=0;//баланса на нашата сметка ще бъде 0 в началото
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterest() {
        return interest;
    }

    public static void setInterest(double interest) {
        BankAccount.interest = interest;
    }
    //Във мейнт метода трябва да четем всяка една от тези команди;да я четем и да я изпълняваме;
    //Create a test client supporting the following commands:
    //•	Create
    //•	Deposit {Id} {Amount}
    //•	SetInterest {Interest}
    //•	GetInterest {ID} {Years}
    //•	End

    //имплементираме си депозит
    //•	deposit(double amount): void
    public void deposit(double money){
        //deposti не може да бъде статично,защото всеки път,когато депозираме искаме да бъде на конкретна банкова сметка
        this.balance+=money;
        //На баланса искам да си добавя парите
    }

    public double getInterest(int years){//Трябва да сметна лихвата,която ще натрупаме за определен брой години
        //getInterest Приема години
        //Трябва да върнем годините * лихвения процент * баланса
        return years * interest *  this.balance;
    }
}
