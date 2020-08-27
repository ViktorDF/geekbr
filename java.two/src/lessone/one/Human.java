package lessone.one;


public class Human implements Participant, Jumpable, Runnable {
    @Override
    public void jump() {
        System.out.println("Human is jumping");
    }

    @Override
    public void run() {
        System.out.println("Human is running");
    }

    @Override
    public void doActivity(Obstacle obstacle) {
        obstacle.pass(this);
    }
}
