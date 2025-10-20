public class recurtionL1 {
    public static int print(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n);
        return print(n-1);

    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        System.out.print(n+"+");
        return sum(n-1)+n;
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        return factorial(n-1)*n;
    }

    public static int  fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static int power(int n,int pow){
        if(pow==0){
            return 1;
        }
        return power(n,pow-1)*n;
    }

    //stack height = log(n)
        public static int printPower(int x, int n) {
        if(n == 0) {
        return 1;
        }
        if(n % 2 == 0) {
        return printPower(x, n/2) * printPower(x, n/2);
        }
        else {
        return x * printPower(x, n/2) * printPower(x, n/2);
        }
        }
    public static void main(String[] args) {
       print(23);
       System.out.println(sum(5));
       System.out.println(factorial(5));
         System.out.println(power(2,5));
       int num=7;
       for (int i = 0; i < num; i++) {
           System.out.print(fibonacci(i)+" ");
       }

       int x = 2, n = 5;
int output = printPower(x, n);
System.out.println(output);
    }
}
