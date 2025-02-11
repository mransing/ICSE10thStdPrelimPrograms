
/**
    Accept numbers in a 2D array of 2 x 2 
    Print 
    a)  The array in the matrix form 
    b)  sum of i) left diagonal     ii) right diagonal 
    c)  Product of each row separately

   */
import java.util.*;
public class matrix2x2
{
    void main(){
        int matrix[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of matrix row wise");
        matrix[0][0]=sc.nextInt();
        matrix[0][1]=sc.nextInt();
        matrix[1][0]=sc.nextInt();
        matrix[1][1]=sc.nextInt();
        
        System.out.println("Matrix Form ");
        System.out.println(matrix[0][0] + " " + matrix[0][1]);
        System.out.println(matrix[1][0] + " " + matrix[1][1]);
        
        int sum_left_diagonal = matrix[0][0] + matrix[1][1];
        int sum_right_diagonal = matrix[0][1] + matrix[1][0];
        
        System.out.println("Sum of left diagonal is " + sum_left_diagonal);
        System.out.println("Sum of right diagonal is " + sum_right_diagonal);
        
        int product_row_1 = matrix[0][0] * matrix[0][1];
        int product_row_2 = matrix[1][0] * matrix[1][1];
        
        System.out.println("product of row 1 is " + product_row_1);
        System.out.println("product of row 2 is " + product_row_2);
    }
}
