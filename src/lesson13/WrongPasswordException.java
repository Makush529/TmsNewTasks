package lesson13;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {
    }
    public WrongPasswordException(String text){
        super(text);
    }
}
