package org.mercycorps.translationcards.ui;

import org.mercycorps.translationcards.model.Dictionary;

import java.util.List;

/**
 * A utility class for displaying information about languages keyed by ISO code.
 *
 * @author nick.c.worden@gmail.com (Nick Worden)
 */
public class LanguageDisplayUtil {

    public static String getDestLanguagesFromStringsForDisplay(List<String> languages) {
        if (languages.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(languages.get(0).toUpperCase());
        for (int i = 1; i < languages.size(); i++) {
            sb.append("  ");
            sb.append(languages.get(i).toUpperCase());
        }
        return sb.toString();
    }
}
