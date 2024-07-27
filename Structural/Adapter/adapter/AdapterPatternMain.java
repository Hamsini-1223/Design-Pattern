/**
 * The AdapterPatternMain class demonstrates the usage of the Adapter pattern.
 * It creates an instance of the ExternalLMS class and adapts it to the AssessmentSystem interface using the LMSAdapter class.
 * The adapted AssessmentSystem is then used to upload results to the external LMS.
 */
package Adapter.adapter;

public class AdapterPatternMain {
    public static void main(String[] args) {
        ExternalLMS externalLMS = new ExternalLMS();
        AssessmentSystem assessmentSystem = new LMSAdapter(externalLMS);

        assessmentSystem.uploadResults("12345", 85);
    }
}
