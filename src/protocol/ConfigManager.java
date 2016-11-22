package protocol;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.prefs.Preferences;

/**
 * Created by Lyle on 8/4/2016.
 */
public class ConfigManager {
    private static Preferences prefs = Preferences.userRoot().node("protocol");

    private static final String EXE_PATH = "EXE_PATH";
    private static final String MEDIA_PATH = "MEDIA_PATH";
    private static final String DEFAULT_PORT = "DEFAULT_PORT";
    private static final String ALIAS_MAP = "ALIAS_MAP";

    public static Integer getDefaultPort() {
        return Integer.parseInt(prefs.get(DEFAULT_PORT, "10125"));
    }
    public static String getMediaPath() {
        return prefs.get(MEDIA_PATH, "");
    }
    public static void setDefaultPort(Integer port) {
        prefs.put(DEFAULT_PORT, port.toString());
    }
    public static void setMediaPath(String path) {
        prefs.put(MEDIA_PATH, path);
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
        HashMap<String, String> map = getExecutablePaths();
        map.remove(name);
        setExecutablePaths(map);
    }
    private static void setExecutablePaths(HashMap<String, String> map) {
        setMap(EXE_PATH, map);
    }
    public static HashMap<String, String> getAliases() {
        String data = prefs.get(ALIAS_MAP, "");
        return buildHashMap(data);
    }
    public static void addAlias(String name, String alias) {
        HashMap<String, String> map = getAliases();
        map.put(name, alias);
        setAliases(map);
    }
    public static void removeAlias(String name) {
        HashMap<String, String> map = getAliases();
        map.remove(name);
        setAliases(map);
    }
    private static void setAliases(HashMap<String, String> map) {
        setMap(ALIAS_MAP, map);
    }
    private static void setMap(String key, HashMap<String, String> map) {
        if (map.size() == 0) {
            prefs.remove(key);
            prefs.put(key, "");
            return;
        }
        Set<String> ks = map.keySet();
        String data = "";
        for (String mapkey : ks) {
            data += "," + mapkey + "::" + map.get(mapkey);
        }
        prefs.remove(key);
        prefs.put(key, data.substring(1));
    }
    private static HashMap<String, String> buildHashMap(String data) {
        HashMap<String, String> map = new HashMap<>();
        if (data.equals(""))
            return map;
        String[] entries = data.split(",");
        for (String entry : entries) {
            String[] pair = entry.split("::");
            map.put(pair[0].toLowerCase(), pair[1]);
        }
        return map;
    }
}
