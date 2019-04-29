package com.example.LamdaExpression.testlambda;

import java.io.IOException;
import java.io.OutputStream;

public interface MyInterface {

  int printIt(int num1, int num2);

  public default void printUtf8To(String text, OutputStream outputStream) {
    try {
      outputStream.write(text.getBytes("UTF-8"));

    } catch (IOException e) {
      throw new RuntimeException("Error writing String as UTF-8 to OutputStream", e);
    }
  }

  //  static void printItToSystemOut(String text) {
  //    System.out.println(text);
  //  }

}
