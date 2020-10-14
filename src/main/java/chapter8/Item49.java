package chapter8;

/**
 * check parameters for validity
 */
public class Item49 {
    public static void main(String[] args) {
        double quotient = divide(4, 6);
        System.out.println(quotient);

        quotient = divide(10, 0);
        System.out.println(quotient);
    }

    /**
     * performs division of given dividend and divisor and returns quotient
     *
     * @param dividend dividend for division
     * @param divisor divisor for division
     * @return quotient of division
     * @throws ArithmeticException if divisor is 0
     */
    private static double divide(double dividend, double divisor) {
//        assert divisor != 0; // add -ea in VM options
        if (divisor == 0) {
            throw new ArithmeticException("Division results in undefined state. Divisor = 0.");
        }
        return dividend / divisor;
    }
}
