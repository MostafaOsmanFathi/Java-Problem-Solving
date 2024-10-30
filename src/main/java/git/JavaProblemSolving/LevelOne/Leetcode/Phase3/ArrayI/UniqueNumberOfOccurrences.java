package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.ArrayI;

public class UniqueNumberOfOccurrences {
    int mangeNegAndPosInArray(int idx) {
        if (idx < 0)
            return -idx + 1001;
        else
            return idx;
    }

    public boolean uniqueOccurrences(int[] arr) {
        int[] frq = new int[2024];
        int[] frqOnFrq = new int[1001];
        for (int num : arr) {
            if (frq[mangeNegAndPosInArray(num)] != 0)
                frqOnFrq[frq[mangeNegAndPosInArray(num)]]--;
            frq[mangeNegAndPosInArray(num)]++;
            frqOnFrq[frq[mangeNegAndPosInArray(num)]]++;
        }
        for (int i = 0; i < 1001; i++) {
            if (frqOnFrq[i] > 0 && frqOnFrq[i] != 1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        UniqueNumberOfOccurrences obj = new UniqueNumberOfOccurrences();
        System.out.println(obj.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
    }
}
