public class existANumberHigher {
    public static void main(String[] args) {
        System.out.println(existsHigher(new int[] {12, 56, 89}, 56 ));
    }
    public static boolean existsHigher(int[] arr, int n) {
        for(int i : arr ) {
            if (i >= n) return true;
        }
        return false;
    }
}
