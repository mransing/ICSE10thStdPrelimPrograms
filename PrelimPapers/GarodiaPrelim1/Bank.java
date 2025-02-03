import java.util.*;

class Bank {
    
    int acc_num[];
    int acc_bal[];
    String name[];
    int n_accounts;
        
    public void accept(){
        int l_acc_number, l_balance;
        String l_name;
        acc_num = new int[10];
        acc_bal=new int[10];
        name=new String[10];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<10;++i){
            System.out.println("Enter the account number");
            l_acc_number=sc.nextInt();
            acc_num[i]=l_acc_number;
            System.out.println("Enter the account balance");
            l_balance=sc.nextInt();
            sc.nextLine();
            acc_bal[i]=l_balance;
            System.out.println("Enter the name");
            l_name=sc.nextLine();
            name[i]=l_name;
        }
    }
    
    public void compute(){
        int l_acc_no,acc_index=-1,age,acc_balance;
        double interestRate;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number");
        l_acc_no=sc.nextInt();
        for(int i = 0;i<10;++i){
            if(acc_num[i] == l_acc_no){
                acc_index=i;
                break;
            }
        }
        if(acc_index == -1){
            System.out.println("Wrong Number. Please try again.");
            return;   
        }
        System.out.println("Enter the age");
        age=sc.nextInt();
        acc_balance=acc_bal[acc_index];
        
        if(acc_balance <= 10000){
            interestRate = 3.5;
        }else if (acc_balance <= 200000){
            interestRate=4.3;
        }else if (acc_balance <= 900000){
            interestRate=4.9;
        }else if (acc_balance <=10000000){
            interestRate=5.4;
        }else{
            interestRate=6.3;
        }
        if(age >=60){
            interestRate = interestRate + 0.5;
        }
        System.out.println("Interest rate is " + interestRate);;
    }
    
    void display(){
        System.out.println("Name - Account Number - Account Balance");
        for(int i =0;i<10;++i){
            System.out.println(name[i] + " " + acc_num[i] + " " + acc_bal[i]);
        }
    }
    
    void main(){
        Bank new_bank= new Bank();
        new_bank.accept();
        new_bank.compute();
        new_bank.display();
    }
}