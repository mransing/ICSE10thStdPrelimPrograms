
/**
    write a Java program to accept a sentence as an input from the user 
    and print the frequency of the vowels occurring in each one of the sentence. 
    Example input: Enter a sentence: “Failures are the pillars of success”
    Output: No. of vowels present 
    failures - 4 
    are – 2 
    the - 1 
    pillar-2
    of -1 
    success – 2
 */
import java.util.*;
import java.lang.*;
public class vowels
{
    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String input=sc.nextLine();
        int len=input.length();
        char ch;
        String word;
        int previousIndex = 0,i,noOfVowels=0;
        System.out.println("Number of vowels present ");
        for(i=0;i<len;++i){
            ch=input.charAt(i);
            if(Character.isWhitespace(ch)){ 
                word = input.substring(previousIndex,i);
                System.out.println(word + " - " + noOfVowels);
                noOfVowels=0;
                previousIndex=i+1;
                continue;
            }
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                noOfVowels++;
            }       
        }
        word = input.substring(previousIndex,i);
        System.out.println(word + " - " + noOfVowels);
    }
}
