package lesson1.regular;

/**
 * other class
 */
public class OtherClass {
    /**
     *
     * @param a слагаемое
     * @param b слагаемое
     * @return сумма
     */
    public static int add(int a, int b) {
        return a + b; // возврат без проверки переполнения
    }

    /**
     *
     * @param a делимое
     * @param b делитель
     * @return
     */

    public static int div(int a, int b) {
        return a / b; // возврат без проверки переполнения
    }

    /**
     *
     * @param a множитель
     * @param b множитель
     * @return
     */
    public static int mul(int a, int b) {
        return a * b; // возврат без проверки переполнения
    }

    /**
     *
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return
     */
    public static int sub(int a, int b) {
        return a - b; // возврат без проверки переполнения
    }

}
