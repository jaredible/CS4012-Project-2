package net.jaredible.mathbank.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.jaredible.mathbank.model.Problem;
import net.jaredible.mathbank.service.ProblemService;

@Controller
@RequestMapping("/report")
public class ReportController {

	@Autowired
	private ProblemService problemService;

	@GetMapping
	public ModelAndView processCheckedProblems(@RequestParam("ids") Integer[] problemIds) {
		ModelAndView mav = new ModelAndView("report");

		List<Problem> problems = new ArrayList<Problem>();

		for (Integer problemId : problemIds) {
			problems.add(problemService.getProblem(problemId));
		}

		mav.addObject("problems", problems);

		return mav;
	}

}
