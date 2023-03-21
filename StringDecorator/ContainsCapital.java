package StringDecorator;

public class ContainsCapital extends StringDecorator{

    public ContainsCapital(WordInspector wi) {
        super(wi);
    }

    @Override
    public boolean contains(String str) {
        return super.contains(str) && Helper.containsUpper(str);
    }
}
