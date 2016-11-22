package display;

import java.io.File;

public interface DisplayAdapter {
	void portFeedback(String feedback);
	void mediaPlayback(File file);
}
