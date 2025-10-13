public class oparetor {
    public static void main(String[] args) {
        // Assignment Operators
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulo

        // Unary Operators
        System.out.println("a++ = " + (a++)); // Post-increment
        System.out.println("++a = " + (++a)); // Pre-increment
        System.out.println("b-- = " + (b--)); // Post-decrement
        System.out.println("--b = " + (--b)); // Pre-decrement

        // Relational Operators
        System.out.println("a == b = " + (a == b)); // Equal to
        System.out.println("a != b = " + (a != b)); // Not equal to
        System.out.println("a > b = " + (a > b));   // Greater than
        System.out.println("a < b = " + (a < b));   // Less than
        System.out.println("a >= b = " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b = " + (a <= b)); // Less than or equal to

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y = " + (x && y)); // Logical AND
        System.out.println("x || y = " + (x || y)); // Logical OR
        System.out.println("!x = " + (!x));         // Logical NOT

        // Bitwise Operators
        int A=1010; 
        int  B=0110; 
        System.out.println("A & B = " + (A & B)); // Bitwise AND
        System.out.println("A | B = " + (A | B)); // Bitwise OR
        System.out.println("A ^ B = " + (A ^ B)); // Bitwise XOR
        System.out.println("~A = " + (~A));       // Bitwise NOT

        System.out.println("A << 1 = " + (A << 1)); // Left shift
        System.out.println("A >> 1 = " + (A >> 1)); // Right shift
        System.out.println("A >>> 1 = " + (A >>> 1)); // Unsigned right shift

        // Ternary Operator
        int age = 20;
        String canVote = (age >= 18) ? "Yes" : "No";
        System.out.println("Can vote: " + canVote);
    }
}
