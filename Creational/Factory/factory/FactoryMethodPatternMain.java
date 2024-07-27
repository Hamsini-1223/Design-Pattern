/**
 * Demonstrates the usage of the Factory Method design pattern to create different types of documents.
 * The `FactoryMethodPatternMain` class creates PDF and Word documents using the appropriate `DocumentFactory` implementations.
 */
package Factory.factory;


public class FactoryMethodPatternMain {
    
    public static void main(String[] args) {
        DocumentFactory factory;
        Document document;

        // Creating PDF Document
        factory = new PDFDocumentFactory();
        document = factory.createDocument();
        document.create();

        // Creating Word Document
        factory = new WordDocumentFactory();
        document = factory.createDocument();
        document.create();
    }
}
