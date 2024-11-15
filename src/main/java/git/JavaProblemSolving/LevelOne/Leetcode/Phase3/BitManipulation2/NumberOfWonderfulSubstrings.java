package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation2;

import java.util.HashMap;
import java.util.Scanner;

public class NumberOfWonderfulSubstrings {
    public long wonderfulSubstrings(String word) {
        HashMap<Long, Long> mp = new HashMap<>();
        mp.put(0L, 1L);
        long ans = 0;
        long mask = 0;
        for (int i = 0; i < word.length(); i++) {
            mask ^= (1L << (word.charAt(i) - 'a'));
            if (mp.containsKey(mask)) {
                ans += mp.get(mask);
            }
            mp.put(mask, mp.getOrDefault(mask, 0L) + 1);

            for (int j = 0; j < 10; j++) {
                long tmp = mask ^ (1 << j);
                if (mp.containsKey(tmp))
                    ans += mp.get(tmp);
            }

        }


        return ans;
    }


    public static void main(String[] args) {
//        System.out.println(Integer.bitCount(0));
//        Scanner sc = new Scanner(System.in);
        NumberOfWonderfulSubstrings w = new NumberOfWonderfulSubstrings();
        System.out.println(w.wonderfulSubstrings("fiabhedce"));
        System.out.println(w.wonderfulSubstrings("aba"));
        System.out.println(w.wonderfulSubstrings("aabb"));
        System.out.println(w.wonderfulSubstrings("he"));
//        System.out.println(w.wonderfulSubstrings(sc.next()));
    }
}