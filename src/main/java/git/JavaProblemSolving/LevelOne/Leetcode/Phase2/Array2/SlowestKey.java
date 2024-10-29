package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array2;

class SlowestKey {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char res = keysPressed.charAt(0);
        int duration = releaseTimes[0];

        for (int i = 1; i < releaseTimes.length; i++) {
            int tmp = releaseTimes[i] - releaseTimes[i - 1];
            if (duration < tmp) {
                res = keysPressed.charAt(i);
                duration = tmp;
            } else if (duration == tmp) {
                res = (Character.compare(res, keysPressed.charAt(i)) > 0) ? res : keysPressed.charAt(i);
            }
        }
        return res;
    }


}