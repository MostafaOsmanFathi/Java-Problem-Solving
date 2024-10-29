package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array1;

class _1BitAnd2BitCharacters {
    public boolean isOneBitCharacter(int[] bits) {
        for (int i = 0; i < bits.length; i++) {
            if (bits[i] == 1) {
                ++i;
            } else if (i == bits.length - 1) {
                return true;
            }
        }
        return false;
    }
}