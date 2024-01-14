package Testing;
import java.util.Scanner;
public class CustomerInfo{
    static void info(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Hello " + name + "you are " + age);
        scanner.close();
    }
    
    public static void main(String[] args){
        info();
    }
}
