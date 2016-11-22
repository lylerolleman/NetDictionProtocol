package protocol;

import java.util.HashMap;
import java.util.Set;
import java.util.prefs.Preferences;

/**
 * Created by Lyle on 8/4/2016.
 */
public class ConfigManager {
    private static Integer default_port = 10125;
    private static String media_path = "";
    private static Preferences prefs = Preferences.userRoot().node("protocol");

    private static final String EXE_PATH = "EXE_PATH";

    public static Integer getDefaultPort() {
        return default_port;
    }
    public static String getMediaPath() {
        return media_path;
    }
    public static void setDefaultPort(Integer port) {
        default_port = port;
    }
    public static void setMediaPath(String path) {
        media_path = path;
    }
    public static HashMap<String, String> getExecutablePaths() {
        String data = prefs.get(EXE_PATH, "");
        return buildHashMap(data);
    }
    public static void addExecutablePath(String name, String path) {
        HashMap<String, String> map = getExecutablePaths();
        map.put(name, path);
        setExecutablePaths(map);
    }
    public static void removeExecutablePath(String name) {
        System.err.println("Removing: " + name);
        HashMap<String, String> map = getExecutablePaths();
        map.remove(name);
        setExecutablePaths(map);
    }
    private static void setExecutablePaths(HashMap<String, String> map) {
        if (map.size() == 0) {
            prefs.remove(EXE_PATH);
            prefs.put(EXE_PATH, "");
            return;
        }
        Set<String> ks = map.keySet();
        String data = "";
        for (String key : ks) {
            data += "," + key + "::" + map.get(key);
        }
        prefs.remove(EXE_PATH);
        prefs.put(EXE_PATH, data.substring(1));
    }
    private static HashMap<String, String> buildHashMap(String data) {
        HashMap<String, String> map = new HashMap<>();
        if (data.equals(""))
            return map;
        String[] entries = data.split(",");
        for (String entry : entries) {
            String[] pair = entry.split("::");
            map.put(pair[0], pair[1]);
        }
        return map;
    }
}
