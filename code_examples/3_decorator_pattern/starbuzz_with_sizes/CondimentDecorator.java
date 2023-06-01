abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;

    public abstract String getDescription();

    // Overridden as to return what the core instance knows (the custom set size),
    // not what the wrapper instance knows (default set size)
    public Size getSize() {
        return beverage.getSize();
    }
}