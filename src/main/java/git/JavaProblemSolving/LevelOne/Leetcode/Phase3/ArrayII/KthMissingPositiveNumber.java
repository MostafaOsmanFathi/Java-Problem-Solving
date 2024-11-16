package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.ArrayII;

public class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {

        if (arr[0] > k) return k;

        k -= arr[0] - 1;
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i] - arr[i - 1];
            tmp--;
            if (tmp >= k) {
                return arr[i - 1] + k;
            }
            k -= tmp;
        }
        return arr[arr.length - 1] + k;
    }

    public static void main(String[] args) {
        KthMissingPositiveNumber obj = new KthMissingPositiveNumber();
        System.out.println(obj.findKthPositive(new int[]{1, 3}, 1));
        System.out.println(obj.findKthPositive(new int[]{1, 2, 3, 4}, 2));
        System.out.println(obj.findKthPositive(new int[]{2, 3, 4, 7, 11}, 5));
    }
}
