package ca.ghildas;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ca.ghildas.dao.*;
import ca.ghildas.entity.Answer;
import ca.ghildas.entity.Question;
import ca.ghildas.entity.Quizz;



@SpringBootApplication
public class MyQuizzApplication implements CommandLineRunner {
	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private AnswerRepository answerRepository;
	@Autowired
	private QuizzRepository quizzRepository;
	public static void main(String[] args) {
		SpringApplication.run(MyQuizzApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		//Question q1= new Question("geographie", "captitale du france",new Date(), "", "", "");	
		Answer a1= new Answer("Bruxelle","Paris", false); 
		Answer a2= new Answer("Milan","Paris", false); 
		Answer a3= new Answer("Paris","Paris", true);
		List<Answer> choices=new ArrayList<Answer>();
		choices.add(a1);
		choices.add(a2);
		choices.add(a3);
		Answer a4= new Answer("ALGER","Alger", true); 
		Answer a5= new Answer("RABAT","Alger", false); 
		Answer a6= new Answer("TUNIS","TUNIS", false);
		List<Answer> choices2=new ArrayList<Answer>();
		choices.add(a4);
		choices.add(a5);
		choices.add(a6);
		Answer a7= new Answer("Barcelone","Real Madrid",false); 
		Answer a8= new Answer("psg","Madrid", false); 
		Answer a9= new Answer("Madrid","Madrid", true);
		List<Answer> choices3=new ArrayList<Answer>();
		choices.add(a7);
		choices.add(a8);
		choices.add(a9); 
		Quizz qz= new Quizz("geo", false, 30, 1, "this is insturction");
		Quizz qz2= new Quizz("sport", false, 30, 1, "this is insturction");
		Question q1= new Question("geographie", "captitale du france",new Date(), "cocher la bonne reponse", "non comment","Paris",choices,qz);	
		Question q2= new Question("geographie", "captitale Algérie",new Date(), "cocher la bonne reponse", "non comment","Alger",choices2,qz);	
		Question q3= new Question("sport", "Ligue de champions",new Date(), "QUI EST LE VAINQUEUR DE LA LIGUE DES CHAMPIONS", "non comment","Real madrid",choices3,qz);	
		Question q4= new Question("sport", "Ligue UEFA",new Date(), "cocher la bonne reponse", "QUI EST LE VAINQUER DE LA LIGUES EUROPA","MACHESTER UNITED",choices3,qz2);
		
		
		answerRepository.save(a1);
		answerRepository.save(a2);
		answerRepository.save(a3);
		answerRepository.save(a4);
		answerRepository.save(a5);
		answerRepository.save(a6);
		answerRepository.save(a7);
		quizzRepository.save(qz);
		quizzRepository.save(qz2);
		
		questionRepository.save(q1);
		questionRepository.save(q2);
		questionRepository.save(q3);
		questionRepository.save(q4);
	}

}
