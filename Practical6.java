//Use the loop for 10 numbers and stop the execution after 7 numbers and skip any numbers.

public class Practical6 {
    public static void main(String[] args) {
        int i;
        for(i=1; i<=10; i++) {
            if(i == 3) {
                continue;
            }

            System.out.println(i);

            if(i == 7) {
                System.out.println("Ending the loop");
                break;
            }
        }
    }
}
