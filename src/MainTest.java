import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main testing = new Main();

    @Test
    void dateYears() {
        int result = testing.dateYears(ZonedDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals(2023,result);
    }

    @Test
    void dateMonth() {
        String result = testing.dateMonth(ZonedDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("MARCH",result);
    }

    @Test
    void dateDay() {
        int result = testing.dateDay(ZonedDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals(01,result);
    }

    @Test
    void dateWeekDay() {
        String result = testing.dateWeekDay(ZonedDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("WEDNESDAY",result);
    }
}