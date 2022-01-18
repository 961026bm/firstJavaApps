public class VowelCount {

    public static void main(String[] args) {
        System.out.println(getCount("Classes and objects"));
    }
    public static int getCount(String str) {

            return str.replaceAll("[^aeiouAEIOU]", "").length();
        }
    }

