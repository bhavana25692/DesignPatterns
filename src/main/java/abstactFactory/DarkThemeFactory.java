package abstactFactory;

public class DarkThemeFactory implements GUIFactory{
    @Override
    public DarkButton createButton() {
        System.out.println("Dark theme button");
        return new DarkButton();
    }

    @Override
    public DarkThemeTextBox createTextBox() {
        System.out.println("Dark theme text box");
        return new DarkThemeTextBox();
    }
}
