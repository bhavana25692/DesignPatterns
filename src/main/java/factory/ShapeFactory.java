package factory;

import java.util.Locale;

public class ShapeFactory {
    public Shape getShape(String shapeName){
        switch (shapeName.toLowerCase(Locale.ROOT)) {
            case "circle" : return new Circle();
            case "rectangle" : return new Rectangle();
            default: throw new IllegalArgumentException();
        }
    }
}
