package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.String.format;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s, is my first project in this topic.";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "my friend") String name) {
		return new Greeting(/*counter.incrementAndGet(),*/ format(template, name));
	}
}
