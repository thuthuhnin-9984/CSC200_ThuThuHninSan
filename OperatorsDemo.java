public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 5, b = 10;

        System.out.println("===== Arithmetic Operators =====");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));

        System.out.println("\n===== Increment / Decrement =====");
        int x = 5, y = 10;
        System.out.println("Initial: x = " + x + ", y = " + y);
        System.out.println("++x = " + (++x));  // prefix increment
        System.out.println("x++ = " + (x++));  // postfix increment
        System.out.println("Now x = " + x);
        System.out.println("--y = " + (--y));  // prefix decrement
        System.out.println("y-- = " + (y--));  // postfix decrement
        System.out.println("Now y = " + y);

        System.out.println("\n===== Assignment Operators =====");
        int c = 7;
        System.out.println("c = " + c);
        c += 3;
        System.out.println("c += 3 → " + c);
        c -= 2;
        System.out.println("c -= 2 → " + c);
        c *= 2;
        System.out.println("c *= 2 → " + c);
        c /= 3;
        System.out.println("c /= 3 → " + c);
        c %= 3;
        System.out.println("c %= 3 → " + c);

        System.out.println("\n===== Relational Operators =====");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a == b → " + (a == b));
        System.out.println("a != b → " + (a != b));
        System.out.println("a > b → " + (a > b));
        System.out.println("a < b → " + (a < b));
        System.out.println("a >= b → " + (a >= b));
        System.out.println("a <= b → " + (a <= b));

        System.out.println("\n===== Logical Operators =====");
        boolean p = true, q = false;
        System.out.println("p = " + p + ", q = " + q);
        System.out.println("p && q → " + (p && q));
        System.out.println("p || q → " + (p || q));
        System.out.println("!p → " + (!p));

        System.out.println("\n===== Bitwise Operators =====");
        int m = 6, n = 3; // binary: 6=110, 3=011
        System.out.println("m = " + m + " (110), n = " + n + " (011)");
        System.out.println("m & n → " + (m & n));  // 110 & 011 = 010 (2)
        System.out.println("m | n → " + (m | n));  // 110 | 011 = 111 (7)
        System.out.println("m ^ n → " + (m ^ n));  // 110 ^ 011 = 101 (5)
        System.out.println("~m → " + (~m));        // bitwise NOT
        System.out.println("m << 1 → " + (m << 1)); // left shift
        System.out.println("m >> 1 → " + (m >> 1)); // right shift
        System.out.println("m >>> 1 → " + (m >>> 1)); // unsigned right shift

        System.out.println("\n===== Ternary Operator =====");
        int max = (a > b) ? a : b;
        System.out.println("max of a and b = " + max);
    }
}
