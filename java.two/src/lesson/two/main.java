package lesson.two;

public class main {
    public static void main(String[] args) {
        String[][] numbers = {
                {"123", "12", "0", "-5a"},
                {"123", "12", "0", "-5"},
                {"123", "12", "0", "-5"},
                {"123", "12", "0", "-5"}
        };
        try {
            new Numbers().calculateNumbers(numbers);
        } catch (ArrayDataException e) {
            e.printStackTrace();
        }
    }
}
