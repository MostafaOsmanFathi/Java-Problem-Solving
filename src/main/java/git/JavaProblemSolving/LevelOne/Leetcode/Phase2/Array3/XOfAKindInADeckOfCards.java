package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array3;

import java.util.*;

class XOfAKindInADeckOfCards {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < deck.length; i++) {
            if (hashMap.containsKey(deck[i])) {
                int tmp = hashMap.get(deck[i]);
                hashMap.replace(deck[i], tmp + 1);
            } else {
                hashMap.put(deck[i], 1);
            }
        }
        var tmp = hashMap.values();
        int tmpGcd = 0;
        for (int vals : hashMap.values()) {
            tmpGcd = gcd(tmpGcd, vals);
            if (tmpGcd == 1) {
                return false;
            }
        }
        return true;
    }
}