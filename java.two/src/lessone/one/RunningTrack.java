package lessone.one;

public class RunningTrack implements Obstacle {
    @Override
    public void pass(Participant participant) {
        if (participant instanceof Runnable) {
            ((Runnable) participant).run();
        } else {
            System.out.println("Cannot run");
        }
    }
}
