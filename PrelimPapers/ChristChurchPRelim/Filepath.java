
/**
Write a program to accept full path of the file, 
using library functions extract and output file path, 
file name and file extensions as per the example below. 
Example : 
Input: C:\Users\admin\Pitures\Images_1.jpg
Output
Path: C:\Users\admin\Pitures\
File Name: Images_1
Extension: jpg

 */
import java.util.*;
public class Filepath
{
    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the full file path: ");
        String filePath = sc.nextLine();
        String path,fileName, extension;
        int indexSlash, indexDot;
        indexSlash=filePath.lastIndexOf('\\');
        indexDot=filePath.lastIndexOf('.');
        path=filePath.substring(0,indexSlash);
        fileName=filePath.substring(indexSlash+1,indexDot);
        extension=filePath.substring(indexDot+1);
        System.out.println("Path: " +  path);
        System.out.println("File Name: " +  fileName);
        System.out.println("Extension: " +  extension);
    }
}
