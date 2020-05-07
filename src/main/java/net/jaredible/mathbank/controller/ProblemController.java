package net.jaredible.mathbank.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.jaredible.mathbank.model.Problem;
import net.jaredible.mathbank.service.ProblemService;

@Controller
@RequestMapping("/problem")
public class ProblemController {

	@Autowired
	private ProblemService problemService;

	@GetMapping
	public ModelAndView viewProblems() {
		ModelAndView mav = new ModelAndView("problem");

		mav.addObject("problem", new Problem());
		mav.addObject("problems", problemService.getProblems());

		return mav;
	}

	@PostMapping
	public ModelAndView addProblem(@Valid @ModelAttribute("problem") Problem problem, BindingResult result) {
		ModelAndView mav = new ModelAndView("problem");

		if (result.hasFieldErrors("content")) {
			mav.addObject("newProblemContentError", result.getFieldError("content").getDefaultMessage());
			mav.addObject("problem", problem);
		} else {
			problemService.addProblem(problem);
			mav.addObject("problem", new Problem());
		}

		mav.addObject("problems", problemService.getProblems());

		return mav;
	}

}
