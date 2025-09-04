import java.util.Date;

public class BestPractice_Activity2 {
    public static void main(String[] args) {
        // Displaying program introduction
        System.out.println("This program contains literal text.");
        System.out.println("It will produce readable output.");
        System.out.println("Yet the code is not readable.");
        System.out.print("So to make the code become ");
        System.out.println("readable ensure to modify the code by implementing best practices of coding.");
        System.out.print("Once you have completed the task ");
        System.out.println("submit the corrected version of code file as your answer.");
        
        // Displaying required information
        System.out.println("Ensure to provide the following information:");
        System.out.print("Student Name : ");
        System.out.println(""); // You can fill your name here
        System.out.println("Student ID : ");
        System.out.println("Task ID : CSC200_BL001");
        
        // Displaying the current system date and time
        Date myDate = new Date();
        System.out.println("System date : " + myDate.toString());
    }
}
