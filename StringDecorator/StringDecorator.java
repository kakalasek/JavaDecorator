package StringDecorator;

public abstract class StringDecorator implements WordInspector {
    private final WordInspector decoratedInspector;

    public StringDecorator(WordInspector wi){
        this.decoratedInspector = wi;
    }

    @Override
    public boolean contains(String str) {
        return decoratedInspector.contains(str);
    }
}
