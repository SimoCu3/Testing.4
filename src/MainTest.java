import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main testing = new Main();

    @Test
    void dateYears() {
        String result = testing.dateYears(ZonedDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("2023","2023");
    }

    @Test
    void dateMonth() {
        String result = testing.dateYears(ZonedDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("marzo","marzo");
    }

    @Test
    void dateDay() {
        String result = testing.dateYears(ZonedDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("01","01");
    }

    @Test
    void dateWeekDay() {
        String result = testing.dateYears(ZonedDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("mer","mer");
    }
}