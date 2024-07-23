package kyu.seven;

public class SquareDigit {

  public static int squareDigits(int number) {
    return Integer.parseInt(
        String.valueOf(number)
            .chars()
            .map(Character::getNumericValue)
            .map(digit -> digit * digit)
            .mapToObj(String::valueOf)
            .reduce("", String::concat));
  }

  public static void main(String[] args) {
    squareDigits(51415);
  }
}
