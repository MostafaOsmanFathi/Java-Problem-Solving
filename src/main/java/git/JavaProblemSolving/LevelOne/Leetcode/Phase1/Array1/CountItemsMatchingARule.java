package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array1;

import java.util.List;

class CountItemsMatchingARule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result = 0;
        for (List<String> item : items) {
            String type = item.get(0), color = item.get(1), name = item.get(2);
            if (ruleKey.equals("type") && ruleValue.equals(type)) {
                ++result;
            }else if (ruleKey.equals("color") && ruleValue.equals(color)) {
                ++result;
            }else if (ruleKey.equals("name") && ruleValue.equals(name)) {
                ++result;
            }

        }
    
        return result;   
    }
}
