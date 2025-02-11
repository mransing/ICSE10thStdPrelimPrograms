
/**
Design a class to overload a function Joystring() as follows 
1)  void joystring(string s, char ch1, char ch2) -  with one string and two character 
    arguments that replaces the character argument ch1 with the character argument ch2 
    in the given string s and print the new string. 
    Example input value of s =”TECHNALAGY”, ch1=’A’, ch2=’O’ 
    Output=”TECHNOLOGY” 
2)  void joystring (string s) - With one string argument that prints the position of the 
    first space and the last space of the given string . 
    Example s=”cloud computing means internet based computing”
    Output: First Index : 5 Last Index : 36 
3)  void joystring(string S1, string S2) with two string arguments that combines the two 
    strings with the space between them and prints the result.
    Example s1=”Keep trying.” s2=”Don't lose hope.”
    Output: “Don’t lose hope. Keep trying.” (use library function)
*/

import java.util.*;
public class JoyString
{
  
    void joyString(String s, char ch1, char ch2){
        String outputString = s.replace(ch1,ch2);
        System.out.println("New String is " + outputString);
    }
    
    void joyString(String s){
        int firstIndex=s.indexOf(' ');
        int lastIndex=s.lastIndexOf(' ');
        System.out.println("First Index :" + firstIndex + " Last Index : " + lastIndex);
    }
    
    void joyString(String s1,String s2){
        String concatedString = s2.concat(s1);
        System.out.println(concatedString);
    }
    
    void main(){
        joyString("TECHNALAGY",'A','O');
        joyString("Cloud computing means internet based computing");
        joyString("Keep trying.","Don't loose hope.");
    }
}
