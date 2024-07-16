/*
CONSEGNA:
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
Ottieni l'anno
Ottieni il mese
Ottieni il giorno
Ottieni il giorno della settimana
Stampa i risultati sulla console
---Crea dei test per questo esercizio
*/

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));

        String dateString = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

        System.out.println("\nData completa: " + dateString);


        System.out.println("\nAnno: " + dateYears(date));

        System.out.println("Mese: " + dateMonth(date));

        System.out.println("Giorno: " + dateDay(date));

        System.out.println("Giorno della settimana: " + dateWeekDay(date));

    }


    public static String dateYears (ZonedDateTime dateInput){
        String dateStringYears = dateInput.format(DateTimeFormatter.ofPattern("yyyy"));
        return dateStringYears;
    }

    public static String dateMonth (ZonedDateTime dateInput){
        String dateStringMonth = dateInput.format(DateTimeFormatter.ofPattern("MMMM"));
        return dateStringMonth;

    }

    public static String dateDay (ZonedDateTime dateInput){
        String dateStringDay = dateInput.format(DateTimeFormatter.ofPattern("dd"));
        return dateStringDay;

    }

    public static String dateWeekDay (ZonedDateTime dateInput){
        String dateStringWeekDay = dateInput.format(DateTimeFormatter.ofPattern("EEE"));
        return dateStringWeekDay;

    }
}

/*
CORREZIONE:

*/