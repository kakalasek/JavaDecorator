package StringDecorator;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        WordInspector wi = new Basic();
        System.out.println(wi.contains("HELLO"));

        wi = new ContainsCapital(wi);
        System.out.println(wi.contains("HELLO"));

        wi = new ContainsLowerCase(wi);
        System.out.println(wi.contains("HELLO"));
    }
}
