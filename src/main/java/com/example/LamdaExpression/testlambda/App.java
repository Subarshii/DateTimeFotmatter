package com.example.LamdaExpression.testlambda;

public class App {

  public static void main(String[] args) {
    MyInterface myInterface = (num1, num2) ->  num1 * num2;
    System.out.println(myInterface.printIt(3, 3));
  }
}
