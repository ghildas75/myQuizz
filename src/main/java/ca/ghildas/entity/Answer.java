package ca.ghildas.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.validation.constraints.NotNull;
@Entity
public class Answer implements Serializable{
@Id	
@GeneratedValue(strategy=GenerationType.AUTO)
private int idAnswer;
@NotNull
private String reponse;
private String answerText;
private Boolean isAnswer;
@ManyToOne
@JoinColumn(name="idQuestion")
private Question question;

public Answer() {
	super();
}


public Answer(String reponse, String answerText, Boolean isAnswer, Question question) {
	super();
	this.reponse = reponse;
	this.answerText = answerText;
	this.isAnswer = isAnswer;
	this.question = question;
}


public Answer(String reponse, String answerText, Boolean isAnswer) {
	super();
	this.reponse = reponse;
	this.answerText = answerText;
	this.isAnswer = isAnswer;
	
}

public int getIdAnswer() {
	return idAnswer;
}

public void setIdAnswer(int idAnswer) {
	this.idAnswer = idAnswer;
}

public String getReponse() {
	return reponse;
}

public void setReponse(String reponse) {
	this.reponse = reponse;
}

public String getAnswerText() {
	return answerText;
}

public void setAnswerText(String answerText) {
	this.answerText = answerText;
}

public Boolean getIsAnswer() {
	return isAnswer;
}

public void setIsAnswer(Boolean isAnswer) {
	this.isAnswer = isAnswer;
}

public Question getQuestion() {
	return question;
}

public void setQuestion(Question question) {
	this.question = question;
}
 

}
