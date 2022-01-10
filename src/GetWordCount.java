public class GetWordCount {
    public static void main(String[] args) {
        System.out.println(countWords("My name is olu"));
    }
    public static int countWords(String s) {
        return s.split(" ").length;
    }
}
