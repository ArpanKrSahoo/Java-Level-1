import java.util.*;

public class array2d {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        arr[2][0]=7;
        arr[2][1]=8;
        arr[2][2]=9;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns");
        int cols=sc.nextInt();
        int marks[][]=new int[rows][cols];
        System.out.println("Enter the elements of array");
        
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                marks[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("The elements of array are");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Enter the element to find");
        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
            if(marks[i][j]==x){
                System.out.println("Element found at position "+"("+(i+1)+" "+(j+1)+")");}
            }
        }
    }

}
