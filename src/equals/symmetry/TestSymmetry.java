package equals.symmetry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gorobec on 31.05.16.
 */
public class TestSymmetry {
    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";
        System.out.println("s.equals(cis) -> " + s.equals(cis));
        System.out.println("cis.equals(s) -> " + cis.equals(s));

        List<CaseInsensitiveString> list =
                new ArrayList<>();
        list.add(cis);

        System.out.println("list.contains(s) -> " + list.contains(s));
    }
}
