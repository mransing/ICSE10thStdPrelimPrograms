
/**
	void print() – 
Print the sum of first 10 terms of Fibonacci series.
Fibonacci Series:- 0,1,1,2,3,5.. 

	void print (int x) 
Print the sum of the following series 
sum=x-x/2!+x/3!-x/4!…10 times
n! means -  1 x 2 x 3.. n times 
	void print(String s) 
To print the following.
For example s=”HAPPY”
H
HA
HAP
HAPP
HAPPY
 */
import java.util.*;
public class overloadibgPrint
{
    void print(){
        int sum=0;
        int f1=0,f2=1;
        int i;
        sum = f1 + f2;
        for(i=0;i<8;++i){
            int f3=f1+f2;
            f1=f2;
            f2=f3;
            sum = sum + f3;
        }
        System.out.println("Sum of first 10 Fibonacci numbers is " + sum + "\n");
    }
    
    void print(int x){
        double sum=0;
        long fact=1;
        for(int i=1;i<=10;++i){
            fact = fact * i;
            double fraction = (1.0*x/fact); 
            
            if(i%2 == 1){
                sum = sum + fraction;    
            }else{
                sum = sum - fraction;
            }
            
        }
        System.out.println("Sum of Series is " + sum + "\n");
    }
    
    void print(String s){
        int len=s.length();
        for(int i=1;i<=len;++i){
            String substr=s.substring(0,i);
            System.out.println(substr);
        }
    }
    
    void main(){
        print();
        print(5);
        print("HAPPY");
    }
}
