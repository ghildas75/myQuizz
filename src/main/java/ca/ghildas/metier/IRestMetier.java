package ca.ghildas.metier;

import java.util.List;

import ca.ghildas.entity.Question;
import ca.ghildas.entity.Quizz;

public interface IRestMetier {
public Question getQuestionbyId(int id);
public List<Question>getQuestionOfQuizz(int id);
public Quizz getQuizzById(int id);
public List<Question> CreateQuizz(Quizz quizz);

}
