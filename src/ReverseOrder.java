public class ReverseOrder {

    public static void main(String[] args) {
        System.out.println(reverse("CareerDevs"));
    }
    public static String reverse(final String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
