public class NumbersEqual {

    public static void main(String[] args) {
        System.out.println(isSameNum(10, 20));
        System.out.println(isSameNum(10,10));
    }
    public static boolean isSameNum(int x, int y) {
        if (x == y) {
            return true;
        } else {
            return false;
        }
    }
}
