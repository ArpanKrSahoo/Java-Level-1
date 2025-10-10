import java.util.*;

public class array {
    public static void main(String[] args) {
         int[] marks=new int[3];
        //  int mark[]=new int[3];
         marks[0]=97;
         marks[1]=98;
         marks[2]=95;
            System.out.println(marks[0]);
            System.out.println(marks[1]);
            System.out.println(marks[2]);
        System.out.println();
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }


    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the elements of array");
    for(int i=0;i<n ;i++){    
        arr[i]=sc.nextInt();
    }
    System.out.println("The elements of array are");
    for(int i=0;i<n;i++){
        if(arr[i]==0){
           System.out.println("zero found at position "+(i+1)); 
        }
        // System.out.println(arr[i]);
    }
        
    }
} 
