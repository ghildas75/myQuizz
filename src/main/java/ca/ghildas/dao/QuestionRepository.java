package ca.ghildas.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.ghildas.entity.Answer;
import ca.ghildas.entity.Question;
import ca.ghildas.entity.Quizz;

public interface QuestionRepository extends JpaRepository<Question,Integer> {

	public List<Question> findByQuizz(Quizz qz);
	
}
