package me.fiat.calculator.core;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author FIAT BRUNO
 */
@ExtendWith(MockitoExtension.class)
class CalculatorImplTest {

  @Mock
  private  Calculator calculator;


  @Test
  public void testAdd() {
    calculator = mock(Calculator.class);

    when(calculator.add(4, 5)).thenReturn(9);

    int result = calculator.add(4, 5);
    assertEquals(9, result);
  }

  @Test
  public void testSubtract() {
    calculator = mock(Calculator.class);

    when(calculator.subtract(4, 5)).thenReturn(-1);

    int result = calculator.subtract(4, 5);
    assertEquals(-1, result);
  }

  @Test
  public void testMultiply() {
    calculator = mock(Calculator.class);

    when(calculator.multiply(4,5).thenReturn(20));

    int result = Calculator.multiply(4, 5);
    assertEquals(20, result);
  }

  @Test
  public void testDivide() {
    calculator = mock(Calculator.class);

    when(calculator.divide(5,5).thenReturn(1));

    int result = Calculator.divide(5, 5);
    assertEquals(1, result);
  }
}