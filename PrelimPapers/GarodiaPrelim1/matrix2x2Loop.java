
/**
    Accept numbers in a 2D array of 2 x 2 
    Print 
    a)  The array in the matrix form 
    b)  sum of i) left diagonal     ii) right diagonal 
    c)  Product of each row separately
    2 3 
    4 1

   */
import java.util.*;
public class matrix2x2Loop
{
    void main(){
        int matrix[][] = new int[2][2];
        int i,j;
        int sum_left_diagonal=0,sum_right_diagonal=0;
        int product=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of matrix row wise");
        for(i=0;i<2;++i){
            for(j=0;j<2;++j){
                matrix[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Matrix Form ");
        for(i=0;i<2;++i){
            for(j=0;j<2;++j){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
        
        for(i=0;i<2;++i){
         sum_left_diagonal = sum_left_diagonal + matrix[i][i];
        }
        
        for(i=0;i<2;++i){
         sum_right_diagonal = sum_right_diagonal + matrix[i][1-i];
        }
        
        System.out.println("Sum of left diagonal is " + sum_left_diagonal);
        System.out.println("Sum of right diagonal is " + sum_right_diagonal);
        
        for(i = 0;i<2;++i){
            product=1;
            for(j=0;j<2;++j){
                product = product * matrix[i][j];
            }
           System.out.println("product of row " + (i+1) + " is " + product); 
        }
    }
}
