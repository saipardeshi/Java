import java.util.Arrays;

public class Practice71 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println("Anagrams? " + Arrays.equals(a, b));
    }
}