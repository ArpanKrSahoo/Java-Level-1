import java.util.*;
public class problem2 {
   public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter your email");
     String email = sc.next();
    String username="";
   for(int i=0;i<email.length();i++){
    if(email.charAt(i)=='@'){
        break; // exit whole condition
    }
    else{
        username+=email.charAt(i);
    }
   }
   System.out.print("Your Username is : ");

   System.out.println(username);
    




   }
}
