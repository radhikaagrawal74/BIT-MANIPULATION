//Calculate square of a number without using *, / and pow()
public class SquareOfNumber {
    public static void main(String[] args) {
        int n = 3, res = n;
        for (int i = 1; i < n; i++) {
            res += n;
        }
        System.out.println(res);
    }
}
