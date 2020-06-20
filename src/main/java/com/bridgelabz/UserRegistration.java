package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    boolean match = true;
    public static final String FIRST_NAME_REGEX = "^[A-Z]{1}[A-Za-z]{2,}$";

    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_REGEX);
        return pattern.matcher(firstName).matches();


    }

    public static final String LAST_NAME_REGEX = "^[A-Z]{1}[A-Za-z]{2,}$";

    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(LAST_NAME_REGEX);
        return pattern.matcher(lastName).matches();
    }

    public static final String EMAIL_REGEX_SIMPLEST = "^(.+)@(.+)$";
    public static final String EMAIL_REGEX_USERNAME = "^[A-Za-z0-9+_.-]+@(.+)$";
    public static final String EMAIL_REGEX_COMPLETE = "^[A-za-z0-9]+([._+-][0-9a-z]+)@+[A-Za-z0-9]+.[a-z]{2,4}([.][a-z]{2}$)";

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX_SIMPLEST);
        Pattern pattern1 = Pattern.compile(EMAIL_REGEX_USERNAME);
        Pattern pattern2 = Pattern.compile(EMAIL_REGEX_COMPLETE);
        if (pattern.matcher(email).matches() || pattern1.matcher(email).matches() || pattern2.matcher(email).matches()) {
            return match;
        } else
            return (!match);


    }

    public static final String PHONE_NUMBER = "^[91]{2}[: :][0-9]{10}$";

    public boolean validatePhoneNumber(String phonenNumber) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER);
        return pattern.matcher(phonenNumber).matches();

    }

    public static final String PASSWORD = "^[0-9a-zA-Z]{8,}$";

    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD);
        return pattern.matcher(password).matches();

    }
}
