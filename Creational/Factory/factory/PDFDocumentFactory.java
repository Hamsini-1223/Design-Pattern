/**
 * Provides a factory for creating PDF document instances.
 */
package Factory.factory;

public class PDFDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}
