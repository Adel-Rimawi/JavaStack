import java.util.*;
public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Him & I", "Cross my heart, hope to die To my lover...");
        trackList.put("Papaoutai", "Dites-moi d'où il vient Enfin je saurai où je vais Maman dit que lorsqu'on cherche bien On finit toujours par trouver");
        trackList.put("Dance Monkey", "Take your hands, my dear, and place them both in mine");
        trackList.put("When I'm Gone", "Yeah... It's my life... In my own words, I guess...");
        // get the keys by using the keySet method
        Set<String> keys = trackList.keySet();
        for (String key : trackList.keySet()) {
            System.out.println(String.format("Track: %s: Lyrics: %s", key, trackList.get(key)));
        }
    }
}