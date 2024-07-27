/**
 * Represents a PDF document that can be created.
 */
package Factory.factory;


public class PDFDocument implements Document {
    @Override
    public void create() {
        System.out.println("Creating PDF Document");
    }
}
