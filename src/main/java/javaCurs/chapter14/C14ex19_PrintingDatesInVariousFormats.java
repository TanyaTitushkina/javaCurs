package javaCurs.chapter14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class C14ex19_PrintingDatesInVariousFormats {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter date in 'mm/dd/yyyy' format:");
        String date1 = scanner.nextLine();
        String[] dateArr = date1.split("/");

        LocalDate date = LocalDate.of(Integer.parseInt(dateArr[2]), Integer.parseInt(dateArr[0]), Integer.parseInt(dateArr[1]));
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MMMM d, YYYY", Locale.ENGLISH);
        System.out.println(date.format(formatDate));
    }
}