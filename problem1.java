import java.util.*;

public class problem1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter first number: ");
       int num1 = sc.nextInt();
         System.out.println("Enter second number: ");
       int num2 = sc.nextInt();
       while (true) { 
           
           System.out.println("Enter operator (+, -, *, /, %): ");
           String op=sc.next();
           switch(op){
               case "+":
               System.out.println("Sum: " + (num1 + num2));
               break;
               case "-":
               System.out.println("Difference: " + (num1 - num2));
               break;
               case "*":
              System.out.println("Product: " + (num1 * num2));
              break;
              case "/":
              System.out.println("Quotient: " + (num1 / num2));
              break;
          case "%":
              System.out.println("Remainder: " + (num1 % num2));
              break;
              default:
              System.out.println("Invalid operator");
            }
        }
        }
    }
    
