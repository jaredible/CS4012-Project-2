package net.jaredible.mathbank.service;

import java.util.List;

import net.jaredible.mathbank.model.Problem;

public interface ProblemService {

	public List<Problem> getProblems();

	public Problem getProblem(int id);

	public void addProblem(Problem problem);

}
