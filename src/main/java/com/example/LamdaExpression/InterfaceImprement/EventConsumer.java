package com.example.LamdaExpression.InterfaceImprement;

public class EventConsumer implements MyEventConsumer {
  private int eventCount = 0;

  public static void main(String[] args) {
    EventConsumer eventConsumer = new EventConsumer();
    eventConsumer.consume(4);
  }

  @Override
  public void consume(Object event) {
    System.out.println(event.toString() + " consumed " + this.eventCount++ + " times.");
  }

  @Override
  public int pluss(int a, int b) {
    return a+b;
  }
}
