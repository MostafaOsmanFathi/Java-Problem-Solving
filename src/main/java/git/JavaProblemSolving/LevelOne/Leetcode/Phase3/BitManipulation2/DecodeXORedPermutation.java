package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation2;

import java.util.Arrays;
import java.util.HashSet;

public class DecodeXORedPermutation {

    public int[] decode(int[] encoded) {
        int[] result = new int[encoded.length + 1];
        int xorAll = 0;
        for (int i = 1; i <= encoded.length + 1; i++) {
            xorAll ^= i;
        }

        for (int i = 1; i < encoded.length; i+=2) {
            xorAll ^= encoded[i];
        }
        result[0] = xorAll;
        for (int i = 1; i <= encoded.length; i++) {
            result[i] = result[i - 1] ^ encoded[i - 1];
        }
        return result;
    }

    public static void main(String[] args) {
        DecodeXORedPermutation decoded = new DecodeXORedPermutation();
//        System.out.println(Arrays.toString(decoded.decode(new int[]{3, 1})));
        System.out.println(Arrays.toString(decoded.decode(new int[]{6, 5, 4, 6})));
    }
}

