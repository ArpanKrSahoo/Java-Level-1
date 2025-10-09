import java.util.*;

class first{
    public static void main(String[] args){
        System.out.println("Hello World"); // prints Hello World in one line 
        
       //Variables
       float a = 10;
       float b = 20;
       float sum = a + b;
       System.out.println("Sum: " + sum);
       System.out.println("Diff: "+ (a - b));

       String name = "Aman";
       String neighbour = "Akku";
       String friend = neighbour;

      int[] marks = new int[3];
    marks[0] = 97;
    marks[1] = 98;
    marks[2] = 95;
    System.out.println("Marks of " + name + ": " + marks[0]);
    System.out.println("Marks of " + neighbour + ": " + marks[1]);  
       // input
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter your name: ");
       String name_u = sc.nextLine(); // to take string input next fun take one token and nextline takes whole line 
       System.out.println("Hello " + name_u);

       //problem 1
       System.out.println("Enter first number: ");
       int num1 = sc.nextInt();
         System.out.println("Enter second number: ");
       int num2 = sc.nextInt();
         int sum1 = num1 + num2;
         System.out.println("Sum: " + sum1);
            System.out.println("Diff: " + (num1 - num2));
               System.out.println("Product: " + (num1 * num2));
                  System.out.println("Quotient: " + (num1 / num2));
                     System.out.println("Remainder: " + (num1 % num2));
    }
}