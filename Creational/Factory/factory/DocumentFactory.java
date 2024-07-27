/**
 * Provides an abstract base class for creating different types of documents.
 * Concrete subclasses of this class are responsible for implementing the
 * `createDocument()` method to return a specific type of document.
 */
package Factory.factory;

public abstract class DocumentFactory {
    public abstract Document createDocument();
}
