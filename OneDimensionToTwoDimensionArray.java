import java.util.Arrays;
import java.util.Scanner;
public class OneDimensionToTwoDimensionArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int originalArray[] = new int[size];
        System.out.print("Enter the elements of the array : ");
        for(int i=0; i<size; i++){
            originalArray[i] = sc.nextInt();
        }
         System.out.print("Enter the number of rows : ");
         int rows = sc.nextInt();
         System.out.print("Enter the number of columns : ");
         int columns = sc.nextInt();

         int resultArray[][] = new int[rows][columns];
         int index = 0;

         if(rows*columns !=size){
             System.out.println("The number of rows and columns do not match the size of the original array.");
             return;
         }

         for(int i=0; i<rows; i++){
             for(int j=0; j<columns; j++){
                 resultArray[i][j] = originalArray[index];
                 index++;
             }
         }
         System.out.println("The two-dimensional array is: "+ Arrays.deepToString(resultArray));
    }
}
