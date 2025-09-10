public class OperatorLevels {
    public static void main(String[] args) {
        int originalA = 10, originalB = 5; // keep originals to allow reset
        int a = originalA, b = originalB;

        System.out.println("Initial values: a = " + a + ", b = " + b);
        System.out.println("-------------------------------------------");

        // 1. Unary Operators
        System.out.println("Unary Operators:");
        System.out.println(" -a = " + (-a) + " (Unary minus)");

        // Prefix increment
        System.out.println(" ++a = " + (++a) + " (Prefix increment)"); // a becomes 11

        // Update the code to perform the postfix decrement on the variable b
        System.out.println(" b before b-- = " + b);            // show value before postfix
        int postB = b--;                                       // postB gets old value, then b is decremented
        System.out.println(" result of b-- stored in postB = " + postB + " (used old value), b after b-- = " + b);
        System.out.println();

        // Update the code to Reset values of a and b to the original
        a = originalA;
        b = originalB;
        System.out.println("Values reset to originals:");
        System.out.println(" a = " + a + ", b = " + b);
        System.out.println();

        // 2. Binary Operators
        System.out.println("Binary Operators:");
        System.out.println(" a + b = " + (a + b) + " (Addition)");

        // Update the code to perform subtraction, b minus from a
        System.out.println(" a - b = " + (a - b) + " (Subtraction)");

        // Update the code to perform multiplication, a multiply with b
        System.out.println(" a * b = " + (a * b) + " (Multiplication)");

        // Update the code to perform division, divide b from a
        System.out.println(" a / b = " + (a / b) + " (Integer Division)");

        // Update the code to find the remainder of the process a divide b
        System.out.println(" a % b = " + (a % b) + " (Remainder)");
        System.out.println();

        // 3. Ternary Operator
        System.out.println("Ternary Operator:");
        // update the code to determine the value of a is odd or even using ternary operator
        String parity = (a % 2 == 0) ? "even" : "odd";
        System.out.println("a (" + a + ") is " + parity + ".");
        System.out.println();

        System.out.println("Program updated: all requested operator actions implemented.");
    }
}
