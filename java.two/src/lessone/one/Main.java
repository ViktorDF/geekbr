package lessone.one;

public class Main {
    /**
     * Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
     * Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
     *
     * Создайте два класса: беговая дорожка и стена, при прохождении через которые,
     * участники должны выполнять соответствующие действия (бежать или прыгать),
     * результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
     *
     * Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
     *
     * * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
     * Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
     */
    public static void main(String[] args) {
        Participant[] participants = {new Cat(), new Robot(), new Human()};
        Obstacle[] obstacles = {new JumpingTrack(), new RunningTrack()};

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                participants[i].doActivity(obstacles[i]);
            }
        }
    }
}
