
/**
Define a class Courier as per following specifications.
Class  	Courier
Data Members	
s_name	To store the name of the sender
weight	To store the weight of the parcel
r_name	To store the name of the receiver
r_add	To store receiver's address
Member methods	
vaid accept()	Accepts all required details
void calculate()	Calculates the charges for delivering the parcel 
as per following table

Weight in gms/ kg	  Charges per gms/Kg
upto 750 grams	             Rs 200
For the weight exceeding 
750 grms but not exceeding 
1250gms	                    Rs 350
Exceeding 1250gms	      Rs 475

void display()	Displays the details
void main()
	Creates object of the class and invokes the
methods.

 */
import java.util.*;

public class Courier
{
    private String s_name;
    private int weight;
    private String r_name;
    private String r_add;
    private double charges;
    
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the customer name: ");
        s_name=sc.nextLine();
        System.out.print("Enter the reciever's name: ");
        r_name=sc.nextLine();
        System.out.print("Enter the reciever's address: ");
        r_add=sc.nextLine();
        System.out.print("Enter the parcel's weight in grams: ");
        weight=sc.nextInt();
    }
    
    void calculate(){
        if(weight <= 750){
            charges = 200.0 * (weight/1000.0);
        }else if (weight <=1250){
            charges= 350.0 * (weight/1000.0);
        }else{
            charges= 475.0 * (weight/1000.0);
        }
    }
    
    void display(){
        System.out.println("Customer Name:  " + s_name);
        System.out.println("Reciever's Name:  " + r_name);
        System.out.println("Reciever's Address:  " + r_add);
        System.out.println("Pacrels weight:  " + weight);
        System.out.println("Charges for parcel:  " + charges);
    }
    
    void main(){
        Courier myCourier = new Courier();
        myCourier.accept();
        myCourier.calculate();
        myCourier.display();
    }
}
