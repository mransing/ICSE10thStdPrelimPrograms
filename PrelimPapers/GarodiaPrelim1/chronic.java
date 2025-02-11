
/**
 Write a menu driven program to perform the following 
    a)	sum
    To print the Pronic numbers between 1 and the limit enter by the user 
    for example if n= 10 output 2, 6, 12, 20,30, 42, 56, 72, 90
    Pronic number is a number that is the product of two consecutive integers. 
    b)	Pattern 
    for example n= 5 
    output 
    1
    21
    321 
    4321
    54321
    Note: accept n from the user to perform the above options.
 */
import java.util.*;
public class chronic
{
    void main(){
        char ch;
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the choice a or b ");
        ch = sc.next().charAt(0);
        switch(ch){
            case 'a':
                System.out.print("Enter n ");
                n=sc.nextInt();
                if(n == 1){//Special treatment when n is 1 
                    System.out.println(2);
                    break;
                }
                for(i = 1; i< n-1;++i){
                     int chronicNumber = i * (i+1);
                     System.out.print(chronicNumber + ",");
                }
                System.out.println(n * (n-1));//Last chronic number to avoid , at end
                break;
            case 'b':
                System.out.print("Enter n ");
                n=sc.nextInt();
                  for(i=1;i<=n;++i){
                      for(int j = i ; j>0;--j) {
                          System.out.print(j);
                        }
                        System.out.print("\n");
                  }
                break;
            default:
                System.out.println("Wrong choice.");
        }
    }
};
