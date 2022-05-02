import java.beans.Transient;

import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {

    @Test
    public void testName() {
        assertEquals("Pranay", SkillDemo.getName());
    }
}
