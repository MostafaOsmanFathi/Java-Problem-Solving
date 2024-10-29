package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array1;

import java.util.*;

class OrderedStream {

    String[] arrStream;
    int currentID;

    public OrderedStream(int n) {
        arrStream = new String[n+1];
        currentID = 0;
    }

    public List<String> insert(int idKey, String value) {
        --idKey;
        arrStream[idKey] = value;
        List<String> res = new ArrayList<>();
        while (arrStream[currentID] != null) {
            res.add(arrStream[currentID]);
            ++currentID;
        }
        return res;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */