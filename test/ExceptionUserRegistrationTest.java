package Exceptions.test;

import Exceptions.main.ExceptionUserRegistration;
import Exceptions.main.InputInvalidException;
import org.junit.jupiter.api.Test;
import org.testng.Assert;


public class ExceptionUserRegistrationTest {

    ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

    @Test
    public void firstName() throws InputInvalidException {
        String firstName = "Ramakrishna";
        Assert.assertTrue(exceptionUserRegistration.testFirstName(firstName));
    }

    @Test
    public void lastName() throws InputInvalidException {
        String lastName = "Velisetti";
        Assert.assertTrue(exceptionUserRegistration.testLastName(lastName));
    }

    @Test
    public void emailId() throws InputInvalidException {
        String emailId = "ramakrishna96.velisetti@gmail.com";
        Assert.assertTrue(exceptionUserRegistration.testEmailId(emailId));
    }

    @Test
    public void mobileNumber() throws InputInvalidException {
        String mobileNumber = "91 9989774456";
        Assert.assertTrue(exceptionUserRegistration.testMobileNumber(mobileNumber));
    }

    @Test
    public void password() throws InputInvalidException {
        String password = "qw98hRL@&dl";
        Assert.assertTrue(exceptionUserRegistration.testPassword(password));
    }
}
