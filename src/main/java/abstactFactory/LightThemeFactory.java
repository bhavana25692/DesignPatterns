package abstactFactory;

public class LightThemeFactory implements GUIFactory {
    @Override
    public LightButton createButton() {
        System.out.println("Light Theme Button");
        return new LightButton();
    }

    @Override
    public LightThemeTextBox createTextBox() {
        System.out.println("Light theme text box");
        return new LightThemeTextBox();
    }
}
