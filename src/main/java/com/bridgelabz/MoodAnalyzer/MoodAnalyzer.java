package com.bridgelabz.MoodAnalyzer;

public class MoodAnalyzer {
	public MoodAnalyzer() {
	}

	public String MoodAnalyzer(String message) {
		if (message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
	}

}
