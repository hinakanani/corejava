//Define an 'age' variable and check your age.
import java.util.Scanner;

public class Practical2 {
    public static void main(String[] args) {
        int age;
        System.out.println("Here,Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>18) {
            System.out.println("Your age is above 18.so, you can drive.");
        }
        else {
            System.out.println("your age is below 18.so,you can't drive yet!");
        }
    }

}
