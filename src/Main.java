public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int number = 5;
        int square = calcSquareOfNumber(number);
        System.out.println("Квадрат числа " + number + " = " + square);
    }

    public static int calcSquareOfNumber(int number) {
        return number * number;
    }
}
