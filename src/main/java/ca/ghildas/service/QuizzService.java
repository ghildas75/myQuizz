package ca.ghildas.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ca.ghildas.dao.QuestionRepository;
import ca.ghildas.dao.QuizzRepository;
import ca.ghildas.entity.Question;
import ca.ghildas.entity.Quizz;

import ca.ghildas.metier.IRestMetier;

@RestController
@CrossOrigin("*")
public class QuizzService {
	@Autowired	
	private QuestionRepository questionRepository;
	@Autowired	
	private QuizzRepository quizzRepository;
	@RequestMapping(value="/quizzes",method=RequestMethod.GET)
	public List<Quizz> getAllQuizz(){
		return quizzRepository.findAll();
	}
	@RequestMapping(value="/quizzes/{id}",method=RequestMethod.GET)
	public Quizz getQuestionById(@PathVariable ("id")int id) {
		
		return quizzRepository.findOne(id);
	}
	
	@RequestMapping(value="/quizzes", method=RequestMethod.POST, produces = "application/json")
	public List<Question> AddQuizz(@RequestBody Quizz quizz) {
		
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
