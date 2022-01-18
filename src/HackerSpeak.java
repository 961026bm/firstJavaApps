public class HackerSpeak {

    public static void main(String[] args) {
        System.out.println(hackerSpeak( "Careedevs"));
    }
    public static String hackerSpeak(String str) {
        return str
                .replace('a','4')
                .replace('e','3')
                .replace('i','1')
                .replace('o','0')
                .replace('s','5');
    }
}
