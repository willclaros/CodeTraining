public class BitCounting {

    /**
     * Write a function that takes an integer as input, and returns the number of bits that are equal to one
     * in the binary representation of that number. You can guarantee that input is non-negative.
     * <p>
     * Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
     *
     * @param n
     * @return
     */
    public int countBits(int n) {
        if (n > 0) {
            return Integer.bitCount(n);
        } else {
            return 0;
        }
    }

    public int countBitsWithLambda(int n) {
        if (n > 0) {
            return (int) Integer.toBinaryString(n).chars().filter(c -> c == '1').count();
        } else {
            return 0;
        }
    }
}
