package com.bridgelabz.MoodAnalyzer;

import org.junit.Test;

import junit.framework.Assert;

public class MoodAnalyzerTest {
	@Test
	public void given_AnyMood_Should_Return_HAPPY() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.MoodAnalyzer("I am In Any Mood");
		Assert.assertEquals("HAPPY", mood);

	}

}
