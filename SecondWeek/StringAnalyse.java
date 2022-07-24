package SecondWeek;

public class StringAnalyse {

    String str;

    public StringAnalyse(String s) {
        this.str = s;
    }

    public static void exception(String str) throws myException {
        char[] cc = str.toCharArray();
        for (int i = 0; i < cc.length; i++) {
            if (cc[i] == '/') {
                if (cc[i + 1] == '0') {
                    throw new myException();
                } else {
                    continue;
                }

            }
        }
    }

}