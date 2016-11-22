package protocol.exec;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Type implements NetDictionCommand {
	private String text;
	
	public Type(String text) {
		this.text = text;
	}
	@Override
	public void execute() {
		char[] chars = text.toCharArray();
		for (char c : chars) {
			try {
				switch (c) {
					case ',':
					case '.':
						pressKey((int) c);
						break;
					case '\n':
						pressKey(KeyEvent.VK_ENTER);
						break;
					case '\t':
						pressKey(KeyEvent.VK_TAB);
						break;
				}
				if (Character.isDigit(c) || Character.isSpaceChar(c))
					pressKey((int) c);
				else if (Character.isAlphabetic(c))
					if (Character.isLowerCase(c))
						pressKey(((int) c) - 32);
					else
						shiftPressKey((int) c);
				else 
					System.err.println("Unrecognized character: " + c);
			} catch (AWTException e) {
				e.printStackTrace();
			}
		}
	}

	private static void pressKey(int event) throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(event);
	    robot.keyRelease(event);
	}

	private static void shiftPressKey(int event) throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(event);
		robot.keyRelease(event);
		robot.keyRelease(KeyEvent.VK_SHIFT);
	}
}
