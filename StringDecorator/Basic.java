package StringDecorator;

public class Basic implements WordInspector {
    @Override
    public boolean contains(String str) {
        return true;
    }
}
