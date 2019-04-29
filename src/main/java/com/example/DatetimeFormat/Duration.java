package com.example.DatetimeFormat;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Duration {
  public static void main(String[] args) {

    Instant timestamp = Instant.now();
    LocalDateTime ldt = LocalDateTime.ofInstant(timestamp, ZoneId.of("UTC+07:00"));
    LocalDateTime ldt2 = LocalDateTime.ofInstant(timestamp, ZoneId.systemDefault());
    System.out.printf("%s %d %d at %d:%d%n",
        ldt.getMonth(), ldt.getDayOfMonth(), ldt.getYear(), ldt.getHour(), ldt.getMinute());
    System.out.println(ldt2);
  }
}
