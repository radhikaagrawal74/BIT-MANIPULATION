//Find the two non-repeating elements in an array of repeating elements
public class UniqueEle {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 3 };
        int x = arr[0], n = arr.length;
        for (int i = 1; i < n; i++) {
            x = x ^ arr[i];
        }
        System.out.println(x);
    }
}
