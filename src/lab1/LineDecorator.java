package lab1;
// ConcreteDecorator

/**The ColourDecorator class  is a concrete implementation of ICircleDecorator,
 *made for changing the circle outline
 */
class LineDecorator extends ICircleDecorator {

    /**
     * Constructs a LineDecorator instance with the specified decoratedICircle
     * @param decoratedICircle the ICircle object to be decorated
     */
    public LineDecorator(ICircle decoratedICircle) {
        super(decoratedICircle);
    }

    /**
     * Overrides the base getDescription()
     * @return Description of a circle that has a  changed outline
     */
    @Override
    public String getDescription() {
        return super.getDescription() + ", має пунктирну лінію";
    }

}
