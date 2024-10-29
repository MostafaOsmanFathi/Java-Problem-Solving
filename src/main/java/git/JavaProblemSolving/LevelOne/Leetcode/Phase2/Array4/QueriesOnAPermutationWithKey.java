package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array4;

import java.util.LinkedList;

class QueriesOnAPermutationWithKey {
    public int[] processQueries(int[] queries, int m) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        int[] result = new int[queries.length];
        int con = 0;

        for (int i = 1; i <= m; i++) {
            linkedList.addLast(i);
        }
        for (int q : queries) {
            int tmp = linkedList.indexOf(q);
            linkedList.remove(tmp);
            result[con++] = tmp;
            linkedList.addFirst(q);
        }
        return result;
    }
}