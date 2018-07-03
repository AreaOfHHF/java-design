package DecoratorPattern.inter;

public abstract class CondimentDecorator extends Beverage{
    //新的行为，与前面的getDescription()不同
    public abstract String getDescription();

}
