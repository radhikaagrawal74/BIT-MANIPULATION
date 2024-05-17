//Program to find whether a no is power of two
public class powerOfTwo {
    public static boolean power(int n) {
        return ((n & (n - 1)) != 0);
    }

    public static void main(String[] args) {
        int n = 16;
        if (power(n)) {
            System.out.println("no it is not power of 2");
        } else
            System.out.println("yes it is power of 2");
    }
}
