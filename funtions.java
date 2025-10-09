public class funtions {
    public static void main(String[] args) {
        System.out.println("This is our first function");
        int a=5;
        int b=6;
        int sum=add(a,b);
        System.out.println("The sum of a and b is: "+sum);
       String name="Arpan";
       greet(name);
       System.out.println("the factorial of 5 is: "+factorial(5));
    }
    public static void greet(String name){
        System.out.println("Hello "+name);
    }
    public static int add(int x,int y){
        return x+y;
      }
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
                }
    }  
}
