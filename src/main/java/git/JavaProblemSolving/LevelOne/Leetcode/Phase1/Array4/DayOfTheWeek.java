package git.JavaProblemSolving.LevelOne.Leetcode.Phase1.Array4;

import java.time.LocalDate;
class DayOfTheWeek {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        String tmp = localDate.getDayOfWeek().toString().toLowerCase();
        return (tmp.charAt(0) + "").toUpperCase() + tmp.substring(1);
    }
}