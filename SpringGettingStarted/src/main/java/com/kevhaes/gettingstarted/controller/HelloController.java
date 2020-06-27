/**
 * @author KevHaes
 *
 */
package com.kevhaes.gettingstarted.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author KevHaes
 *
 */
@RestController
public class HelloController {

	@GetMapping("/")
	public String getStandardMessage() {
		return "Hello World";
	}

	@GetMapping(path = "{name}")
	public String getPersonalizedMessage(@PathVariable("name") String name) {
		return "Hello " + name;
	}

}
