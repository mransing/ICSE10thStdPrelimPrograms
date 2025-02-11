
/**
    Write a program to accept the sentence and print it.
     Count and print the number of small case, uppercase, special characters, numbers and spaces in the accepted sentence.

*/
import java.util.*;
import java.lang.*;
public class sentence
{
  void main(){
      //Charater.isLowerCase()
      //Charater.isUppperCase()
      //Charater.isDigit()
      //Character.isWhitespace()
      //Special
      System.out.print("Enter the sentence : ");
      Scanner sc = new Scanner(System.in);
      String input=sc.nextLine();
      int countSmallCase=0,countUpperCase=0,countNumbers=0,countSpaces=0,countSpecials=0;
      int len=input.length();
      for(int i=0;i<len;++i){
          char curChar=input.charAt(i);
          if(Character.isLowerCase(curChar)){//curChar >= 'a' && curChar <='z'
              countSmallCase++;
          }else if (Character.isUpperCase(curChar)){//curChar >= 'A' && curChar <='Z'
              countUpperCase++;
          }else if (Character.isDigit(curChar)){//curChar >= '0' && curChar <='9'
              countNumbers++;
          }else if (Character.isWhitespace(curChar)){//curChar == ' '
              countSpaces++;
          }else {
              countSpecials++;
          }
        }
        System.out.println("The given sentence is:");
        System.out.println(input);
        System.out.println("Number of lower case characters " + countSmallCase);
        System.out.println("Number of upper case characters " + countUpperCase);
        System.out.println("Number of numbers " + countNumbers);
        System.out.println("Number of spaces " + countSpaces);
        System.out.println("Number of special characters " + countSpecials);
  }
}
