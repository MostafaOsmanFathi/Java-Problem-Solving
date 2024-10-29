package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array3;

class CorporateFlightBookings {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] prefix = new int[n];
        //bookings[i] = [firsti, lasti, seatsi]

        for (int[] booking : bookings) {
            prefix[booking[0] - 1] += booking[2];
            if (booking[1] != n)
                prefix[booking[1]] -= booking[2];
        }
        for (int i = 1; i < n; i++) {
            prefix[i] += prefix[i - 1];
        }
        return prefix;
    }
}