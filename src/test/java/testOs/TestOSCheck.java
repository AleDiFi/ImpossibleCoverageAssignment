package testOs;

import com.example.impossiblecoverageassignment.OSCheck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOSCheck {

    @Test
    public void testCheckOsSpecifics(){
        OSCheck testOSName = new OSCheck();
        String osName = testOSName.getOSName();
        String output = testOSName.checkOsSpecifics(osName);
        assertEquals((String) "Il sistema operativo è Windows 10", output);
    }
}
