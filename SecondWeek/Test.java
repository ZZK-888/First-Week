package SecondWeek;

import java.util.Iterator;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {

        ReversePolish t = new ReversePolish();
        Calculate c = new Calculate();
        try{
            StringAnalyse.exception("1+2/0-3");
        } catch (myException e) {
            System.out.println(e.getMessage());
        }
        t.setStr("1+9*4+7-9+3");
        Stack kk = t.getExpress(t.getStr());
        Iterator it = kk.iterator();
        StringBuffer stringBuffer = new StringBuffer();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
        }
        String s = new String(stringBuffer);
        String[] arr = s.split("");
        System.out.println(c.resule(arr));
    }
}