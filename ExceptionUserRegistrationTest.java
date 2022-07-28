package Exceptions;

import org.junit.jupiter.api.Test;
import org.testng.Assert;


public class ExceptionUserRegistrationTest {

    ExceptionUserRegistrationMain exceptionUserRegistration = new ExceptionUserRegistrationMain();

    @Test
    public void givenFirstName_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.firstName("Ramakrishna");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenFirstName_IsProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.firstName("RamaKrishna");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenLastName_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.lastName("Velisetti");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenLastName_IsProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.lastName("VeLiseTTi");
        Assert.assertEquals(false, actualResult);
    }
    
}
