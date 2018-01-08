/*package ca.ghildas.metier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.ghildas.dao.*;
import ca.ghildas.entity.Question;
import ca.ghildas.entity.Quizz;
@Service
public class RestMetier implements IRestMetier {
@Autowired	
private QuestionRepository questionRepository;

@Autowired	
private QuizzRepository quizzRepository;
	@Override
	public Question getQuestionbyId(int id) {
		// TODO Auto-generated method stub
		return  questionRepository.findOne(id);
	}

	@Override
	public List<Question> getQuestionOfQuizz(int id) {
		// TODO Auto-generated method stub
		 Quizz qz=quizzRepository.findOne(id);
		 return qz.getQuestions();
		
	}

	@Override
	public Quizz getQuizzById(int id) {
		// TODO Auto-generated method stub
		return  quizzRepository.findOne(id);
	}

	@Override
	public List<Question> CreateQuizz(Quizz quizz) {
		// TODO Auto-generated method stub
	 
	   List<Question> questions= new ArrayList<Question>(quizz.getNbreQuestion());
		
		for (int i = 0; i <quizz.getNbreQuestion(); i++) {
				questions.add(questionRepository.findAll().get(i));
			      
		    Collections.shuffle(questions);
		     
		         } 
		
	   quizz.setQuestions(questions);
	   quizzRepository.save(quizz);
	   
		  return questions;
	}

	
}
*/