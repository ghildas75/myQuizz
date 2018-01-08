package ca.ghildas.entity;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import ch.qos.logback.core.net.SyslogOutputStream;


@Entity
public class Quizz  {
@Id 
@GeneratedValue	(strategy=GenerationType.AUTO)
private int idQuizz;
private String title;
private boolean show_correction;
private int timelimit;
private int nbreQuestion;
private String instructions;
@OneToMany(mappedBy="quizz", fetch=FetchType.LAZY)
private List<Question> questions=new ArrayList<Question>(nbreQuestion);
@JsonIgnore
public List<Question> getQuestions() {
	return questions;
}





public void setQuestions(List<Question> questions) {
	this.questions = questions;
}


public Quizz() {
	

}


public Quizz(String title, boolean show_correction, int timelimit, int nbreQuestion, String instructions) {
	super();
	this.title = title;
	this.show_correction = show_correction;
	this.timelimit = timelimit;
	this.nbreQuestion = nbreQuestion;
	this.instructions = instructions;
	
	
}


/*public List<Question> generateQuestions() {
	questions= new ArrayList<Question>(nbreQuestion);
	
	if(nbreQuestion<=0) return null;
	else {
		for (int i = 0; i < nbreQuestion; i++) {
			questions.add(questionR);
		}
	Collections.shuffle(questions);
		
	} 
	return questions;

	
}
*/

public int getIdQuizz() {
	return idQuizz;
}


public void setIdQuizz(int idQuizz) {
	this.idQuizz = idQuizz;
}


public String getTitle() {
	return title;
}


public void setTitle(String title) {
	this.title = title;
}


public boolean isShow_correction() {
	return show_correction;
}


public void setShow_correction(boolean show_correction) {
	this.show_correction = show_correction;
}


public int getTimelimit() {
	return timelimit;
}


public void setTimelimit(int timelimit) {
	this.timelimit = timelimit;
}


public int getNbreQuestion() {
	return nbreQuestion;
}


public void setNbreQuestion(int nbreQuestion) {
	this.nbreQuestion = nbreQuestion;
}


public String getInstructions() {
	return instructions;
}


public void setInstructions(String instructions) {
	this.instructions = instructions;
}
















	
}
