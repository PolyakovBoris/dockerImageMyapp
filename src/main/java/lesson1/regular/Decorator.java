package lesson1.regular;

/**
 * Декоратор. Накладывает на результат декорации
 */
public class Decorator {

    public static String decorate(int a) {
        /*
         * Метод декорирует число, добавляя к нему строку
         * при помощи функции форматирования строк
         */
        return String.format("Here is your number: %d.", a);
    }
}
