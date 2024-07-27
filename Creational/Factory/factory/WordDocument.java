/**
 * Represents a Word document implementation of the {@link Document} interface.
 * This class provides the functionality to create a new Word document.
 */
package Factory.factory;

public class WordDocument implements Document {
    @Override
    public void create() {
        System.out.println("Creating Word Document");
    }
}
