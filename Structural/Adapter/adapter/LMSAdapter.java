/**
 * Adapter class that implements the `AssessmentSystem` interface and delegates to an `ExternalLMS` instance to upload student assessment results.
 * 
 * This adapter class provides a way to integrate an external learning management system (LMS) with an assessment system that expects the `AssessmentSystem` interface.
 * The `LMSAdapter` takes an `ExternalLMS` instance in its constructor and forwards calls to the `uploadResults` method to the `submitScore` method of the `ExternalLMS`.
 */
package Adapter.adapter;


public class LMSAdapter implements AssessmentSystem {
    private ExternalLMS externalLMS;

    public LMSAdapter(ExternalLMS externalLMS) {
        this.externalLMS = externalLMS;
    }

    @Override
    public void uploadResults(String studentId, int score) {
        externalLMS.submitScore(studentId, score);
    }
}
