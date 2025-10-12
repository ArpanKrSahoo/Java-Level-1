import java.util.*;
public class StringBuilderExample { 
    public static void main(String[] args) {
    StringBuilder sb=new StringBuilder("Tony ");

    sb.append("Stark");
    System.out.println(sb);

    sb.reverse();
    System.out.println(sb);
    
    System.out.println(sb.charAt(2));
    sb.setCharAt(0, 'A');
    System.out.println(sb);

    sb.insert(0, "Hello ");
    System.out.println(sb);

    sb.delete(0, 6);
    System.out.println(sb);

    System.out.println(sb.length());
    System.out.println(sb.capacity()); //default 16 + initial string length
    }
}     