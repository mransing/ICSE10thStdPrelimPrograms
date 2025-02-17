
/**
 Write a menu driver program.
(a)	To accept a number and print whether the number is a Dudeney number or not. 
        A number is said to be Dudeney number if the cube of the summation of the 
        digits of the number is equal to the number itself E.g. 512 is a dudeney number
        5 + 1 + 2 =8
        And cube of 8 is 512  
(b)	To accept the number and print whether it is a SuperSpy number or not. A number is said to be a superspy number if the sum of the digits of the number is equal to the number of digits of the number entered. 
E.g. 1021
No of digits = 4
Sum ofdigits = 1 + 0 + 2 + 1 = 4

 */
import java.util.*;
public class DudeneySuperSpy
{
    void main(){
        Scanner sc = new Scanner(System.in);
        char choice;
        int n;
        System.out.print("Enter the choice : a - Dudeney Number b - SuperSpy Number ");
        choice=sc.nextLine().charAt(0);
        System.out.print("Enter the number: ");
        n=sc.nextInt();
        int temp,sum_digits=0,count_digits=0;
        switch(choice){
            case 'a': 
                temp=n;
                sum_digits=0;
                while(n>0){
                    int last_digit=n%10;
                    sum_digits = sum_digits + last_digit;
                    n=n/10;
                }
                int cubeSum=sum_digits * sum_digits * sum_digits;
                if(cubeSum == temp){
                    System.out.println("The number " + temp +  " is a Dudeney Number.\n" );
                }else{
                    System.out.println("The number " + temp +  " is not a Dudeney Number.\n" );
                }
                break;
            case 'b' :
                temp=n;
                sum_digits=0;
                while(n>0){
                    count_digits++;
                    int last_digit=n%10;
                    sum_digits = sum_digits + last_digit;
                    n=n/10;
                }
                if(count_digits == sum_digits){
                    System.out.println("The number " + temp + " is a Super Spy Number\n" );
                }else{
                    System.out.println("The number " + temp + " is not a Super Spy Number\n" );
                }
                break;
            default:
                break;
        }
    }
}
