package exceptions;

/**
 * Customized exception for not space in memory
 */
public class MemoryOverflowException extends Exception{
    public MemoryOverflowException(String msg) {
        super(msg);
    }
}
