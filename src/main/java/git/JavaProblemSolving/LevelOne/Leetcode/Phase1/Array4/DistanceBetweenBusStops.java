package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array4;

class DistanceBetweenBusStops {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int ans1 = 0;
        int ans2 = 0;
        for (int i = start; ; i++, i = Math.floorMod(i, distance.length)) {
            if (i == destination) {
                break;
            }
            ans1 += distance[i];
        }
        for (int i = Math.floorMod(start - 1, distance.length); ; i--, i = Math.floorMod(i, distance.length)) {
            ans2 += distance[i];
            if (i == destination) {
                break;
            }
        }
        return Math.min(ans1, ans2);
    }
}
