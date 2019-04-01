import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMainClass {

    @Test
    public void haveHangoverTest() {
        Main toBeTested = new Main();
        String dayToBeTested = "Friday";

        assertEquals(true, toBeTested.hangover(dayToBeTested), "Nem is vagy másnapos...");

    }

    @Test
    public void haveHangoverTestv2() {
        Main function = new Main();
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
        String today = simpleDateFormat.format(date);

        assertTrue(function.hangover(today), "nope");
    }
}
