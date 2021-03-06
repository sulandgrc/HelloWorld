package pieces;

import java.util.HashSet;
import java.util.Set;

/**
 * This class keeps track of the languages spoken in the world today
 */
public class WorldLanguages {

    private Set<String> languages = new HashSet<>();

    public WorldLanguages() {
        languages.add("English");
        languages.add("Spanish");
        languages.add("Russian");
        languages.add("Chinese");
    }

    public boolean addLanguage(String lang){
        return languages.add(lang);
    }

    @Override
    public String toString() {
        return "WorldLanguages{" +
                "languages=" + languages +
                '}';
    }
}
