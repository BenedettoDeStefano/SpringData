package Principale.exception;

public class ItemNotFoundException extends RuntimeException {

	public ItemNotFoundException(int id) {
        super("Elemento con ID " + id + " non trovato!");
	}
}