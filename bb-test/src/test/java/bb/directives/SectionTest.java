package bb.comments;

import org.junit.Test;
import directives.section.*;

import static org.junit.Assert.assertEquals;

public class SectionTest {

    @Test
    public void basicSectionWorks() {
        assertEquals("This is a section test (this is a section)", SimpleSection.render());
    }

    @Test
    public void nestedSectionCallWorks() {
        assertEquals("(this is a section)", SimpleSection.mySection.render());
        assertEquals("(Edward is 19 years old)", SectionWithParams.mySection.render("Edward", 19));
    }

    @Test
    public void sectionWithParamsWorks() {
        assertEquals("Section with Params (Carson is 9001 years old)", SectionWithParams.render());
    }

    @Test
    public void simpleInferenceWorks() {
        assertEquals("Inference Test (Carson is 9001 years old)", SimpleInference.render());
    }

    @Test
    public void inferenceInParamsWorks() {
        assertEquals("Infer in Params Test (Carson is 9001 years old)", InferenceInParams.render("Carson", 9001));
    }

    @Test
    public void inferenceInCodeBlockWorks() {
        assertEquals("Inference in Code Block (0)(1)(2)(3)(4)", InferenceInCodeBlock.render());
    }

}