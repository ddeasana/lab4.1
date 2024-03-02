package lab1;
//5. Define class specifications and implementation of methods for rendering the
//selected graphic element in the vector graphics editor. Provide the ability to
//dynamically change the display of the element.

public class Main {

    public static void main(String[] args) {

        ICircle simpleICircle = new SimpleICircle();
        System.out.println("Опис кола: " + simpleICircle.getDescription());
        ICircle colouredICircle = new ColourDecorator(simpleICircle);
        System.out.println("Опис кола: " + colouredICircle.getDescription());
        ICircle linedICIrcle = new LineDecorator(simpleICircle);
        System.out.println("Опис кола: " + linedICIrcle.getDescription());
        ICircle linedAndColouredICircle = new LineDecorator(colouredICircle);
        System.out.println("Опис кола: " + linedAndColouredICircle.getDescription());
    }
}
