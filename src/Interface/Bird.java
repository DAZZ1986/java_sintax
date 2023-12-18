package Interface;

public class Bird extends Animal implements CanRun, Flyable{
    @Override
    public void eat() {
        System.out.println("Кость");
    }

    public void run() {
        System.out.println("Bird running");
    }

    @Override
    public void fly() {
        System.out.println("Bird flying");
    }
}
