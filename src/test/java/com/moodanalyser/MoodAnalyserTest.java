package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    /*
    Giving message using constructor of MoodAnalyser
     */
    public void givenNullMood_ShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            moodAnalyser.analyseMood(null);
        } catch (MoodAnalysesException e) {
            Assertions.assertEquals("Please enter proper message", e.getMessage());
        }

    }

}
