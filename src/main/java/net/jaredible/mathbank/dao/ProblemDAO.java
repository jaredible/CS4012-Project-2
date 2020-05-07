package net.jaredible.mathbank.dao;

import java.util.List;

import net.jaredible.mathbank.model.Problem;

public interface ProblemDAO {

	public List<Problem> getProblems();

	public Problem getProblem(int id);

	public void insertProblem(Problem problem);

}
