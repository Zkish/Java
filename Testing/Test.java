// package is the folder everything is held in
package Testing;
// enter imports under the package statement
import java.util.Scanner;


// class is the name of the file
public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // getting name of customer
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        // getting age of customer
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        // display inputed information
        System.out.println("Hello " + name + " Your " + age + " years old.");
        // closing scanner so no information leaks
        scanner.close();
    }
}