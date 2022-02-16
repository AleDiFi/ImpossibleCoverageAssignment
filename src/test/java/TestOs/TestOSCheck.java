package TestOs;

import com.example.impossiblecoverageassignment.OSCheck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOSCheck {

    @Test
    public void testCheckOsSpecifics(){
        OSCheck testOSName = new OSCheck();
        String os_name = testOSName.getOSName();
        String output = testOSName.checkOsSpecifics(os_name);
        assertEquals((String) "Il sistema operativo è Windows 10", output);
    }
}
