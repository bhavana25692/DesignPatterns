package abstactFactory;


public class FactoryProvider {
    public GUIFactory getGUIFactory(String theme) {
        switch (theme.toLowerCase()) {
            case "light" : return new LightThemeFactory();
            case "dark" : return new DarkThemeFactory();
            default: throw new IllegalArgumentException();
        }
    }
}
