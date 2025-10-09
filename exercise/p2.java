// Fibonacci Series using Recursion

public class p2 {
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        int n=20;
        for(int i =0;i<n;i++)
        System.out.print(" "+fibonacci(i));
    }
}
