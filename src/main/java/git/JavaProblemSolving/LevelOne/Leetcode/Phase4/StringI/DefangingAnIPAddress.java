package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.StringI;

public class DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        String[] tmp = address.split("\\.");
        return String.join("[.]", tmp);
    }
}
