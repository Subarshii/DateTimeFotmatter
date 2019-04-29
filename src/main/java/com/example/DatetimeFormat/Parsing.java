package com.example.DatetimeFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Parsing {
  public static void main(String[] args) {
    String input = "Jan 3 2003";
    try {
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d yyyy");
      LocalDate date = LocalDate.parse(input, formatter);
      System.out.printf("%s%n", date);
    } catch (DateTimeParseException exc) {
      System.out.printf("%s is not parsable!%n", input);
      throw exc; // Rethrow the exception.
    }
  }
}
