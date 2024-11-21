public class ReverseString {
    public void reverseString(char[] s) {
        int lim = s.length / 2;
        for (int i = 0; i < lim; i++) {
            char tmp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = tmp;
        }
    }
}
