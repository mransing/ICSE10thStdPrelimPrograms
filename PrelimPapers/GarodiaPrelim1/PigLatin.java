/*Pig Latin is a language game of alteration read in English. 
 * To form the Pig Latin form an English word the initial consonant sound is transpose to the end of the word and ay is affixed.  
For example, trash yields ash-tray and plunder is under-play. 
Write a program to input 10 names in an array. Print the name and their Pig Latin.*/

import java.util.*;
class PigLatin {
    void main(){
        Scanner sc = new Scanner(System.in);
        String names[] = new String[10];
        String pigLatinNames[] = new String[10];
        int len,indexFirstVowel;
        int i,j;
        String cur_name,first_part,second_part;
        char cur_char;
        
        for (i = 0 ;i<10;++i)
         {
             System.out.print("Enter the name :");
             names[i]=sc.nextLine();
             len=names[i].length();
             indexFirstVowel=0;
             cur_name=names[i];
             for(j = 0;j<len;++j){
                 cur_char=cur_name.charAt(j);
                 if (cur_char == 'a' || 
                    cur_char == 'e' ||
                    cur_char == 'i' || 
                    cur_char == 'o' || 
                    cur_char == 'u')
                    {
                        indexFirstVowel = j;
                        break;
                    }
                }
                if(j == len){
                    pigLatinNames[i]=cur_name;
                    continue;
                }
                first_part =  cur_name.substring(0,indexFirstVowel);
                second_part = cur_name.substring(indexFirstVowel);
                pigLatinNames[i] = second_part + first_part + "ay";
        }
        
             for(i =0 ;i<10;++i){
                 System.out.println("PigLatin for " + names[i] + " is " + pigLatinNames[i]);
             }
        
    }
}
