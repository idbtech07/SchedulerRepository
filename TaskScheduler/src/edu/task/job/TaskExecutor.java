package edu.task.job;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class TaskExecutor {

	public void run() {

		String dateParam = new Date().toString();

		System.out.println(dateParam);

	  }
}