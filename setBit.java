//Find position of the only set bit
public class setBit {
    public static void main(String[] args) {
        int n = 4;
        int pos = 0;
        int m = n, count = 0;
        while (m != 0) {
            m = m & m - 1;
            count += 1;
        }
        if (count == 1) {
            while (n != 0) {
                n = n >> 1;
                pos += 1;
            }
            System.out.println(pos);
        } else {
            System.out.println("-1");
        }

    }
}
