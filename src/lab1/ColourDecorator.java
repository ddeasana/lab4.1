package lab1;
// ConcreteDecorator

/**The ColourDecorator class  is a concrete implementation of ICircleDecorator,
 *made for filling the circle with colour
 */
class ColourDecorator extends ICircleDecorator {

    /**
     * Constructs a ColourDecorator instance with the specified decoratedICircle
     * @param decoratedICircle the ICircle object to be decorated
     */
    public ColourDecorator(ICircle decoratedICircle) {
        super(decoratedICircle);
    }

    /**
     * Overrides the base getDescription()
     * @return Description of a circle that is filled with some colour
     */
    @Override
    public String getDescription() {
        return super.getDescription() + ", залите кольором";
    }


}
