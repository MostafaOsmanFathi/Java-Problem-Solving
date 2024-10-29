package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

class RevealCardsInIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int[] result = new int[deck.length];
        LinkedList<Integer> order = new LinkedList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < deck.length; i++) {
            order.add(i);
        }

        while (!order.isEmpty()) {
            tmp.add(order.getFirst());
            order.removeFirst();
            if (!order.isEmpty()) {
                order.addLast(order.getFirst());
                order.removeFirst();
            }
        }

        System.out.println(order);
        System.out.println(tmp);

        int con = 0;
        for (Integer integer : tmp) {
            result[integer] = deck[con++];
        }
        return result;
    }
}