public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 36;   // Binary: 00100100
        int b = 75;   // Binary: 01001011

        System.out.println("Initial Values:");
        System.out.println("a = " + a + " (Binary: " + String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0') + ")");
        System.out.println("b = " + b + " (Binary: " + String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0') + ")");
        System.out.println("--------------------------------------------------");

        // Bitwise AND
        System.out.println("a & b = " + (a & b));
        System.out.println("Binary Result: " + String.format("%8s", Integer.toBinaryString(a & b)).replace(' ', '0'));
        System.out.println("--------------------------------------------------");

        // Bitwise OR
        System.out.println("a | b = " + (a | b));
        System.out.println("Binary Result: " + String.format("%8s", Integer.toBinaryString(a | b)).replace(' ', '0'));
        System.out.println("--------------------------------------------------");

        // Bitwise XOR
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("Binary Result: " + String.format("%8s", Integer.toBinaryString(a ^ b)).replace(' ', '0'));
        System.out.println("--------------------------------------------------");

        // Bitwise NOT
        System.out.println("~a = " + (~a));
        System.out.println("Binary Result: " + String.format("%32s", Integer.toBinaryString(~a)).replace(' ', '0'));
        System.out.println("--------------------------------------------------");

        // Left shift
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("Binary Result: " + String.format("%8s", Integer.toBinaryString(a << 1)).replace(' ', '0'));
        System.out.println("--------------------------------------------------");

        // Right shift
        System.out.println("a >> 1 = " + (a >> 1));
        System.out.println("Binary Result: " + String.format("%8s", Integer.toBinaryString(a >> 1)).replace(' ', '0'));
        System.out.println("--------------------------------------------------");

        // Unsigned right shift
        System.out.println("a >>> 1 = " + (a >>> 1));
        System.out.println("Binary Result: " + String.format("%8s", Integer.toBinaryString(a >>> 1)).replace(' ', '0'));
    }
}
