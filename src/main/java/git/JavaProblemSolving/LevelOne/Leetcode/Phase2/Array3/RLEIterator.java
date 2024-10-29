package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array3;

class RLEIterator {

    int[] encoding;
    int con;

    public RLEIterator(int[] encoding) {
        this.encoding = encoding;
        this.con = 0;
    }

    public int next(int n) {
        while (con < encoding.length && n > encoding[con]) {
            n -= encoding[con];
            con += 2;
        }
        if (con >= encoding.length) {
            return -1;
        }
        encoding[con] -= n;
        return encoding[con + 1];
    }
}

/**
 * Your RLEIterator object will be instantiated and called as such:
 * RLEIterator obj = new RLEIterator(encoding);
 * int param_1 = obj.next(n);
 */