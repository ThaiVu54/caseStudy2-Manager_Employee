package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GenderRegex {
    private static final String GENDER_REGEX = "^[Nn][Aa][Mm]+|[Nn][Uu]$";

    public static boolean validate(String gender) {
        Pattern pattern = Pattern.compile(GENDER_REGEX);
        Matcher matcher = pattern.matcher(gender);
        return matcher.matches();
    }
}
