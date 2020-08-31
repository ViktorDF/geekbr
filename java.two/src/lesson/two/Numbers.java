package lesson.two;

public class Numbers {
    public int calculateNumbers(String[][] numbers) throws ArrayDataException {
        if (numbers.length != 4) {
            throw new ArraySizeException("Array should have length 4");
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].length != 4) {
                throw new ArraySizeException("Array should have length 4");
            }
        }

        int val = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                try {
                    val += Integer.parseInt(numbers[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Array value is not parsable " + numbers[i][j], e);
                }
            }
        }

        return val;
    }
}
