package guru.springframework.unittest.quickstart;

import junit.framework.TestCase;
import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest extends TestCase {
@Test
    public void testConcatAndConvertString() throws Exception{


            String expectedValue = "HELLOWORLD";
            App app = new App();
            String actualValue = app.concatAndConvertString("Hello", "World");
            assertEquals(expectedValue, actualValue);
    }
}