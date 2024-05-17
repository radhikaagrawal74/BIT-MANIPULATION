//Check bit is clear or set at given position.
public class BitSetOrClear {
    public static void main(String[] args) {
        int n = 2, pos = 0;
        // n&(1<<k)
        while (pos != 0) {
            n = n >> 1;
            pos--;
        }
        int ans = n & 1;
        System.out.println(ans);
    }
}
