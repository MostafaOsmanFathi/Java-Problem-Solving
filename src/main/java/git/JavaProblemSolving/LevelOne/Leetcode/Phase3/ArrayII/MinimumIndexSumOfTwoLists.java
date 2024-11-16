package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.ArrayII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MinimumIndexSumOfTwoLists {

    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list2.length; i++) {
            map.putIfAbsent(list2[i], i);
        }

        ArrayList<String> res = new ArrayList<>();
        int mnTrack = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            if (!map.containsKey(list1[i])) {
                continue;
            }
            int tmp = i + map.get(list1[i]);
            if (mnTrack > tmp) {
                res.clear();
                res.add(list1[i]);
                mnTrack = tmp;
            } else if (mnTrack == tmp) {
                res.add(list1[i]);
            }
        }
        String[] resArr = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resArr[i] = res.get(i);
        }
        return resArr;
    }

    public static void main(String[] args) {
        MinimumIndexSumOfTwoLists solver = new MinimumIndexSumOfTwoLists();
        System.out.println(Arrays.toString(solver.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"}, new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"})));
    }
}
