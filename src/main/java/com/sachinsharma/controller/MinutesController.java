package com.sachinsharma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sachinsharma.model.Exercise;

@Controller
public class MinutesController {
	
	@RequestMapping(value="/add")
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise) {
		
		System.out.println("exercise: " + exercise.getMinutes());
		return "addMinutes";
	}
}
