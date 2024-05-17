//Count number of bits to be flipped to convert A to B
public class ConverAtoB {
    public static void main(String[] args) {
        int a = 10, b = 20, count = 0;
        int n = a ^ b;
        while (n != 0) {
            count++;
            n &= n - 1;
        }
        System.out.println(count);
    }
}
// 01010^10100=11110
// n=n&n-1 11110&10011=10010&10001=10000&01111=00000