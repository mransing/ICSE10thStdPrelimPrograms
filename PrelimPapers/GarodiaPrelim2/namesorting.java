/**
Write a java program to create two single dimension array to store 10 names 
and their phone number (Accept them from the user). 
Arrange the names in ascending order (using bubble sort) along with their 
phone numbers. 
Print unsorted and sorted names and their phone number.
*/

import java.util.*;
public class namesorting
{
 
    void main(){
        Scanner sc = new Scanner(System.in);
        int lenArray=10;
        String names[] = new String[lenArray];
        String phoneNumbers[]=new String[lenArray];
        int i=0,j=0;
        for(i=0;i<lenArray;++i){
            System.out.print("Enter the name of person " + (i+1) + " ");
            names[i]=sc.nextLine();
            System.out.print("Enter the phone number of person " + (i+1) + " ");
            phoneNumbers[i]=sc.nextLine();
        }
        System.out.println("Unsorted : ");
        System.out.println("Name\tPhone Nmuber");
        for(i=0;i<lenArray;++i){
            System.out.println(names[i]+"\t"+phoneNumbers[i]);
        }
        for(i=0;i<lenArray-1;++i){
            for(j=i+1;j<(lenArray-i);++j){
                if(names[j-1].compareTo(names[j]) > 0){
                    String temp=names[j];
                    names[j]=names[j-1];
                    names[j-1]=temp;
                    temp=phoneNumbers[j];
                    phoneNumbers[j]=phoneNumbers[j-1];
                    phoneNumbers[j-1]=temp;
                }
            }
        }
        System.out.println("Sorted : ");
        System.out.println("Name\tPhone Nmuber");
        for(i=0;i<lenArray;++i){
            System.out.println(names[i]+"\t"+phoneNumbers[i]);
        }
    }
}
