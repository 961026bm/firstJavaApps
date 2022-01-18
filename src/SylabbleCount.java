public class SylabbleCount {

    public static void main(String[] args) {
        System.out.println(numberSyllables("Buffering"));
    }
    public static int numberSyllables(String word) {
        String[] syl = word.split("-");
        return syl.length;

    }
}
