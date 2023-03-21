package StringDecorator;

public class ContainsLowerCase extends StringDecorator{
    public ContainsLowerCase(WordInspector wi) {
        super(wi);
    }

    @Override
    public boolean contains(String str) {
        return super.contains(str) && Helper.containsLower(str);
    }
}
