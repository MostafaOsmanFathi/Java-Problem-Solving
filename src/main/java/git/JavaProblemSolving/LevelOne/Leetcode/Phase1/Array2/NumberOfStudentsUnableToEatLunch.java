package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array2;

class NumberOfStudentsUnableToEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        int cnt1 = 0;
        int cnt2;
        for (var x : students) {
            cnt1 += x;
        }
        cnt2 = sandwiches.length - cnt1;
        for (var x : sandwiches) {
            if (x == 1 && cnt1 != 0) {
                --cnt1;
            } else if (x == 0 && cnt2 != 0) {
                --cnt2;
            }else{
                break;
            }
        }

        return cnt1 + cnt2;
    }

}