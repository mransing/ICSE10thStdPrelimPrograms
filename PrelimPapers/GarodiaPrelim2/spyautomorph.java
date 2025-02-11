
/**
 * Write a menu driven program to perform the following.
 Main menu 
a)	Spy number 
b)	Automorphic number 
c)	Exit 
where 
a)	Spy number - Accept a number from the user check whether it is a Spy number or not. 
Spy number – A positive integer is called a spy number if the sum and product of its digit are equal.
For Example – 1124
sum= 1 + 1 + 2 + 4 =8 
product= 1 *1* 2 * 4 =8 
Yes. 1124 is a spy number 
b)	Automorphic() - Automorphic number is the number which is contained in the last digit of its square.
 	For Example 25 is an automorphic number as its square is 625 and 25 is present as the last two digits. 

 */
import java.util.*;
public class spyautomorph
{
 void main(){
     char choice;
     int number;
     Scanner sc = new Scanner(System.in);
     System.out.println("Please enter choice : a - Spy Number b - Automorphic Number c- Exit");
     choice=sc.nextLine().charAt(0);
     switch(choice){
         case 'a':
             System.out.println("Enter the number");
             number=sc.nextInt();
             int temp=number,product=1,sum=0;
             while(number>0){
                 int lastDigit=number%10;
                 product = product * lastDigit;
                 sum = sum + lastDigit;
                 number=number/10;
             }
             if(product == sum){
                 System.out.println("The number " + temp + " is a spy number");
             }else{
                 System.out.println("The number " + temp + " is not a spy number");
             }
             break;
            case 'b':
                System.out.println("Enter the number");
                number=sc.nextInt();
                int square=number * number;
                String stringSquare=String.valueOf(square);
                String stringNumber=String.valueOf(number);
                if(stringSquare.endsWith(stringNumber)){
                    System.out.println("The number " + number + " is automorphic." );
                }else{
                    System.out.println("The number " + number + " is not automorphic." );
                }
                break;
         case 'c':
             System.out.println("Exiting");
             System.exit(0);
         default:
             break;
     }
 }
}
