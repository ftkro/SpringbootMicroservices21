package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * Handle the /start endpoint
 *
 */
@Controller
public class PlantPlacesController {

	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public String read() {
		return "start";
	}

	@RequestMapping(value = "/start", method = RequestMethod.GET, headers = {"content-type=text/json"})
	public String readJson() {
		return "start";
	}

	@RequestMapping(value = "/start", method = RequestMethod.GET, params = {"loyalty=blue"})
	public String readBlue() {
		return "start";
	}

	@RequestMapping(value = "/start", method = RequestMethod.GET, params = {"loyalty=silver"})
	public String readSilver() {
		return "start";
	}

	@PostMapping("/start")
	public String create() {
		return "start";
	}

	/**
	 * Handle the / endpoint
	 */
	@RequestMapping("/")
	public String index() {
		return "start";
	}
}
