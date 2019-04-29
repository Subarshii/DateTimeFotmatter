package com.example.DatetimeFormat;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DatetimeFormat {
  public static void main(String[] args) {
    LocalDate time = LocalDate.now();
    DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd-MM-YYYY (D)");
    System.out.printf("now: %s%n", LocalDateTime.now());

    System.out.printf("Apr 15, 1994 @ 11:30am: %s%n", LocalDateTime.of(1994, Month.APRIL, 15, 11, 30));
    System.out.printf("now (from Instant from location): %s%n", LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));
    System.out.printf("+ 6 months from now: %s%n", LocalDateTime.now().plusMonths(6));
    System.out.printf("- 6 months ago: %s%n", LocalDateTime.now().minusMonths(6));
    System.out.println("Time now = " + dateformat.format(time));
  }
}
