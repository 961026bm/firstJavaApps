public class FlipTheBoolean {
    public static void main(String[] args){
        System.out.println(flipTheBoolean(false));
    }
    public static boolean flipTheBoolean(boolean b) {
        if (b == true) {
            return false;
        } else {
            return true;
        }
    }
}
