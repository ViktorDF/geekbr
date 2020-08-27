package lessone.one;


public class Robot implements Participant, Jumpable, Runnable {
    @Override
    public void jump() {
        System.out.println("Robot is jumping");
    }

    @Override
    public void run() {
        System.out.println("Robot is running");
    }

    @Override
    public void doActivity(Obstacle obstacle) {

    }
}
