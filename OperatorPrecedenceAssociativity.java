public class OperatorPrecedenceAssociativity {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;
        int result;

        System.out.println("This program demonstrates both operator precedence and associativity.");
        System.out.println("Initial values: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("---------------------------------------------------");

        System.out.println("This program has incomplete parts. Refer to the comments below for the instructions. The first example is provided for you.");
        // ---------------- Precedence Examples ----------------

        // Example 1: Multiplication has higher precedence than addition.
        // show the result of a add b multiply with c.
        result = a + b * c;   // evaluated as a + (b * c)
        System.out.println("1) a + b * c = " + result + "  ==> evaluated as a + (b * c)  -> " 
                + a + " + (" + b + " * " + c + ") = " + result);

        // Example 2: Parentheses override precedence
        int result2 = (a + b) * c; // evaluated as (a + b) * c
        System.out.println("2) (a + b) * c = " + result2 
                + "  ==> parentheses force addition first -> (" + a + " + " + b + ") * " + c + " = " + result2);

        // Example 3: Division vs multiplication (same precedence, left-to-right associativity)
        // show step-by-step (a / b) then * c
        int stepDiv = a / b;               // a / b
        int result3 = stepDiv * c;         // (a / b) * c
        System.out.println("3) a / b * c = " + result3 
                + "  ==> same precedence, left-to-right -> (" + a + " / " + b + ") = " + stepDiv 
                + ", " + stepDiv + " * " + c + " = " + result3);

        // Example 4: Unary minus has higher precedence than multiplication
        int result4 = -a * b;      // evaluated as (-a) * b
        System.out.println("4) -a * b = " + result4 
                + "  ==> unary minus before multiplication -> (" + (-a) + ") * " + b + " = " + result4);

        // Example 5: Relational operators after arithmetic
        boolean result5 = a + b > c * 2;  // (a + b) compared to (c * 2)
        System.out.println("5) a + b > c * 2 = " + result5 
                + "  ==> arithmetic first: (a + b) = " + (a + b) + ", (c * 2) = " + (c * 2));

        // Example 6: Logical AND vs OR (AND has higher precedence)
        // Expression: (a > b) || (b > c) && (a < c)
        boolean left = (a > b);
        boolean middle = (b > c);
        boolean right = (a < c);
        boolean andPart = middle && right;            // (b > c) && (a < c)
        boolean result6 = left || andPart;            // (a > b) || ((b > c) && (a < c))
        System.out.println("6) (a > b) || (b > c) && (a < c) = " + result6
                + "  ==> evaluated as (a > b) || ((b > c) && (a < c))"
                + " -> (a > b) = " + left + ", (b > c) = " + middle + ", (a < c) = " + right
                + ", ((b > c) && (a < c)) = " + andPart);

        // Example 7: Assignment has the lowest precedence
        int x;
        x = a + b * c;   // (b * c) evaluated first, then added to a, then assigned
        System.out.println("7) x = a + b * c -> x = " + x 
                + "  ==> (b * c) = " + (b * c) + ", a + (b * c) = " + x);

        System.out.println("---------------------------------------------------");

        // ---------------- Associativity Examples ----------------

        // Example 8: Left-to-right associativity for subtraction
        // a - b - c  -> (a - b) - c
        int leftStep8 = a - b;
        int result8 = leftStep8 - c;
        System.out.println("8) a - b - c = " + result8 
                + "  ==> evaluated as (a - b) - c -> (" + a + " - " + b + ") = " + leftStep8 + ", " 
                + leftStep8 + " - " + c + " = " + result8);

        // Example 9: Left-to-right associativity for division
        // a / b / c -> (a / b) / c
        int leftStep9 = a / b;
        int result9 = leftStep9 / c;
        System.out.println("9) a / b / c = " + result9 
                + "  ==> evaluated as (a / b) / c -> (" + a + " / " + b + ") = " + leftStep9 + ", " 
                + leftStep9 + " / " + c + " = " + result9);

        // Example 10: Right-to-left associativity for assignment
        int p, q, r;
        p = q = r = 5;   // evaluated as p = (q = (r = 5))
        System.out.println("10) p = q = r = 5 -> p = " + p + ", q = " + q + ", r = " + r
                + "  ==> assignment associates right-to-left");

        // Example 11: Ternary operator (right-to-left associativity)
        // nested ternary: (a > b) ? (b > c ? b : c) : a
        int result11 = (a > b) ? (b > c ? b : c) : a;
        String ternarySteps;
        if (a > b) {
            ternarySteps = "(a > b) true -> evaluate (b > c ? b : c) -> (b > c) = " + (b > c) 
                          + " -> result = " + ( (b > c) ? b : c );
        } else {
            ternarySteps = "(a > b) false -> result = a (" + a + ")";
        }
        System.out.println("11) Ternary nested (a > b) ? (b > c ? b : c) : a = " + result11
                + "  ==> " + ternarySteps);

        System.out.println("---------------------------------------------------");
        System.out.println("All examples completed: each line shows the expression, the evaluation order (precedence/associativity) and the computed result.");
    }
}
