package pl.edu.wszib.jwd.jwdcolors.helper;

import javax.swing.text.html.StyleSheet;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ColorHelper {
    public static List<String> convertColors(Collection<String> strcolor){
        StyleSheet styleSheet = new StyleSheet();
        List<String> colors = new ArrayList<>();
        for (String strColor: strcolor){
            Color color = styleSheet.stringToColor(strColor);
            colors.add("rgba("+color.getRed()+","+color.getGreen()+","+color.getBlue()+"1)");

        }
        return colors;
    }
}
