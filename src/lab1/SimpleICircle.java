package lab1;
// ConcreteComponent

/**
 *The CSimpleICircle class  is a concrete implementation of ICircle
 */
class SimpleICircle implements ICircle {

    /**
     * Overrides the base getDescription()
     * @return Description of a simple circle
     */
    @Override
    public String getDescription() {
        return "Коло";
    }

}
