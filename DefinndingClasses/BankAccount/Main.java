package DefinndingClasses.BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Create a test client supporting the following commands:
        //•	Create
        //•	Deposit {Id} {Amount}
        //•	SetInterest {Interest}
        //•	GetInterest {ID} {Years}
        //•	End

        //Create
        //Create
        //Deposit 1 20
        //Deposit 3 20
        //Deposit 2 10
        //SetInterest 1.5
        //GetInterest 1 1
        //GetInterest 2 1
        //GetInterest 3 1
        //End

        String[]lineArguments=scanner.nextLine().split("\\s+");
        Map<Integer,BankAccount>accounts=new HashMap<>();
        //На първо място винаги трябва да имаме някаква команда;Create,Deposit,SetInterest,GetInterest,End;
        String command=lineArguments[0];
        while (!command.equals("End")){//Докато командата ни е различна от End,ние ще ги четем и ще ги изпълняваме
            //От всяка една от командите ще трябва да принтираме нещо
            //За това нещо,което ще принтираме можем да си го изкараме в отделна променлива ->
            String result="";
         //Започваме със създаването на функционалностите със switch/case
            switch (command){
                case "Create"://Трябва да си създаме банкова сметка и да принтираме,че акаунт ИД е създане--> Account ID1 created
                   BankAccount bankAccount=new BankAccount();
                   accounts.put(bankAccount.getId(),bankAccount);//Номера ID i самият банкова акаунт
                   result=String.format("Account ID%d created",bankAccount.getId());
                    break;
                case "Deposit"://При Deposit ще ни дадат ID на сметка и ние ще трябва да добавим парите,които са дали ->
                    //За тази цел тия пари трябва да ги държим някъде -> Map -> Понеже ще ги търсим по ID най-лесно ще бъде да ги държим в мап
                    //От едната страна ще имаме ID,а от другата самите банкови сметки
                    //deposit метод взима парите и ги добавя към баланса на конкретната банкова сметка

                  //Преди да депозираме пари по сметката,първо трябва да проверим дали имаме въобще запазена банкова сметка
                    //Като преди да видим дали имаме банкова сметка,трябва да запазваме нещо ->
//                    BankAccount bankAccount1=new BankAccount();//Реално ние,когато създаваме банкова сметка ние ще трябва да я добавим в мап с нашите акаунти
                    //Първо трябва да проверим дали имаме такава банкова сметка;за целта от командата ще си вземем ID-to(lineArgument[1] и парите,които искаме да добавим(lineArguments[2]);
                    int accountID=Integer.parseInt(lineArguments[1]);
                    double money=Double.parseDouble(lineArguments[2]);
                    //Проверяваме дали accounts съдържа accountsID
                    if(accounts.containsKey(accountID)){
                        //Ако имаме си го създавме -> нов обект bankAccount1
                        BankAccount bankAccountFromMap=accounts.get(accountID);//Към този банкова акаунт трябва да добавим money
                        bankAccountFromMap.deposit(money);
                        //И ще трябва отнова да върнем bankAccountFromMap в мапа
                        accounts.put(accountID,bankAccountFromMap);//този банкова акаунт ще бъде с новите пари
                        result=String.format("Deposited %.0f to ID%d",money,accountID);
                        break;
                    }else{
                        result="Account does not exist";
                        break;
                    }
                case "SetInterest"://С този метод трябва да сетнем лихвения процент за всички банкови сметки
               //Първо трябва да си вземем новият лихвен процент ->
                    double interestRate=Double.parseDouble(lineArguments[1]);
                    BankAccount.setInterest(interestRate);//Използвам си сетъра на bankAccount//това можем да го нарпавим,защото лихвения процент ни е еднакъв за всички банкови сметки;за това можем да го сложим директно на BankAccounta
                    //това е статичен метод,който променят interest
                    break;

                case "GetInterest"://При него трябва да вземем банкова сметка и да принитаме каква ще е лихвата за броя години,които ни дават
                    //Първо трябва да си вземем банковата сметка на която ще смятата лихвата от нашият мап
                    int accountIDGetInterest=Integer.parseInt(lineArguments[1]);
                    int years=Integer.parseInt(lineArguments[2]);//Броя години,с които ще смятаме лихвата

                    if(accounts.containsKey(accountIDGetInterest)){
                        BankAccount bankAccount1=accounts.get(accountIDGetInterest);
                        double totalInterest=bankAccount1.getInterest(years);
                        result=String.format("%.2f",totalInterest);
                    }else{
                        result="Account does not exist";
                    }
                    break;

            }

            if(!result.isEmpty()){
                System.out.println(result);
            }
//            command=scanner.nextLine();
            lineArguments=scanner.nextLine().split("\\s+");
            command=lineArguments[0];
        }

    }
}
