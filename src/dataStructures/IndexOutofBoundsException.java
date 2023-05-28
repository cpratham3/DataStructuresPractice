package dataStructures;

public class IndexOutofBoundsException extends Exception{
    String message;

    public IndexOutofBoundsException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
