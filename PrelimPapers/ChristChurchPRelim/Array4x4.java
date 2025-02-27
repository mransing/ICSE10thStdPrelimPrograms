
/**
Write a program to accept elements of array A of order 4 x 4 and print whether it is a diagonal array or not. 
An array is said to be a diagonal array if the sum of the elements equal to the sum of the elements of right diagonal. 
Also print appropriate message if the array is not diagonal array . 
 */
import java.util.*;
public class Array4x4
{
   void main(){
        int n=4;
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
        for(i=0;i<n;++i){
         sum_left_diagonal = sum_left_diagonal + matrix[i][i];
        }
        
        for(i=0;i<n;++i){
         sum_right_diagonal = sum_right_diagonal + matrix[i][(n-1)-i];
        }
        
        if(sum_left_diagonal == sum_right_diagonal){
            System.out.println("Sum of the both diagonals are equal and the sum is " + sum_left_diagonal);
        }else{
            System.out.println("Sum of the both diagonals are not equal.");
        }
    }    
}
