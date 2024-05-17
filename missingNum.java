public class missingNum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5 };
        int n = arr.length;
        int x = arr[0];
        for (int i = 1; i < n; i++) {
            x = x ^ arr[i];
        }
        int y = 1;
        for (int i = 2; i <= n + 1; i++) {
            y = y ^ i;
        }
        System.out.println(x ^ y);
    }
}
