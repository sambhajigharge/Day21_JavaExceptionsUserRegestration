package Exceptions.test;

import Exceptions.main.MoodAnalyser;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class MoodAnalyserTest {
    MoodAnalyser moodAnalyser = new MoodAnalyser();

    @Test
    public void givenMessage_WhenHappy_ReturnEntrySuccessful() {
        String actualResult = moodAnalyser.analyseMood("User is Happy");
        Assert.assertEquals("Entry Successful", actualResult);
    }

    @Test
    public void givenEmail2_WhenNotProper_ReturnEntryFailed() {
        String actualResult = moodAnalyser.analyseMood("User is Sad");
        Assert.assertEquals("Entry Failed", actualResult);
    }

}
