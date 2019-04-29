package com.example.DatetimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DecimalStyle;
import java.util.Locale;

public class NonISOdate {
  public static void main(String[] args) {
    //

    LocalDateTime date = LocalDateTime.now();
    JapaneseDate jdate = JapaneseDate.from(date);
    HijrahDate hdate = HijrahDate.from(date);
    MinguoDate mdate = MinguoDate.from(date);
    ThaiBuddhistDate tdate = ThaiBuddhistDate.from(date);
    LocalDate date2 = LocalDate.from(JapaneseDate.now());

    System.out.println(date);
    System.out.println("Another country time zone to time zone of Thailand");
    System.out.printf(
        "%s to %s%n", jdate, fromNow(LocalDateTime.now(), JapaneseChronology.INSTANCE));
    System.out.printf("%s to %s%n", mdate, fromNow(LocalDateTime.now(), MinguoChronology.INSTANCE));
    System.out.printf(
        "%s to %s%n", tdate, fromNow(LocalDateTime.now(), ThaiBuddhistChronology.INSTANCE));
    System.out.printf("%s to %s%n", hdate, fromNow(LocalDateTime.now(), HijrahChronology.INSTANCE));
    System.out.println("date2 = " + date2);
  }

  public static LocalDate fromNow(LocalDateTime date, Chronology chrono) {
    if (date != null && !date.equals(null)) {
      Locale locale = Locale.getDefault(Locale.Category.FORMAT);
      if (chrono == null) {
        chrono = IsoChronology.INSTANCE;
      }
      String pattern = "M/d/yyyy GGGGG";
      DateTimeFormatter df =
          new DateTimeFormatterBuilder()
              .parseLenient()
              .appendPattern(pattern)
              .toFormatter()
              .withChronology(chrono)
              .withDecimalStyle(DecimalStyle.of(locale));

      return LocalDate.from(date);
    }
    return null;
  }
}
