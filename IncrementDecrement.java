public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Initial values:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("----------------------------------");

        // Prefix increment (++a)
        System.out.println("Prefix Increment (++a):");
        System.out.println("Before: a = " + a);
        int pre_a = ++a; // a increases first
        System.out.println("After: a = " + a + ", Result stored = " + pre_a);
        System.out.println("----------------------------------");

        // Postfix increment (a++)
        System.out.println("Postfix Increment (a++):");
        System.out.println("Before: a = " + a);
        int post_a = a++; // value used first, then incremented
        System.out.println("After: a = " + a + ", Result stored = " + post_a);
        System.out.println("----------------------------------");

        // Prefix decrement (--b)
        System.out.println("Prefix Decrement (--b):");
        System.out.println("Before: b = " + b);
        int pre_b = --b; // b decreases first
        System.out.println("After: b = " + b + ", Result stored = " + pre_b);
        System.out.println("----------------------------------");

        // Postfix decrement (b--)
        System.out.println("Postfix Decrement (b--):");
        System.out.println("Before: b = " + b);
        int post_b = b--; // value used first, then decremented
        System.out.println("After: b = " + b + ", Result stored = " + post_b);
    }
}
