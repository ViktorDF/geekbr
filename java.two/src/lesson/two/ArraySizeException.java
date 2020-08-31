package lesson.two;

public class ArraySizeException extends RuntimeException {
    public ArraySizeException() {
    }

    public ArraySizeException(String message) {
        super(message);
    }

    public ArraySizeException(String message, Throwable cause) {
        super(message, cause);
    }
}
