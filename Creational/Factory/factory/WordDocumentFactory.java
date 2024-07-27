/**
 * A factory class that creates instances of the `WordDocument` class, which represents a word processing document.
 */
package Factory.factory;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
