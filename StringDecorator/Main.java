package StringDecorator;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        WordInspector wi = new Basic();
        wi = new ContainsCapital(new IsFirstLetterCapital(new ContainsLowerCase(wi)));

        System.out.println(wi.contains("hELlO"));
    }
}
