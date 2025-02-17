
/**
    Write a program to accept name and total marks of n number of student 
    in two single dimensional array name and total marks. 
    Calculate and print 
    (i)	The average of the total marks obtained by n number of students 
        Average = (sum of total marks of all the students)/n 
    (ii) Deviation of each students total marks with the average 
        deviation = total marks of a student - average 

 */
import java.util.*;
public class StudentsMarks
{
 void main(){
     Scanner sc = new Scanner(System.in);
     int n;
     double total=0, average=0;
     System.out.print("Enter Number of stduents: ");
     n=sc.nextInt();
     sc.nextLine();
     String names[] = new String[n];
     int totalMarks[] = new int[n];
     double deviation[] = new double[n];
     for(int i=1;i<=n;++i){
         System.out.print("Enter the name of student " + i + " : " );
         names[i-1]=sc.nextLine();
         System.out.print("Enter total marks of student " + i + " : ");
         totalMarks[i-1]=sc.nextInt();
         sc.nextLine();
     }
     
     for(int i=0;i<n;++i){
         total = total + totalMarks[i];
     }
     average = total/n;
     System.out.println("Average marks: " + average);
     System.out.println("Deviations are:");
     for(int i=0;i<n;++i){
         deviation[i]=totalMarks[i]-average;
         System.out.println("Student: " + (i+1) + " Deviation: " + deviation[i]);
     }
 }
}
