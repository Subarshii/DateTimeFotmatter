package com.example.DatetimeFormat;

import java.time.LocalDate;

public class ZonedDateTime {
  public static void main(String[] args) {
    LocalDate a = LocalDate.of(2014, 6, 30);
    LocalDate b = LocalDate.of(2014, 7, 1);
    System.out.println(a.isAfter(b));
    System.out.println(a.isAfter(a));
    System.out.println(b.isAfter(a));
  }
}
