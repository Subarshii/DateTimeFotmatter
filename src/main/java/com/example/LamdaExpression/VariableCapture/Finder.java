package com.example.LamdaExpression.VariableCapture;

public class Finder {
  public static void main(String[] args) {
    MyFinder myPrinter = (a, b) -> a + b;
    System.out.println(myPrinter.doFind(2,3));
  }
}
