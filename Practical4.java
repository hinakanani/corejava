//Print 1 to 10 numbers using while loop.

public class Practical4 {
    public static void main(String[] args) {
        System.out.println("Using while loop");
        int x = 1;

        while (x <= 10) {
            System.out.println(x);
            x++;
        }
        System.out.println("Finish running while loop.\n");

        //print 1 to 10 numbers using do-while loop.
        System.out.println("Using do-while loop");
        int y = 1;
        do {
            System.out.println(y);
            y++;
        }while (y <= 10);

        System.out.println("Finish running do-while loop.");
    }
}
