//write a program to demonstrate the example of constructor and parameterized constructor
// (e.g pass two integer parameters and apply any mathematical formula).

public class Practical7 {
    int num1;
    int num2;

    public Practical7() {
        System.out.println("Simple constructor:values are initialised..");
        num1 = 10;
        num2 = 20;
    }

    public Practical7(int a, int b) {
        System.out.println("Parameterised constructor:values are initialized");
        num1 = a;
        num2 = b;
    }

    public void sum() {
        System.out.println("Now,The function is called");
        int result = num1 + num2;
        System.out.println("The  sum of these two numbers is:" + result);
    }

}
class Constr_demo {
    public static void main(String[] args) {
        Practical7 obj1 = new Practical7();
        obj1.sum();
        Practical7 obj2 = new Practical7(100,15);
        obj2.sum();
    }
}
