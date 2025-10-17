import java.util.Scanner;

public class p4 {

public static void  decimalToBinary() {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the decimal value: ");
    int decimal=sc.nextInt();
    String binary="";
    for(int i=1;i<=decimal;i++){
    if(decimal>=i){
        binary+="1";
        decimal-=i;
    }
    else{
        binary+="0";
    }
}
System.out.println(binary);
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

    }

}
