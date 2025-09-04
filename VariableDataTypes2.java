public class VariableDataTypes2 {
    public static void main(String[] args) {
        System.out.println("Demonstrating Variable Data Types in Java");
        System.out.println("-----------------------------------------");

        // Primitive Data Types
        byte b = 120;
        short s = 32000;
        int i = 123456789;
        long l = 9876543210L;
        float f = 5.75f;
        double d = 19.99;
        char c = 'A';
        boolean bool = true;

        // Additional variables (your part)
        int num;          // declared but not initialized
        int val = 5;
        char alpha = 'J';
        char ban = 'k';
        double x = 3.1415;
        double y = 2 / 3;   // integer division -> result = 0.0
        float p = 5 / 3;    // integer division first, then cast -> 1.0
        float q = 5 / 3f;   // float division -> 1.6667 approx

        // Printing primitive values
        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
        System.out.println("char value: " + c);
        System.out.println("boolean value: " + bool);

        // Printing additional variables
        System.out.println("\n--- Additional Variables ---");
        System.out.println("val = " + val);
        System.out.println("alpha = " + alpha);
        System.out.println("ban = " + ban);
        System.out.println("x = " + x);
        System.out.println("y = " + y); // 0.0 due to integer division
        System.out.println("p = " + p); // 1.0 due to integer division
        System.out.println("q = " + q); // ~1.6667 (float division)

        System.out.println("\n--- Non-Primitive Data Types ---");

        // Non-Primitive Data Types
        String str = "Hello, Java!";
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("String value: " + str);
        System.out.print("Array values: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
