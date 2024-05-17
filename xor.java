public class xor {
    public static void main(String[] args) {
        int n = 6, x = 0;
        for (int i = 1; i <= n; i++) {
            x = x ^ i;
        }
        System.out.println(x);
    }
}
