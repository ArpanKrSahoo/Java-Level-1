import java.util.Scanner;

public class p4 {

    public static void  decimalToBinary() {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the decimal value: ");
        int decimal=sc.nextInt();
        String binary="";
        for(int i = 31; i >= 0; i--){
            int bitMask=1<<i;
            if((bitMask&decimal)==0){
                    binary+="0";
                    }
                    else{
                        binary+="1";
                    }
        }
        binary=binary.replaceAll("^0+(?!$)", ""); // to remove leading zeros
        System.out.println("Binary:" + binary);
    } 

    public static void binaryToDecimal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary value: ");
        String binary = sc.next();
        int decimal = 0;
        for(int i =0; i<binary.length(); i++){
            char bit = binary.charAt(i);
            // int bitMasking=1<<i;
           if (bit == '1') {
                decimal = (decimal << 1) | 1; // left shift and set last bit
            } else if (bit == '0') {
                decimal = decimal << 1; // left shift, last bit is 0
            } else {
                System.out.println("Invalid binary number!");
                return;
            }
       
        }
            System.out.println("Decimal equivalent: " + decimal);

    }    

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        //power of 2
        int n= sc.nextInt();
        if((n > 0) && (n & (n - 1)) == 0){
            System.out.println("It is a power of 2");
        }
        else{
            System.out.println("It is not a power of 2");
        }

        //decimal to binary
        decimalToBinary();
        //binary to decimal
        binaryToDecimal();

    }

}
