package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenCorrect_ShouldReturnTrue() {

       UserRegistration userRegistration =new UserRegistration();
       boolean isValid = userRegistration.validateFirstName("Rahul");
        Assert.assertTrue(isValid);
    }
    @Test
    public void givenFirstName_WhenInCorrectlength_ShouldReturnFalse() {

        UserRegistration userRegistration =new UserRegistration();
        boolean isValid = userRegistration.validateFirstName("Ra");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateLastName("Kumar");
        Assert.assertTrue(isValid);
    }
    @Test
    public void givenLastName_WhenIncorrectLength_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateLastName("Ku");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenLastName_WhenNoUppercaseCharacter_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateLastName("kum");
        Assert.assertFalse(isValid);
    }

}
