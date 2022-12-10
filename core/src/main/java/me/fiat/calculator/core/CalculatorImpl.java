package me.fiat.calculator.core;

import me.fiat.calculator.api.Calculator;
import me.fiat.calculator.api.CalculatorService;

/**
 * @author FIAT BRUNO
 */
public class CalculatorImpl implements CalculatorImpl {


  public Calculator() {
  }

   public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public static int multiply(int a, int b) {
    return a * b;
  }

  public static int divide(int a, int b) {
    return a / b;
  }

  @Override
  public void run() {
    String exampleData = exampleService.fetchExampleData();
    printStream.println(exampleData);
  }
}
