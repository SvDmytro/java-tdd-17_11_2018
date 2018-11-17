import org.junit.Assert;
import org.junit.Test;

public class fizzBuzzTest {

  @Test
  public void converterShouldReturnNumber() {
    FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();

    Assert.assertEquals("1", fizzBuzzConverter.convert(1));
    Assert.assertNotEquals("Fizz", fizzBuzzConverter.convert(1));
  }

  @Test
  public void converterShouldReturnFizz() {
    FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();

    Assert.assertEquals("Fizz", fizzBuzzConverter.convert(3));
    Assert.assertEquals("Fizz", fizzBuzzConverter.convert(6));
    Assert.assertEquals("Fizz", fizzBuzzConverter.convert(9));
    Assert.assertEquals("Fizz", fizzBuzzConverter.convert(99));
  }

  @Test
  public void converterShouldReturnBuzz() {
    FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();

    Assert.assertEquals("Buzz", fizzBuzzConverter.convert(5));
    Assert.assertEquals("Buzz", fizzBuzzConverter.convert(10));
    Assert.assertEquals("Buzz", fizzBuzzConverter.convert(20));
  }

  @Test
  public void converterShouldReturnFizzBuzz() {
    FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();

    Assert.assertEquals("FizzBuzz", fizzBuzzConverter.convert(15));
    Assert.assertEquals("FizzBuzz", fizzBuzzConverter.convert(30));
  }
}
