package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstname_WhenCorrect_ShouldReturnTrue() {

       UserRegistration userRegistration =new UserRegistration();
       boolean isValid = userRegistration.validateFirstName("Rahul");
        Assert.assertTrue(isValid);
    }
    @Test
    public void givenFirstname_WhenInCorrectlength_ShouldReturnFalse() {

        UserRegistration userRegistration =new UserRegistration();
        boolean isValid = userRegistration.validateFirstName("Ra");
        Assert.assertFalse(isValid);
    }
}
