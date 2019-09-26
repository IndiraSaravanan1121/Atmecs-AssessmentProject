package com.atmecs.Pages;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ValidateBlogsDate {
	public static void validateBlogsDate(String blogsDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd yyyy");
		LocalDateTime startTime = LocalDateTime.parse("Mar 15 2019", formatter);
		LocalDateTime todayDate = LocalDateTime.parse("Sep 09 2019", formatter);
		Duration difference = Duration.between(startTime, todayDate);
		System.out.println(difference.toMinutes());

	}
}