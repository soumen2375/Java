package QUESTIONS;
// Searching in String
public class Problem_01 {
    public static void main(String[] args) {
        String[] str = { "apple", "mango", "banana", "guava" };
        String target = "mango";
        System.out.println(stringSearch(str, target));

    }

    static boolean stringSearch(String[] arr, String target) {
        for (String element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
