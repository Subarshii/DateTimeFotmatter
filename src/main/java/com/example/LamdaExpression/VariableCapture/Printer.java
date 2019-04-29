package com.example.LamdaExpression.VariableCapture;

public class Printer implements MyPrinter {
  public static void main(String[] args) {
    MyPrinter printer = new Printer();
    printer.print(1,2);

  }


  @Override
  public int print(int a, int b) {
    System.out.println(a+b);
    return a + b;
  }

    @Override
    public void print2(String s) {


    }



}
