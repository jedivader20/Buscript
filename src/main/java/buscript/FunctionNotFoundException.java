package buscript;

@SuppressWarnings({"WeakerAccess", "unused"})
public class FunctionNotFoundException extends Exception {

    public FunctionNotFoundException() {
        this("");
    }

    public FunctionNotFoundException(String message) {
       super(message);
    }
}
