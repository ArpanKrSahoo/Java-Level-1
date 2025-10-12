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
    
   // reverse the username
   StringBuilder sb = new StringBuilder(username);
   for(int i=0;i<sb.length()/2;i++){
    int front = i;
    int back = sb.length()-1-i;
    char frontChar = sb.charAt(front);
    char backChar = sb.charAt(back);
    sb.setCharAt(front, backChar);
    sb.setCharAt(back, frontChar);
    }
    System.out.println("Your reversed username is : ");
    System.out.println(sb);

   }
}
