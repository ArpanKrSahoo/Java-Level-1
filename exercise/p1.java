import java.io. *;
import java.util. *;
public class p1 {
    public static int gsd(int a, int b){
        int result=Math.min(a, b);
        while(result > 0){
            if(a%result==0 && b%result==0){
                return result;
            }
            result--;
        }
        return 1;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The GCD of "+a+" and "+b+" is: "+gsd(a,b));    
    }
}
