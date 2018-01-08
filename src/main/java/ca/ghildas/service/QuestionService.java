package ca.ghildas.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import ca.ghildas.dao.AnswerRepository;
import ca.ghildas.dao.QuestionRepository;
import ca.ghildas.dao.QuizzRepository;
import ca.ghildas.entity.Question;
import ca.ghildas.entity.Quizz;
import ch.qos.logback.core.net.SyslogOutputStream;



@RestController
//@CrossOrigin("*")

public class QuestionService {
	@Autowired	
	private QuestionRepository questionRepository;
	@Autowired	
	private QuizzRepository quizzRepository;
	@Autowired
	private AnswerRepository   answerRepository;
	 
	@RequestMapping(value="/questions")
	public List<Question> getAllQuestion(){
		return questionRepository.findAll();
		/*List<Question> list=questionRepository.findAll();
		
		System.out.println("\n\n");
		list.forEach(System.out::println);
		list.forEach(q->{q.setAnswers(answerRepository.findByQuestion(q));});
		return list;*/
	}
	
	@RequestMapping(value="/questions/{id}",method=RequestMethod.GET)
	public Question getQuestionById(@PathVariable ("id")int id) {
		return questionRepository.findOne(id);
	}
	@RequestMapping(value="/quizzes/{id}/questions",method=RequestMethod.GET,produces = "application/json")
	public List<Question> getListofQuestion(@PathVariable("id")int id){
      Quizz qz=new Quizz();
      qz.setIdQuizz(id);
      
		return questionRepository.findByQuizz(qz);


	}



}
