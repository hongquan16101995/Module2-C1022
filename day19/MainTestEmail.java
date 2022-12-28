package day19;

import java.util.regex.Pattern;

public class MainTestEmail {
    public static void main(String[] args) {
        String emailAddress = "username@domain.com";
        String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        System.out.println("Result: " + patternMatches(emailAddress, regexPattern));
    }

    public static boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }

}
