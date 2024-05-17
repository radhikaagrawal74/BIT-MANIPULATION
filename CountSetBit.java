//Count set bits in a given number.

public class CountSetBit {
    public static void main(String[] args) {
        int n = 3, count = 0;
        while (n > 0) {
            count += n & 1;
            n = n >> 1;// right shift (divible by 2)
        }
        System.out.println(count);
    }
}