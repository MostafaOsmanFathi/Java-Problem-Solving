package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.ArrayI;

import java.awt.*;
import java.util.*;
import java.util.List;

public class SubdomainVisitCount {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> mp = new HashMap<>();
        for (String domain : cpdomains) {
            String[] tmp = domain.split("[.|\s]");
            int times = Integer.parseInt(tmp[0]);
            LinkedList<String> lst = new LinkedList<>();

            for (int i = tmp.length - 1; i >= 1; i--) {
                lst.addFirst(tmp[i]);
                StringBuilder str = new StringBuilder();
                for (String s : lst) {
                    str.append(s);
                }
                String strStr = str.toString();

                mp.put(strStr, mp.getOrDefault(strStr, 0) + times);
                lst.addFirst(".");
            }

        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            result.add(entry.getValue() + " " + entry.getKey());
        }

        return result;
    }

    public static void main(String[] args) {
        SubdomainVisitCount subdomainVisitCount = new SubdomainVisitCount();
        System.out.println(subdomainVisitCount.subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"}));
        System.out.println(subdomainVisitCount.subdomainVisits(new String[]{"9001 discuss.leetcode.com"}));
    }
}
