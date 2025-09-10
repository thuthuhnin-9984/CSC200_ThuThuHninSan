import java.util.Scanner;

class InputOutput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        // String input
        System.out.print("Enter your name: ");
        String name = myObj.nextLine();

        // Integer input
        System.out.print("Enter your age: ");
        int age = myObj.nextInt();

        // Double input
        System.out.print("Enter your height in meters: ");
        double height = myObj.nextDouble();

        // Boolean input
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = myObj.nextBoolean();

        // Character input
        System.out.print("Enter your grade (A, B, C, etc.): ");
        char grade = myObj.next().charAt(0);

        // Display outputs
        System.out.println("\n------ User Information ------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Student: " + isStudent);
        System.out.println("Grade: " + grade);

        myObj.close();
    }
}
