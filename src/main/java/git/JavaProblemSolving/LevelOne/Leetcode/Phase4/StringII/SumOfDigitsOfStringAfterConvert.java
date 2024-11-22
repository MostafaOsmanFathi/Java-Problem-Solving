package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.StringII;

import java.math.BigInteger;

public class SumOfDigitsOfStringAfterConvert {
    public int getLucky(String s, int k) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            res.append(s.charAt(i) - 'a'+1);
        }
        BigInteger sum = new BigInteger("0");
        BigInteger n = new BigInteger(res.toString());
        BigInteger ten = new BigInteger("10");
        BigInteger zero = new BigInteger("0");
        while (k-- != 0) {
            sum = new BigInteger("0");
            while (!n.equals(zero)) {
                sum=sum.add(n.mod(ten));
                n=n.divide(ten);
            }
            n = sum;
        }
        return Integer.parseInt(sum.toString());
    }

    public static void main(String[] args) {
        SumOfDigitsOfStringAfterConvert s = new SumOfDigitsOfStringAfterConvert();
        System.out.println(s.getLucky("iiii", 1));
    }
}
