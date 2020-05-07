package net.jaredible.mathbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.jaredible.mathbank.dao.ProblemDAO;
import net.jaredible.mathbank.model.Problem;

@Service
public class ProblemServiceImpl implements ProblemService {

	@Autowired
	private ProblemDAO problemDAO;

	@Override
	public List<Problem> getProblems() {
		return problemDAO.getProblems();
	}

	@Override
	public Problem getProblem(int id) {
		return problemDAO.getProblem(id);
	}

	@Override
	public void addProblem(Problem problem) {
		problemDAO.insertProblem(problem);
	}

}
