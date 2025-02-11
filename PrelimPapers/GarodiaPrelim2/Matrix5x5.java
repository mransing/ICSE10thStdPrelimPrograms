
/**
Write a program to create a 2 D integer array with 5 x 5 elements. Accept the values from the user. Perform the following operations on the array. 
Print the array and the results 
a)	Product of the elements of each row 
b)	Sum of the elements of each column
c)	Check if the sum of the left diagonal is equal to the sum of the right diagonal

Input 
1 2 3 4 5 3 3 3 3 3 5 4 3 2 1 7 5 3 1 7 9 6 3 8 9

 */
import java.util.*;
public class Matrix5x5
{
    void main(){
        int n=5;
        int matrix[][] = new int[n][n];
        int i,j;
        int sum_left_diagonal=0,sum_right_diagonal=0;
        int product=1,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of matrix row wise");
        for(i=0;i<n;++i){
            for(j=0;j<n;++j){
                matrix[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Matrix Form ");
        for(i=0;i<n;++i){
            for(j=0;j<n;++j){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
        
        System.out.println("\n");
        for(i = 0;i<n;++i){
            product=1;
            for(j=0;j<n;++j){
                product = product * matrix[i][j];
            }
           System.out.println("product of row " + (i+1) + " is " + product); 
        }
        
        System.out.println("\n");
        for(i = 0;i<n;++i){
            sum=0;
            for(j=0;j<n;++j){
                sum = sum + matrix[j][i];
            }
           System.out.println("Sum of row " + (i+1) + " is " + sum); 
        }
        System.out.println("\n");
        for(i=0;i<n;++i){
         sum_left_diagonal = sum_left_diagonal + matrix[i][i];
        }
        
        for(i=0;i<n;++i){
         sum_right_diagonal = sum_right_diagonal + matrix[i][(n-1)-i];
        }
        
        if(sum_left_diagonal == sum_right_diagonal){
            System.out.println("Sum of the both diagonals are equal.");
        }else{
            System.out.println("Sum of the both diagonals are not equal.");
        }
    }    
}
