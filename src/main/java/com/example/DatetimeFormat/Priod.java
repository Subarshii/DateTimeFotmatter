package com.example.DatetimeFormat;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Priod {
  public static void main(String[] args) {
      LocalDate today = LocalDate.now();
      LocalDate birthday = LocalDate.of(1960, Month.JANUARY, 1);

      Period p = Period.between(birthday, today);
      long p2 = ChronoUnit.DAYS.between(birthday, today);
      System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
              " months, and " + p.getDays() +
              " days old. (" + p2 + " days total)");
  }
}
