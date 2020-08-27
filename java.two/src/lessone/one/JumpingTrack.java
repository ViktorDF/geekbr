package lessone.one;

public class JumpingTrack implements Obstacle {
    @Override
    public void pass(Participant participant) {
        if (participant instanceof Jumpable) {
            ((Jumpable) participant).jump();
        }
    }
}
