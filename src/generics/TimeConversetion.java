package generics;

public class TimeConversetion {

    public static String timeConversion(String s) {
        // Write your code here
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        if (s.substring(s.length() - 1).equals("M")){

        }
        if (s.substring(s.length() - 2).equals("P")){

        }


        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("sdfsdfdsfsddsf"));
    }
}
