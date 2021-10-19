package model;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameRegex {
    private static final String NAME_REGEX = "^[A-Za-z]+$";

    public static boolean validate(String name) {
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
