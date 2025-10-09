import java.util.*;

public class condition {
    public static void main(String[] args){
        // if else
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("You can drive");
        }
        else if(age==18){
            System.out.println("You are eligible for a learner's license");
        }
        else{
            System.out.println("You cannot drive");
        }

        // switch case
        System.out.println("Enter Button: ");
        int button = sc.nextInt();
        switch(button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Button");
        }  
    }
}
