package ca.ghildas.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.ghildas.entity.Answer;
import ca.ghildas.entity.Question;

public interface AnswerRepository extends JpaRepository<Answer,Integer>{

public List<Answer> findByQuestion(Question q);
}
