package git.JavaProblemSolving.LevelOne.Leetcode.Phase4.MathI;

public class SmallestRangeI {
    public int smallestRangeI(int[] nums, int k) {
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        for (int num : nums) {
            mx = Math.max(mx, num);
            mn = Math.min(mn, num);
        }
        int tmp = mx - mn;

        return tmp - Math.min(tmp, k * 2);
    }
    public static void main(String[] args) {
        SmallestRangeI obj = new SmallestRangeI();
        System.out.println(obj.smallestRangeI(new int[]{3, 1, 10}, 4));
        System.out.println(obj.smallestRangeI(new int[]{1, 3, 6}, 3));
        System.out.println(obj.smallestRangeI(new int[]{0, 10}, 2));
    }
}
