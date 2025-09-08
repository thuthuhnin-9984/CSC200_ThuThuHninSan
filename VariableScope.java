public class VariableScope {

    // Static variable (class-level, shared by all objects)
    static int staticVar = 100;

    // Instance variable (object-level, each object has its own copy)
    int instanceVar = 50;

    public void printOutputMethod() {
        // Local variable (method-level, exists only inside this method)
        int localVar = 10;

        System.out.println("Local Variable: " + localVar);
        // Print the instance variable
        System.out.println("Instance Variable: " + instanceVar);
        // Print the static variable
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        // Create two different objects
        VariableScope obj1 = new VariableScope();
        // Object 2
        VariableScope obj2 = new VariableScope();

        System.out.println("---- Object 1 ----");
        obj1.printOutputMethod();

        // Change instanceVar in obj1
        obj1.instanceVar = 200;

        // Change staticVar (affects all objects)
        VariableScope.staticVar = 500;

        System.out.println("\n---- Object 2 ----");
        // Call method using Object 2
        obj2.printOutputMethod();

        System.out.println("\n---- Object 1 Again ----");
        // Call method using Object 1
        obj1.printOutputMethod();

        System.out.println("\nProgram completed successfully with variables demonstrated.");
    }
}
