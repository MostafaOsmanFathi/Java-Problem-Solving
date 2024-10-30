package git.JavaProblemSolving.LevelOne.Leetcode.Phase3.BitManipulation1;

public class MaximumCompatibilityScoreSum {
    int n, m;
    boolean[] visited;
    int[][] students;
    int[][] mentors;

    int getSimQ(int[] a, int[] b) {
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                ++cnt;
            }
        }
        return cnt;
    }

    int rec(int it) {
        if (it == m) {
            return 0;
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            int tmp = getSimQ(mentors[it], students[i]) + rec(it + 1);
            ans = Math.max(ans, tmp);
            visited[i] = false;
        }
        return ans;
    }

    public int maxCompatibilitySum(int[][] students, int[][] mentors) {
        n = students[0].length;
        m = students.length;
        visited = new boolean[m];
        this.students = students;
        this.mentors = mentors;
        return rec(0);
    }

    public static void main(String[] args) {
        MaximumCompatibilityScoreSum obj = new MaximumCompatibilityScoreSum();
        System.out.println(obj.maxCompatibilitySum(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 1}}, new int[][]{{1, 0, 0}, {0, 0, 1}, {1, 1, 0}}));
    }
}
