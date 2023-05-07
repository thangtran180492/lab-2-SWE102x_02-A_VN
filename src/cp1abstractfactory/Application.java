package cp1abstractfactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */

public class Application {
	private Button button;
	private CheckBox chechBox;
	public Application(GUIFactory factory) {
		this.button = factory.createButton();
		this.chechBox = factory.createCheckbox();
	}
	
	public void paint() {
		button.paint();
		chechBox.paint();
	}
}
