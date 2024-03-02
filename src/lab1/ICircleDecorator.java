package lab1;
// Decorator

/**The ICircleDecorator is an abstract class that implements the ICircle interface
 *It serves as a base class for other circle decorators, allowing the composition of multiple changes
 */
abstract class ICircleDecorator implements ICircle {

    /**
     * The ICircle object to be decorated
     */
    protected ICircle decoratedICircle;

    /**
     * Constructs a ICircleDecorator instance with the specified decoratedICircle
     * @param decoratedICircle the ICircle object to be decorated
     */
    public ICircleDecorator(ICircle decoratedICircle) {
        this.decoratedICircle = decoratedICircle;
    }

    /**
     * Overrides the base getDescription()
     * @return Description of a circle
     */
    @Override
    public String getDescription() {
        return decoratedICircle.getDescription();
    }
}
