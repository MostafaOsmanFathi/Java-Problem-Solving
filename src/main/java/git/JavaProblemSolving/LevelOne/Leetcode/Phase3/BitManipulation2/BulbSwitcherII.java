package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation2;

import java.util.HashMap;
import java.util.HashSet;

public class BulbSwitcherII {
    int flipMask = (~(1 << 31));
    int flipEvenMask;
    int flipOddMask;
    int flipKMask;
    HashSet<Integer> st = new HashSet<>();
    HashMap<Integer, HashMap<Integer, Integer>> mp = new HashMap<>();

    int rec(int n, int presses) {
        if (presses == 0) {
            if (st.contains(n)) {
                return 0;
            } else {
                st.add(n);
                return 1;
            }
        }
        if (mp.containsKey(n) && mp.get(n).containsKey(presses)) {
            return mp.get(n).get(presses);
        }

        int tmp = 0;
        tmp += rec(n ^ flipMask, presses - 1);
        tmp += rec(n ^ flipEvenMask, presses - 1);
        tmp += rec(n ^ flipOddMask, presses - 1);
        tmp += rec(n ^ flipKMask, presses - 1);
        if (!mp.containsKey(n)) {
            mp.put(n, new HashMap<>());
        }
        mp.get(n).put(presses, tmp);
        return tmp;
    }

    public int flipLights(int n, int presses) {
        for (int i = 0; i < n; i += 2) {
            flipEvenMask ^= (1 << i);
            if (i + 1 < n)
                flipOddMask ^= (1 << (i + 1));
        }
        for (int i = 0; 3 * i < n; i++) {
            flipKMask ^= (1 << (i * 3));
        }
        flipMask = (1 << n) - 1;
//        System.out.println(Integer.toBinaryString(flipMask));
//        System.out.println(Integer.toBinaryString(flipEvenMask));
//        System.out.println(Integer.toBinaryString(flipOddMask));
//        System.out.println(Integer.toBinaryString(flipKMask));

        rec(flipMask, presses);
        return st.size();
    }

    public static void main(String[] args) {
        BulbSwitcherII solution = new BulbSwitcherII();
        System.out.println(solution.flipLights(1000, 1000));
    }
}
