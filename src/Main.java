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

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        //ZonedDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");


        String dateString = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));


        System.out.println("\nFull Date: " + dateString);


        System.out.println("\nYears: " + dateYears(date.toZonedDateTime()));

        System.out.println("Month: " + dateMonth(date.toZonedDateTime()));

        System.out.println("Day Of the Month: " + dateDay(date.toZonedDateTime()));

        System.out.println("Day Of the Week: " + dateWeekDay(date.toZonedDateTime()));

    }


    public static int dateYears (ZonedDateTime dateInput){
        return dateInput.getYear();

        //String dateStringYears = dateInput.format(DateTimeFormatter.ofPattern("yyyy"));
        //return dateStringYears;
    }

    public static String dateMonth (ZonedDateTime dateInput){
        return String.valueOf(dateInput.getMonth());

        //String dateStringMonth = dateInput.format(DateTimeFormatter.ofPattern("MMMM"));
        //return dateStringMonth;

    }

    public static int dateDay (ZonedDateTime dateInput){
        return dateInput.getDayOfMonth();

        //String dateStringDay = dateInput.format(DateTimeFormatter.ofPattern("dd"));
        //return dateStringDay;

    }

    public static String dateWeekDay (ZonedDateTime dateInput){
        return String.valueOf(dateInput.getDayOfWeek());

        //String dateStringWeekDay = dateInput.format(DateTimeFormatter.ofPattern("EEE"));
        //return dateStringWeekDay;

    }
}

/*
CORREZIONE:

*/