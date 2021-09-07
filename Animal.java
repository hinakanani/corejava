public class Animal {

    public void eat() {
        System.out.println("I'm eating!");
    }

    public void run() {
        System.out.println("I'm running!");
    }

    public static void main(String[] args){
        Animal charlie = new Animal();
        charlie.eat();
        charlie.run();
    }

}