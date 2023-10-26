import java.util.ArrayList;

public class phonePad {
    public static void main(String[] args) {
        System.out.println(pad("", "23"));

    }

    public static ArrayList<String> pad(String ans, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        int digit = up.charAt(0) - '0';
        int i = (digit - 2) * 3;
        if (digit > 7) {
            i += 1;
        }
        int len = i + 3;
        if (digit == 7 || digit == 9) {
            len += 1;
        }

        ArrayList<String> list = new ArrayList<>();

        for (; i < len; i++) {
            char ch = (char) ('a' + i);
            list.addAll(pad(ans + ch, up.substring(1)));
        }

        return list;

    }
}