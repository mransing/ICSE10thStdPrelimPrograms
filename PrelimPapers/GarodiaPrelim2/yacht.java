
/**
 Define the class called yacht with the following specification.
Data Members	Purpose
int  yType	to store the yard type (1- premium, 2- super premium)
long  phno	phone of the customer
String name	to store the name of the customer
int hours	to store the number of hours the yacht is taken on the rent
int charges	to calculate and store the rental charge + 18% GST on the total charges
 
Member Methods	Purpose
void input()	To input and store the details of the customer
void compute()	To computer the rental charge
The rent for a yacht is charged on the basis of its type as follow
	Type 1 (Premium)	Type 2(Super Premium)
Hours	Charges	Charge
For Two Hours	₹ 1000 per hour	₹ 3000 per hour
For Five Hours	₹ 700 per hour	₹ 2500 per hour
More than 5 hours but less than 10 hours	₹ 500 per hour	₹ 2000 per hour
More than 10 hours	₹ 10000	₹ 20000

Void display()	To display the details in given format
Output (for example if user selected type1 for 3 hours)
Yacht Type	Phone No	Name	Hours	Charges
Premium	1234567890	Mr. Shyam	3	2100


Write a main method create an object of the class and call the above methods through the object created.

 */
import java.util.*;
public class yacht
{
   private int yType;
   private long phno;
   private String name;
   private int hours;
   private int charges;
   private Scanner sc;
   
   public void input(){
       sc = new Scanner(System.in);
       System.out.print("Enter the yacht type 1-Premium 2-Super Premium: ");
       yType = sc.nextInt();
       System.out.print("Enter the phone number: ");
       phno = sc.nextLong();
       sc.nextLine();
       System.out.print("Enter the name of the customer: ");
       name=sc.nextLine();
   }
   
   public void compute(){
       sc=new Scanner(System.in);
       System.out.print("Enter the hours: ");
       hours=sc.nextInt();
       switch(yType){
           case 1:
               if(hours <=2){
                   charges=hours * 1000;
               }else if (hours <= 5){
                   charges=hours * 750;
               }else if (hours <=10){
                   charges = hours * 500;
               }else {
                   charges = 10000;
               }
               break;
            case 2:
                if(hours <=2){
                   charges=hours * 3000;
               }else if (hours <= 5){
                   charges=hours * 2500;
               }else if (hours <=10){
                   charges = hours * 2000;
               }else {
                   charges = 20000;
               }
               break;
             default:
                 break;
       }
       charges = charges + (int)Math.round(charges * 0.18);
   }
   void display(){
       String yachtType="";
       switch(yType) {
           case 1:
               yachtType="Premium";
               break;
            case 2:
                yachtType="Super Premium";
            default:
                break;
       }
       System.out.println("Yacht Type\t\tPhone No\tName\t\tHours\tCharges");
       System.out.println(yachtType +"\t\t"+phno+"\t"+name+"\t\t"+hours+"\t"+charges);
   }
   
   void main(){
       yacht myYacht= new yacht();
       myYacht.input();
       myYacht.compute();
       myYacht.display();
   }
}
