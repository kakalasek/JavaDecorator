package StringDecorator;

public class IsFirstLetterCapital extends StringDecorator{
    public IsFirstLetterCapital(WordInspector wi) {
        super(wi);
    }

    @Override
    public boolean contains(String str) {
        return super.contains(str) && Helper.isFirstCapital(str);
    }
}
