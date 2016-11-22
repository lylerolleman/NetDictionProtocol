package display;

import java.io.File;
import java.util.LinkedList;

public class DisplayManager {
	private static LinkedList<DisplayAdapter> adapters = new LinkedList<DisplayAdapter>();
	
	public static void addDisplayAdapter(DisplayAdapter adapter) {
		adapters.add(adapter);
	}
	
	public static void clearDisplayAdapters() {
		adapters.clear();
	}
	
	public static void displayPortFeedback(String feedback) {
		for (DisplayAdapter adapter : adapters) {
			adapter.portFeedback(feedback);
		}
	}

	public static void startMediaPlayback(File file) {
		for (DisplayAdapter adapter : adapters) {
			adapter.mediaPlayback(file);
		}
	}
}
