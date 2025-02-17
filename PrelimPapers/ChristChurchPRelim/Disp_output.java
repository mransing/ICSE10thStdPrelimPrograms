
/**
Design a class to overload the function disp_output as per the following:
void disp_output()    : to display the following output using appropriate logic
        		  1 , 1 1 , 1 1 1 , 1 1 1 1 , 1 1 1 1 1 , 1 1 1 1 1 1
void disp_output(string str char chr): displays the count of character ch appearing 
in string str by converting str and chr in small case  	
void disp_output(int n) : displays following output as per users choice of no of 
lines of output required.
e.g. if n= 5 
output
1 
1 2
1 2 1
1 2 1 2  
1 2 1 2 1
*/

public class Disp_output
{
    void disp_output(){
        for(int i =1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("1 ");
            }
            System.out.print(" , ");
        }
        System.out.println("");
    }
    
    void disp_output(String str, char ch){
        str=str.toUpperCase();
        ch=Character.toUpperCase(ch);
        int len=str.length(),count=0;
        for(int i=0;i<len;++i){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        System.out.println("The count of " + ch + " in " + str + " is " + count);
    }
    
    void disp_output(int n){
        for(int i=1;i<=n;++i){
            for(int j=1;j<=i;j++){
                if(j%2 == 0){
                    System.out.print("2 ");
                }else{
                    System.out.print("1 ");
                }
            }
            System.out.println("");
        }
    }
    
    void main(){
        disp_output();
        disp_output("abcAe",'a');
        disp_output(5);
    }
}
