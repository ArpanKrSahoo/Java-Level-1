
import java.util.Scanner;

public class bitManupulation {
    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 2;

        //get bit
        int bitMask=1<<pos;
        System.out.println(bitMask);
        System.out.println();

        if((bitMask&n)==0){
            System.out.println("bit was 0");
        }
        else{
            System.out.println("bit was 1");
        }
        //set bit
        int newBitMask = 1<<pos;
        int newNumber = newBitMask | n;
        System.out.println(newNumber);

        //clear bit  
        int clearBitMask = ~(1<<pos);
        int clearBitNumber = clearBitMask & n;
        System.out.println(clearBitNumber);
        System.out.println();
 
        //update bit
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation(0 for clear, 1 for set): ");
        int operation = sc.nextInt();

        if(operation==1){
            //set
            int updateBitMask = 1<<pos;
            int updateBitNumber = updateBitMask | n;
            System.out.println(updateBitNumber);
        }
        else{
            //clear
            int clearBitMask2 = ~(1<<pos);
            int clearBitNumber2 = clearBitMask2 & n;
            System.out.println(clearBitNumber2);
        }
    }

}
