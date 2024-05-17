//Invert a bit at given position.
//wrong
public class InvertBit {
    public static void main(String[] args) {
        int num = 4, pos = 1;
        int x = (int) (Math.log(num) /
                Math.log(2)) + 1;
        for (int i = 0; i < x; i++)
            num = (num ^ (1 << i));

        System.out.println(num);
    }
}
