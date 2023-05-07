package cp3methodfactory;

/**
 * Windows Dialog will produce Windows buttons.
 */

public class WindowDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
