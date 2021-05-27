
public class ReverseString {

    public static String firstWayReverseStringMethod(String str) {
        return new StringBuilder(str).reverse().toString();

    }

    public static String secondWayReverseStringMethod(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(firstWayReverseStringMethod("yusufbestas"));
        System.out.println("--------------------------");
        System.out.println(secondWayReverseStringMethod("yusufbestas"));
    }
}
