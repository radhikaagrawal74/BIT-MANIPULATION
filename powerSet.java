public class powerSet {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int n = arr.length;
        long size = (long) Math.pow(2, n);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0)
                    System.out.print(arr[j]);
            }

            System.out.println();
        }
    }
}
