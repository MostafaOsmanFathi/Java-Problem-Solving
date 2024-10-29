package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array3;

import java.util.ArrayList;

class MyCalendarI {


    record Interval(int Start, int End) {
    }

    ArrayList<Interval> arrayList;

    public MyCalendarI() {
        this.arrayList = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (Interval interval : arrayList) {
            if (start < interval.End && interval.Start <= end) {
                return false;
            }
        }
        arrayList.add(new Interval(start, end));
        return true;
    }
}
/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */