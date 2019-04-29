package com.example.DatetimeFormat;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class Temporal {
  public static void main(String[] args) {
    System.out.println( adjustInto(LocalDate.now()));

    LocalDateTime date = LocalDateTime.now();
      date = date.with(date);
    System.out.println(date);
  }

    public static LocalDate adjustInto(LocalDate input) {
        LocalDate date = LocalDate.from(input);
        int day;
        if (date.getDayOfMonth() < 15) {
            day = 15;
        } else {
            day = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
        }
        date = date.withDayOfMonth(day);
        if (date.getDayOfWeek() == DayOfWeek.SATURDAY ||
                date.getDayOfWeek() == DayOfWeek.SUNDAY) {
            date = date.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        }

        return input.with(date);
    }


}
