package com.example.LamdaExpression.testlambda;

public class Lambda {
  public static void main(String[] args) {

    StateOwner stateOwner = new StateOwner();

    stateOwner.addStateListener((oldState, newState) -> {
    });
  }
}
