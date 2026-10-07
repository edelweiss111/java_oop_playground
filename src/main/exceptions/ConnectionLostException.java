package exceptions;

public class ConnectionLostException extends Exception {

    // 1. Пустой конструктор
    public ConnectionLostException() {
        super();
    }

    // 2. Конструктор со строковым сообщением
    public ConnectionLostException(String message) {
        super(message);
    }

    // 3. Конструктор с причиной (Throwable cause)
    public ConnectionLostException(Throwable cause) {
        super(cause);
    }

    // 4. Комбинация строки и причины
    public ConnectionLostException(String message, Throwable cause) {
        super(message, cause);
    }
}