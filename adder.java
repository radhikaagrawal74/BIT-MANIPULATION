//Find out sum of two integers using Bitwise Operator
//a^b=sum
//(a&b)<<1=for handing carry as 1
public class adder {
    static int add(int x, int y) {
        int res = x ^ y;
        int carry = (x & y) << 1;
        if (carry == 0)
            return res;

        return add(carry, res);
    }

    public static void main(String[] args) {
        int a = 2, b = 3;
        System.out.println(add(a, b));
    }
}
