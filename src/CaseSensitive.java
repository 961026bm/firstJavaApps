public class CaseSensitive {

    public static void main(String[] args) {
        System.out.println(match("hello", "Hello"));
    }
    public static boolean match(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }
}
