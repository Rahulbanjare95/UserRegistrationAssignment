package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;
import java.util.regex.Pattern;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenCorrect_ShouldReturnTrue() {

        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateFirstName("Rahul");
        Assert.assertTrue(isValid);
    }
    @Test
    public void givenFirstName_WhenInCorrectlength_ShouldReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
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
    @Test
    public void givenEmail_WhenNoatsymbol_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateEmail("abcyahoo.com");
        Assert.assertFalse(isValid);

    }
    @Test
    public void givenEmail_WithAtsymbol_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateEmail("abc@yahoo.com");
        Assert.assertTrue(isValid);
    }
    @Test
    public void givenEmail_WithoutAtSymbol_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateEmail("@yahoo.com");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenEmail_WithProperNames_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateEmail("abc.qax@yahoo.co.in");
        Assert.assertTrue(isValid);
    }
    @Test
    public void givenMobile_WithProperFormat_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePhoneNumber("91 8982423482");
        Assert.assertTrue(isValid);
    }
    @Test
    public void givenMobile_WithoutSpace_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePhoneNumber("91982423482");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenMobile_WithlessLength_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePhoneNumber("91982");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenPassword_WithMin8charchter_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePassword("122abcde#fghAAS");
        Assert.assertTrue(isValid);
    }
    @Test
    public void givenPassword_WithLessCharacters_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePassword("zx2A");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenPassword_WithNoUpperCase_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePassword("zx2");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenPassword_WithNoUpperCaseButProper_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePassword("zx2asbcz8");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenPassword_WithNumericCharacter_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePassword("AABa12ds");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenPassword_WithNumericCharacterButNotLength_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePassword("Aa12");
        Assert.assertFalse(isValid);
    }
}