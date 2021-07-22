/**
 * 
 */

/**
 * @author pankaj
 *
 */
public class NotInsertableException extends RuntimeException {

	public NotInsertableException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }

}
