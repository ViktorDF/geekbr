package lessone.one;

public class Cat implements Participant, Jumpable, Runnable {
    @Override
    public void jump() {
        System.out.println("Cat is jumping");
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
    }

    @Override
    public void doActivity(Obstacle obstacle) {

    }
}
